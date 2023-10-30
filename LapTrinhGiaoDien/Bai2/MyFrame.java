package Bai2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyFrame extends JFrame implements ActionListener{
    private JPanel tools=new JPanel();
    private JButton OK=new JButton("OK");
    private JComboBox<String> color=new JComboBox<>();
    private JComboBox<String> type=new JComboBox<>();
    private JComboBox<String> geometry=new JComboBox<>();
    private String selectedType;
    private Color selectedColor;

    public MyFrame(String s) throws HeadlessException{
        super(s);

        selectedColor = Color.red;
        selectedType = "Dac";

        setLayout(new BorderLayout());

        type.addItem("Dac");
        type.addItem("Rong");

        color.addItem("Vang");
        color.addItem("Do");
        color.addItem("Xanh la");
        color.addItem("Den");

        geometry.addItem("HCN");
        geometry.addItem("Vuong");
        geometry.addItem("Tron");
        geometry.addItem("Da giac");

        tools.setLayout(new FlowLayout());
        tools.add(OK);
        tools.add(geometry);
        tools.add(type);
        tools.add(color);
        add(tools, BorderLayout.SOUTH);

        OK.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == OK){
            switch (color.getSelectedItem().toString()){
                case "Do":
                    selectedColor = new Color(255, 0, 0);
                    break;
                case "Vang":
                    selectedColor = new Color(255,255,0);
                    break;
                case "Xanh":
                    selectedColor = new Color(0,142,0);
                    break;
                case "Den":
                    selectedColor = new Color(0,0,0);
                    break;
            }
            selectedType = type.getSelectedItem().toString();
            switch (geometry.getSelectedItem().toString()){
                case "HCN":
                    add(new Rectangle(selectedType, selectedColor));
                    break;
                case "Vuong":
                    add(new Square(selectedType, selectedColor));
                    break;
                case "Tron":
                    add(new Circle(selectedType, selectedColor));
                    break;
                case "Da giac":
                    add(new Polygons(selectedType, selectedColor));
                    break;
            }
            setVisible(true);
        }
    }
}
