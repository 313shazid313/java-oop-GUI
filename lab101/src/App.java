import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class App implements ActionListener {

    JFrame jf = new JFrame();
    JTextField jt1 = new JTextField();
    JTextField jt2 = new JTextField();
    JButton plus = new JButton("+"); // Add text to the button
    JButton minus = new JButton("-"); // Add text to the button
    JTextField jtAnswer = new JTextField();


    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == plus) {
            int num1 = Integer.parseInt(jt1.getText());
            int num2 = Integer.parseInt(jt2.getText());
            int result = num1 + num2;
            jtAnswer.setText(Integer.toString(result));
        } else if (e.getSource() == minus) {
            int num1 = Integer.parseInt(jt1.getText());
            int num2 = Integer.parseInt(jt2.getText());
            int result = num1 - num2;
            jtAnswer.setText(Integer.toString(result));
        }
    }


    public App() {

        jt1.setBounds(50, 50, 150, 50);
        jt2.setBounds(250, 50, 150, 50);
        plus.setBounds(50, 150, 150, 50);
        minus.setBounds(250, 150, 150, 50);
        jtAnswer.setBounds(100, 250, 150, 50);

        jf.add(jt1);
        jf.add(jt2);
        jf.add(plus);
        jf.add(minus);
        jf.add(jtAnswer);

        plus.addActionListener(this); // Register action listener
        minus.addActionListener(this); // Register action listener

        jf.setLocation(200, 100);
        jf.setSize(600, 600);
        jf.setLayout(null);
        jf.setVisible(true);
    }

    public static void main(String[] args) throws Exception {
        new App();
    }

    

}
