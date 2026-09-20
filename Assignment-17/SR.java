import javax.swing.*;

public class SR {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Student Registration");

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(30, 30, 100, 30);

        JTextField nameField = new JTextField();
        nameField.setBounds(130, 30, 180, 30);

        JLabel rollLabel = new JLabel("Roll No:");
        rollLabel.setBounds(30, 70, 100, 30);

        JTextField rollField = new JTextField();
        rollField.setBounds(130, 70, 180, 30);

        JLabel courseLabel = new JLabel("Course:");
        courseLabel.setBounds(30, 110, 100, 30);

        JTextField courseField = new JTextField();
        courseField.setBounds(130, 110, 180, 30);

        JButton button = new JButton("Register");
        button.setBounds(130, 160, 100, 30);

        button.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame,
                "Name: " + nameField.getText() +
                "\nRoll No: " + rollField.getText() +
                "\nCourse: " + courseField.getText());
        });

        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(rollLabel);
        frame.add(rollField);
        frame.add(courseLabel);
        frame.add(courseField);
        frame.add(button);

        frame.setSize(350, 250);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}