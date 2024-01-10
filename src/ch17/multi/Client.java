package ch17.multi;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 10000);

            class ReadThread implements Runnable {
                public void run() {
                    try {
                        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));

                        while (true) {
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
