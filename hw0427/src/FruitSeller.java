public class FruitSeller {
    int numOfApple = 20;
    int myMoney = 0;
    final int APPLE_PRICE = 1000;

    public void sellApple(FruitBuyer buyer, int num) {
        numOfApple -= num;
        myMoney += num * APPLE_PRICE;
        buyer.myMoney -= num * APPLE_PRICE;
        buyer.numOfApple += num;
    }

    public void showSaleResult() {
        System.out.println("남은 사과: " + numOfApple);
        System.out.println("판매 수익: " + myMoney);
    }
}
