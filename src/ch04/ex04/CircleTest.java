package ch04.ex04;

public class CircleTest {
    public static void main(String[] args) {
        Circle obj; // 참초 변수 선언
        obj = new Circle(); // 객체 생성

        // 객체의 필드 접근
        obj.radius = 100;
        obj.color = "blue";

        double area = obj.getArea(); // 객체 메소드 접근
        System.out.println("원의 면적= " + area);
    }
}
