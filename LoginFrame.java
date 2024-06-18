import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame implements ActionListener {
    JFrame j;
    JLabel username, pasword;
    JTextField text;
    JPasswordField pass;
    JButton login;

    LoginFrame(){
     
          j=new JFrame("login page");

        username = new JLabel("Username");
        username.setBounds(100, 100, 100, 20);
        j.add(username);

        pasword = new JLabel("Pasworrd");
        pasword.setBounds(100, 150, 100, 20);
        j.add(pasword);
        
     
        text = new JTextField();
        text.setBounds(200, 100, 100, 20);
        j.add(text);

        pass = new JPasswordField();
        pass.setBounds(200, 150, 100, 20);
        j.add(pass);

        login = new JButton("Login");
        login.setBounds(150, 300, 100, 50);
        j.add(login);
        login.addActionListener(this);
        j.setSize(500, 500);
        j.setLayout(null);
        j.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
       if(e.getSource()==login){
        String usertext;
        String passtext;
        usertext=text.getText();
        passtext=pass.getText();
        if(usertext.equalsIgnoreCase("Sachin")&&passtext.equalsIgnoreCase("86607")){
            JOptionPane.showMessageDialog(this,"aja teri hi bat thi");
        } else {
          JOptionPane.showMessageDialog(this,"bhaj ja ure t nhi maru bhot ga");
        }
        
       }
    }



    public static void main(String[] args) {
        new LoginFrame();
    }

}