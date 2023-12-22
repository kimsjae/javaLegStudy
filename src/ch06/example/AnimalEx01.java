package ch06.example;

import ch04.example.model.Account;

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

    @Override
    void speak() {
        System.out.println("야옹");
    }
}

public class AnimalEx01 {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        c1.speak();
        c1.run();
    }
}
