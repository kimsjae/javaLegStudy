package ex03;

import java.util.Scanner;

public class GugudanEx01 {

    public static void main(String[] args) {
        // 1. 2~9단까지 출력되는 프로그램을 만드시오.
        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.println(i + " * " + j + " = " + i*j);
            }
            System.out.println();
        }

        // 2. 스캐너를 이용하여 입력받은 단만 출력하시오.
        System.out.print("곱할 두 수를 입력하시오: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println(x + " * " + y + " = " + (x * y));

      // 3. 가로로 나열
        System.out.print("2*1=2\t");
        System.out.print("3*1=3\t");
        System.out.print("4*1=4\t");
        System.out.println();

        System.out.print("2*2=4\t");
        System.out.print("3*2=6\t");
        System.out.print("4*2=8\t");
        System.out.println();

        for (int i = 1; i < 10; i++) {
            for (int j = 2; j < 10; j++) {
                System.out.print(j + "*" + i + "=" + (j*i) + "\t");
            }
            System.out.println();
        }


    }
}
