import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;

public class PaymentManagementSystem extends JFrame {

    private JTextField nameField, amountField, dateField;
    private JComboBox<String> paymentMethodBox;
    private DefaultTableModel tableModel;

    public PaymentManagementSystem() {
        setTitle("Payment Management System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700, 400);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Top Panel (Input Form)
        JPanel inputPanel = new JPanel(new GridLayout(5, 2, 10, 10));
        inputPanel.setBorder(BorderFactory.createTitledBorder("Enter Payment Details"));

        inputPanel.add(new JLabel("Customer Name:"));
        nameField = new JTextField();
        inputPanel.add(nameField);

        inputPanel.add(new JLabel("Amount:"));
        amountField = new JTextField();
        inputPanel.add(amountField);

        inputPanel.add(new JLabel("Date (dd-mm-yyyy):"));
        dateField = new JTextField();
        inputPanel.add(dateField);

        inputPanel.add(new JLabel("Payment Method:"));
        String[] methods = {"Cash", "Card", "UPI", "Bank Transfer"};
        paymentMethodBox = new JComboBox<>(methods);
        inputPanel.add(paymentMethodBox);

        JButton addButton = new JButton("Add Payment");
        JButton clearButton = new JButton("Clear");
        inputPanel.add(addButton);
        inputPanel.add(clearButton);

        add(inputPanel, BorderLayout.NORTH);

        // Table to display payments
        tableModel = new DefaultTableModel(new String[]{"Customer Name", "Amount", "Date", "Method"}, 0);
        JTable paymentTable = new JTable(tableModel);
        JScrollPane tableScrollPane = new JScrollPane(paymentTable);
        tableScrollPane.setBorder(BorderFactory.createTitledBorder("Payment Records"));

        add(tableScrollPane, BorderLayout.CENTER);

        // Button actions
        addButton.addActionListener(e -> addPayment());
        clearButton.addActionListener(e -> clearFields());

        setVisible(true);
    }

    private void addPayment() {
        String name = nameField.getText().trim();
        String amount = amountField.getText().trim();
        String date = dateField.getText().trim();
        String method = (String) paymentMethodBox.getSelectedItem();

        if (name.isEmpty() || amount.isEmpty() || date.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill all fields!", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            Double.parseDouble(amount);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Amount must be a number!", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        tableModel.addRow(new Object[]{name, amount, date, method});
        clearFields();
    }

    private void clearFields() {
        nameField.setText("");
        amountField.setText("");
        dateField.setText("");
        paymentMethodBox.setSelectedIndex(0);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(PaymentManagementSystem::new);
    }
}
