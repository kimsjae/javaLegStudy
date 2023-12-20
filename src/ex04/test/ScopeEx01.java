package ex04.test;

import ex04.TvTest;

public class ScopeEx01 {

    static void m3() {
        int u = 100;
    }

    void m4() {
        System.out.println();
    }

    int n1 = 1;
    static int n2 = 2;

    static void m1() {
        int n5 = 10;
        System.out.println("m1 : " + n5);
    }

    void m2() {
        System.out.println("m2 : " + n1);
    }

    // 메인 시작전에 static에 n2변수와 m1메서드가 로드 되어 있음.
    public static void main(String[] args) {
        System.out.println(1);
        m1();
        System.out.println(2);
        ScopeEx01 sc = new ScopeEx01(); // sc라는 변수는 메인 스택에, 메인에 sc는 heap의 주소가 담겨있다, 참조변수 ex) *50000
        System.out.println(sc.n1);
        sc.m2();

        /**
         * static (n2=2, m1(), main) -> 클래스명.x
         * -> 어디에서든지 접근 가능하다.
         *
         * heap (n1=1, m2())
         * -> heap끼리는 같은 scope 여서 접근이 가능하다.
         *
         * stack (n5-10)
         * -> 외부 접근 불가능
         *
         * 데이터는 스택에 저장
         * 실행은 스택 x
         */
        TvTest.my();
    }
}
