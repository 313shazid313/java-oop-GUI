import javax.swing.*;
import java.awt.*;

public class App {
    JFrame f;

    App() {
        f = new JFrame();
        JLabel l1 = new JLabel("Foot");
        JTextField f1 = new JTextField(10);
        JButton b1 = new JButton("Convert to Inch");
        JLabel l2 = new JLabel("Inch");
        JTextField f2 = new JTextField(10);
        JButton b2 = new JButton("Convert to Foot");

     

        f.setLayout(new FlowLayout());
        f.setSize(300, 300);
        f.add(l1);
        f.add(f1);
        f.add(b1);
         f.add(b2);
        f.add(l2);
        f.add(f2);
        
        f.setVisible(true);

        b1.addActionListener(e->{
           
         
            
        });
        b2.addActionListener(e->{

        });


    }




    public static void main(String[] args) throws Exception {
        new App();
    }
}
