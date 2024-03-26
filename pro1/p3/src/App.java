import javax.swing.*;
import java.awt.*;

public class App {
    JFrame f;

    App() {

        JFrame f = new JFrame("My Frame");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500, 500);
        Container p = f.getContentPane();
        f.setLayout(new GridLayout(3,3));
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        
        b1.setBounds(10, 10, 50, 20);

        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        f.setVisible(true);
   

        b1.addActionListener(e -> {
            b2.setText("2");
            b3.setText("3");
        });
        b4.addActionListener(e ->{
            b2.setText("3");
            b3.setText("2");
        });
    }

    public static void main(String[] args) throws Exception {
        new App();
    }
}
