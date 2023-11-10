/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Bai6;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TinhGiaiThua extends JFrame {
    private JTextField inputField;
    private JButton calculateButton;
    private JLabel resultLabel;

    public TinhGiaiThua() {
        setTitle("Tính Giai Thừa");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        inputField = new JTextField(10);
        calculateButton = new JButton("Tính");
        resultLabel = new JLabel("Kết quả: ");

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateFactorial();
            }
        });

        panel.add(new JLabel("Nhập số: "));
        panel.add(inputField);
        panel.add(calculateButton);
        panel.add(resultLabel);

        add(panel);

        setVisible(true);
    }

    private void calculateFactorial() {
        try {
            int number = Integer.parseInt(inputField.getText());
            long factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            resultLabel.setText("Kết quả: " + factorial);
        } catch (NumberFormatException ex) {
            resultLabel.setText("Nhập số nguyên hợp lệ!");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TinhGiaiThua();
            }
        });
    }
}