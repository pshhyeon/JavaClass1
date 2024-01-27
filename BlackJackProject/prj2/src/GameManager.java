import java.util.Random;
import java.util.Scanner;

public class GameManager {
    private final Card[] deck;
    private final User player;
    private final User dealer;
    private boolean isPlaying;

    public GameManager() {
        deck = createDeck();
        player = new User();
        dealer = new User();
        isPlaying = true;
        setGame();
    }

    private Card[] createDeck() {
        Card[] cards = new Card[52];
        int curCNT = 0;
        String[] suits = {"♠", "♥", "♦", "♣"};
        String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "K", "Q"};
        for (String rank : ranks) {
            for (String suit : suits) {
                Card card = new Card(suit, rank);
                cards[curCNT] = card;
                curCNT++;
            }
        }
        return cards;
    }

    private void setGame() {
        for (int i = 0; i < 2; i++) {
            player.addCard(dealing());
            dealer.addCard(dealing());
        }
    }

    public void play() {
        boolean stand = false;
        while (isPlaying) {
            show(stand);
            stand = hitOrStand();
            isPlaying = result(stand);
        }
        show(stand);
    }

    private void show(boolean stand) {
        System.out.println("------------- Jack's BlackJack Game -------------");
        System.out.print("# Dealer: ");
        openHand(dealer, stand);
        System.out.print("\n# Player: ");
        openHand(player, stand);
        System.out.println("\n-------------------------------------------------");
    }

    private void openHand(User user, boolean stand) {
        if (user == dealer && !stand) {
            System.out.print(user.getHand().get(0).getRank() + "(" + user.getHand().get(0).getSuit() + ")" + " XX");
        } else {
            for (int i = 0; i < user.getHand().size(); i++) {
                System.out.print(user.getHand().get(i).getRank() + "(" + user.getHand().get(i).getSuit() + ") ");
            }
        }
    }

    private Card dealing() {
        Random num = new Random();
        Card dealCard = null;
        boolean checkHand = true;

        while (checkHand) {
            dealCard = deck[num.nextInt(deck.length)];
            checkHand = player.getHand().contains(dealCard) || dealer.getHand().contains(dealCard);
        }
        return dealCard;
    }

    private boolean hitOrStand() {
        Scanner input = new Scanner(System.in);
        System.out.print("Hit or Stand? (H/S): ");
        while (true) {
            String key = input.next();
            if (key.equals("h") || key.equals("H")) {
                player.addCard(dealing());
                break;
            } else if (key.equals("s") || key.equals("S")) {
                while (dealer.getScore() < 17) {
                    dealer.addCard(dealing());
                }
                return true;
            } else {
                System.out.print("input another key");
            }
        }
        return false;
    }

    public boolean result(boolean stand) {
        if (player.getScore() > 21) {
            System.out.println("Player busted...");
            return false;
        } else if (dealer.getScore() > 21) {
            System.out.println("Dealer busted...");
            return false;
        } else if (player.getScore() == 21) {
            System.out.println("Player wins...");
            return false;
        }
        if (stand) {
            if (player.getScore() == dealer.getScore()) {
                System.out.println("Equal points..;");
            } else if (player.getScore() > dealer.getScore()) {
                System.out.println("Player wins...");
            } else {
                System.out.println("Dealer wins...");
            }
            return false;
        }
        return true;
    }

    public boolean reStart() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Restart Game? input (Y/N)");
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("y") || input.equals("Y")) {
                return true;
            } else if (input.equals("n") || input.equals("N")) {
                return false;
            } else {
                System.out.println("input another Key");
            }
        }
    }
}
