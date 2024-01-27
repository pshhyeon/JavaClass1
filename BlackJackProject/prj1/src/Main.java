import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> playerHand = new ArrayList<>();
        ArrayList<String> dealerHand = new ArrayList<>();
        boolean isPlaying = true;
        boolean stand;
        String[] card = cardDesign();
        setGame(card, playerHand, dealerHand);
        while (isPlaying) {
            show(playerHand, dealerHand, isPlaying);
            stand = hitOrStand(card, playerHand, dealerHand);
            isPlaying = result(playerHand, dealerHand, stand);
        }
        show(playerHand, dealerHand, isPlaying);
    }

    public static String[] cardDesign() {
        String[] card = new String[13];
        for (int i = 1; i <= card.length; i++) {
            switch (i) {
                case 1:
                    card[i - 1] = "A";
                    break;
                case 11:
                    card[i - 1] = "J";
                    break;
                case 12:
                    card[i - 1] = "K";
                    break;
                case 13:
                    card[i - 1] = "Q";
                    break;
                default:
                    card[i - 1] = "" + i;
            }
        }
        return card;
    }

    public static String dealing(String[] card, ArrayList<String> playerHand, ArrayList<String> dealerHand) {
        Random num = new Random();
        boolean checkPlayerHand = true, checkDealerHand = true;
        String addCard = "";
        while (checkPlayerHand || checkDealerHand) {
            addCard = card[num.nextInt(card.length)];
            checkPlayerHand = playerHand.contains(addCard);
            checkDealerHand = dealerHand.contains(addCard);
        }
        return addCard;
    }

    public static void show(ArrayList<String> playerHand, ArrayList<String> dealerHand, boolean isPlaying) {
        System.out.println("------------- Jack's BlackJack Game -------------");
        System.out.print("# Dealer: ");
        if (isPlaying) {
            System.out.print(dealerHand.get(0) + " X");
        } else {
            for (String i : dealerHand
            ) {
                System.out.print(i + " ");
            }
        }
        System.out.print("\n# Player: ");
        for (String i : playerHand
        ) {
            System.out.print(i + " ");
        }
        System.out.println("\n-------------------------------------------------");
    }

    public static void setGame(String[] card, ArrayList<String> playerHand, ArrayList<String> dealerHand) {
        for (int i = 0; i < 2; i++) {
            playerHand.add(dealing(card, playerHand, dealerHand));
            dealerHand.add(dealing(card, playerHand, dealerHand));
        }
    }

    public static boolean hitOrStand(String[] card, ArrayList<String> playerHand, ArrayList<String> dealerHand) {
        Scanner input = new Scanner(System.in);
        System.out.print("Hit or Stand? (H/S): ");
        while (true) {
            String key = input.next();
            if (key.equals("h") || key.equals("H")) {
                playerHand.add(dealing(card, playerHand, dealerHand));
                break;
            } else if (key.equals("s") || key.equals("S")) {
                while (calculate(dealerHand) < 17) {
                    dealerHand.add(dealing(card, playerHand, dealerHand));
                }
                return true;
            } else {
                System.out.print("input another key");
            }
        }
        return false;
    }

    public static int calculate(ArrayList<String> card) {
        int sum = 0;
        for (String i : card
        ) {
            switch (i) {
                case "A":
                    sum += 1;
                    break;
                case "J":
                case "K":
                case "Q":
                    sum += 10;
                    break;
                default:
                    sum += Integer.parseInt(i);
            }
        }
        return sum;
    }

    public static boolean result(ArrayList<String> playerHand, ArrayList<String> dealerHand, boolean stand) {
        int playerScore = calculate(playerHand);
        int dealerScore = calculate(dealerHand);

        if (playerScore > 21) {
            System.out.println("Player busted...");
            return false;
        } else if (dealerScore > 21) {
            System.out.println("Dealer busted...");
            return false;
        } else if (playerScore == 21) {
            System.out.println("Player wins...");
            return false;
        }
        if (stand) {
            if (playerScore == dealerScore) {
                System.out.println("Equal points..;");
            } else if (playerScore > dealerScore) {
                System.out.println("Player wins...");
            } else {
                System.out.println("Dealer wins...");
            }
            return false;
        }
        return true;
    }

}
