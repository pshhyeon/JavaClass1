import java.io.*;
import java.util.Scanner;

public class Diary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("## 내 일기장 ##");
            System.out.println("1. 보기\n2. 쓰기\n3. 종료");
            System.out.print("입력하세요: ");
            String s = scanner.nextLine();
            switch (s) {
                case "1":
                    viewDiary();
                    break;
                case "2":
                    writeDiary();
                    break;
                case "3":
                    System.out.println("종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 입력입니다.");
                    break;
            }
        }
    }

    public static void viewDiary() {
        try {
            BufferedReader in = new BufferedReader(new FileReader("Diary.txt"));
            String str;
            while (true) {
                str = in.readLine();
                if (str == null)
                    break;
                System.out.println(str);
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeDiary() {
        Scanner s = new Scanner(System.in);
        BufferedWriter out = null;
        try {
            out = new BufferedWriter(new FileWriter("Diary.txt", true));
            System.out.print("날짜: ");
            String date = s.nextLine();
            System.out.print("내용: ");
            String content = s.nextLine();
            out.write("날짜: " + formatDate(date) + "\n내용: " + content + "\n");
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Could not write to file");
        }
    }

    public static String formatDate(String date) {
        String year = date.substring(0, 2);
        String month = date.substring(2, 4);
        String day = date.substring(4, 6);
        String formattedDate = year + "년 " + month + "월 " + day + "일";
        return formattedDate;
    }
}