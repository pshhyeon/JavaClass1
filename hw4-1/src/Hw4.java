import java.util.Scanner;

public class Hw4 {
    public static void main(String[] args) {
        final int MATRIX_TOTAL = 2;
        int matrix[][][] = new int[MATRIX_TOTAL][3][2];
        for (int i = 0; i < MATRIX_TOTAL; i++) {
            printTitle(i);
            inputMatrix(matrix[i]);
        }
        printMatrixSum(matrix);
    }

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
