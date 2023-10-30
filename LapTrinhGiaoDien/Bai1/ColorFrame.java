package Bai1;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class ColorFrame extends JFrame implements ActionListener {
    private JPanel p=new JPanel();
    private JComboBox<String> chon=new JComboBox<>();
    private JButton newOK = new JButton("Green");
    private JButton ok=new JButton("OK");
    public ColorFrame(String title) throws HeadlessException{
        super(title);
        setLayout(new BorderLayout());
        add(p,BorderLayout.CENTER);
        
        JPanel ps=new JPanel();
        ps.setLayout(new FlowLayout());
        ps.add(ok);ps.add(newOK); ps.add(chon);


        chon.addItem("Do"); chon.addItem("Vang");chon.addItem("Den"); chon.addItem("Xanh");
        chon.addItem("Hong"); chon.addItem("Cam");chon.addItem("Xam");
        add(ps,BorderLayout.SOUTH);
        ok.addActionListener(this);
        newOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                p.setBackground(Color.green);
            }
        });
    }

    public void actionPerformed(ActionEvent e){
        String s=chon.getSelectedItem().toString();
        if(s.equals("Xanh")) p.setBackground(Color.BLUE);
        if(s.equals("Do")) p.setBackground(Color.RED);
        if(s.equals("Vang")) p.setBackground(Color.YELLOW);
        if(s.equals("Den")) p.setBackground(Color.BLACK);
        if(s.equals("Hong")) p.setBackground(Color.PINK);
        if(s.equals("Cam")) p.setBackground(Color.ORANGE);
        if(s.equals("Xam")) p.setBackground(Color.DARK_GRAY);
    }
}
