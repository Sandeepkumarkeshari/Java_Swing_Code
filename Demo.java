import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.*;
import com.mysql.cj.jdbc.Driver;

class Demo {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setBounds(100, 100, 850, 750);
        jf.setLayout(null);
        jf.getContentPane().setBackground(Color.cyan);

        // button for the add..

        JButton jb = new JButton("ADD");
        jb.setBounds(50, 30, 100, 50);

        // button for the edit
        JButton jb1 = new JButton("Edit");
        jb1.setBounds(200, 30, 100, 50);

        // button for the delete.
        JButton jb2 = new JButton("Delete");
        jb2.setBounds(350, 30, 100, 50);

        // button for the find
        JButton jb3 = new JButton("Find");
        jb3.setBounds(500, 30, 100, 50);

        // button for the save

        JButton jb4 = new JButton("Save");
        jb4.setBounds(650, 30, 100, 50);

        // name

        JLabel jl = new JLabel("Name");
        jl.setBounds(30, 100, 100, 30);

        // name textfield

        JTextField jt = new JTextField();
        jt.setBounds(100, 100, 100, 30);
        // dob
        JLabel dob = new JLabel("DOB");
        dob.setBounds(30, 150, 100, 30);

        JTextField jt1 = new JTextField();
        jt1.setBounds(100, 150, 100, 30);
        // age
        JLabel age = new JLabel("Age");
        age.setBounds(250, 150, 100, 30);

        JTextField jt2 = new JTextField();
        jt2.setBounds(300, 150, 100, 30);
        // doj
        JLabel doj = new JLabel("DOJ");
        doj.setBounds(30, 200, 100, 30);

        JTextField jt3 = new JTextField();
        jt3.setBounds(100, 200, 100, 30);

        JLabel mobile = new JLabel("Mobile");
        mobile.setBounds(250, 200, 100, 30);

        JTextField jt8 = new JTextField();
        jt8.setBounds(300, 200, 100, 30);
        // address
        JLabel address = new JLabel("Address");
        address.setBounds(30, 250, 100, 30);

        JTextField jt4 = new JTextField();
        jt4.setBounds(100, 250, 100, 30);
        // city
        JLabel city = new JLabel("City");
        city.setBounds(30, 300, 100, 30);

        JTextField jt5 = new JTextField();
        jt5.setBounds(100, 300, 100, 30);
        // state
        JLabel state = new JLabel("State");
        state.setBounds(30, 350, 100, 30);

        JTextField jt6 = new JTextField();
        jt6.setBounds(100, 350, 100, 30);
        // country
        JLabel country = new JLabel("Country");
        country.setBounds(250, 350, 100, 30);

        String[] ct = { "Varansi", "Kanpur", "Delhi", "Noida" };
        JComboBox jc = new JComboBox<>(ct);
        jc.setBounds(350, 350, 100, 30);
        // class
        JLabel clas = new JLabel("Class");
        clas.setBounds(30, 400, 100, 30);

        JTextField jt7 = new JTextField();
        jt7.setBounds(30, 450, 100, 30);

        JTextField jtt = new JTextField();
        jtt.setBounds(30, 480, 100, 30);

        JTextField jtt1 = new JTextField();
        jtt1.setBounds(30, 510, 100, 30);
        // collage
        JLabel collage = new JLabel("Collage");
        collage.setBounds(140, 400, 100, 30);

        JTextField jt9 = new JTextField();
        jt9.setBounds(140, 450, 100, 30);

        JTextField jt91 = new JTextField();
        jt91.setBounds(140, 480, 100, 30);

        JTextField jt92 = new JTextField();
        jt92.setBounds(140, 510, 100, 30);

        // obtaining
        JLabel obtaining = new JLabel("Obtating");
        obtaining.setBounds(250, 400, 100, 30);

        JTextField jt10 = new JTextField();
        jt10.setBounds(250, 450, 100, 30);

        JTextField jt101 = new JTextField();
        jt101.setBounds(250, 480, 100, 30);

        JTextField jt102 = new JTextField();
        jt102.setBounds(250, 510, 100, 30);
        // obtained
        JLabel obtained = new JLabel("Obtained");
        obtained.setBounds(350, 400, 100, 30);

        JTextField jt11 = new JTextField();
        jt11.setBounds(350, 450, 100, 30);

        JTextField jt111 = new JTextField();
        jt111.setBounds(350, 480, 100, 30);

        JTextField jt112 = new JTextField();
        jt112.setBounds(350, 510, 100, 30);
        // % autocalculate

        JLabel marks = new JLabel("% Autocalculate");
        marks.setBounds(450, 400, 100, 30);

        JTextField jt12 = new JTextField();
        jt12.setBounds(450, 450, 100, 30);

        JTextField jt122 = new JTextField();
        jt122.setBounds(450, 480, 100, 30);

        JTextField jt123 = new JTextField();
        jt123.setBounds(450, 510, 100, 30);

        // adding the database connectivity

        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Demo",
                            "root", "");

                    System.out.println("Database is connected");
                    Statement str = con.createStatement();

                    String sqlquery = "INSERT INTO demo1 ('" + jt.getText() + "','" + jt1.getText() + "','"
                            + jt3.getText() + "','" + jt4.getText() + "','" + jt5.getText() + "','" + jt6.getText()
                            + "','" + jt7.getText() + "','" + jt8.getText() + "','" + jt9.getText() + "')";

                    int i = str.executeUpdate(sqlquery);

                    if (i > 0) {
                        JOptionPane.showMessageDialog(null, "data inserted");
                    } else {
                        JOptionPane.showMessageDialog(null, "data is the not inserted");
                    }

                } catch (Exception x) {
                    System.out.println(x);
                }
            }
        });

        // add to database the add button...

        // add to database for the edit.....

        jb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Demo",
                            "root", "");

                    System.out.println("Database is connected");
                    Statement str = con.createStatement();

                    String sqlquery = "DELETE FROM demo1 WHERE  ('" + jt.getText() + "','" + jt1.getText() + "','"
                            + jt2.getText() + "','" + jt3.getText() + "','" + jt4.getText() + "','" + jt5.getText()
                            + "','" + jt6.getText() + "','" + jt7.getText() + "','" + jt8.getText() + "','"
                            + jt9.getText() + "')";

                    int i = str.executeUpdate(sqlquery);

                    if (i > 0) {
                        JOptionPane.showMessageDialog(null, "data inserted");
                    } else {
                        JOptionPane.showMessageDialog(null, "failed!");
                    }

                } catch (Exception l) {
                    System.out.println(l);
                }
            }
        });

        // add to database the delete...

        jb3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Demo",
                            "root", "");

                    System.out.println("Database is connected");
                    Statement str = con.createStatement();

                    String sqlquery = "SELECT * FROM   demo1 WHERE ('" + jt.getText() + "','" + jt1.getText() + "','"
                            + jt2.getText() + "','" + jt3.getText() + "','" + jt4.getText() + "','" + jt4.getText()
                            + "','" + jt5.getText() + "','" + jt6.getText() + "','" + jt7.getText() + "','"
                            + jt8.getText() + "','" + jt9.getText() + "')";

                    int i = str.executeUpdate(sqlquery);

                    if (i > 0) {
                        JOptionPane.showMessageDialog(null, "data inserted");
                    } else {
                        JOptionPane.showMessageDialog(null, "not inserted the data");
                    }

                } catch (Exception u) {
                    System.out.println(u);
                }
            }
        });

        // add to database the find....

        jb4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Demo",
                            "root", "");

                    System.out.println("Database is connected succesfuly");
                    Statement str = con.createStatement();

                    String sqlquery = "SELECT * FROM  demo1 WHERE ('" + jt.getText() + "','" + jt1.getText() + "','"
                            + jt2.getText() + "','" + jt3.getText() + "','" + jt4.getText() + "','" + jt5.getText()
                            + "','" + jt6.getText() + "','" + jt7.getText() + "','" + jt8.getText() + "','"
                            + jt9.getText() + "')";

                    int i = str.executeUpdate(sqlquery);

                    if (i > 0) {
                        JOptionPane.showMessageDialog(null, "data inserted");
                    } else {
                        JOptionPane.showMessageDialog(null, "error");
                    }

                } catch (Exception i) {
                    System.out.println(i);
                }
            }
        });
        String[][] data = { { "001", "sandeep", "21" },
                { "002", "manish", "21" },
                { "003", "Dharmendra", "22" } };

        String[]columnNames = { "Roll NO", "Name", "Age" };

        JTable table = new JTable(data,columnNames );
        table.setBounds(30, 900, 300, 300);

        jf.add(new JScrollPane(table));
        jf.add(jtt);
        jf.add(jtt1);
        jf.add(jt91);
        jf.add(jt92);
        jf.add(jt101);
        jf.add(jt102);
        jf.add(jt111);
        jf.add(jt112);
        jf.add(jt122);
        jf.add(jt123);
        jf.add(jc);
        jf.add(jt);
        jf.add(jt1);
        jf.add(jt2);
        jf.add(jt3);
        jf.add(jt4);
        jf.add(jt5);
        jf.add(jt6);
        jf.add(jt7);
        jf.add(jt8);
        jf.add(jt9);
        jf.add(jt10);
        jf.add(jt11);
        jf.add(jt12);
        jf.add(jl);
        jf.add(dob);
        jf.add(age);
        jf.add(doj);
        jf.add(address);
        jf.add(city);
        jf.add(state);
        jf.add(country);
        jf.add(clas);
        jf.add(mobile);
        jf.add(collage);
        jf.add(obtaining);
        jf.add(obtained);
        jf.add(marks);
        jf.add(jb);
        jf.add(jb1);
        jf.add(jb2);
        jf.add(jb3);
        jf.add(jb4);
        jf.setVisible(true);
    }
}