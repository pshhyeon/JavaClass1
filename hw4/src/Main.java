import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // hw1
/*        printRandomNum(2, 7, 10);
        printRandomNum(100, 11, 15);*/

        // hw2
/*      Scanner a = new Scanner(System.in);
        int matrix1[][] = new int[2][2];
        int matrix2[][] = new int[2][2];

        System.out.println("Enter the elements of matrix1");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.print("Enter " + (i + 1) + (j + 1) + ": ");
                matrix1[i][j] = a.nextInt();
            }
        }

        System.out.println("Enter the elements of matrix2");
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                System.out.print("Enter " + (i + 1) + (j + 1) + ": ");
                matrix2[i][j] = a.nextInt();
            }
        }

        System.out.println("Sum of matrix:");
        for (int i = 0; i < matrix1.length; i++){
            for (int j = 0; j < matrix1[0].length; j++) {
                System.out.println(matrix1[i][j] + "+" + matrix2[i][j]+ "="+ (matrix1[i][j] + matrix2[i][j]));
            }
        }*/

        // hw3
        /*Scanner a = new Scanner(System.in);
        int[] numbers;
        numbers = inputNumber();
        printNumber(numbers);*/

        // hw4
/*        final int MATRIX_TOTAL = 2;
        int matrix[][][] = new int[MATRIX_TOTAL][3][2];
        for (int i = 0; i < MATRIX_TOTAL; i++) {
            printTitle(i);
            inputMatrix(matrix[i]);
        }
        printMatrixSum(matrix);*/
    }


    // hw1
    public static void printRandomNum(int num1, int num2, int count) {
        //최솟값, 최댓값, 출력할갯수 함수로 호출
        final int MIN = num1;
        final int MAX = num2;
        for (int i = 0; i < count; i++) {
            Random r = new Random();
            System.out.println(r.nextInt(MAX - MIN + 1) + MIN);
        }
        System.out.println("done");
    }

    // hw3
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
        double avg = 0;
        for (int i : numbers
        ) {
            sum += i;
        }
        avg = (float) sum / numbers.length;
        if (avg * 10 % 10 == 0) {
            int intNum = (int) avg;
            System.out.println("정수 4개의 값 평균: " + intNum);
        } else {
            System.out.println("정수 4개의 값 평균: " + avg);
        }
    }

    // hw4
    public static void printTitle(int i) {
        System.out.println("Enter the elements of matrix " + (i + 1));
    }

    public static void inputMatrix(int[][] matrix) {
        Scanner a = new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Enter " + (i + 1) + (j + 1) + ": ");
                matrix[i][j] = a.nextInt();
            }
        }
    }

    public static void printMatrixSum(int[][][] matrix) {
        System.out.println("Sum of matrix: ");
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix[0][i].length; j++) {
                System.out.println(matrix[0][i][j] + "+" + matrix[1][i][j] + "=" + (matrix[0][i][j] + matrix[1][i][j]));
            }
        }
    }

}