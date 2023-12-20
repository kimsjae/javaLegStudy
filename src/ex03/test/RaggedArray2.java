package ex03.test;

import java.util.Arrays;

public class RaggedArray2 {
    public static void main(String[] args) {
        //int[][] ragged = new int[3][];
        int[][] ragged = {{1, 2, 3}, {4, 5, 6, 7}, {8, 9}};
        for (int[] row : ragged) {
            System.out.println(Arrays.toString(row));
        }
    }
}
