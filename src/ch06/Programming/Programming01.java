package ch06.Programming;

class Circle {
    protected int radius;

    public Circle(int r) {
        radius = r;
    }
}

class Pizza {
    String name;
    int num;

    public Pizza(String name, int num) {
        this.name = name;
        this.num = num;
    }

}

public class Programming01 {
    public static void main(String[] args) {
        Pizza obj = new Pizza("Pepperoni", 20);
        System.out.println("피자의 종류 : " + obj.name + ", 피자의 크기 : " + obj.num);
    }
}
