package ch06.ex04;

// Employee 클래스를 상속받아서 관리자를 나타내는 Manager 클래스와 프로그래머를 나타내는 Programmer 클래스를 작성한다
// Employee 클래스 안에는 월급을 계산하는 getSalary()메소드가 있다 이 메소드를 매니저,프로 클래스에서 오버라이딩해서 각 직급별로 다른 월급을 반환

class Employee {
    public int baseSalary = 3000000;

    int gerSalary() {
        return baseSalary;
    }
}

class Manager extends Employee {
    @Override
    int gerSalary() {
        return baseSalary + 2000000;
    }
}

class Programmer extends Employee {
    @Override
    int gerSalary() {
        return baseSalary + 3000000;
    }
}

public class Test {
    public static void main(String[] args) {
        Manager obj1 = new Manager();
        System.out.println("관리자의 월급 : " + obj1.gerSalary());

        Programmer obj2 = new Programmer();
        System.out.println("프로그래머의 월급 : " + obj2.gerSalary());
    }
}
