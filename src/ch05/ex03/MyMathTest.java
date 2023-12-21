package ch05.ex03;

/**
 * 간단한 연산을 제공하는 MyMath 클래스를 작성하여 보자.
 * MyMath 클래스는 n^k값을 계산하는 power() 메소드와 절대값 메소드를 제공한다.
 * 모두 정적 메소드로 정의해보자.
 */

class MyMath {
    public static int abs(int x) {
        return x > 0 ? x : -x;
    }

    public static int power(int base, int exponent) {
        int result = 1;
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        return result;
    }
}

public class MyMathTest {
    public static void main(String[] args) {
        System.out.println("10의 3승은 " + MyMath.power(10, 3));
    }
}
