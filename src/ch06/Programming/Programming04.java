package ch06.Programming;

class Rectangle {
    int width, height;
}

class ColorRectangle extends Rectangle {
    String color;

    public ColorRectangle(int width, int height, String color) {
        super.width = width;
        super.height = height;
        this.color = color;
    }
}

public class Programming04 {
    public static void main(String[] args) {
        ColorRectangle obj = new ColorRectangle(100, 100, "blue");
        System.out.println("가로 : " + obj.width);
        System.out.println("세로 : " + obj.height);
        System.out.println("색상 : " + obj.color);
    }
}
