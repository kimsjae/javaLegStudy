package ch02;
// 1광년 거리 계산하기
public class Light {
    public static void main(String[] args) {
        // 빛이 1년 동안 진행하는 거리를 계산하여 보자.
        // double형의 변수를 사용해보자.

        final double LIGHT_SPEED = 3e5;
        double distance;

        distance = LIGHT_SPEED * 365 * 24 * 60  * 60;
        System.out.println("빛이 1년 동안 가는 거리 : " + distance + " km.");
    }
}
