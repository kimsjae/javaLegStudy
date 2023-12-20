package ch04.ex03;

public class This {
    int radius;

    public This(int radius) {
        this.radius = radius;
    }

    public This() {
        this(0);
    }

    double getArea() {
        return 3.14 * radius * radius;
    }
}
