import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionListener; //action listener is an event
import java.awt.event.ActionEvent; //action event is a class

public class Computation extends JFrame {
    private JLabel lblinput, lbloper, lblequal;
    private JTextField txtval1, txtval2, txtresult;
    private JButton btnSum, btnProduct, btnExit;

    public Computation() {
        lblinput = new JLabel("Input");
        lbloper = new JLabel("?");
        lblequal = new JLabel("=");
        txtval1 = new JTextField(5);
        txtval2 = new JTextField(5);
        txtresult = new JTextField(5);
        btnSum = new JButton("sum");
        btnProduct = new JButton("Product");
        btnExit = new JButton("exit");
        setTitle("Computation");
        setVisible(true);
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(new FlowLayout());

        // Adding components to the frame
        add(lblinput);
        add(txtval1);
        add(lbloper);
        add(txtval2);
        add(lblequal);
        add(txtresult);
        add(btnSum);
        add(btnProduct);
        add(btnExit);
        txtresult.setEditable(false);  //makes answer uneditable

        // Registering action listeners
        btnSum.addActionListener(new SumListener());
        btnProduct.addActionListener(new ProductListener());

        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { //main class implements listener
                int Choice = JOptionPane.showConfirmDialog(null,"Do you really want to exit?");
                if (Choice == 0){
                    System.exit(0);
                }
            }
        });
    }

    // Action listener(addresses clicking) for the Sum button, using a named class
    private class SumListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double val1 = Double.parseDouble(txtval1.getText());
            double val2 = Double.parseDouble(txtval2.getText());
            double result = val1 + val2;
            txtresult.setText(String.valueOf(result));
            lbloper.setText("+");
        }
    }
    // Action listener for the Product button
    private class ProductListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double val1 = Double.parseDouble(txtval1.getText());
            double val2 = Double.parseDouble(txtval2.getText());
            double result = val1 * val2;
            txtresult.setText(String.valueOf(result));
            lbloper.setText("x");
        }
    }
    public static void main(String[] args) {
        new Computation();
    }
}
