import javax.swing.*;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class UserInfo extends JFrame {
    private JLabel lbluser, lblpass, lblconf;
    private JTextField txtuser;
    private JPasswordField txtpass, txtconf;
    private JButton btnLogin, btnReset;
    private JRadioButton rad1, rad2;
public UserInfo(){

    lbluser = new JLabel("User Name: ");
    lblpass = new JLabel("Password: ");
    lblconf = new JLabel("Confirm password: ");
    txtuser = new JTextField(15);
    txtpass = new JPasswordField(15);
    txtconf = new JPasswordField(15);
    btnLogin = new JButton("Login");
    btnReset = new JButton("Reset");
    rad1 = new JRadioButton("New User");
    rad2 = new JRadioButton("Existing User");
    setTitle("User Information");
    setVisible(true);
    setSize(300, 200);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    txtpass.setEditable(false);
    txtconf.setEditable(false);
    ButtonGroup bgUser = new ButtonGroup();
    bgUser.add(rad1); //when we place buttons in the same button group they become MutEX
    bgUser.add(rad2); //this makes the buttons mutually exclusive, only selects one

    setLayout(new GridLayout(5,2)); //add the no of rows and columns
    add(lbluser);
    add(txtuser);
    add(rad1);
    add(rad2);
    add(lblpass);
    add(txtpass);
    add(lblconf);
    add(txtconf);
    add(btnLogin);
    add(btnReset);

    rad1.addActionListener(this::actionPerformed);
    rad2.addActionListener(this::actionPerformed);
    btnLogin.addActionListener(this::actionPerformed);
}
public void actionPerformed(ActionEvent e){
    if (e.getSource()== rad1){
        txtpass.setEditable(true);
        txtconf.setEditable(true);
        btnLogin.setText("create User");
    }
    if(e.getActionCommand().equals(rad2.getText())){
        txtpass.setEditable(true);
        txtconf.setEditable(false);
        btnLogin.setText("Login");
        if(e.getActionCommand().equals("Login")){ //we use get action command and not get source since get source cant differentiate
            String username = txtuser.getText();
            String password = txtpass.getText();
            if(username.equalsIgnoreCase("test") && password.equals("TEST")){
                JOptionPane.showMessageDialog(this,"welcome "+ username);
            }
            else{
                JOptionPane.showMessageDialog(this, "Type mismatch, try again.");
                txtuser.setText(" ");
                txtpass.setText(" ");
            }
        }
    }
}
public static void main(String[] args){
    new UserInfo();
}
}
