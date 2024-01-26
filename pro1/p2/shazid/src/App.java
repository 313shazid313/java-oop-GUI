import javax.swing.*;
import java.awt.*;

public class App {
    int count = 3;
    JFrame f;
    App() {
        f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new FlowLayout());
        f.setSize(400, 300);
        JButton b = new JButton("Click");
        JLabel l = new JLabel();


        f.add(l);
        f.add(b);
        f.setVisible(true);

        
        b.addActionListener(e -> {
            if (count > 0) {
                l.setText(count + "...");
                count--;
            } else if (count == 0) {
                l.setText("Go");
            }
        });
    }


    public static void main(String[] args) throws Exception {
        new App();
    }
}
