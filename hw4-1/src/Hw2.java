import java.util.Scanner;

public class Hw2 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
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
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                System.out.println(matrix1[i][j] + "+" + matrix2[i][j] + "=" + (matrix1[i][j] + matrix2[i][j]));
            }
        }
    }
}
