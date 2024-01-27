class FruitSeller
{
    int myNumOfApple;
    int myMoney;
    final int APPLE_PRICE;
    public  FruitSeller(int appleNum, int money, int price){
        myNumOfApple = appleNum;
        myMoney = money;
        APPLE_PRICE = price;
    }

    public void sellApple(FruitBuyer buyer, int appleNum){
        myNumOfApple -= appleNum;
        myMoney += buyer.buyApple(appleNum, APPLE_PRICE);
    }

    public void sellerResult(){
        System.out.println("사과 개수: " + myNumOfApple +"개");
        System.out.println("단가: " + APPLE_PRICE +"원");
        System.out.println("잔액: " + myMoney +"원");
    }
}
