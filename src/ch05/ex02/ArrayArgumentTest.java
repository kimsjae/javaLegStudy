package ch05.ex02;

/**
 * 배열을 받아서 최소값을 계산하여 반환하는 메소드 minArray(double[] list)를 작성하고 테스트해보자.
 */

public class ArrayArgumentTest {
    public static double minArray(double[] list) {
        double min = list[0];

        for (int i = 1; i < list.length; i++) {
            if (list[i] < min) {
                min = list[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        double[] a = {1.1, 2.2, 3.3, 4.4, 0.1, 0.2};
        double[] b = {-2.0, 3.0, -9.0, 2.9, 1.5};

        double min;

        min = minArray(a);
        System.out.println("첫 번째 배열의 최소값=" + min);
        min = minArray(b);
        System.out.println("두 번째 배열의 최소값=" + min);
    }
}
