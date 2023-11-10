/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Bai6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class SOCHINHPHUONG {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Kiểm tra số chính phương");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new FlowLayout());
        JLabel label = new JLabel("Nhập số trường hợp:");
        JTextField countField = new JTextField(5);
        JButton submitButton = new JButton("Xác nhận");

        inputPanel.add(label);
        inputPanel.add(countField);
        inputPanel.add(submitButton);

        JTextArea resultArea = new JTextArea(10, 20);
        resultArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(resultArea);

        frame.add(inputPanel, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String countInput = countField.getText();
                try {
                    int count = Integer.parseInt(countInput);
                    resultArea.setText(""); // Xóa kết quả trước đó

                    List<Long> numbers = new ArrayList<>();

                    for (int i = 0; i < count; i++) {
                        String numStr = JOptionPane.showInputDialog("Nhập số thứ " + (i + 1) + ":");
                        try {
                            long number = Long.parseLong(numStr.trim());
                            numbers.add(number);
                        } catch (NumberFormatException ex) {
                            resultArea.append(numStr + ": Không phải số hợp lệ\n");
                        }
                    }

                    for (long number : numbers) {
                        if (isPerfectSquare(number)) {
                            resultArea.append(number + ": YES\n");
                        } else {
                            resultArea.append(number + ": NO\n");
                        }
                    }
                } catch (NumberFormatException ex) {
                    resultArea.append("Số trường hợp không hợp lệ\n");
                }
            }
        });

        frame.setVisible(true);
    }

    public static boolean isPerfectSquare(long number) {
        if (number < 0) {
            return false;
        }

        long sqrt = (long) Math.sqrt(number);
        return sqrt * sqrt == number;
    }
}
