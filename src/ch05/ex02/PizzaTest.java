package ch05.ex02;

/**
 * 피자 객체 2개를 받아서 더 큰 피자 객체를 반환하는 메소드 Pizza whosLargest(Pizza p1, Pizza p2)를 작성하고 테스트하라.
 */

class Pizza {
    int radius;

    Pizza(int r) {
        radius = r;
    }

    Pizza whosLargest(Pizza p1, Pizza p2) {
        if (p1.radius > p2.radius) {
            return p1;
        } else {
            return p2;
        }
    }
}

public class PizzaTest {
    public static void main(String[] args) {
        Pizza obj1 = new Pizza(14);
        Pizza obj2 = new Pizza(18);

        Pizza largest = obj1.whosLargest(obj1, obj2);
        System.out.println(largest.radius + "인치 피자가 더 큼.");
    }
}
