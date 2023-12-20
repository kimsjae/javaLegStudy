package ch04;

public class MethodEx01 {

    static void m1() {
        System.out.println("m1");
    }

    static String m2() {
        System.out.println("m2");
        return "m2"; // 메서드 종료
    }

    public static void main(String[] args) {
        m1();
        String result = m2(); // m2() = "m2"
        System.out.println("result : " + result);
        // 암기 : 메서드는 호출할 때만 열린다
        // 15번 컨트롤클릭하면 6번이 열린다
        // 16번 컨트롤클릭하면 10번~11번이 열린다
        // 내부가 안보이다가 실행하면 그때 보인다
        // 실행이 끝나면 리턴값으로 바뀐다
    }
}
