package ch16.example3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ThreadEx03 extends JFrame {
    private boolean state = true;
    private boolean state2 = true;
    private int count = 0;
    private int count2 = 0;
    private JLabel countLabel;
    private JLabel count2Label;

    public ThreadEx03() {
        setTitle("숫자 카운터 프로그램");
        setVisible(true);
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        countLabel = new JLabel("숫자1: " + count);
        count2Label = new JLabel("숫자2: " + count2);
        countLabel.setAlignmentX(CENTER_ALIGNMENT);
        count2Label.setAlignmentX(CENTER_ALIGNMENT);
        add(countLabel);
        add(count2Label);
        JButton increaseButton = new JButton("멈춤");
        JButton increaseButton2 = new JButton("멈춤");
        increaseButton.setAlignmentX(CENTER_ALIGNMENT);
        increaseButton2.setAlignmentX(CENTER_ALIGNMENT);
        add(increaseButton);
        add(increaseButton2);
        // 버튼에 액션 리스너 추가
        increaseButton.addActionListener(e -> {
            state = false;
        });
        increaseButton2.addActionListener(e -> {
            state2 = false;
        });


        // 레이아웃 매니저 설정


        // 숫자를 표시할 레이블 생성


        // 멈춤 버튼 생성


        new Thread(
                () -> {
                    while (state) {
                        try {
                            Thread.sleep(1000);
                            count++;
                            countLabel.setText("숫자1: " + count);
                        } catch (InterruptedException ex) {
                            throw new RuntimeException(ex);
                        }
                    }
                }).start();
        new Thread(() -> {
            while (state2) {
                try {
                    Thread.sleep(1000);
                    count2++;
                    count2Label.setText("숫자2: " + count2);
                } catch (InterruptedException ex) {
                    throw new RuntimeException(ex);
                }
            }
        }).start();


    }

    public static void main(String[] args) {
        new ThreadEx03();
    }
}