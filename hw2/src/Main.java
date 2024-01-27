import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("정수를 입력하세요: ");
/*
        String input = a.nextLine();
        int nSeconds = Integer.parseInt(input);
*/
        int nSeconds = a.nextInt();
        int hours = nSeconds / 3600;
        int minutes = (nSeconds % 3600) / 60;
        int seconds = nSeconds % 60;

        System.out.print(nSeconds + "초는 " + hours + "시간, " + minutes + "분, " + seconds + "초입니다.");
    }
}