import javax.swing.*;
import java.awt.*;



public class App {
    JFrame f;

    App(){
        f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new FlowLayout());
        f.setSize(400,300);
        JButton b = new JButton("Click");
        JTextField tf = new JTextField(13);
        JLabel l = new JLabel("");
        f.add(tf);
        f.add(l);
        f.add(b);
        f.setVisible(true);
        b.addActionListener(e ->{
            String text = tf.getText();
            l.setText(text);

        });
    }
    public static void main(String[] args) {
     new App();
    }
    
}
