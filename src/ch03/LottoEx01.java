package ch03;

import java.util.Arrays;
import java.util.Random;

public class LottoEx01 {
    public static void main(String[] args) {

        int[] arr = new int[6];
        Random r = new Random();

        int num;

        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                num = r.nextInt(6) + 1;
                arr[i] = num;
            } else {
                while (true) {
                    num = r.nextInt(6) + 1;
                    if (arr[i - 1] != num) {
                        arr[i] = num;
                        //a++;
                        break;


//                        for (int j = 1; j <= 5; j++) {
//                            if (arr[i-j] != num) {
//
//                            }
//                        }


//                    if (arr[i - 1] != num) {
//                        if (arr[i-2] != num) {
//
//                        }
//                    }
//

                    }
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
