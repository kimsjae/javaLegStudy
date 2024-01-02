package ch08.example2;

class Cal3 {
    void divide(int num) {
        System.out.println(10 / num);
    }
}

public class TryEx05 {
    public static void main(String[] args) {

        Cal3 c3 = new Cal3();
        try {
            c3.divide(0);
        } catch (Exception e) {
            System.out.println("0으로 나누지 마요");
        }
    }
}