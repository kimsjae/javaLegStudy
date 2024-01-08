package ch15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StreamEx03 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String line = br.readLine();
            System.out.println(line + 1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
