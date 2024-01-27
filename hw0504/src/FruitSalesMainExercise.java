import java.util.Scanner;
class FruitSalesMainExercise
{
    public static void main(String[] args)
    {
        FruitSeller seller1 = new FruitSeller(10, 3000, 1000);
        FruitSeller seller2 = new FruitSeller(15, 4000, 900);
        FruitBuyer buyer = new FruitBuyer(2, 10000);
        System.out.println("==과일 구매 전==");
        System.out.println("과일 판매자A");
        seller1.sellerResult();
        System.out.println("\n과일 판매자B");
        seller2.sellerResult();
        System.out.println("\n과일 구매자");
        buyer.buyerResult();

        Scanner scanner = new Scanner(System.in);
        System.out.print("과일 판매자A에게 사과 몇 개를 사시겠습니까? ");
        int apple1 = scanner.nextInt();
        System.out.print("과일 판매자B에게 사과 몇 개를 사시겠습니까? ");
        int apple2 = scanner.nextInt();

        seller1.sellApple(buyer, apple1);
        seller2.sellApple(buyer, apple2);

        System.out.println("\n==과일 구매 후==");
        System.out.println("과일 판매자A");
        seller1.sellerResult();
        System.out.println("\n과일 판매자B");
        seller2.sellerResult();
        System.out.println("\n과일 구매자");
        buyer.buyerResult();

    }
}
