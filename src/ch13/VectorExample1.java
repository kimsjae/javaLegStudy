package ch13;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class VectorExample1 {
    public static void main(String[] args) {
        List<String> vec = new Vector();
        System.out.println("요소 추가");
        vec.add("Apple");
        vec.add("Orange");
        vec.add("Mango");


        System.out.println("\n크기");
        System.out.println(vec.size());


        System.out.println("\n인덱스 접근");
        System.out.println(vec.get(1));


        System.out.println("\n정렬 (오름차순)");
        Collections.sort(vec);

        for (String s : vec) {
            System.out.print(s + " ");
        }

        System.out.println();


        System.out.println("\n정렬 (내림차순)");
        Collections.sort(vec, Collections.reverseOrder());

        for (String s : vec) {
            System.out.print(s + " ");
        }

        System.out.println();

        // 정렬 다른 방법
        // Arrays.sort();


        System.out.println("\n삭제");
        String result = vec.remove(2);
        System.out.println(result);
        System.out.println(vec.size());


        System.out.println("\n값 찾기");
        boolean search = vec.contains("mango");
        System.out.println(search);


        System.out.println("\n대소문자 구분 없이 값 찾기");
        String a = "Mango";
        boolean check = a.equalsIgnoreCase("mAngo");
        System.out.println(check);
    }
}
