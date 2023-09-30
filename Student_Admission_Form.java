import java.awt.Cursor;
import java.sql.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

class Student_Admission_Form {
    public static void main(String[] args) {
        JFrame jframe = new JFrame();
        jframe.setBounds(350, 50, 850, 750);
        jframe.setLayout(new BorderLayout());
        jframe.setTitle("Student_Admission_Form");
        jframe.getContentPane().setBackground(Color.cyan);
        jframe.setForeground(Color.black);

        // ADD buttons

        JButton add = new JButton("ADD");
        add.setBounds(50, 30, 100, 50);
        add.setBackground(Color.red);

        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
        add.setCursor(cursor);

        // Edit buttons

        JButton edit = new JButton("EDIT");
        edit.setBounds(200, 30, 100, 50);
        edit.setBackground(Color.red);
        Cursor cursor1 = new Cursor(Cursor.HAND_CURSOR);
        edit.setCursor(cursor1);
          

         // that is the delete buttons.....

        JButton delete = new JButton("Delete");
        delete.setBounds(350, 30, 100, 50);
        delete.setBackground(Color.red);
        Cursor cr2 = new Cursor(Cursor.HAND_CURSOR);
        delete.setCursor(cr2);

        
        // find buttons..

        JButton find = new JButton("Find");
        find.setBounds(500, 30, 100, 50);
        find.setBackground(Color.red);
        Cursor cursor3 = new Cursor(Cursor.HAND_CURSOR);
        find.setCursor(cursor3);
          
         // save buttons..

        JButton save = new JButton("Save");
        save.setBounds(650, 30, 100, 50);
        save.setBackground(Color.red);
        Cursor cursor4 = new Cursor(Cursor.HAND_CURSOR);
        save.setCursor(cursor4);


        // first Name
        JLabel jl = new JLabel("FIRST NAME");
        jl.setBounds(75, 100, 100, 30);

        JTextField firstname = new JTextField();
        firstname.setBounds(200, 100, 150, 30);

        // Last name

        JLabel jll = new JLabel("LAST NAME");
        jll.setBounds(400, 100, 100, 30);
        jframe.add(jll);

        JTextField lastname = new JTextField();
        lastname.setBounds(500, 100, 150, 30);
        jframe.add(lastname);

        // Date of the Birth..

        JLabel jl1 = new JLabel("DATE OF BIRTH");
        jl1.setBounds(75, 150, 100, 30);

        String[] day = new String[31];
        for (int i = 1; i <= 31; i++) {
            day[i - 1] = Integer.toString(i);
        }

        JComboBox jc = new JComboBox<>(day);
        jc.setBounds(200, 150, 50, 30);
        jframe.add(jc);

        String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December" };

        JComboBox jc1 = new JComboBox<>(months);
        jc1.setBounds(300, 150, 100, 30);
        jframe.add(jc1);

        String[] year = new String[50];
        for (int i = 1990; i < 2023; i++) {
            year[i - 1990] = Integer.toString(i);
        }

        JComboBox jc2 = new JComboBox<>(year);
        jc2.setBounds(450, 150, 100, 30);
        jframe.add(jc2);

        // date of the joining..

        JLabel jl2 = new JLabel("DATE OF JOIN");
        jl2.setBounds(75, 200, 100, 30);

        String[] day1 = new String[31];
        for (int i = 1; i <= 31; i++) {
            day1[i - 1] = Integer.toString(i);
        }

        JComboBox jc3 = new JComboBox<>(day1);
        jc3.setBounds(200, 200, 50, 30);
        jframe.add(jc3);

        String[] months1 = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December" };

        JComboBox jc4 = new JComboBox<>(months1);
        jc4.setBounds(300, 200, 100, 30);
        jframe.add(jc4);

        String[] year1 = new String[50];
        for (int i = 1990; i <= 2023; i++) {
            year1[i - 1990] = Integer.toString(i);
        }

        JComboBox jc5 = new JComboBox<>(year1);
        jc5.setBounds(450, 200, 100, 30);
        jframe.add(jc5);

        // age

        JLabel jl3 = new JLabel("AGE");
        jl3.setBounds(75, 250, 100, 30);

        String[] age = new String[100];
        for (int i = 1; i <= 100; i++) {
            age[i - 1] = Integer.toString(i);
        }
        JComboBox jc6 = new JComboBox<>(age);
        jc6.setBounds(200, 250, 150, 30);
        jframe.add(jc6);

        // Address
        JLabel jl4 = new JLabel("ADDRESS");
        jl4.setBounds(75, 300, 100, 30);

        JTextField address = new JTextField(null, null, 0);
        address.setBounds(200, 300, 150, 30);

        // city
        JLabel jl5 = new JLabel("CITY");
        jl5.setBounds(75, 350, 100, 30);

        JTextField city = new JTextField(null, null, 0);
        city.setBounds(200, 350, 150, 30);
        
        JTextArea textarea = new JTextArea();
        textarea.setBounds(470, 240, 300, 250);
        jframe.add(textarea);

        // state
        JLabel jl6 = new JLabel("STATE");
        jl6.setBounds(75, 400, 100, 30);

        String[] state = { "Utter Pradesh", "Madhya Pradesh", "Rajsthan", "Bhopal", "Agra", "Sultanpur", "Firojabad",
                "Arurachal Pradesh", "Andman Nikobar " };

        JComboBox jc7 = new JComboBox<>(state);
        jc7.setBounds(200, 400, 150, 30);
        jframe.add(jc7);

        // country..

        JLabel jl7 = new JLabel("COUNTRY");
        jl7.setBounds(75, 450, 100, 30);

        String[] country = { "United States", "Canada", "United Kingdom", "Australia", "India", "Japan", "Germany", };

        JComboBox jc8 = new JComboBox<>(country);
        jc8.setBounds(200, 450, 150, 30);
        jframe.add(jc8);

        // mobile

        JLabel jl8 = new JLabel("MOBILE");
        jl8.setBounds(75, 500, 100, 30);

        String[] countrycode = { "+91", "1", "44", "67", "92" };
        JComboBox jc9 = new JComboBox<>(countrycode);
        jc9.setBounds(200, 500, 150, 30);
        jframe.add(jc9);

        JTextField mobile = new JTextField(null, null, 0);
        mobile.setBounds(370, 500, 150, 30);

        // education....
        JLabel jl9 = new JLabel("EDUCATION");
        jl9.setBounds(100, 550, 100, 30);

        JTextField jt10 = new JTextField(null, null, 0);
        jt10.setBounds(100, 590, 100, 30);

        JTextField jt11 = new JTextField(null, null, 0);
        jt11.setBounds(100, 630, 100, 30);

        JTextField jt12 = new JTextField(null, null, 0);
        jt12.setBounds(100, 670, 100, 30);

        // college
        JLabel jl10 = new JLabel("COLLAGE");
        jl10.setBounds(220, 550, 100, 30);

        JTextField jt13 = new JTextField(null, null, 0);
        jt13.setBounds(220, 590, 100, 30);

        JTextField jt14 = new JTextField(null, null, 0);
        jt14.setBounds(220, 630, 100, 30);

        JTextField jt15 = new JTextField(null, null, 0);
        jt15.setBounds(220, 670, 100, 30);

        // obtaining
        JLabel jl11 = new JLabel("OBTAINING");
        jl11.setBounds(340, 550, 100, 30);

        JTextField jt16 = new JTextField(null, null, 0);
        jt16.setBounds(340, 590, 100, 30);

        JTextField jt17 = new JTextField(null, null, 0);
        jt17.setBounds(340, 630, 100, 30);

        JTextField jt18 = new JTextField(null, null, 0);
        jt18.setBounds(340, 670, 100, 30);

        // OBTAINED
        JLabel jl12 = new JLabel("OBTAINED");
        jl12.setBounds(460, 550, 100, 30);

        JTextField jt19 = new JTextField(null, null, 0);
        jt19.setBounds(460, 590, 100, 30);

        JTextField jt20 = new JTextField(null, null, 0);
        jt20.setBounds(460, 630, 100, 30);

        JTextField jt21 = new JTextField(null, null, 0);
        jt21.setBounds(460, 670, 100, 30);

        // PERCENTAGE
        JLabel jl13 = new JLabel("PERCENTAGE");
        jl13.setBounds(580, 550, 100, 30);

        JTextField jt22 = new JTextField(null, null, 0);
        jt22.setBounds(580, 590, 100, 30);

        JTextField jt23 = new JTextField(null, null, 0);
        jt23.setBounds(580, 630, 100, 30);

        JTextField jt24 = new JTextField(null, null, 0);
        jt24.setBounds(580, 670, 100, 30);

        // that is the add event for the add buttons......

        add.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student_Admission_Form",
                    "root",
                    "");

            System.out.println("Database is connected");
            Statement str = con.createStatement();

            String sqlquery = "INSERT INTO admission VALUES ()";
            int i = str.executeUpdate(sqlquery);

            if (i > 0) {
                JOptionPane.showMessageDialog(null, "Data inserted");
            } else {
                JOptionPane.showMessageDialog(null, "Data not inserted");
            }

        } catch (Exception u) {
            System.out.println(u);
        }
    }
});


        // that is the edit buttons........

        edit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent r) {
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student_Admission_Form",
                            "root", null);
                    Statement str = conn.createStatement();
                    System.out.println("connection is the succesfuly connected!!");
                    String sqlquery = " ";
                    int i = str.executeUpdate(sqlquery);
                    if (i > 0) {
                        JOptionPane.showMessageDialog(null, "data is the succesfully updated");
                    } else {
                        JOptionPane.showMessageDialog(null, "some thing errors!!");
                    }
                } catch (Exception j) {
                    System.out.println(j);
                }
            }
        });

       
          
        delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                try{
                     Class.forName("com.mysql.cj.jdbc.Driver");
                     Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Student_Admission_Form", "root","");
                    Statement str=conn.createStatement();
                    System.out.println("Database is the connected");
                    String sqlquery="";
                    int i=str.executeUpdate(sqlquery);
                    if(i>0){
                        JOptionPane.showMessageDialog(null,"Data is the inserted");
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"data is not inserted");
                    }
                }
                catch(Exception u){
                      System.out.println(u);
                }
            }
        });

        // that is the delete buttons

       delete.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e){

            try{
                     Class.forName("com.mysql.cj.jdbc.Driver");
                     Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Student_Admission_Form","root","");
                     Statement str=conn.createStatement();
                     System.out.println("database is the connected");
                     String sqlquery="";
                     int i=str.executeUpdate(sqlquery);
                     if(i>0){
                        JOptionPane.showMessageDialog(null,"data is the deleted");
                     }
                     else{
                        JOptionPane.showMessageDialog(null,"data is the not deleted");
                     }
            }
            catch(Exception u){
                System.out.println(u);
            }
        }
       });
        jframe.add(add);
        jframe.add(edit);
        jframe.add(delete);
        jframe.add(find);
        jframe.add(save);
        jframe.add(firstname);
        jframe.add(address);
        jframe.add(city);
        jframe.add(mobile);
        jframe.add(jt10);
        jframe.add(jt11);
        jframe.add(jt12);
        jframe.add(jt13);
        jframe.add(jt14);
        jframe.add(jt15);
        jframe.add(jt16);
        jframe.add(jt17);
        jframe.add(jt18);
        jframe.add(jt19);
        jframe.add(jt20);
        jframe.add(jt21);
        jframe.add(jt22);
        jframe.add(jt23);
        jframe.add(jt24);
        jframe.add(jl);
        jframe.add(jl1);
        jframe.add(jl2);
        jframe.add(jl3);
        jframe.add(jl4);
        jframe.add(jl5);
        jframe.add(jl6);
        jframe.add(jl7);
        jframe.add(jl8);
        jframe.add(jl9);
        jframe.add(jl10);
        jframe.add(jl11);
        jframe.add(jl12);
        jframe.add(jl13);

        jframe.setVisible(true);
    }
}
