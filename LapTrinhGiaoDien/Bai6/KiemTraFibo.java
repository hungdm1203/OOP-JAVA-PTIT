/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Bai6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KiemTraFibo extends JFrame implements ActionListener {
    private JTextField inputField;
    private JTextArea outputArea;

    public KiemTraFibo() {
        setTitle(" Kiểm Tra Fibonacci ");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));

        JLabel label = new JLabel("Nhập số Testcase:");
        inputField = new JTextField(10);
        JButton checkButton = new JButton("CHECK");
        checkButton.addActionListener(this);

        outputArea = new JTextArea();
        outputArea.setEditable(false);

        panel.add(label);
        panel.add(inputField);
        panel.add(checkButton);

        add(panel, BorderLayout.NORTH);
        add(new JScrollPane(outputArea), BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("CHECK")) {
            String inputText = inputField.getText();
            try {
                int numTests = Integer.parseInt(inputText);
                StringBuilder result = new StringBuilder();

                for (int i = 1; i <= numTests; i++) {
                    String testInput = JOptionPane.showInputDialog("Nhập một số nguyên dương cho bộ test " + i);
                    try {
                        long n = Long.parseLong(testInput);
                        if (isFibonacci(n)) {
                            result.append("YES\n");
                        } else {
                            result.append("NO\n");
                        }
                    } catch (NumberFormatException ex) {
                        result.append("Đầu vào không hợp lệ " + i + "Nhập vào một số nguyên dương.\n");
                    }
                }

                outputArea.setText(result.toString());
            } catch (NumberFormatException ex) {
                outputArea.setText("Dữ liệu đầu vào không hợp lệ cho số lượng bộ test. Vui lòng nhập một số hợp lệ.");
            }
        }
    }

    private boolean isFibonacci(long n) {
        if (n < 0) {
            return false;
        }
        long a = 0;
        long b = 1;
        while (a < n) {
            long temp = a;
            a = b;
            b = temp + b;
        }
        return a == n;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            KiemTraFibo frame = new KiemTraFibo();
            frame.setVisible(true);
        });
    }
}
