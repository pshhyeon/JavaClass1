import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

/*
        //hw1
        Scanner a = new Scanner(System.in);
        System.out.print("두 정수를 입력하시오: ");
        int num1=a.nextInt();
        int num2=a.nextInt();
        if (num1>num2)
            System.out.print(num1 + ">" + num2);
        else if (num1<num2)
            System.out.print(num1 + "<"+ num2);
        else
            System.out.print(num1 + "==" + num2);
*/


/*
        // hw2
        Scanner a = new Scanner(System.in);
        int result = 0;
        System.out.print("두 정수를 입력하시오: ");
        int num1 = a.nextInt();
        int num2 = a.nextInt();

        System.out.print("연산자를 입력하시오(+|-|*|/): ");
        String calculation = a.next();

        switch (calculation) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
        }
        System.out.print(num1 + calculation + num2 + "=" + result);
*/


/*
        //hw3
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + "+");
            sum += i;
        }
        System.out.print("=" + sum);
*/


/*
        //hw4
        Scanner a = new Scanner(System.in);
        int count = 0;
        int num = 0;
        while (true) {
            num = a.nextInt();
            if (num == -1) {
                break;
            }
            count++;
        }
        System.out.print("입력된 숫자 개수는" + count);
*/

        //hw5
        Scanner a = new Scanner((System.in));
        System.out.print("모래시계 높이를 입력하세요 : ");
        int high = a.nextInt();
        int width = high;
        int count = 0;

        for (int i = 0; i < high; i++) {
            for (int j = 0; j <= count; j++) {
                System.out.print(' ');
            }
            for (int j = 0; j < width; j++) {
                System.out.print('*');
            }
            System.out.println();
            if (high % 2 == 0 && i == high / 2 - 1) {
                continue;
            }
            if (i < high / 2) {
                count++;
                width -= 2;
            } else {
                count--;
                width += 2;
            }

        }
    }
}

