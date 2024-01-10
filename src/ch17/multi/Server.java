package ch17.multi;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(10000);
            Socket socket = serverSocket.accept();

            class ReadThread implements Runnable {
                public void run() {
                    try {
                        while (true) {
                            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
                            String msg = br.readLine();
                            System.out.println(msg);
                        }

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

            class WriteThread implements Runnable {
                public void run() {
                    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                    try {
                        while (true) {
                            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(), "UTF-8"));
                            String s = br.readLine();
                            bw.write(s + "\n");
                            bw.flush();
                        }

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

            Thread read = new Thread(new ReadThread());
            Thread write = new Thread(new WriteThread());
            read.start();
            write.start();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}