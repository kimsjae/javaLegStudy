package ch02;
// 원의 면적 계산하기
public class AreaTest {
    public static void main(String[] args) {
        // 반지름이 5.0인 원의 면적을 계산하는 프로그램을 작성해보자.
        // 모든 변수를 실수형으로 정의하라.
        // 파이는 상수 PI로 정의해보자.

        final double PI = 3.141592;
        double radius, area;

        radius = 5.0;
        area = PI * radius * radius;
        System.out.println("반지름이 5인 원의 면적은 " + area);
    }
}
