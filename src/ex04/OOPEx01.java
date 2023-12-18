package ex04;

class Person3 {
    int weight = 100; // 상태
}

public class OOPEx01 {
    public static void main(String[] args) {
        Person3 p3 = new Person3();
        System.out.println("p3의 몸무게 : " + p3.weight);

        p3.weight = 60;
        System.out.println("p3의 몸무게 : " + p3.weight);
        // 문법으로는 괜찮지만
        // 잘못됨
        // 상태는 행위(메서드)를 통해서만 변경시켜야 한다.
    }
}
