/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Bai6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class TongNSoNguyenDuongDauTien extends JFrame implements ActionListener {
    private JTextField inputField;
    private JTextArea outputArea;

    public TongNSoNguyenDuongDauTien() {
        setTitle("Tinh Tổng N Số Nguyên Dương Đầu Tiên");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));

        JLabel label = new JLabel("Nhập số Test:");
        inputField = new JTextField(10);
        JButton calculateButton = new JButton("Tính");
        calculateButton.addActionListener(this);

        outputArea = new JTextArea();
        outputArea.setEditable(false);

        panel.add(label);
        panel.add(inputField);
        panel.add(calculateButton);

        add(panel, BorderLayout.NORTH);
        add(new JScrollPane(outputArea), BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Tính")) {
            String inputText = inputField.getText();
            try {
                int numTests = Integer.parseInt(inputText);
                StringBuilder result = new StringBuilder();

                for (int i = 1; i <= numTests; i++) {
                    String testInput = JOptionPane.showInputDialog("Nhập n Testcase" + i);
                    try {
                        long N = Long.parseLong(testInput);
                        long sum = calculateSum(N);
                        result.append("Tổng cho test #" + i + ": " + sum + "\n");
                    } catch (NumberFormatException ex) {
                        result.append("Đầu vào không hợp lệ #" + i + ". Nhập vào một giá trị nguyên dương .\n");
                    }
                }

                outputArea.setText(result.toString());
            } catch (NumberFormatException ex) {
                outputArea.setText("Đầu vào không hợp lệ . Vui lòng nhập số hợp lệ.");
            }
        }
    }

    private long calculateSum(long N) {
        return (N * (N + 1)) / 2;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TongNSoNguyenDuongDauTien frame = new TongNSoNguyenDuongDauTien();
            frame.setVisible(true);
        });
    }
}

