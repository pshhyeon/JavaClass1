class FruitBuyer {
    int myNumOfApple;
    int myMoney;

    public FruitBuyer(int appleNum, int money) {
        myNumOfApple = appleNum;
        myMoney = money;
    }

    public int buyApple(int appleNum,final int applePrice){
        int price = appleNum * applePrice;
        myNumOfApple += appleNum;
        myMoney -= price;
        return price;
    }

    public void buyerResult() {
        System.out.println("사과 개수: " + myNumOfApple + "개");
        System.out.println("보유 금액: " + myMoney + "원");
    }
}

