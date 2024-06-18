import javax.swing.*;

public class dejin {
    JFrame f;

         dejin(){
        f = new JFrame("welcome");
        JButton b = new JButton("click");
        b.setBounds(130, 100, 100, 40);
        JLabel c=new JLabel("how are u");
        c.setBounds(150,100,200,100);
        JCheckBox d=new JCheckBox("hey");
        d.setBounds(200,170,50,40);
        JMenu e=new JMenu("hey who are u");
        e.setBounds(200,100,100,40);
        JFileChooser s=new JFileChooser("qqqq");
        f.add(d);
        f.setSize(400, 500);
        f.setLayout(null);
        f.setVisible(true);
    }
public static void main(String[] args) {
        new dejin();
    }
}