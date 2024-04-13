import javax.swing.*;

public class RadioButtonExample {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Radio Button Example");

        // Set the frame size
        frame.setSize(300, 200);

        // Create a JPanel
        JPanel panel = new JPanel();

        // Create a ButtonGroup to group the radio buttons
        ButtonGroup group = new ButtonGroup();

        // Create radio buttons
        JRadioButton radioButton1 = new JRadioButton("Option 1");
        JRadioButton radioButton2 = new JRadioButton("Option 2");
        JRadioButton radioButton3 = new JRadioButton("Option 3");

        // Add radio buttons to the ButtonGroup
        group.add(radioButton1);
        group.add(radioButton2);
        group.add(radioButton3);

        // Add radio buttons to the panel
        panel.add(radioButton1);
        panel.add(radioButton2);
        panel.add(radioButton3);

        // Add the panel to the frame
        frame.add(panel);

        // Set frame visibility
        frame.setVisible(true);

        // Set default close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
