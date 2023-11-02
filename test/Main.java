// package test;

// import java.io.*;

// public class Main {
//     public static void main(String[] args) throws Exception {
//         // ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("C:\\WORKSPACE\\Java\\test\\SV.IN"));
//         // SinhVien a=new SinhVien(100,"xxx","D21",10,10,2000);
//         // out.writeObject(a);
//         // out.close();
//         // ObjectInputStream in=new ObjectInputStream(new FileInputStream("C:\\WORKSPACE\\Java\\test\\SV.IN"));
//         // SinhVien b=(SinhVien)in.readObject();
//         // System.out.println(b);
//         // in.close();

//         // Person a=new Student("dmh", "hd","1203");
//         // System.out.println(a);
//     }
// }
package test;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.*;

import javax.swing.table.*;


public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JTable from File Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        DefaultTableModel model = new DefaultTableModel();
        JTable table = new JTable(model);

        // Đọc dữ liệu từ tệp tin và đưa vào JTable
        try {
            Scanner sc = new Scanner(new File("C:\\WORKSPACE\\Java\\test\\data.txt"));
            String line;
            // Đọc tiêu đề cột từ tệp tin (nếu có)
            if ((line = sc.nextLine()) != null) {
                String[] columnNames = line.split(",");
                for (String columnName : columnNames) {
                    model.addColumn(columnName);
                }
            }
            // Đọc dữ liệu hàng từ tệp tin và thêm vào JTable
            while (sc.hasNextLine()) {
                String[] rowData = sc.nextLine().split(",");
                model.addRow(rowData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane);
        frame.setVisible(true);
    }
}
