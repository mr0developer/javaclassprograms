import javax.swing.JOptionPane;
public class GUIDemo {
    public static void main(String[] args){
        String name;
        name = JOptionPane.showInputDialog("Enter your name: ");
        JOptionPane.showMessageDialog(null, name+ "welcome");
    }
}
