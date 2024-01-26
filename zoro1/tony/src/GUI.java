import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame implements ActionListener {
  JTextField t1, t2;
  JButton b;
  JLabel l1;

  public GUI() {

    t1 = new JTextField(30); // text field for input
    t2 = new JTextField(30); // text field for input
    b = new JButton("add");// for adding button
    l1 = new JLabel("calculator");

    add(t1);
    add(t2);
    add(b);
    add(l1);

    b.addActionListener(this); // acctionlistener is a interface

    setLayout(new FlowLayout());
    setVisible(true);
    setSize(400, 400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    int number1 = Integer.parseInt(t1.getText());
    int number2 = Integer.parseInt(t2.getText());

    int value = number1 + number2;
    l1.setText(value + "");
  }
}
