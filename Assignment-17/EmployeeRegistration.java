import javax.swing.*;

public class EmployeeRegistration {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Employee Registration");

        JLabel idLabel = new JLabel("Employee ID:");
        idLabel.setBounds(30, 30, 100, 30);

        JTextField idField = new JTextField();
        idField.setBounds(140, 30, 180, 30);

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(30, 70, 100, 30);

        JTextField nameField = new JTextField();
        nameField.setBounds(140, 70, 180, 30);

        JLabel deptLabel = new JLabel("Department:");
        deptLabel.setBounds(30, 110, 100, 30);

        JTextField deptField = new JTextField();
        deptField.setBounds(140, 110, 180, 30);

        JLabel salaryLabel = new JLabel("Salary:");
        salaryLabel.setBounds(30, 150, 100, 30);

        JTextField salaryField = new JTextField();
        salaryField.setBounds(140, 150, 180, 30);

        JButton button = new JButton("Register");
        button.setBounds(140, 200, 100, 30);

        button.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame,
                "Employee ID: " + idField.getText() +
                "\nName: " + nameField.getText() +
                "\nDepartment: " + deptField.getText() +
                "\nSalary: " + salaryField.getText());
        });

        frame.add(idLabel);
        frame.add(idField);
        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(deptLabel);
        frame.add(deptField);
        frame.add(salaryLabel);
        frame.add(salaryField);
        frame.add(button);

        frame.setSize(380, 290);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}