package ch07.ex02;

interface Remocon {
    void on();

    void off();
}

class SamsungRemocon implements Remocon {

    @Override
    public void on() {
        System.out.println("삼성 리모컨 on");
    }

    @Override
    public void off() {
        System.out.println("삼성 리모컨 off");
    }
}

class LgRemocon implements Remocon {

    @Override
    public void on() {
        System.out.println("엘지 리모컨 on");
    }

    @Override
    public void off() {
        System.out.println("엘지 리모컨 off");
    }
}

/**
 * 작성자 : 홍길동<p>
 * 날짜 : 2023.12.26<p>
 * 구현체 : SamsungRemocon, LgRemocon
 */
class CommonRemocon {
    private Remocon r;

    public CommonRemocon(Remocon r) {
        this.r = r;
    }

    public void on() {
        r.on();
    }

    public void off() {
        r.off();
    }
}

public class InterEx01 {
    public static void main(String[] args) {
        CommonRemocon cr = new CommonRemocon(new SamsungRemocon());
        cr.on();
    }
}