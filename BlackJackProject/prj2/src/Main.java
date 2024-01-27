public class Main {
    public static void main(String[] args) {
        boolean coin = true;
        while (coin) {
            GameManager gameManager = new GameManager();
            gameManager.play();
            coin = gameManager.reStart();
        }
    }
}
