package ch02;

import java.util.Scanner;

public class FtoC {
    public static void main(String[] args) {
        System.out.println("=========================");
        System.out.println("1. 화씨 -> 섭씨");
        System.out.println("2. 섭씨 -> 화씨");
        System.out.println("=========================");
        System.out.println();

        System.out.print("번호를 선택하시오: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.print((num == 1) ? "화씨온도를 입력하시오: " : "섭씨온도를 입력하시오: ");
        double temp = sc.nextDouble();
        double f_temp, c_temp;
        f_temp = (9 * temp + 160) / 5;
        c_temp = (5 * temp - 160) / 9;

        System.out.print((num == 1) ? "섭씨온도는 " : "화씨온도는 ");
        System.out.println((num == 1) ? c_temp : f_temp);
    }
}
