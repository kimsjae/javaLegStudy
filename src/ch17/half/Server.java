package ch17.half;

import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        try {
            // 서버 소켓 생성
            ServerSocket serverSocket = new ServerSocket(10000);

            System.out.println("서버가 시작되었습니다.");

            // 클라이언트의 연결 대기
            Socket clientSocket = serverSocket.accept();
            System.out.println("클라이언트가 접속했습니다.");

            // 소켓의 입력 스트림과 출력 스트림 생성
            BufferedReader br = new BufferedReader(new InputStreamReader(clientSocket.getInputStream(), "UTF-8"));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream(), "UTF-8"));

            // 클라이언트로부터 메시지 받기
            String message = br.readLine();
            System.out.println("클라이언트로부터 받은 메시지: " + message + "\n");

            // 클라이언트에게 응답 보내기
            bw.write("Hello, Client!\n");
            bw.flush();

            // 연결 종료
            clientSocket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}