import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.Color;
import java.awt.*;

class Checkbox {
    public static void main(String[] args) {

        JFrame jf = new JFrame();
        jf.setLayout(null);
        jf.setBounds(100, 100, 650, 650);
        jf.getContentPane().setBackground(Color.cyan);
        jf.setTitle("CheckBox");

        // using check box ....

        JCheckBox jc = new JCheckBox("Delhi");
        jc.setBounds(100, 100, 200, 50);

        JCheckBox jc1 = new JCheckBox("Varansi");
        jc1.setBounds(100, 150, 200, 50);

        JCheckBox jc2 = new JCheckBox("Lucknow");
        jc2.setBounds(100, 200, 200, 50);

        JCheckBox jc3 = new JCheckBox("Kanpur");
        jc3.setBounds(100, 250, 200, 50);
        jf.add(jc);
        jf.add(jc1);
        jf.add(jc2);
        jf.add(jc3);
        jf.setVisible(true);

    }
}