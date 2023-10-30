package Bai3;

import javax.swing.*;
import java.awt.*;
import java.text.*;
import java.util.*;

public class DigitalClock extends JPanel implements Runnable{
    JLabel digitalClock;
    Thread clockThread;

    public DigitalClock(){
        digitalClock = new JLabel();
        digitalClock.setFont(new Font("Times New Roman", Font.ITALIC, 30));
        digitalClock.setForeground(new Color(0, 0, 0));
        add(digitalClock);
        startRun();
    }

    private void startRun(){
        clockThread = new Thread(this);
        clockThread.start();
    }

    @Override
    public void run(){
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        while(true){
            Date now = new Date();
            String time = sdf.format(now);
            digitalClock.setText(time);
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }
}
