package coffee;

import java.util.ArrayList;

public class Menu {
    public Barista item() {
        ArrayList<String> item = new ArrayList<>();
        item.add("아메리카노");
        item.add("에스프레소");
        item.add("카라멜 마키아또");
        item.add("카푸치노");
        return item();
    }
}
