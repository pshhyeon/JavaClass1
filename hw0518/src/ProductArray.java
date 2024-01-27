import java.util.Scanner;

public class ProductArray {
    final static int PRODUCT_TOTAL = 3;

    public static void main(String[] args) {
        Product[] productArray = new Product[PRODUCT_TOTAL];
        Scanner scanner = new Scanner(System.in);
        String barcode, name, inputPrice;
        int price;
        System.out.println("## 상품 정보 입력 ##");
        for (int i = 0; i < PRODUCT_TOTAL; i++) {

            System.out.print("바코드: ");
            barcode = scanner.nextLine();
            System.out.print("상품명: ");
            name = scanner.nextLine();
            System.out.print("가격: ");
            inputPrice = scanner.nextLine();
            // price = Integer.parseInt(scanner.nextLine());
            if (name.equals("")) {
                price = Integer.parseInt(inputPrice);
                productArray[i] = new Product(barcode, price);
            } else if (inputPrice.equals("")) {
                productArray[i] = new Product(barcode, name);
            } else {
                price = Integer.parseInt(inputPrice);
                productArray[i] = new Product(barcode, name, price);
            }
            System.out.println(productArray[i].getName() + " 추가되었습니다.\n");
        }

        System.out.println("## 상품 검색 ##");
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