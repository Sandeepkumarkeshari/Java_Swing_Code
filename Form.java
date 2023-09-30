import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.mysql.cj.jdbc.Driver;

import javax.swing.JButton;
import javax.swing.*;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
class Login {
    
    public static void main(String[] args) {

        JFrame jf = new JFrame();
        jf.setBounds(100, 100, 750, 650);
        jf.setTitle("Login Form");
        jf.setLayout(null);
        jf.getContentPane().setBackground(Color.cyan);

        // user name.....
        JLabel jl = new JLabel("User name:");
        jl.setBounds(70, 50, 150, 30);

        // user textfield....
        JTextField jt = new JTextField("Enter the user name");
        jt.setBounds(180, 50, 150, 30);

        // user Password..
        JLabel jl1 = new JLabel("user password:");
        jl1.setBounds(70, 80, 150, 30);

        // user textfield....
        JTextField jt1 = new JTextField("enter the user password");
        jt1.setBounds(180, 80, 150, 30);

        // button.....

        JButton jb = new JButton("click");
        jb.setBounds(180, 130, 150, 50);
        jb.setBackground(Color.red);

        Font ft=new Font("Arial",Font.PLAIN,50);
        jb.setFont(ft);

            //cursor adding...
            Cursor cr=new Cursor(Cursor.HAND_CURSOR);
        jb.setCursor(cr);

     jb.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e){

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo3", "root",
                            "");

                            System.out.println("Database is the connected");
                            Statement str=con.createStatement();
                            
                            String sqlquery = "insert into demo4 values('" + jt.getText() + "' ,'" + jt1.getText() + "')";

                         int i = str.executeUpdate(sqlquery);
                    if (i > 0) {
                        JOptionPane.showMessageDialog(null, "data inserted");
                    } else {
                        JOptionPane.showMessageDialog(null, "not inserted");
                    }

            } catch (Exception u) {
                // TODO: handle exception
                System.out.println(u);
            }
}


        
     });



     
        
      jf.add(jl);
        jf.add(jl1);
        jf.add(jt);
        jf.add(jt1);
        jf.add(jb);

        jf.setVisible(true);

    }
}