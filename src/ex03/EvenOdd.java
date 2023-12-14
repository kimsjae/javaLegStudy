package ex03;

import java.util.Scanner;

public class EvenOdd { // 짝수와 홀수 구별하기
    public static void main(String[] args) {
        int number;

        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하시오: ");

        number = sc.nextInt();

        if (number % 2 == 0) { // number를 2로 나누어서 0이면 짝수이다.
            System.out.println("짝수");
        } else {
            System.out.println("홀수");
        }
    }
}
