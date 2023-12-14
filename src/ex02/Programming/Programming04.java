package ex02.Programming;

public class Programming04 {
    public static void main(String[] args) {
        /**
         * 자바의 기본 논리 연산에 대한 진리표를 표시하는 프로그램을 작성해보자.
         */

        boolean P, Q, AND, OR, XOR;
        System.out.println("P\t\tQ\t\tAND\t\tOR\t\tXOR");


        // P와 Q가 모두 TRUE일 때
        P = true;
        Q = true;
        AND = P && Q;
        OR = P || Q;
        XOR = (P != Q)? true : false;
        System.out.println(P + "\t" + Q + "\t" + AND + "\t" + OR + "\t" + XOR);


        // P가 TRUE, Q가 FALSE일 때
        P = true;
        Q = false;
        AND = P && Q;
        OR = P || Q;
        XOR = (P != Q)? true : false;
      System.out.println(P + "\t" + Q + "\t" + AND + "\t" + OR + "\t" + XOR);

      // P가 FALSE, Q가 TRUE일 때
      P = false;
      Q = true;
        AND = P && Q;
        OR = P || Q;
        XOR = (P != Q)? true : false;
      System.out.println(P + "\t" + Q + "\t" + AND + "\t" + OR + "\t" + XOR);

      // P와 Q가 모두 FALSE일 때
      P = false;
      Q = false;
        AND = P && Q;
        OR = P || Q;
        XOR = (P != Q)? true : false;
        System.out.println(P + "\t" + Q + "\t" + AND + "\t" + OR + "\t" + XOR);

    }
}
