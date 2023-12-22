package ch06.example2;

class Animal {
    void speak() {
        System.out.println("멍멍");
    }

    void run() {
        System.out.println("달린다");
    }
}

class Cat extends Animal {
    //    @Override
//    void speak() {
//
//    }  재정의 : 부모 메소드를 가림
// 동적 바인딩, 재정의, 오버라이드
    @Override
    void speak() {
        System.out.println("야옹");
    }
}

public class AnimalEx01 {
    public static void main(String[] args) {
        Animal c1 = new Cat(); // [Cat, Animal] // 다형성 : 타입을 두개중에 하나 선택할 수 있음
        c1.speak();
        c1.run();
    }
}
