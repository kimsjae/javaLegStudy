package ch17.half;

import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        try {
            // 서버에 연결
            Socket socket = new Socket("192.168.0.103", 10000);

            // 소켓의 입력 스트림과 출력 스트림 생성
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(), "UTF-8"));

            // 서버로 메시지 전송
            bw.write("Hello, Server!\n");
            bw.flush();

            // 서버로부터 응답 받기
            String response = br.readLine();
            System.out.println("서버로부터 받은 응답: " + response + "\n");

            // 연결 종료
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}