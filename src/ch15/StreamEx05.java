package ch15;

import java.io.*;

/**
 * 상대 경로 : 실행되는 위치(일반적으론 프로젝트폴더)를 기반으로 경로 정하는 것<p></p>
 * 절대 경로 : 루트에서부터 경로를 찾는 것<p></p><p></p>
 * 윈도우 : C:\\workspace\\hello.txt<p></p>
 * 맥, 리눅스 : /workspace/hello.txt
 */

public class StreamEx05 {
    public static void main(String[] args) {
        try {
            //BufferedReader br = new BufferedReader(new FileReader("D:\\workspace\\java_lec\\study\\src\\ch15\\hello.txt"));
            BufferedReader br = new BufferedReader(new FileReader("src\\ch15\\hello.txt"));

            String line = br.readLine();
            System.out.println(line);

            BufferedWriter bw = new BufferedWriter(new FileWriter("input.txt"));
            bw.write("안녕");
            bw.write("반가워\n");
            bw.write("ddd");
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
