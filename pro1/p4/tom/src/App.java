import javax.swing.*;
import java.awt.*;



public class App {
    JFrame f;
    App() {
        f= new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new FlowLayout());
        JTextField tf1 = new JTextField(10);
        JTextField tf2 = new JTextField(10);
        JButton b = new JButton("Swap!");
        f.setSize(300,300);
        f.add(tf1);
        f.add(tf2);
        f.add(b);
        f.setVisible(true);
        b.addActionListener(e ->{
           
        });
    }

    public static void main(String[] args) throws Exception {
        new App();
    }
}
