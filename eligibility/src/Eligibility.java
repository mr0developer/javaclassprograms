import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Eligibility extends JFrame {
    private JLabel YOB, Gender;
    private JTextField Year;
    private JRadioButton Female, Male;
    private JButton Elig;

    public Eligibility(){
        YOB=new JLabel("Year of Birth");
        Gender=new JLabel("Gender");
        Year=new JTextField(4);
        Female=new JRadioButton("Female");
        Male=new JRadioButton("male");
        Elig= new JButton("Eligibility");

        setLayout(new FlowLayout());
        add(YOB);
        add(Year);
        add(Gender);
        add(Female);
        add(Male);
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
            if (Female.isSelected()){
                int val =Integer.parseInt(Year.getText());
                int Age = 2024 - val;
                if (Age>18){
                    JOptionPane.showMessageDialog(null, "Qualified");
                }
                else {
                    JOptionPane.showMessageDialog(null, "Not qualified");
                }
            }
            if (Male.isSelected()){
                int val =Integer.parseInt(Year.getText());
                int Age = 2024 - val;
                if (Age>20){
                    JOptionPane.showMessageDialog(null, "Qualified");
                }
                else {
                    JOptionPane.showMessageDialog(null, "Not qualified");
                }
            }
        }
    }

    public static void main(String[] args){
        new Eligibility();
    }
}
