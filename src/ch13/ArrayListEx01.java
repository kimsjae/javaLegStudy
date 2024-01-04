package ch13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListEx01 {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList();
        arr.add(1);
        arr.add(2);

        // 위에 코드 3줄이랑 아래 코드 1줄이랑 같다.
        List<Integer> arr2 = Arrays.asList(1, 2);
    }
}
