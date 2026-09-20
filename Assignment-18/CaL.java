import javax.swing.*;
import java.awt.event.*;

public class CaL {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Calculator");

        JLabel label1 = new JLabel("Number 1:");
        label1.setBounds(30, 30, 100, 30);

        JTextField field1 = new JTextField();
        field1.setBounds(120, 30, 150, 30);

        JLabel label2 = new JLabel("Number 2:");
        label2.setBounds(30, 70, 100, 30);

        JTextField field2 = new JTextField();
        field2.setBounds(120, 70, 150, 30);

        JButton addButton = new JButton("Add");
        addButton.setBounds(50, 120, 90, 30);

        JButton subButton = new JButton("Subtract");
        subButton.setBounds(160, 120, 100, 30);

        JLabel result = new JLabel("Result:");
        result.setBounds(30, 170, 250, 30);

        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(field1.getText());
                int b = Integer.parseInt(field2.getText());

                result.setText("Result: " + (a + b));
            }
        });

        subButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(field1.getText());
                int b = Integer.parseInt(field2.getText());

                result.setText("Result: " + (a - b));
            }
        });

        frame.add(label1);
        frame.add(field1);
        frame.add(label2);
        frame.add(field2);
        frame.add(addButton);
        frame.add(subButton);
        frame.add(result);

        frame.setSize(320, 250);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}