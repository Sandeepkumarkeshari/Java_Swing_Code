import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.*;
import com.mysql.cj.jdbc.Driver;
import com.mysql.cj.xdevapi.Statement;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;

class Registration_Form {
    public static void main(String[] args) {
        //that is the first frame.....
        JFrame jf = new JFrame();
        jf.setBounds(100, 50, 1050, 750);

       
        jf.setLayout(null);
        jf.setTitle("Registration_Form");
        jf.getContentPane().setBackground(Color.cyan);

        // user name....
        JLabel jl = new JLabel("User Name");
        jl.setBounds(60, 30, 100, 30);

        // user textfield...
        JTextField jt = new JTextField(null, null, 0);
        jt.setBounds(200, 30, 150, 30);
          

        JTextField je=new JTextField(null, null, 0);
        je.setBounds(600, 40, 350, 350);

        // user mobile.....
        JLabel jl1 = new JLabel("Mobile Number");
        jl1.setBounds(60, 70, 100, 30);

        // user textfield....
        JTextField jt1 = new JTextField(null, null, 0);
        jt1.setBounds(200, 70, 150, 30);

        // user gender....
        JLabel jl2 = new JLabel("User Gender:");
        jl2.setBounds(60, 110, 100, 30);

        // Button for the Male.
        JRadioButton jb1 = new JRadioButton("Male");

        jb1.setBounds(200, 110, 100, 30);

        // Button for the Femail.
        JRadioButton jb2 = new JRadioButton("Femail");

        jb2.setBounds(300, 110, 100, 30);

        // Button for the Other.

        JRadioButton jb3 = new JRadioButton("Other");
        jb3.setBounds(400, 110, 100, 30);

        // Adding the al button in the button group.....
        ButtonGroup br = new ButtonGroup();

        br.add(jb1);
        br.add(jb2);
        br.add(jb3);

        // user date of the birth...
        JLabel jl3 = new JLabel("DOB:");
        jl3.setBounds(60, 150, 100, 30);

        // User textfield for the data of birth.....
        
        JComboBox jc1 = new JComboBox<>();
        jc1.setBounds(200, 150, 100, 30);
        

        JComboBox jc2 = new JComboBox<>();
        jc2.setBounds(300, 150, 100, 30);

        JComboBox jc3 = new JComboBox<>();
        jc3.setBounds(400, 150, 100, 30);

        // JComboBox jx1=new JComboBox("Date of birth");

        // user address
        JLabel jl4 = new JLabel("Address:");
        jl4.setBounds(60, 190, 100, 30);

        // user textfield...
        String[] values = { "Delhi", "Varansi", "Mirzapur", "Noida", "USA", "India" };
        JComboBox jx = new JComboBox(values);
        jx.setBounds(200, 190, 150, 30);

        // check box for the conditions...

        JCheckBox jo2 = new JCheckBox("Please accept the terms & conditions");
        jo2.setBounds(80, 260, 250, 30);

        // button for the submit....
        JButton jb = new JButton("Submit");
        jb.setBounds(200, 330, 100, 30);
        jb.setBackground(Color.red);
        jb.setForeground(Color.black);

        Cursor jc = new Cursor(Cursor.HAND_CURSOR);
        jb.setCursor(jc);

        // user registration succesfuly.....

        JLabel jl5 = new JLabel("Registration form feel up succesfuly....");
        jl5.setBounds(100, 370, 300, 30);

        // using the database to the server...........

      /*jb.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e){

            try{
                  Class.forName("com.mysql.cj.jdbc.Driver");
                  Connection skk=DriverManager.getConnection("jdbc:mysql://localhost:3306/Registration_Form", "root", "");
                  System.out.println("Connection is the succesfuly connected");
                  java.sql.Statement str=skk.createStatement();
                  String sqlquery="INSERT INTO rst values =('"+jt.getText()+"','"+jt1.getText()+"','"+jl.getText()+"')";
                  int i=str.executeUpdate(sqlquery);

                   if (i > 0) {
                        JOptionPane.showMessageDialog(null, "data inserted");
                    } else {
                        JOptionPane.showMessageDialog(null, "not inserted");
                    }
            }

            catch(Exception d){
                 System.out.println(d);
            }
        }

       
      });*/
       
        jf.add(je);
        jf.add(jc1);
        jf.add(jc2);
        jf.add(jc3);
        jf.add(jo2);
        jf.add(jx);
        jf.add(jb);
        jf.add(jb1);
        jf.add(jb2);
        jf.add(jb3);
        jf.add(jl);
        jf.add(jl1);
        jf.add(jl2);
        jf.add(jl3);
        jf.add(jl4);
        jf.add(jl5);
        jf.add(jt);
        jf.add(jt1);

        jf.setVisible(true);
    }
}
