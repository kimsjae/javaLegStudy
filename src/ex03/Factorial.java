package ex03;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        long fact = 1;
        int n;

        System.out.print("정수를 입력하시오: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            fact *= i; // fact = fact * i
        }
        /**
         * n=5
         * fact = 1 * 1
         * fact = 1 * 2
         * fact = 2 * 3
         * fact = 6 * 4
         * fact = 24 * 5
         *
         */

        System.out.printf("%d!은 %d입니다.\n", n, fact);
    }
}
