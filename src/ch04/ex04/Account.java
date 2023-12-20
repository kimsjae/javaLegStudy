package ch04.ex04;

public class Account {
    // 필드가 모두 private로 선언되었다.
    // 클래스 내부에서만 사용이 가능하다.
    private int regNumber;
    private String name;
    private int balance;

    // 접근자와 설정자를 사용하고 있다.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}