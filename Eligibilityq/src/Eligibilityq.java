import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Eligibilityq extends JFrame {
    private JLabel YOB, Gender;
    private JTextField Year;
    private JRadioButton Female, Male;
    private JButton Elig;

    public Eligibilityq(){
        YOB = new JLabel("Year of Birth");
        Gender = new JLabel("Gender");
        Year = new JTextField(4);
        Female = new JRadioButton("Female");
        Male = new JRadioButton("Male"); // Capitalized "Male"
        Elig = new JButton("Eligibility");

        setLayout(new FlowLayout());
        add(YOB);
        add(Year);
        add(new JLabel("                                      "));
        add(Gender);
        add(Female);
        add(Male);
        add(new JLabel("                   "));
        add(Elig);

        setTitle("Eligibility Form");
        setVisible(true);
        setSize(300,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        ButtonGroup Bg = new ButtonGroup();
        Bg.add(Female);
        Bg.add(Male);
        Elig.addActionListener(new EligListener());
    }

    private class EligListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            String yearText = Year.getText();
            if (yearText.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter a year of birth.");
                return;
            }

            try {
                int yearOfBirth = Integer.parseInt(yearText);
                int currentYear = 2024;
                int age = currentYear - yearOfBirth;

                if (Female.isSelected()){
                    if (age > 18){
                        JOptionPane.showMessageDialog(null, "Qualified");
                    } else {
                        JOptionPane.showMessageDialog(null, "Not qualified");
                    }
                }
                if (Male.isSelected()){
                    if (age > 20){
                        JOptionPane.showMessageDialog(null, "Qualified");
                    } else {
                        JOptionPane.showMessageDialog(null, "Not qualified");
                    }
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Invalid year of birth.");
            }
        }
    }

    public static void main(String[] args){
        new Eligibilityq();
    }
}
