import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.*;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import com.mysql.cj.jdbc.Driver;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;

public class Register {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Name");
        jf.setBounds(100, 100, 650, 750);
        jf.setTitle("Register");
        jf.setLayout(null);
        jf.getContentPane().setBackground(Color.gray);

        // name...
        JLabel jl = new JLabel("Name");
        jl.setBounds(60, 60, 100, 30);

        JTextField jt = new JTextField("");
        jt.setBounds(250, 60, 200, 30);

        // user dob..
        JLabel jl1 = new JLabel("DOB");
        jl1.setBounds(60, 120, 100, 30);

        JTextField jt1 = new JTextField("");
        jt1.setBounds(250, 120, 200, 30);

        // user gender..
        JLabel jl2 = new JLabel("Gender");
        jl2.setBounds(60, 180, 80, 30);

        JRadioButton jc = new JRadioButton("male");
        jc.setBounds(250, 180, 80, 30);

        JRadioButton jc1 = new JRadioButton("Femail");
        jc1.setBounds(340, 180, 80, 30);

        JRadioButton jc2 = new JRadioButton("Other");
        jc2.setBounds(430, 180, 80, 30);

        ButtonGroup bp = new ButtonGroup();
        bp.add(jc);
        bp.add(jc1);
        bp.add(jc2);
        // user email..
        JLabel jl3 = new JLabel("Email Id");
        jl3.setBounds(60, 240, 100, 30);

        JTextField jt3 = new JTextField("");
        jt3.setBounds(250, 240, 200, 30);

        // user mobile..
        JLabel jl4 = new JLabel("Mobile No");
        jl4.setBounds(60, 300, 100, 30);

        JTextField jt4 = new JTextField("");
        jt4.setBounds(250, 300, 200, 30);

        // user password
        JLabel jl5 = new JLabel("Password");
        jl5.setBounds(60, 360, 100, 30);

        JTextField jt5 = new JTextField("");
        jt5.setBounds(250, 360, 200, 30);

        // user RE password
        JLabel jl6 = new JLabel("Repassword");
        jl6.setBounds(60, 420, 100, 30);

        JTextField jt6 = new JTextField("");
        jt6.setBounds(250, 420, 200, 30);

        // user course

        JLabel jl7 = new JLabel("Course");
        jl7.setBounds(60, 480, 100, 30);

        String[] values = { "B.tech", "M.tech", "Bca", "Mca", "B.pharma", "D.pharma" };
        JComboBox jx = new JComboBox<>(values);
        jx.setBounds(250, 480, 150, 50);

        JLabel jl8 = new JLabel("Branch");
        jl8.setBounds(60, 540, 250, 30);

        String[] values1 = { "CSE", "ME", "EE", "EC", "CE" };
        JComboBox jx1 = new JComboBox(values1);
        jx1.setBounds(250, 540, 100, 50);

        JButton jb = new JButton("Register");
        jb.setBounds(250, 600, 250, 60);
        jb.setBackground(Color.red);
        Cursor cr = new Cursor(Cursor.HAND_CURSOR);
        jb.setCursor(cr);

        

        jf.add(jl8);
        jf.add(jb);
        jf.add(jl);
        jf.add(jl1);
        jf.add(jl2);
        jf.add(jl3);
        jf.add(jl4);
        jf.add(jl5);
        jf.add(jl6);
        jf.add(jl7);
        jf.add(jx);
        jf.add(jx1);
        jf.add(jt);
        jf.add(jt1);
        jf.add(jc);
        jf.add(jc1);
        jf.add(jc2);
        jf.add(jt3);
        jf.add(jt4);
        jf.add(jt5);
        jf.add(jt6);

        jf.setVisible(true);
    }
}