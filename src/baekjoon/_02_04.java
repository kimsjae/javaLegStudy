package baekjoon;

import java.io.*;

public class _02_04 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            int x = Integer.parseInt(br.readLine());
            int y = Integer.parseInt(br.readLine());

            if (x > 0 && y > 0) {
                bw.write("1");
            }
            if (x < 0 && y > 0) {
                bw.write("2");
            }
            if (x < 0 && y < 0) {
                bw.write("3");
            }
            if (x > 0 && y < 0) {
                bw.write("4");
            }
            if (x == 0 || y == 0) {
                bw.write("0을 제외한 수를 입력하세요.");
            }
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
