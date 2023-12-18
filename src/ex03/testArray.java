package ex03;

public class testArray {
    public static void main(String[] args) {
        int[][] s = new int [3][5];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(s[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
