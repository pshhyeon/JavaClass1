import java.util.Scanner;

public class hw1 {
    public static void main(String[] args) {
        int[] numbers;
        numbers = inputNumber();
        printNumber(numbers);
    }

    public static int[] inputNumber() {
        // 정수 4개 입력받기
        Scanner n = new Scanner(System.in);
        int num[] = new int[4];
        for (int i = 0; i < 4; i++) {
            System.out.printf("정수4개를 입력하세요 (%d/4): ", i + 1);
            num[i] = n.nextInt();
        }
        return num;
    }

    public static void printNumber(int[] numbers) {
        // 입력받은 정수의 평균값 출력
        int sum = 0;
        double avg;
        for (int i : numbers
        ) {
            sum += i;
        }
        avg = (double) sum / numbers.length;

        if (avg * 10 % 10 == 0) {
            int intNum = (int) avg;
            System.out.println("정수 4개의 값 평균: " + intNum);
        } else {
            System.out.println("정수 4개의 값 평균: " + avg);
        }
    }
}
