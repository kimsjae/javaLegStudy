package ch05;

// 객체를 메모리에 단 한번만 올릴 수 있는 패턴
// 공간은 힙에 뜬다
class President {

    static President instance = new President();

    public President() {

    }
}

public class SingleTonEx01 {
    public static void main(String[] args) {
        President p1 = President.instance;
        System.out.println(p1.hashCode());

        President p2 = President.instance;
        System.out.println(p2.hashCode());
    }
}
