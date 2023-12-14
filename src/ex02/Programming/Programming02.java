package ex02.Programming;

import java.util.Scanner;

public class Programming02 {
    public static void main(String[] args) {
        /**
         * 마일을 킬로미터로  변환하는 프로그램을 작성하라.
         * 1마일은 1.609킬로미터와 같다.
         * 사용자로부터 마일의 값을 읽어 들인다.
         */

        // 1. 마일 입력
        System.out.print("마일을 입력하시오: ");
        Scanner sc = new Scanner(System.in);
        double mile = sc.nextDouble();

        // 2. 마일을 킬로미터로 변환하는 식
        double km = mile * 1.609;

        // 3. 입력 값을 출력
        System.out.println(mile + "마일은 " + km + "킬로미터입니다.");
    }
}
