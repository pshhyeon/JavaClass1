public class FruitSellerA {
    int numOfApple = 10;
    int myMoney = 3000;
    final int APPLE_PRICE = 1000;

    public void sellApple(FruitBuyerA buyer, int num) {
        numOfApple -= num;
        myMoney += num * APPLE_PRICE;
        buyer.myMoney -= num * APPLE_PRICE;
        buyer.numOfApple += num;
    }

    public void showSaleResult() {
        System.out.println("과일 판매자A");
        System.out.println("사과 개수: " + numOfApple + "개");
        System.out.println("단가: " + APPLE_PRICE + "원");
        System.out.println("잔액: " + myMoney + "원\n");
    }
}

