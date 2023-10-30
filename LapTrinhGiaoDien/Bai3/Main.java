package Bai3;

import javax.swing.*;
import java.awt.*;

public class Main{
    public static void main(String[] args){
        JFrame frame = new JFrame("Clock");
        frame.setLayout(new BorderLayout());
        frame.add(new StillClock(), BorderLayout.CENTER);
        frame.add(new DigitalClock(), BorderLayout.SOUTH);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        // frame.setResizable(false); khong cho nguoi dung thay doi kich thuoc cua so
        // frame.setLocationRelativeTo(null); khi chay cua so hien len o chinh giua man hinh
    }
}
