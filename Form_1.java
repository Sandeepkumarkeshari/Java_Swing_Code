import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;

class Form_1 {
        public static void main(String[] args) {
                JFrame jf = new JFrame();
                jf.setTitle("EMP Form");
                jf.setLayout(null);
                jf.getContentPane().setBackground(Color.cyan);
                // jf.setSize(750, 850);
                jf.setBounds(200, 100, 450, 450);
                // jf.setLocation(200, 200);
                // EMP ID....
                JLabel jl = new JLabel("EMP ID:");
                jl.setBounds(40, 20, 150, 30);
                // EMP ID text field...
                JTextField jt = new JTextField("Pls Enter the emp id");
                jt.setBounds(160, 20, 150, 30);

                // EMP Name.
                JLabel jl1 = new JLabel("EMP Name:");
                jl1.setBounds(40, 40, 150, 30);
                // EMP Name text field.
                JTextField jt1 = new JTextField("Enter the emp name");
                jt1.setBounds(160, 40, 150, 30);
                // EMP Address.
                JLabel jl2 = new JLabel("EMP Address:");
                jl2.setBounds(40, 60, 150, 30);
                // EMP Address text field.
                JTextField jt2 = new JTextField("Enter the emp address");
                jt2.setBounds(160, 60, 150, 30);
                // EMP city.
                JLabel jl3 = new JLabel("Enter the emp city:");
                jl3.setBounds(40, 80, 150, 30);
                // EMP city text field.
                JTextField jt3 = new JTextField("Enter the emp city name");
                jt3.setBounds(160, 80, 150, 30);

                // Button for the Male.
                JRadioButton jb1 = new JRadioButton("Male");

                jb1.setBounds(150, 120, 90, 30);

                // Button for the Femail.
                JRadioButton jb2 = new JRadioButton("Femail");

                jb2.setBounds(240, 120, 90, 30);

                // Button for the Other.

                JRadioButton jb3 = new JRadioButton("Other");
                jb3.setBounds(330, 120, 90, 30);

                // Adding the al button in the button group.....
                ButtonGroup bg = new ButtonGroup();
                
                bg.add(jb1);
                bg.add(jb2);
                bg.add(jb3);





                 // Button for the click...
                JButton jb = new JButton("Click");

                Cursor jc=new Cursor(Cursor.HAND_CURSOR);
                jb.setCursor(jc);
                jb.setBounds(100, 200, 150, 50);
                jb.setBackground(Color.green);



             jb .addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e){

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo3", "root",
                            "");

                            System.out.println("Database is the connected");
                            Statement str=con.createStatement();
                            
                            String sqlquery = "insert into demo4 values('" + jt.getText() + "' ,'" + jt1.getText() + "','"+jt2.getText()+"','"+jt3.getText()+"','"+jb1.getText()+"','"+jb2.getText()+"','"+jb3.getText()+"')";

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
                jf.add(jl2);
                jf.add(jl3);
                jf.add(jt);
                jf.add(jt1);
                jf.add(jt2);
                jf.add(jt3);
                jf.add(jb1);
                jf.add(jb2);
                jf.add(jb3);
                jf.add(jb);

                jf.setVisible(true);
                // jf.setResizable(true);

        }
}