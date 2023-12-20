package ex04;

public class TvTest {

    public static int my() {
        int channel = 7;
        int volume = 10;
        boolean onOff = true;
        return channel;
    }

    void your() {
        int channel = 7;
        int volume = 10;
        boolean onOff = true;
    }


    public static void main(String[] args) {

        TvTest sc = new TvTest();
        sc.your();

        System.out.println(my());
    }
}
