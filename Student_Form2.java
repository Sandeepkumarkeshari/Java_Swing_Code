import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.*;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.*;
import com.mysql.cj.jdbc.Driver;
import javax.swing.JCheckBox;

class Student_Form {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Name");
        jf.setBounds(100, 100, 650, 750);
        jf.setTitle("Student Form");
        jf.setLayout(null);
        jf.getContentPane().setBackground(Color.gray);

        // name...
        JLabel jl = new JLabel("Name");
        jl.setBounds(60, 60, 100, 30);

        JTextField jt = new JTextField("");
        jt.setBounds(250, 60, 200, 30);

        // user name..
        JLabel jl1 = new JLabel("User name");
        jl1.setBounds(60, 120, 100, 30);

        JTextField jt1 = new JTextField("");
        jt1.setBounds(250, 120, 200, 30);

        // user password..
        JLabel jl2 = new JLabel("Password");
        jl2.setBounds(60, 180, 100, 30);

        JTextField jt2 = new JTextField("");
        jt2.setBounds(250, 180, 200, 30);

        // user  confirm password..
        JLabel jl3 = new JLabel("Confirm Password");
        jl3.setBounds(60, 240, 100, 30);

        JTextField jt3 = new JTextField("");
        jt3.setBounds(250, 240, 200, 30);

        // user email
        JLabel jl4 = new JLabel("Email");
        jl4.setBounds(60, 300, 100, 30);

        JTextField jt4 = new JTextField("");
        jt4.setBounds(250, 300, 200, 30);

        // user Phone.
        JLabel jl5 = new JLabel("Phone");
        jl5.setBounds(60, 360, 100, 30);

        JTextField jt5 = new JTextField("");
        jt5.setBounds(250, 360, 200, 30);

        // user address
        JLabel jl6 = new JLabel("Address");
        jl6.setBounds(60, 420, 100, 30);

        JTextField jt6 = new JTextField("");
        jt6.setBounds(250, 420, 200, 30);

        // button for the submit and the reset and the close.
        JButton jb = new JButton("Submit");
        jb.setBounds(100, 500, 150, 50);
        jb.setBackground(Color.red);
        Font jo = new Font("Arial", Font.PLAIN, 30);
        jb.setFont(jo);
        Cursor cr = new Cursor(Cursor.HAND_CURSOR);
        jb.setCursor(cr);

     //adding the submit button to the database for submit the value.....
       jb.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed (ActionEvent t){
         
            try{
                   Class.forName("com.mysql.cj.jdbc.Driver");
     Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Student_Form", "root","");
     System.out.println("This is the connected to the database.");
     Statement str=con.createStatement();
     String sqlquery="INSERT INTO Student_Form1 VALUES('"+jt.getText()+"','"+jt1.getText()+"','"+jt2.getText()+"','"+jt3.getText()+"','"+jt4.getText()+"','"+jt5.getText()+"','"+jt6.getText()+"')";
     int i=str.executeUpdate(sqlquery);
     
     if(i>0){
        JOptionPane.showMessageDialog(null, "data inserted");
     }
     else{
        JOptionPane.showMessageDialog(null, "data not inserted");
     }
}
     catch(Exception f){
        System.out.println(f);
     }
            
        }
       });
    
        JButton jb1 = new JButton("Reset");
        jb1.setBounds(250, 500, 150, 50);
        jb1.setBackground(Color.red);
        Font jo1 = new Font("Arial", Font.PLAIN, 30);
        jb1.setFont(jo1);

        Cursor cr1 = new Cursor(Cursor.TEXT_CURSOR);
        jb1.setCursor(cr1);

        JButton jb2 = new JButton("Fetch");
        jb2.setBounds(400, 500, 150, 50);
        jb2.setBackground(Color.red);
        Font jo2 = new Font("Arial", Font.PLAIN, 30);
        jb2.setFont(jo2);
        Cursor cr2 = new Cursor(Cursor.WAIT_CURSOR);
        jb2.setCursor(cr2);

        JCheckBox jc = new JCheckBox("Pls accept the all terms and the conditions");
        Font ft1=new Font("Vardana",Font.ITALIC,18);
        jc.setFont(ft1);
        jc.setBounds(50, 600, 400, 50);
        jf.add(jc);
        jf.add(jb);
        jf.add(jb1);
        jf.add(jb2);
        jf.add(jl);
        jf.add(jl1);
        jf.add(jl2);
        jf.add(jl3);
        jf.add(jl4);
        jf.add(jl5);
        jf.add(jl6);
        jf.add(jt);
        jf.add(jt1);
        jf.add(jt2);
        jf.add(jt3);
        jf.add(jt4);
        jf.add(jt5);
        jf.add(jt6);
        jf.setVisible(true);
    }
}