import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
public class Adminpage implements ActionListener {

    JFrame j;
    JFrame A;
    JFrame S;
    JFrame F;
    JButton admin;
    JButton librarian;
   public JLabel pic;
    JLabel username;
    JTextField ur;
    JLabel password;
    JPasswordField pf;
    JButton login;
    JButton addL;
    JButton viewL;
    JButton deleteL;
    JButton logoutA;
    JButton addB;
    JButton ViewB;
    JButton IssueB;
    JButton ViewIssueB;
    JButton ReturnB;
    JButton logotL;

    void creTFILE() {
        File myFile = new File("lib.txt");
        try {
            myFile.createNewFile();
        } catch (IOException e) {
            System.out.println("file not crated");
            e.printStackTrace();
        }
    }

    Adminpage() {
        creTFILE();
        // main
        j = new JFrame("library");
        pic = new JLabel(new ImageIcon("ss.jpg"));
        pic.setLayout(new FlowLayout());
        pic.setBounds(0, 0, 1900, 1080);
        JLabel lib = new JLabel("Library");
        admin = new JButton("Admin Login");
        librarian = new JButton("librarian Login");
        lib.setBounds(600, 200, 100, 100);
        admin.setBounds(550, 275, 150, 50);
        librarian.setBounds(550, 335, 150, 50);
        j.add(lib);
        j.add(librarian);
        j.add(pic);
        j.add(admin);
        j.setLayout(null);
        j.setBounds(0, 0, 1920, 1080);
        j.setVisible(true);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        admin.addActionListener(this);
        librarian.addActionListener(this);
        // admin usermane add password
        A = new JFrame("Admin");
        username = new JLabel("Username");
        ur = new JTextField();
        password = new JLabel("Password");
        pf = new JPasswordField();
        login = new JButton("Login");
        username.setBounds(550, 200, 100, 100);
        password.setBounds(550, 245, 100, 100);
        pf.setBounds(625, 285, 100, 20);
        ur.setBounds(625, 245, 100, 20);
        login.setBounds(600, 335, 100, 50);
        A.add(username);
        A.add(password);
        A.add(ur);
        A.add(pf);
        A.add(login);
        A.setLayout(null);
        A.setBounds(0, 0, 1920, 1080);
        A.setVisible(false);
        A.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        login.addActionListener(this);
        // after login page
        S = new JFrame("admin");
        S.setLayout(null);
        S.setBounds(0, 0, 1920, 1080);
        S.setVisible(false);
        S.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addL = new JButton("Add Librarian");
        viewL = new JButton("View Librarian");
        deleteL = new JButton("Delete Librarian");
        logoutA = new JButton("Logout");
        addL.setBounds(535, 180, 200, 50);
        viewL.setBounds(535, 250, 200, 50);
        deleteL.setBounds(535, 320, 200, 50);
        logoutA.setBounds(535, 390, 200, 50);
        S.add(viewL);
        S.add(addL);
        S.add(deleteL);
        S.add(logoutA);
        logoutA.addActionListener(this);
        // cod hare for admin setion + buton
        // Librarian
        F = new JFrame("admin");
        F.setLayout(null);
        F.setBounds(0, 0, 1920, 1080);
        F.setVisible(false);
        F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addB = new JButton("Add Books");
        ViewB = new JButton("View Books");
        IssueB = new JButton("Issue Book");
        ViewIssueB = new JButton("View Issue Book");
        ReturnB = new JButton("Return book");
        logotL = new JButton("logout");
        addB.setBounds(535, 160, 200, 50);
        ViewB.setBounds(535, 230, 200, 50);
        IssueB.setBounds(535, 300, 200, 50);
        ViewIssueB.setBounds(535, 370, 200, 50);
        ReturnB.setBounds(535, 440, 200, 50);
        logotL.setBounds(535, 510, 200, 50);
        F.add(addB);
        F.add(ViewB);
        F.add(IssueB);
        F.add(ViewIssueB);
        F.add(ReturnB);
        F.add(logotL);
        logotL.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == admin) {
            j.setVisible(false);
            A.setVisible(true);
            A.add(pic);
        }
        if (e.getSource() == librarian) {
            j.setVisible(false);
            F.setVisible(true);
            F.add(pic);
        }
        if (e.getSource() == login) {
            String userText;
            String pwdText;
            userText = ur.getText();
            pwdText = pf.getText();
            if (userText.equalsIgnoreCase("") && pwdText.equalsIgnoreCase("")) {
                A.setVisible(false);
                S.setVisible(true);
                S.add(pic);
                ur.setText("");
                pf.setText("");
            } else {
                JOptionPane.showMessageDialog(A, "Invalid Username or Password");
            }
        }
        if(e.getSource()==logoutA){
            S.setVisible(false);
            j.setVisible(true);
            j.add(pic);
        }
        if(e.getSource()==logotL){
            F.setVisible(false);
            j.setVisible(true);
            j.add(pic);
        }  
        addL.addActionListener(this);
        
    
         if(e.getSource()==addL){
        JFrame LibrarianADD=new JFrame();
        LibrarianADD.setLayout(null);
     LibrarianADD.setBounds(0, 0, 1920, 1080);
     LibrarianADD.setVisible(true);
     LibrarianADD.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     JLabel Libname=new JLabel("Librarian name");
     JLabel Librarianusername=new JLabel("username");
     JLabel Librarianpassword=new JLabel("password");
     JTextField Libnamee=new JTextField();
     JTextField libuserr=new JTextField();
     JPasswordField libpass=new JPasswordField();
     JButton addLiBBBB=new JButton("ADD");
     Libname.setBounds(500,200,100,30);
     Libnamee.setBounds(700,200,100,30);
     Librarianusername.setBounds(500,300,100,30);
     libuserr.setBounds(700,300,100,30);
     Librarianpassword.setBounds(500,400,100,30);
     libpass.setBounds(700,400,100,30);
     addLiBBBB.setBounds(650,500,100,50);
     LibrarianADD.add(Libname);
     LibrarianADD.add(Libnamee);
     LibrarianADD.add(Librarianusername);
     LibrarianADD.add(libuserr);
     LibrarianADD.add(Librarianpassword);
     LibrarianADD.add(libpass);
     LibrarianADD.add(addLiBBBB);
     LibrarianADD.add(pic);
     addLiBBBB.addActionListener(this);
    if(e.getSource()==addLiBBBB){
        String Libnameeee=Libnamee.getText();
        String textlibnamee=libuserr.getText();
        String linbpass=libpass.getText();
        BufferedWriter writer = new BufferedWriter(new FileWriter("lib.txt", true)){
            writer.write(Libnameeee+"");
        }
    }
    }
    
}

    public static void main(String[] args) {
        Adminpage m1 = new Adminpage();
    }
}