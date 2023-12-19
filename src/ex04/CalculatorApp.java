package ex04;

import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Calculator cal = new Calculator();

        Scanner sc = new Scanner(System.in);
        double n1 = sc.nextInt();
        Scanner sc2 = new Scanner(System.in);
        double n2 = sc2.nextInt();

        double result = cal.add(n1, n2);
        System.out.println("add : " + result);

        double result2 = cal.minus(n1, n2);
        System.out.println("minus : " + result2);

        double result3 = cal.divide(n1, n2);
        System.out.println("divide : " + result3);

        double result4 = cal.multi(n1, n2);
        System.out.println("multi : " + result4);
    }
}
