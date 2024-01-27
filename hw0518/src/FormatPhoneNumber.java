import java.util.Scanner;

public class FormatPhoneNumber {
    public static void main(String[] args) {
        String num;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("전화번호: ");
            num = scanner.nextLine();
            if (num.equals("Q") || num.equals("q")) {
                System.out.println("프로그램이 종료되었습니다.");
                break;
            }
            String formattedNum = formatPhoneNumber(num);
            System.out.println("당신의 전화번호는 " + formattedNum + " 입니다");
        }

    }

    public static String formatPhoneNumber(String phone) {
        StringBuilder num = new StringBuilder(phone);
        num.reverse();
        if (num.length() < 11) {
            num.insert(4, "-");
            num.insert(8, "-");
        } else {
            num.insert(4, "-");
            num.insert(9, "-");
        }
        num.reverse();
        return num.toString();
    }
}