package ch05.ex03;

/**
 * 어떤 가게에서 하루에 판매되는 피자의 개수를 알고 싶다고 하자.
 * 피자의 개수를 알기 위해서는 지금까지 피자가 얼마나 생성되었는지를 알아야 한다.
 * 이러한 경우에 정적 변수를 선언하고 생성자에게 개수를 증가시키면 된다.
 */

class Pizza {
    private String toppings;
    private int radius;
    static final double PI = 3.141592;
    static int count = 0;

    public Pizza(String toppings) {
        this.toppings = toppings;
        count++;
    }
}

public class PizzaTest {
    public static void main(String[] args) {
        Pizza p1 = new Pizza("Super Supreme");
        Pizza p2 = new Pizza("Cheese");
        Pizza p3 = new Pizza("Pepperoni");
        int n = Pizza.count;
        System.out.println("지금까지 판매된 피자 개수 = " + n);
    }
}
