import java.util.ArrayList;

public class User {
    private final ArrayList<Card> hand;
    private int score;

    public User() {
        this.hand = new ArrayList<>();
        this.score = 0;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public int getScore() {
        return score;
    }

    public void addCard(Card card) {
        hand.add(card);
        calculateScore();
    }

    private void calculateScore() {
        score = 0;
        int numOfAce = 0;
        for (Card card : hand) {
            String rank = card.getRank();
            switch (rank) {
                case "A":
                    score += 1;
                    numOfAce++;
                    break;
                case "J":
                case "K":
                case "Q":
                    score += 10;
                    break;
                default:
                    score += Integer.parseInt(rank);
            }
        }
        while (numOfAce > 0 && score <= 11) {
            score += 10;
            numOfAce--;
        }
    }

}

