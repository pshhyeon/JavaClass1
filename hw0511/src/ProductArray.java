import java.util.Scanner;

public class ProductArray {
    final static int PRODUCT_TOTAL = 3;

    public static void main(String[] args) {
        Product[] productArray = new Product[PRODUCT_TOTAL];
        Scanner scanner = new Scanner(System.in);
        System.out.println("## 상품 정보 입력 ##");
        for (int i = 0; i < PRODUCT_TOTAL; i++) {
            productArray[i] = new Product();
            System.out.print("바코드: ");
            productArray[i].setBarcode(scanner.next());
            System.out.print("상품명: ");
            productArray[i].setName(scanner.next());
            System.out.print("가격: ");
            productArray[i].setPrice(scanner.nextInt());
            System.out.println(productArray[i].getName() + " 추가되었습니다.\n");
        }

        System.out.println("## 상품 검색 ##");
        String barcode;
        while (true) {
            System.out.print("바코드: ");
            barcode = scanner.next();
            if (barcode.equals("Q") || barcode.equals("q")) {
                System.out.print("프로그램을 종료합니다.");
                System.exit(0);
            }
            for (int i = 0; i < PRODUCT_TOTAL; i++) {
                if (barcode.equals(productArray[i].getBarcode())) {
                    System.out.println(productArray[i].getName() + ", " + productArray[i].getPrice() + "원\n");
                }
            }
        }
    }
}