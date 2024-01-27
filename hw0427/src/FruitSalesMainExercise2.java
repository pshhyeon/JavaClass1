import java.util.Scanner;

public class FruitSalesMainExercise2 {
    public static void main(String[] args) {
        FruitSellerA sellerA = new FruitSellerA();
        FruitSellerB sellerB = new FruitSellerB();
        FruitBuyerA buyer = new FruitBuyerA();

        System.out.println("==과일 구매 전==");
        sellerA.showSaleResult();
        sellerB.showSaleResult();
        buyer.showBuyResult();

        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.print("\n과일 판매자A에서 사과 몇 개를 사시겠습니까? ");
        num = scanner.nextInt();
        sellerA.sellApple(buyer, num);
        System.out.print("과일 판매자B에서 사과 몇 개를 사시겠습니까? ");
        num = scanner.nextInt();
        sellerB.sellApple(buyer, num);

        System.out.println("\n==과일 구매 전==");
        sellerA.showSaleResult();
        sellerB.showSaleResult();
        buyer.showBuyResult();
    }
}

