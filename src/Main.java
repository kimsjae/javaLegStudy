import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            bw.write("\\    /\\ \n");
            bw.write(" )  ( ')\n");
            bw.write("(  /  ) \n");
            bw.write(" \\(__)| \n");
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}