import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class shazid extends JFrame {
  public shazid (){
    
    JLabel l = new JLabel("shazid");
    JLabel l2 = new JLabel("hello ");
    add(l);
    add(l2);

    setLayout(new FlowLayout());
    setVisible(true);
    setSize(450,300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
