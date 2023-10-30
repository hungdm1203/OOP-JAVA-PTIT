package Bai7_J07057;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class MyFrame extends JFrame implements ActionListener {
    private JTable table;
    private JScrollPane sp;
    private JButton bt;
    private ArrayList<ThiSinh> list;

    public MyFrame(String s, ArrayList<ThiSinh> list) throws HeadlessException{
        super(s);
        this.list=list;
        Object columns[]={"Ma TS","Ho va ten","Dan toc","Khu vuc","Diem thi","Tong diem","Trang thai"};
        Object data[][]=new Object[list.size()][7];


        table=new JTable(data,columns);
        table.setBounds(30, 40, 200, 300);
        table.getColumnModel().getColumn(0).setPreferredWidth(50);
        table.getColumnModel().getColumn(1).setPreferredWidth(200);
        table.getColumnModel().getColumn(2).setPreferredWidth(70);
        table.getColumnModel().getColumn(3).setPreferredWidth(60);
        table.getColumnModel().getColumn(4).setPreferredWidth(70);
        table.getColumnModel().getColumn(5).setPreferredWidth(70);
        table.getColumnModel().getColumn(6).setPreferredWidth(80);
        table.setAutoCreateRowSorter(true);

        sp=new JScrollPane(table);
        setLayout(new BorderLayout());

        bt=new JButton("Read File");
        bt.addActionListener(this);

        add(sp,BorderLayout.CENTER);
        add(bt,BorderLayout.SOUTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for(int i=0;i<list.size();i++){
            table.setValueAt(list.get(i).getId(), i, 0);
            table.setValueAt(list.get(i).getName(), i, 1);
            table.setValueAt(list.get(i).getDt(), i, 2);
            table.setValueAt(list.get(i).getKv(), i, 3);
            table.setValueAt(list.get(i).getScore(), i, 4);
            table.setValueAt(list.get(i).getSum(), i, 5);
            table.setValueAt(list.get(i).getNote(), i, 6);
        }
    }

    


    
}