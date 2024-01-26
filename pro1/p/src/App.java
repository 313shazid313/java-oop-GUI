import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class App {
    public static void main(String[] args) {
        JFrame f1 = new JFrame("shazid");
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setSize(400, 300);
        JPanel p1 = new JPanel();
        JButton b = new JButton("Click me");
        p1.add(b);
        f1.setContentPane(p1);
        f1.setVisible(true);




        b.addActionListener(e -> {
            if (b.getText().equals("Click me")) {
                b.setText("Clicked");
            } else {
                b.setText("Click me");
            }
        });


    }
}
