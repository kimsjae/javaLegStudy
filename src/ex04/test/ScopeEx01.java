package ex04.test;

public class ScopeEx01 {

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
    }
}
