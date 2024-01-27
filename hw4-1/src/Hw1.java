import java.util.Random;

public class Hw1 {
    public static void main(String[] args) {
        printRandomNum(2, 7, 10);
        printRandomNum(100, 110, 15);
    }

    public static void printRandomNum(int min, int max, int num) {
        //최솟값, 최댓값, 출력할갯수 함수로 호출
        Random r = new Random();
        for (int i = 0; i < num; i++) {
            System.out.println(r.nextInt(max - min + 1) + min);
        }
        System.out.println("print complete");
    }

}
