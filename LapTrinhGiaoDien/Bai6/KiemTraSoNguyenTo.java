/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Bai6;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class KiemTraSoNguyenTo extends JFrame implements ActionListener {
    private JTextField inputField;
    private JTextArea outputArea;

    public KiemTraSoNguyenTo() {
        setTitle("KIỂM TRA SỐ NGUYÊN TỐ");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1));

        JLabel label = new JLabel("Nhập Số TestCase:");
        inputField = new JTextField(10);
        JButton startButton = new JButton("Start");
        startButton.addActionListener(this);

        outputArea = new JTextArea();
        outputArea.setEditable(false);

        panel.add(label);
        panel.add(inputField);
        panel.add(startButton);

        add(panel, BorderLayout.NORTH);
        add(new JScrollPane(outputArea), BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Start")) {
            String inputText = inputField.getText();
            try {
                int numTests = Integer.parseInt(inputText);
                StringBuilder result = new StringBuilder();

                for (int i = 1; i <= numTests; i++) {
                    String testInput = JOptionPane.showInputDialog("Enter test case #" + i);
                    try {
                        int number = Integer.parseInt(testInput);
                        boolean isPrime = isPrimeNumber(number);
                        result.append(isPrime ? "YES\n" : "NO\n");
                    } catch (NumberFormatException ex) {
                        result.append("Đầu vào không hợp lệ" + i + ". Nhập vào một sô nguyên.\n");
                    }
                }

                outputArea.setText(result.toString());
            } catch (NumberFormatException ex) {
                outputArea.setText("Dữ liệu đầu vào không hợp lệ cho số lượng bộ test. Vui lòng nhập một số hợp lệ.");
            }
        }
    }

    private boolean isPrimeNumber(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            KiemTraSoNguyenTo frame = new KiemTraSoNguyenTo();
            frame.setVisible(true);
        });
    }
}

