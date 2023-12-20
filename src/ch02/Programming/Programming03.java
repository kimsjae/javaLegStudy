package ch02.Programming;

import java.util.Scanner;

public class Programming03 {
    public static void main(String[] args) {
        /**
         * 사용자로부터 두 개의 정수를 받아서 정수의 합, 정수의 차, 정수의 곱, 정수의 평균, 큰 수, 작은 수를 계산하여 화면에 출력하는 프로그램을 작성하라.
         * 큰 수와 작은 수를 구할 때는 조건 연산자를 사용해보자.
         */

        // 1. 두 개의 정수를 받고 입력하기
        System.out.print("x: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.print("y: ");
        int y = sc.nextInt();

        // 2. 두 수의 합, 차, 곱, 평균, 큰수, 작은 수를 나타내는 식 만들기
        int sum = x + y;
        int minus = x - y;
        int multiply = x * y;
        double average = sum / 2.0;
        int big = (x > y) ? x : y;
        int small = (x < y) ? x : y;


        // 3. 출력하기
        System.out.println("두 수의 합: " + sum);
        System.out.println("두 수의 차: " + minus);
        System.out.println("두 수의 곱: " + multiply);
        System.out.println("두 수의 평균: " + average);
        System.out.println("큰 수: " + big);
        System.out.println("작은 수: " + small);
    }
}
