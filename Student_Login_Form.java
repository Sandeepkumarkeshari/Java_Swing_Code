import com.mysql.cj.jdbc.Driver;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;

import java.awt.Color;
import java.awt.Cursor;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
// import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

class Student_Login_Form {
  public static void main(String[] args) {

    JFrame jf = new JFrame();
    jf.setBounds(100, 100, 650, 650);
    jf.setTitle("Student Login Form");
    jf.setLayout(null);
    // jf.setLocationRelativeTo(null);
    // jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jf.getContentPane().setBackground(Color.gray);
    // 1.Student name using lable.....
    JLabel jl = new JLabel("Student Name:");
    jl.setBounds(40, 20, 100, 20);
    // Student name textfield...
    JTextField jt = new JTextField("Pls enter the student name");
    jt.setBounds(160, 20, 180, 20);

    // 2.student id using lable...
    JLabel jl1 = new JLabel("Student Id:");
    jl1.setBounds(40, 40, 100, 20);
    // student id using textfield...
    JTextField jt1 = new JTextField("pls enter the student id");
    jt1.setBounds(160, 40, 180, 20);

    // 3.student Rollnumber...
    JLabel jl2 = new JLabel("Student Roll_N:");
    jl2.setBounds(40, 60, 100, 20);
    // student rollnumber textfield..
    JTextField jt2 = new JTextField("pls enter the student rollnumber");
    jt2.setBounds(160, 60, 180, 20);

    // 4.student contact ..
    JLabel jl3 = new JLabel("student contact:");
    jl3.setBounds(40, 80, 100, 20);
    // student contact textfield..
    JTextField jt3 = new JTextField("pls enter the student contact");
    jt3.setBounds(160, 80, 180, 20);

    // student email...
    JLabel jl4 = new JLabel("student email:");
    jl4.setBounds(40, 100, 100, 20);
    // student email textfield..
    JTextField jt4 = new JTextField("student email:");
    jt4.setBounds(160, 100, 180, 20);

    // student address
    JLabel jl5 = new JLabel("student adddress");
    jl5.setBounds(40, 115, 100, 50);

    // adding the all checkbox in the button group.
    ButtonGroup jg = new ButtonGroup();

    // button for the submit...

    JButton jb = new JButton("Submit");
    jb.setBounds(170, 285, 120, 50);
    jb.setBackground(Color.red);

    /*
     * Cursor cr=new Cursor(Cursor.CROSSHAIR_CURSOR);
     * jb.setCursor(cr);
     */

    // That is the uses the combo box.........

    String[] values = { "Delhi", "Noida", "Varansi", "Gujrat", "RayBareli", "Mirzapur" };
    JComboBox jc = new JComboBox(values);

    jc.setBounds(150, 150, 200, 100);

    Cursor cr = new Cursor(Cursor.WAIT_CURSOR);

     jb.addActionListener(new ActionListener(){
      @Override
      public void actionPerformed(ActionEvent e){
           
        try{
          Class.forName("com.mysql.cj.jdbc.Driver");
          Connection str=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","");
          System.out.println("That is the connected to the database");

          Statement str1=(Statement) str.createStatement();
          String sqlquery= "INSERT INTO jdbc1 VALUES('"+jt.getText()+"','"+jt1.getText()+"','"+jt2.getText()+"','"+jt3.getText()+"','"+jt4.getText()+"')";
          int j =  str1.executeUpdate(sqlquery);

                    if (j > 0) {
                        JOptionPane.showMessageDialog(null, "data Delete");
                    } 
                  else {
                        JOptionPane.showMessageDialog(null, "Failed........ ");
                    }

       
        }

        catch(Exception k){
            System.out.println(k);
        }

      }
     });



    jb.setCursor(cr);
    jf.add(jc);
    jf.add(jl);
    jf.add(jl1);
    jf.add(jl2);
    jf.add(jl3);
    jf.add(jl4);
    jf.add(jl5);
    jf.add(jt);
    jf.add(jt1);
    jf.add(jt2);
    jf.add(jt3);
    jf.add(jt4);
    jf.add(jb);

    jf.setVisible(true);
   

  }
}