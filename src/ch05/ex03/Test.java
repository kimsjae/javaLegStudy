package ch05.ex03;

/**
 * main()도 정적 메소드이기 때문에 인스턴스 메소드를 호출할 수 없다.
 * 하지만 정적 메소드는 main()에서 호출할 수 있다.
 * 세제곱 계산 프로그램을 정적 메소드만을 이용하여 작성해보자.
 */

public class Test {
    public static int cube(int x) {
        int result = x * x * x;
        return result;
    }

    public static void main(String[] args) {
        System.out.println("10 * 10 * 10은 " + cube(10));
    }
}
