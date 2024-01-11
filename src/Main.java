import java.io.*;

public class Main {
    /**
     * 문제<p>
     * 두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.<p>
     * <p>입력<p>
     * 첫째 줄에 A와 B가 주어진다. A와 B는 공백 한 칸으로 구분되어져 있다.
     * </p>
     * <p></p>출력<p>
     * 첫째 줄에 다음 세 가지 중 하나를 출력한다.<p>
     * A가 B보다 큰 경우에는 '>'를 출력한다.<p>
     * A가 B보다 작은 경우에는 '<'를 출력한다.<p>
     * A와 B가 같은 경우에는 '=='를 출력한다.
     * <p>
     * <p>제한</p>
     * -10,000 ≤ A, B ≤ 10,000
     */
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            String[] s = br.readLine().split(" ");
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);

            if (a > b) {
                bw.write(">\n");
            }

            if (a < b) {
                bw.write("<\n");
            }

            if (a == b) {
                bw.write("==\n");
            }
            bw.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}