package ex03.test;

import java.util.Scanner;

public class BinaryTest02 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target;
        Scanner sc = new Scanner(System.in);
        System.out.print("찾고싶은 수를 입력하시오: ");
        target = sc.nextInt();

        int n = arr.length;
        int start = 0;
        int end = n - 1;
        int mid = (end - start) / 2;

        if (target == arr[mid]) {
            System.out.println(target + "값은 " + mid + "번지에 있습니다.");
        } else if (target < arr[mid]) {
            end = mid - 1;
        } else {
            start = mid + 1;
        }

//        if (target < arr[mid]) {
//            end = mid - 1;
//        }
//
//        if (target > arr[mid]) {
//            end = mid + 1;
//        }

        System.out.println(start);
        System.out.println(end);
    }
}


