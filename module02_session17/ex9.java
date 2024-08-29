package module02_session17;

import java.util.Scanner;

public class ex9 {

    public static int fibonacci(int n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            int a = 0, b = 1;
            int fib = 0;
            for (int i = 3; i <= n; i++) {
                fib = a + b;
                a = b;
                b = fib;
            }
            return fib;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập giá trị n: ");
        int n = scanner.nextInt();


        if (n <= 0) {
            System.out.println("Giá trị n phải là một số nguyên dương.");
            return;
        }


        int result = fibonacci(n);


        System.out.println("Số Fibonacci thứ " + n + " là: " + result);


    }
}
