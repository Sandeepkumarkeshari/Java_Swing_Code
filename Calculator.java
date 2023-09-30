import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Cursor;
import java.sql.*;

class Calculator {
    public static void main(String[] args) {

        JFrame jf = new JFrame();
        jf.setBounds(100, 100, 550, 350);
        jf.setLayout(null);
        jf.setTitle("Calculator");
        jf.getContentPane().setBackground(Color.cyan);

        // Textfield for the calculator calculation...
        JTextField jt = new JTextField();
        jt.setBounds(150, 20, 300, 50);

        // using all Buttons for the calculator..first rows...
        JButton jb = new JButton("7");
        jb.setBounds(150, 100, 80, 30);
        jb.setBackground(Color.white);
        jb.setForeground(Color.black);

        JButton jb1 = new JButton("8");
        jb1.setBounds(220, 100, 80, 30);
        jb1.setBackground(Color.white);
        jb1.setForeground(Color.black);

        JButton jb2 = new JButton("9");
        jb2.setBounds(290, 100, 80, 30);
        jb2.setBackground(Color.white);
        jb2.setForeground(Color.black);

        JButton jb3 = new JButton("/");
        jb3.setBounds(360, 100, 80, 30);
        jb3.setBackground(Color.white);
        jb3.setForeground(Color.black);

        // using the buttons for the calculator second rows.....

        JButton js = new JButton("4");
        js.setBounds(150, 130, 80, 30);
        js.setBackground(Color.white);
        js.setForeground(Color.black);

        JButton js1 = new JButton("5");
        js1.setBounds(220, 130, 80, 30);
        js1.setBackground(Color.white);
        js1.setForeground(Color.black);

        JButton js2 = new JButton("6");
        js2.setBounds(290, 130, 80, 30);
        js2.setBackground(Color.white);
        js2.setForeground(Color.black);

        JButton js3 = new JButton("*");
        js3.setBounds(360, 130, 80, 30);
        js3.setBackground(Color.white);
        js3.setForeground(Color.black);

        // buttons for the third rows....

        JButton jn = new JButton("1");
        jn.setBounds(150, 160, 80, 30);
        jn.setBackground(Color.white);
        jn.setForeground(Color.black);

        JButton jn1 = new JButton("2");
        jn1.setBounds(220, 160, 80, 30);
        jn1.setBackground(Color.white);
        jn1.setForeground(Color.black);

        JButton jn2 = new JButton("3");
        jn2.setBounds(290, 160, 80, 30);
        jn2.setBackground(Color.white);
        jn2.setForeground(Color.black);

        JButton jn3 = new JButton("-");
        jn3.setBounds(360, 160, 80, 30);
        jn3.setBackground(Color.white);
        jn3.setForeground(Color.black);

        // using buttons for the third rows...

        JButton jo = new JButton("0");
        jo.setBounds(150, 190, 80, 30);
        jo.setBackground(Color.white);
        jo.setForeground(Color.black);

        JButton jo1 = new JButton(".");
        jo1.setBounds(220, 190, 80, 30);
        jo1.setBackground(Color.white);
        jo1.setForeground(Color.black);

        JButton jo2 = new JButton("=");
        jo2.setBounds(290, 190, 80, 30);
        jo2.setBackground(Color.white);
        jo2.setForeground(Color.black);

        JButton jo3 = new JButton("+");
        jo3.setBounds(360, 190, 80, 30);
        jo3.setBackground(Color.white);
        jo3.setForeground(Color.black);
           
   /* try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/skk2","Sandeepkumarkeshari","sagar@3638");
        System.out.println("That is the database connections");
      }
      Catch(Exception e){

      }  */ 

        jf.add(jo);
        jf.add(jo1);
        jf.add(jo2);
        jf.add(jo3);
        jf.add(jn);
        jf.add(jn1);
        jf.add(jn2);
        jf.add(jn3);
        jf.add(js);
        jf.add(js1);
        jf.add(js2);
        jf.add(js3);
        jf.add(jb);
        jf.add(jb1);
        jf.add(jb2);
        jf.add(jb3);
        jf.add(jt);
        jf.setVisible(true);
    }
}