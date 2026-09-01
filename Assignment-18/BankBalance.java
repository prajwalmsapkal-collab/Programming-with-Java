import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BankBalance extends JFrame implements ActionListener {

    JTextField balance, amount;
    JLabel result;
    JButton deposit, withdraw;

    BankBalance() {
        balance = new JTextField(10);
        amount = new JTextField(10);

        deposit = new JButton("Deposit");
        withdraw = new JButton("Withdraw");

        result = new JLabel("Balance: ");

        deposit.addActionListener(this);
        withdraw.addActionListener(this);

        setLayout(new FlowLayout());

        add(new JLabel("Initial Balance:"));
        add(balance);

        add(new JLabel("Amount:"));
        add(amount);

        add(deposit);
        add(withdraw);
        add(result);

        setSize(350, 200);
        setTitle("Bank Balance");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        double b = Double.parseDouble(balance.getText());
        double a = Double.parseDouble(amount.getText());

        if (e.getSource() == deposit) {
            result.setText("Balance: " + (b + a));
        }
        else if (e.getSource() == withdraw) {
            result.setText("Balance: " + (b - a));
        }
    }

    public static void main(String[] args) {
        new BankBalance();
    }
}