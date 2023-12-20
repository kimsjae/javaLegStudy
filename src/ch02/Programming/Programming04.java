package ch02.Programming;

public class Programming04 {
    public static void main(String[] args) {
        /**
         * 자바의 기본 논리 연산에 대한 진리표를 표시하는 프로그램을 작성해보자.
         */

        boolean p, q, and, or, xor;
        System.out.println("P\t\tQ\t\tAND\t\tOR\t\tXOR");


        // P와 Q가 모두 TRUE일 때
        p = true;
        q = true;
        and = p && q;
        or = p || q;
        xor = (p != q) ? true : false;
        System.out.println(p + "\t" + q + "\t" + and + "\t" + or + "\t" + xor);


        // P가 TRUE, Q가 FALSE일 때
        p = true;
        q = false;
        and = p && q;
        or = p || q;
        xor = (p != q) ? true : false;
        System.out.println(p + "\t" + q + "\t" + and + "\t" + or + "\t" + xor);

        // P가 FALSE, Q가 TRUE일 때
        p = false;
        q = true;
        and = p && q;
        or = p || q;
        xor = (p != q) ? true : false;
        System.out.println(p + "\t" + q + "\t" + and + "\t" + or + "\t" + xor);

        // P와 Q가 모두 FALSE일 때
        p = false;
        q = false;
        and = p && q;
        or = p || q;
        xor = (p != q) ? true : false;
        System.out.println(p + "\t" + q + "\t" + and + "\t" + or + "\t" + xor);

    }
}
