import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BankManagementSystem extends JFrame implements ActionListener {
    // Components
    private JLabel titleLabel, nameLabel, balanceLabel;
    private JTextField nameField, balanceField;
    private JButton createAccountButton, depositButton, withdrawButton, checkBalanceButton;
    private JTextArea outputArea;

    // Bank Account Variables
    private String accountName;
    private double accountBalance;

    public BankManagementSystem() {
        // Frame Setup
        setTitle("Bank Management System By Abdul Akram");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Title Label
        titleLabel = new JLabel("Abdul Bank Management System ", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Times new Roman", Font.BOLD, 20));
        // titleLabel.setBackground(Red);
        add(titleLabel, BorderLayout.NORTH);

        // Input Panel
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(3, 2));

        nameLabel = new JLabel("                  Account Name:  ");
        nameField = new JTextField();
        balanceLabel = new JLabel("                Initial Balance:  ");
        balanceField = new JTextField();

        inputPanel.add(nameLabel);
        inputPanel.add(nameField);
        inputPanel.add(balanceLabel);
        inputPanel.add(balanceField);

        // Buttons
        createAccountButton = new JButton(" Create Account  ");
        depositButton = new JButton(" Deposit Amount ");
        withdrawButton = new JButton(" Withdraw Amount ");
        checkBalanceButton = new JButton(" Check Amount Balance ");

        createAccountButton.addActionListener(this);
        depositButton.addActionListener(this);
        withdrawButton.addActionListener(this);
        checkBalanceButton.addActionListener(this);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, 3));
        buttonPanel.add(createAccountButton);
        buttonPanel.add(depositButton);
        buttonPanel.add(withdrawButton);
        buttonPanel.add(checkBalanceButton);

        // Output Area
        outputArea = new JTextArea();
        outputArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(outputArea);

        // Add Components to Frame
        add(inputPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
        add(scrollPane, BorderLayout.EAST);

        // Initialize Account
        accountName = "";
        accountBalance = 0.0;

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == createAccountButton) {
            createAccount();
        } else if (e.getSource() == depositButton) {
            depositMoney();
        } else if (e.getSource() == withdrawButton) {
            withdrawMoney();
        } else if (e.getSource() == checkBalanceButton) {
            checkBalance();
        }
    }

    private void createAccount() {
        accountName = nameField.getText();
        try {
            accountBalance = Double.parseDouble(balanceField.getText());
            outputArea.setText("Account Created Successfully! \nName: " + accountName + "\nBalance: $" + accountBalance);
        } catch (NumberFormatException ex) {
            outputArea.setText("Invalid balance amount. Please enter a valid number.");
        }
    }

    private void depositMoney() {
        if (accountName.isEmpty()) {
            outputArea.setText(" Please create an account first. ");
            return;
        }
        try {
            double amount = Double.parseDouble(JOptionPane.showInputDialog(this, "Enter deposit amount:"));
            if (amount > 0) {
                accountBalance += amount;
                outputArea.setText("Deposit Successful!\nNew Balance: $" + accountBalance);
            } else {
                outputArea.setText("Invalid deposit amount. Please enter a positive number.");
            }
        } catch (NumberFormatException ex) {
            outputArea.setText("Invalid input. Please enter a valid number.");
        }
    }

    private void withdrawMoney() {
        if (accountName.isEmpty()) {
            outputArea.setText("Please create an account first.");
            return;
        }
        try {
            double amount = Double.parseDouble(JOptionPane.showInputDialog(this, "Enter withdrawal amount:"));
            if (amount > 0 && amount <= accountBalance) {
                accountBalance -= amount;
                outputArea.setText("Withdrawal Successful!\nNew Balance: $" + accountBalance);
            } else {
                outputArea.setText("Invalid withdrawal amount. Either insufficient balance or invalid input.");
            }
        } catch (NumberFormatException ex) {
            outputArea.setText("Invalid input. Please enter a valid number.");
        }
    }

    private void checkBalance() {
        if (accountName.isEmpty()) {
            outputArea.setText("Please create an account first.");
            return;
        }
        outputArea.setText("Account Name: " + accountName + "\nCurrent Balance: $" + accountBalance);
    }

    public static void main(String[] args) {
        new BankManagementSystem();
    }
}