package ch06.Programming;

class Circle {
    protected int radius;

    public Circle(int r) {
        radius = r;
    }
}

class Pizza extends Circle {
    String name = "Pepperoni";

    public Pizza(String name, int r) {
        super(r);
        this.name = name;
    }
}

public class Programming01 {
    public static void main(String[] args) {
        Pizza p = new Pizza("Pepperoni", 20);
        System.out.println("피자의 종류 : " + p.name + ", 피자의 크기 : " + p.radius);
    }
}
