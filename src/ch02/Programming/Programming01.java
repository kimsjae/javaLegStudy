package ch02.Programming;

import java.util.Scanner;

public class Programming01 {
    public static void main(String[] args) {
        /**
         * 하나의 상자에 오렌지를 10개씩 담을 수 있다고 하자.
         * 오렌지가 127개 있다면 상자 몇 개가 필요한가?
         * 또 몇개의 오렌지가 남을까?
         */

        // 1. 오렌지 개수 입력
        System.out.print("오렌지의 개수를 입력하시오: ");
        Scanner sc = new Scanner(System.in);
        int orange = sc.nextInt();

        // 2. 몇 상자 필요한 지 ?
        int box = orange / 10;

        // 3. 몇 개 남는 지?
        int orange2 = orange % 10;

        // 4. 몇박스 필요하고 몇개 남는지 출력
        System.out.println(box + "박스가 필요하고 " + orange2 + "개가 남습니다.");
    }
}
