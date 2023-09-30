// /*import javax.swing.*;
// import java.awt.event.*;
// import javax.swing.JOptionPane;
// import java.sql.*;

// public class Shalinee {
//     public static void main(String[] args) {
//         JFrame jf = new JFrame("Registration Form");
//         jf.setBounds(50, 20, 600, 400);

//         JLabel jl = new JLabel("Name  :");
//         jl.setBounds(50, 20, 80, 30);

//         JLabel jl1 = new JLabel("MobileNo  :");
//         jl1.setBounds(50, 100, 80, 30);

//         JLabel jl2 = new JLabel("Address  :");
//         jl2.setBounds(50, 180, 80, 30);

//         JTextField jt = new JTextField();
//         jt.setBounds(150, 20, 90, 30);

//         JTextField jt1 = new JTextField();
//         jt1.setBounds(150, 100, 90, 30);

//         JTextField jt2 = new JTextField();
//         jt2.setBounds(150, 180, 90, 30);

//         JButton jb = new JButton("Submit");
//         jb.setBounds(100, 280, 100, 30);

//         jb.addActionListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent e) {
//                 try {
//                     Class.forName("com.mysql.cj.jdbc.Driver");
//                     Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/info", "root", "");
//                     System.out.println("Database Connected");

//                     Statement st = con.createStatement();
//                     String sqlquery = "INSERT INTO INFO VALUES('" + jt.getText() + "','" + jt1.getText() + "','"
//                             + jt2.getText() + "')";
//                     int i = st.executeUpdate(sqlquery);
//                     if (i > 0) {
//                         JOptionPane.showMessageDialog(null, "datainserted");
//                     } else {
//                         JOptionPane.showMessageDialog(null, "invalid data...");
//                     }

//                 } catch (Exception e2){

//                         }
//                     }

//                 });

//         JButton jb1 = new JButton("Fetch");
//         jb1.setBounds(300, 280, 100, 30);

       
//                 jb1.addActionListener(new ActionListener() {
//                     @Override
//                     public void actionPerformed(ActionEvent e) {
//                         try {
//                             Class.forName("com.mysql.cj.jdbc.Driver");
//                             Connection con = DriverManager.getConnection("jdbc.mysql://localhost:3306/info", "root",
//                                     "");
//                             System.out.println("fetch data Successfully");
//                             Statement st = con.createStatement();
//                             String sqlquery = "insert into info values =" + jt1.getText() + "";
//                             ResultSet i = st.executeQuery(sqlquery);
//                             while (i.next()) {
//                                 String s = i.getString("name");
//                                 jt.setText(s);
//                                 String s1 = i.getString("mobile_no");
//                                 jt1.setText(s1);
//                                 String s2 = i.getString("address");
//                                 jt2.setText(s2);
//                             }
//                         } 
//                         catch (Exception e1) {
//             }
//         }
//         });

//         jf.add(jl);
//         jf.add(jl1);
//         jf.add(jl2);

//         jf.add(jt);
//         jf.add(jt1);
//         jf.add(jt2);

//         jf.add(jb);
//         jf.add(jb1);
//         jf.setLayout(null);
//         jf.setVisible(true);

//     }
// }*/

// // import java.awt.Color;
// // import java.awt.event.ActionEvent;
// // import java.awt.event.ActionListener;

// // import javax.swing.JButton;
// // import javax.swing.JFrame;
// // import javax.swing.JOptionPane;
// // import javax.swing.JTextField;

// // public class Shalinee {
// //     public static void main(String[] args) {
// //         JFrame jr = new JFrame();
// //         jr.setBounds(200, 50, 500, 500);

// //         JButton btn = new JButton(" + ");
// //         btn.setBounds(200, 100, 100, 30);

// //         JTextField tf_10_a = new JTextField();
// //         tf_10_a.setBounds(150, 50, 50, 20);

// //         JTextField tf_10_b = new JTextField();
// //         tf_10_b.setBounds(250, 50, 50, 20);

// //         JButton sub = new JButton("submit");
// //         sub.setBounds(300, 100, 100, 30);

// //         JTextField tf_10_total = new JTextField();
// //         tf_10_total.setBounds(500, 50, 100, 20);

// //         sub.addActionListener(new ActionListener() {

// //             @Override
// //             public void actionPerformed(ActionEvent e) {

// //                 if (tf_10_a.getText() == null || tf_10_a.getText().trim().isEmpty()) {

// //                     JOptionPane.showMessageDialog(null, "fill 10 marks", "10 marks", JOptionPane.ERROR_MESSAGE);

// //                 } else {
// //                     tf_10_b.setText(tf_10_a.getText());
// //                 }
// //             }

// //         });

// //         tf_10_b.setEnabled(false);
// //         jr.add(btn);
// //         jr.add(tf_10_a);
// //         jr.add(tf_10_b);
// //         jr.add(sub);
// //         jr.setLayout(null);
// //         jr.setVisible(true);
// //     }
// // }

// /*
//  * import javax.swing.*;
//  * 
//  * import java.awt.event.*;
//  * import java.sql.*;
//  * import javax.swing.*;
//  * import java.awt.*;
//  * import java.awt.Color;
//  * 
//  * public class Solved {
//  * 
//  * public static void main(String[] args) {
//  * JFrame Jf = new JFrame("JDBC");
//  * Jf.setBounds(50, 50, 900, 600);
//  * 
//  * JLabel jl = new JLabel("Name ");
//  * jl.setBounds(100, 50, 100, 30);
//  * 
//  * JTextField jt = new JTextField();
//  * jt.setBounds(150, 50, 100, 30);
//  * 
//  * JLabel jl1 = new JLabel("Mobile    :");
//  * jl1.setBounds(100, 100, 100, 30);
//  * 
//  * JTextField jt1 = new JTextField();
//  * jt1.setBounds(150, 100, 100, 30);
//  * 
//  * JLabel jl2 = new JLabel("Address    :");
//  * jl2.setBounds(100, 150, 100, 30);
//  * 
//  * JTextField jt2 = new JTextField();
//  * jt2.setBounds(150, 150, 100, 30);
//  * 
//  * JButton btn = new JButton("Submit");
//  * btn.setBounds(150, 200, 100, 30);
//  * 
//  * 
//  * btn.addActionListener(new ActionListener() {
//  * 
//  * @Override
//  * public void actionPerformed(ActionEvent e) {
//  * try {
//  * Class.forName("com.mysql.cj.jdbc.Driver");
//  * Connection
//  * con=DriverManager.getConnection("jdbc:mysql://localhost:3306/info1", "root",
//  * "");
//  * 
//  * System.out.println("Database connected");
//  * 
//  * Statement st = con.createStatement();
//  * String sqlquery = "INSERT INTO INFO2 VALUES('" +jt.getText() + "','" +
//  * jt1.getText() + "','"+ jt2.getText() + "')";
//  * int i = st.executeUpdate(sqlquery);
//  * if (i > 0) {
//  * JOptionPane.showMessageDialog(null, "data inserted");
//  * }
//  * else{
//  * JOptionPane.showMessageDialog(null, "invaild data........ ");
//  * }
//  * 
//  * }
//  * catch (Exception e1) {
//  * System.out.println(e1);
//  * }
//  * 
//  * }
//  * 
//  * });
//  * 
//  * 
//  * Jf.add(jl);
//  * Jf.add(jl1);
//  * Jf.add(jl2);
//  * Jf.add(jt);
//  * Jf.add(jt1);
//  * Jf.add(jt2);
//  * Jf.add(btn);
//  * Jf.setLayout(null);
//  * Jf.setVisible(true);
//  * }
//  * }
//  */






// //  '" + firstname.getText() + " " + lastname.getText()
// //                             + "','" + jc.getSelectedItem() + " " + jc1.getSelectedItem() + " " + jc2.getSelectedItem()
// //                             + "','" + jc3.getSelectedItem() + " " + jc4.getSelectedItem() + " " + jc5.getSelectedItem()
// //                             + "','" + jc6.getSelectedItem() + "','" + jc7.getSelectedItem() + "','"
// //                             + jc8.getSelectedItem() + "','" + jc9.getSelectedItem() + " " + mobile.getText() + "','"
// //                             + address.getText() + "','" + city.getText() + "'






// // import java.awt.*;
// // import java.awt.event.ActionEvent;
// // import java.awt.event.ActionListener;
// // import javax.swing.*;
// // import java.sql.Connection;
// // import java.sql.DriverManager;
// // import java.sql.ResultSet;
// // import java.sql.Statement;
// // import java.time.Year;
// // class Swing {
// //     public static void main ( String[] args ) {

// //         JFrame jf = new JFrame ();

// //         JLabel j1 = new JLabel ( "name" );
// //         j1.setBounds ( 20, 20, 50, 20 );
// //         jf.add ( j1 );

// //         JLabel j2 = new JLabel ( "conatct" );
// //         j2.setBounds ( 20, 60, 60, 20 );
// //         jf.add ( j2 );

// //         JLabel j3 = new JLabel ( "DOb" );
// //         j3.setBounds ( 20, 100, 60, 20 );
// //         jf.add ( j3 );

// //         JLabel age = new JLabel ( "age" );
// //         age.setBounds ( 20, 140, 60, 20 );
// //         jf.add ( age);

// //         JTextField age1 = new JTextField ( null );
// //         age1.setBounds ( 100, 140, 60, 20 );
// //         jf.add (age1);
// // //


// //         JLabel j4 = new JLabel ( "gender" );
// //         j4.setBounds ( 20, 180, 60, 20 );
// //         jf.add ( j4 );


// //         JLabel address = new JLabel ( "address" );
// //         address.setBounds ( 20, 220, 50, 20 );
// //         jf.add ( address );

// // //
// // //
// //         JTextField name1 = new JTextField ( null );
// //         name1.setBounds ( 100, 20, 80, 20 );
// //         jf.add ( name1);
// // //


// //         JTextField contact = new JTextField ( null );
// //         contact.setBounds ( 100, 60, 80, 20 );
// //         jf.add (contact);
// // //
// // //
// //         String [] country={"Select Country", "India", "USA"};
// //         JComboBox<String> countryComboBox = new JComboBox<>(country);
// //         countryComboBox.setBounds(100, 220, 80, 20 );//  country1.setBounds (100, 185, 80, 20   );

// //         jf.add(countryComboBox);

// //         String[][] stateOptions = {
// //                 {"Select State", "Uttar Pradesh", "Madhya Pradesh"},
// //                 {"Select State", "Maharashtra", "Gujarat"}
// //         };

// //         JComboBox<String> stateComboBox = new JComboBox<>();
// //         stateComboBox.setBounds(100, 240, 80, 20 );
// //         jf.add(stateComboBox);

// //         String[][][] cityOptions = {
// //                 {{"Select City", "Kanpur", "Lucknow", "Agra"}, {}, {}},
// //                 {{}, {"Select City", "Bhopal", "Indore"}, {"Select City", "Ahmedabad", "Surat"}}
// //         };

// //         JComboBox<String> cityComboBox = new JComboBox<>();
// //         cityComboBox.setBounds(100, 270, 80, 20 );
// //         jf.add(cityComboBox);

// //         countryComboBox.addActionListener ( new ActionListener () {
// //             @Override
// //             public void actionPerformed ( ActionEvent e ) {
// //                 int selectcountryindex = countryComboBox.getSelectedIndex ();
// //                 stateComboBox.removeAllItems ();
// //                 for (String state : stateOptions[selectcountryindex]) {
// //                     stateComboBox.addItem ( state );

// //                 }  }
// //         } );


// //         stateComboBox.addActionListener(new ActionListener() {
// //             @Override
// //             public void actionPerformed(ActionEvent e) {
// //                 int selectedCountryIndex = countryComboBox.getSelectedIndex();
// //                 int selectedStateIndex = stateComboBox.getSelectedIndex();
// //                 cityComboBox.removeAllItems();


// //                 for (String city : cityOptions[selectedCountryIndex][selectedStateIndex]) {
// //                     cityComboBox.addItem(city);
// //                 }
// //             }
// //         });
// //         String[] day = new String[31];
// //         for (int i = 1; i <= 31; i++) {
// //             day[i - 1] = Integer.toString ( i );
// //         }

// //         JComboBox combo= new JComboBox<> ( day );
// //         combo.setBounds ( 100, 100, 60, 20 );
// //         jf.add ( combo);

// //         String[] month = {"jan", "fab", "march", "april", "may", "june", "july", "august", "sep", "oct", "nov", "dec"};
// //         JComboBox combo1 = new JComboBox<> ( month );
// //         combo1.setBounds ( 170, 100, 60, 20 );
// //         jf.add ( combo1 );
// //         String[] year = new String[70];
// //         for (int i = 1951; i <= 2020; i++) {
// //             year[i - 1951] = Integer.toString ( i );
// //         }
// //         JComboBox years = new JComboBox<> ( year );
// //         years.setBounds ( 240, 100, 60, 20 );
// //         jf.add (years);
// // //
// //         JRadioButton jr1 = new JRadioButton ( "male", null, false );
// //         jr1.setBounds ( 100, 170, 80, 20 );
// //         jf.add ( jr1 );
// //         JRadioButton jr2 = new JRadioButton ( "female", null, false );
// //         jr2.setBounds ( 100, 190, 80, 20 );
// //         jf.add ( jr2 );

// //         ButtonGroup bg = new ButtonGroup ();
// //         bg.add ( jr1 );
// //         bg.add ( jr2 );


// //         JButton button = new JButton ( "submit", null );
// //         button.setBounds ( 100, 360, 80, 20 );
// //         jf.add ( button );
// // //      
// //         JButton delete =new JButton ("delete");
// //         delete.setBounds (100, 300, 80, 20  );
// //         jf.add ( delete );
// //         JTextField box =new JTextField ("");
// //         box.setBounds (10, 300, 80, 20  );
// //         jf.add ( box);
// //         JButton find=new JButton ("find");
// //         find.setBounds (190, 300, 80, 20  );
// //         jf.add ( find);
// //         JButton cancel=new JButton ("cancel");
// //         cancel.setBounds (280, 300, 80, 20  );
// //         jf.add ( cancel);


// //         jf.setCursor ( new Cursor ( Cursor.CROSSHAIR_CURSOR ) );


// //         button.addActionListener(new ActionListener() {
// //             @Override
// //             public void actionPerformed(ActionEvent e) {
// //                 try {
// //                     Class.forName("com.mysql.cj.jdbc.Driver");
// //                     Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo4", "root", "7992@12345");
// //                     System.out.println("Database connected");

// //                     Statement st = con.createStatement();
// //                     String gender = jr1.isSelected() ? "male" : "female";
// //                     String sqlquery = "INSERT INTO demo41 VALUES('" + name1.getText() + "','" + contact.getText() + "','"
// //                             + combo.getSelectedItem() + "-" + combo1.getSelectedItem() + "-" + years.getSelectedItem()
// //                             + "','" + gender + "','" + countryComboBox.getSelectedItem () + "-"+stateComboBox.getSelectedItem ()+"-"+cityComboBox.getSelectedItem ()+"')";
// //                     int i = st.executeUpdate(sqlquery);
// //                     if (i > 0) {
// //                         JOptionPane.showMessageDialog(null, "Data inserted");
// //                     } else {
// //                         JOptionPane.showMessageDialog(null, "Invalid data");
// //                     }

// //                 } catch (Exception e1) {
// //                     System.out.println(e1);
// //                 }
// //             }
// //         });
// //         delete.addActionListener(new ActionListener() {
// //             @Override
// //             public void actionPerformed(ActionEvent e) {
// //                 try {
// //                     Class.forName("com.mysql.cj.jdbc.Driver");
// //                     Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo4", "root", "7992@12345");
// //                     System.out.println("Database connected");

// //                     Statement st = con.createStatement();


// // //                    String nameToDelete = name1.getText();
// //                     String sqlquery = "Delete From demo41 where name='" + box.getText () + "'";

// //                     int i = st.executeUpdate(sqlquery);
// //                     if (i > 0) {
// //                         JOptionPane.showMessageDialog(null, "Record deleted successfully");
// //                     } else {
// //                         JOptionPane.showMessageDialog(null, "No record found with the given name");
// //                     }

// //                 } catch (Exception e1) {
// //                     System.out.println(e1);
// //                 }
// //             }
// //         });


// //         find.addActionListener(new ActionListener() {
// //             @Override
// //             public void actionPerformed(ActionEvent e) {
// //                 try {
// //                     Class.forName("com.mysql.cj.jdbc.Driver");
// //                     Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo4", "root", "7992@12345");
// //                     System.out.println("Database connected");

// //                     Statement str = con.createStatement();
// //                     String sqlquery = "SELECT * FROM demo41 WHERE name='" + box.getText() + "'";
// //                     ResultSet resultSet = str.executeQuery(sqlquery);

// //                     if (resultSet.next()) {
// //                         String nameValue = resultSet.getString("name");
// //                         String contactValue = resultSet.getString("contact");
// //                         String dobValue = resultSet.getString("dob");
// //                         String genderValue = resultSet.getString("gender");
// //                         String addressValue = resultSet.getString("address");

// //                         String[] addressParts = addressValue.split("-");


// //                         String countryValue = addressParts[0];
// //                         String stateValue = addressParts[1];
// //                     String cityValue = addressParts[2];

// //                         name1.setText(nameValue);
// //                         contact.setText(contactValue);

// //                         String[] dobParts = dobValue.split("-");
// //                         combo.setSelectedItem(dobParts[0]);
// //                         combo1.setSelectedItem(dobParts[1]);
// //                         years.setSelectedItem(dobParts[2]);

// //                         if (genderValue.equals("male")) {
// //                             jr1.setSelected(true);
// //                         } else if (genderValue.equals("female")) {
// //                             jr2.setSelected(true);
// //                         }

// //                         address.setText(addressValue);

// //                         for (int i = 0; i < country.length; i++) {
// //                             if (country[i].equals(countryValue)) {
// //                                 countryComboBox.setSelectedIndex(i);
// //                                 break;
// //                             }
// //                         }

// //                         int selectedCountryIndex = countryComboBox.getSelectedIndex();
// //                         for (int i = 0; i < stateOptions[selectedCountryIndex].length; i++) {
// //                             if (stateOptions[selectedCountryIndex][i].equals(stateValue)) {
// //                                 stateComboBox.setSelectedIndex(i);
// //                                 break;
// //                             }
// //                         }

// //                         int selectedStateIndex = stateComboBox.getSelectedIndex();
// //                         for (int i = 0; i < cityOptions[selectedCountryIndex][selectedStateIndex].length; i++) {
// //                             if (cityOptions[selectedCountryIndex][selectedStateIndex][i].equals(cityValue)) {
// //                                 cityComboBox.setSelectedIndex(i);
// //                                 break;
// //                             }
// //                         }

// //                     } else {
// //                         JOptionPane.showMessageDialog(null, "No record found with the given name");
// //                     }

// //                 } catch (Exception e1) {
// //                     System.out.println(e1);
// //                 }
// //             }
// //         });




// //         cancel.addActionListener(new ActionListener() {
// //             @Override
// //             public void actionPerformed(ActionEvent e) {
// //                 name1.setText("");
// //                 contact.setText("");
// //                 combo.setSelectedIndex(0);
// //                 combo1.setSelectedIndex(0);
// //                 bg.clearSelection();
// //                 countryComboBox.setSelectedIndex(0);
// //                 stateComboBox.setSelectedIndex(0);
// //                 stateComboBox.setSelectedIndex(0);
// //                 address.setText("");
// //                 box.setText("");
// //             }
// //         });

// //         jf.setTitle ( "web form" );
// //         jf.setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE );
// //         jf.setLayout ( null );
// //         jf.setBounds ( 300, 20, 600, 800 );
// //         jf.setResizable ( true );
// //         jf.setVisible ( true );

// // }
// // }






// import javax.swing.JButton;
// import javax.swing.JCheckBox;
// import javax.swing.JComboBox;
// import javax.swing.JFrame;
// import javax.swing.JLabel;
// import javax.swing.JOptionPane;
// import javax.swing.JTextField;
// import java.awt.Color;
// import java.awt.event.*;
// import java.sql.*;

// class Data_Form {

//     JLabel namel, dobl, agel, dateofjoiningl, addressl, cityl, nameinfo, addressinfo, cityinfo, stateinfo, countryinfo,
//             mobileinfo, edul, collegel, obtainedl, totall, percentagel;
//     JButton add, save, delete, edit, find;
//     JTextField name, age, address, mobile, edu10, college10, obtained10, total10, percentage10, edu12, college12,
//             obtained12, total12, percentage12,
//             edu13, college13, obtained13, total13, percentage13;
//     JComboBox<String> daycombo, monthcombo, yearcombo, cday, cmonth, cyear, citycombo, statecombo, countrycombo;
//     JCheckBox agec;

//     Data_Form() {
//         JFrame frame = new JFrame("Form");
//         frame.setBounds(50, 50, 800, 680);
//         frame.getContentPane().setBackground(Color.cyan);

//         // use of the button

//         JButton add= new JButton("ADD");
//         add.setBounds(120, 30, 100, 30);
//         add.setBackground(Color.red);
//         frame.add(add);
        
     
//         JButton edit= new JButton("EDIT");
//         edit.setBounds(250, 30, 100, 30);
//         edit.setBackground(Color.red);
//         frame.add(edit);
          
//          JButton delete = new JButton("DELETE");
//         delete.setBounds(380, 30, 100, 30);
//         delete.setBackground(Color.red);
//         frame.add(delete);
         
        
//         JButton find = new JButton("FIND");
//         find.setBounds(510, 30, 100, 30);
//         find.setBackground(Color.red);
//         frame.add(find);

//         JButton save = new JButton("SAVE");
//         save.setBounds(640, 30, 100, 30);
//         save.setBackground(Color.red);
//         frame.add(save);


//         JLabel namel = new JLabel("Name  :");
//         namel.setBounds(100, 50, 70, 80);
//         JTextField name = new JTextField();
//         name.setBounds(230, 80, 200, 30);
//         frame.add(namel);
//         frame.add(name);

//         JLabel dobl = new JLabel("Date of birth  :");
//         dobl.setBounds(100, 90, 100, 80);
//         frame.add(dobl);

//         String[] day = new String[31];
//         for (int i = 1; i <= 31; i++) {
//             day[i - 1] = Integer.toString(i);
//         }

//         JComboBox daycombo = new JComboBox<>(day);
//         daycombo.setBounds(230, 120, 40, 30);
//         frame.add(daycombo);

//         String[] month = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11",
//                 "12" };
//         JComboBox monthcombo = new JComboBox<>(month);
//         monthcombo.setBounds(290, 120, 70, 30);
//         frame.add(monthcombo);
//         String[] year = new String[100];
//         for (int i = 1951; i <= 2023; i++) {
//             year[i - 1951] = Integer.toString(i);
//         }
//         JComboBox yearcombo = new JComboBox<>(year);
//         yearcombo.setBounds(370, 120, 100, 30);
//         frame.add(yearcombo);

//         JLabel agel = new JLabel("Age  :");
//         agel.setBounds(500, 90, 100, 80);
//        JTextField age = new JTextField();
//         age.setBounds(600, 120, 100, 30);
//         age.setEditable(false);
        
//         frame.add(age);
//         frame.add(agel);

//        JCheckBox agec = new JCheckBox();
//         agec.setBounds(750, 160, 20, 30);
//         frame.add(agec);

//         JLabel dateofjoiningl = new JLabel("Date of joining  :");
//         dateofjoiningl.setBounds(100, 150, 90, 80);
//         frame.add(dateofjoiningl);

//         String[] days = new String[31];
//         for (int i = 1; i <= 31; i++) {
//             days[i - 1] = Integer.toString(i);
//         }

//        JComboBox cday = new JComboBox<>(day);
//         cday.setBounds(230, 180, 40, 30);
//         frame.add(cday);

//         String[] months = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11",
//                 "12" };

//        JComboBox cmonth = new JComboBox<>(months);
//         cmonth.setBounds(290, 180, 70, 30);
//         frame.add(cmonth);
//         String[] year1 = new String[100];
//         for (int i = 1951; i <= 2023; i++) {
//             year1[i - 1951] = Integer.toString(i);
//         }
//         JComboBox cyear = new JComboBox<>(year);
//         cyear.setBounds(370, 180, 100, 30);
//         frame.add(cyear);

        
//         JLabel mobilel = new JLabel("Mobile no  :");
//         mobilel.setBounds(500, 150, 70, 80);
//       JTextField  mobile = new JTextField();
//         mobile.setBounds(600, 180, 130, 30);
//         frame.add(mobilel);
//         frame.add(mobile);

//        JLabel addressl = new JLabel("Address  :");
//         addressl.setBounds(100, 220, 70, 80);
//        JTextField address = new JTextField();
//         address.setBounds(230, 250, 200, 30);
//         frame.add(addressl);
//         frame.add(address);

//        JLabel cityl = new JLabel("City  :");
//         cityl.setBounds(100, 260, 70, 80);

//        JComboBox citycombo = new JComboBox<>();
//         citycombo.setBounds(230, 290, 200, 30);
//         frame.add(cityl);
//         frame.add(citycombo);

//         JLabel statel = new JLabel("State  :");
//         statel.setBounds(100, 300, 70, 80);
//       JComboBox  statecombo = new JComboBox<>();
//         statecombo.setBounds(230, 330, 200, 30);
//         frame.add(statel);
//         frame.add(statecombo);

//         JLabel countryl = new JLabel("Country  :");
//         countryl.setBounds(450, 300, 70, 80);
//        JComboBox countrycombo = new JComboBox<>();
//         countrycombo.setBounds(550, 330, 200, 30);
//         frame.add(countryl);
//         frame.add(countrycombo);


//        JLabel edul = new JLabel("Education");
//         edul.setBounds(100, 420, 70, 80);
//        JTextField edu10 = new JTextField();
//         edu10.setBounds(80, 480, 120, 30);

//       JTextField  edu12 = new JTextField();
//         edu12.setBounds(80, 520, 120, 30);

//       JTextField  edu13 = new JTextField();
//         edu13.setBounds(80, 560, 120, 30);

//         frame.add(edul);
//         frame.add(edu10);
//         frame.add(edu12);
//         frame.add(edu13);

//       JLabel  collegel = new JLabel("College  ");
//         collegel.setBounds(240, 420, 70, 80);

//        JTextField college10 = new JTextField();
//         college10.setBounds(220, 480, 120, 30);

//        JTextField college12 = new JTextField();
//         college12.setBounds(220, 520, 120, 30);

//        JTextField college13 = new JTextField();
//         college13.setBounds(220, 560, 120, 30);

//         frame.add(collegel);
//         frame.add(college10);
//         frame.add(college12);
//         frame.add(college13);

//       JLabel  obtainedl = new JLabel("Obtained");
//         obtainedl.setBounds(390, 420, 70, 80);

//        JTextField obtained10 = new JTextField();
//         obtained10.setBounds(370, 480, 120, 30);

//        JTextField obtained12 = new JTextField();
//         obtained12.setBounds(370, 520, 120, 30);

//        JTextField obtained13 = new JTextField();
//         obtained13.setBounds(370, 560, 120, 30);

//         frame.add(obtainedl);
//         frame.add(obtained12);
//         frame.add(obtained10);
//         frame.add(obtained13);

//       JLabel  totall = new JLabel("Total");
//         totall.setBounds(520, 420, 70, 80);

//        JTextField total10 = new JTextField();
//         total10.setBounds(500, 480, 120, 30);

//        JTextField total12 = new JTextField();
//         total12.setBounds(500, 520, 120, 30);

//       JTextField  total13 = new JTextField();
//         total13.setBounds(500, 560, 120, 30);

//         frame.add(totall);
//         frame.add(total10);
//         frame.add(total12);
//         frame.add(total13);

//        JLabel percentagel = new JLabel(" Percentage  ");
//         percentagel.setBounds(670, 420, 80, 80);

//        JTextField percentage10 = new JTextField();
//         percentage10.setBounds(650, 480, 120, 30);

//        JTextField percentage12 = new JTextField();
//         percentage12.setBounds(650, 520, 120, 30);

//        JTextField percentage13 = new JTextField();
//         percentage13.setBounds(650, 560, 120, 30);
//         frame.add(percentagel);
//         frame.add(percentage10);
//         frame.add(percentage12);
//         frame.add(percentage13);

//         frame.setLayout(null);
//         frame.setVisible(true);
//         disable();

//         try {
//             Class.forName("com.mysql.cj.jdbc.Driver");
//             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/data", "root", "");
//             Statement st = con.createStatement();
//             String sqlquery = "select * from citydata";
//             ResultSet rs = st.executeQuery(sqlquery);
//             while (rs.next()) {
//                 String s = rs.getString(2);
//                 citycombo.addItem(s);
//             }
//         } catch (Exception e) {
//             System.out.println(e);
//         }

//         citycombo.addItemListener(new ItemListener() {

//             @Override
//             public void itemStateChanged(ItemEvent e) {
//                 try {
//                     statecombo.removeAllItems();

//                     Class.forName("com.mysql.cj.jdbc.Driver");
//                     Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/data", "root",
//                             "");
//                     System.out.println("combo box is the connected");
//                     Statement st = con.createStatement();

//                     String selecteditem = citycombo.getSelectedItem().toString();
//                     String sqlquery = "select state from statedata where sid=(select sid from citydata where city='"
//                             + selecteditem + "')";
//                     ResultSet rs = st.executeQuery(sqlquery);
//                     while (rs.next()) {
//                         String s = rs.getString("state");
//                         statecombo.addItem(s);
//                     }
//                     Statement st1 = con.createStatement();

                    

//                     String sqlquery1 = "select nation from nationdata where nid=(select nid from citydata where city='"
//                             + selecteditem + "')";
//                     ResultSet rs1 = st1.executeQuery(sqlquery1);
//                     while (rs1.next()) {
//                         String s = rs1.getString("nation");
//                         countrycombo.addItem(s);
//                     }
//                 } catch (ClassNotFoundException e1)
//                  {
//                     e1.printStackTrace();

//                 } catch (SQLException e1)
//                  {
//                     e1.printStackTrace();
//                 }

//             }

//         });

//         delete.addActionListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent arg0) {
//                 try {
//                     Class.forName("com.mysql.cj.jdbc.Driver");
//                     Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/data", "root",
//                             "");
//                     Statement st = con.createStatement();
//                     String sqlquery = "delete from projectdata where name='" + name.getText() + "'";
//                     int i = st.executeUpdate(sqlquery);
//                     if (i > 0) {
//                         JOptionPane.showMessageDialog(frame, "Record Deleted Successfully");
//                     } else {
//                         JOptionPane.showMessageDialog(frame, "Record Deletion failed");
//                     }

//                 } catch (ClassNotFoundException e) {
//                     e.printStackTrace();
//                 } catch (SQLException e) {
//                     e.printStackTrace();
//                 }
//             }
//         });

//         save.addActionListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent e) {
//                 String names = name.getText();
//                 String dob = daycombo.getSelectedItem().toString() + "/" + monthcombo.getSelectedItem().toString() + "/"
//                         + yearcombo.getSelectedItem().toString();
//                 String currentdate = cday.getSelectedItem().toString() + "/" + cmonth.getSelectedItem().toString() + "/"
//                         + cyear.getSelectedItem().toString();
//                 int ages = Integer.parseInt(age.getText());
//                 String addressc = address.getText();
//                 String selectedcity = citycombo.getSelectedItem().toString();
//                 String selectedstate = statecombo.getSelectedItem().toString();
//                 String selectedcountry = countrycombo.getSelectedItem().toString();
//                 String mobilenumber = mobile.getText();

//                 try {
//                     Class.forName("com.mysql.cj.jdbc.Driver");
//                     Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/data", "root",
//                             "");
//                     Statement st = con.createStatement();
//                     String sqlquery = "add into projectdata(name,dob,age,currentdate,address,city,state,country,mobile) values('"
//                             + names + "','" + dob + "','" + ages + "','" + currentdate + "','" + addressc + "','"
//                             + selectedcity + "','" + selectedstate + "','" + selectedcountry + "','" + mobilenumber
//                             + "')";
//                     int i = st.executeUpdate(sqlquery);
//                     if (i > 0) {
//                         JOptionPane.showMessageDialog(frame, "data submitted");
//                     } else {
//                         JOptionPane.showMessageDialog(frame, "data not submitted");
//                     }
// //////
//                     Statement st1 = con.createStatement();
//                     float a = Float.parseFloat(total10.getText());
//                     float b = Float.parseFloat(obtained10.getText());
//                     float c = Float.parseFloat(percentage10.getText());
//                     float a1 = Float.parseFloat(total12.getText());
//                     float b1 = Float.parseFloat(obtained12.getText());
//                     float c1 = Float.parseFloat(percentage12.getText());
//                     float a2 = Float.parseFloat(total13.getText());
//                     float b2 = Float.parseFloat(obtained13.getText());
//                     float c2 = Float.parseFloat(percentage13.getText());
//                     String sqlquery1 = "add INTO tabledata (name,education1,college1, total1, obtained1, percentage1,education2,college2, total2, obtained2, percentage2,education3,college3, total3, obtained3, percentage3) VALUES ('"
//                             + name.getText() + "','" + edu10.getText() + "','" + college10.getText() + "','" + a + "','"
//                             + b + "','" + c + "','" + edu12.getText() + "','" + college12.getText() + "','" + a1 + "','"
//                             + b1 + "','" + c1 + "','" + edu13.getText() + "','" + college13.getText() + "','" + a2
//                             + "','" + b2 + "','" + c2 + "')";
//                     int i1 = st1.executeUpdate(sqlquery1);
//                     if (i1 > 0) {
//                         JOptionPane.showMessageDialog(frame, "Marks Data Submitted");
//                     } else {
//                         JOptionPane.showMessageDialog(frame, "Marks data Not Submitted");
//                     }

//                 } catch (ClassNotFoundException e1) {
//                     e1.printStackTrace();

//                 } 
//                 catch (SQLException e1)
//                  {
//                     e1.printStackTrace();
//                 }
//             }
//         });

//         find.addActionListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent arg0) {
//                 try {
//                     Class.forName("com.mysql.cj.jdbc.Driver");
//                     Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/data", "root",
//                             "");
//                     Statement st = con.createStatement();
//                     String sqlquery = "SELECT * fROM projectdata left JOIN tabledata ON projectdata.name = tabledata.name";
//                     ResultSet rs = st.executeQuery(sqlquery);
//                     while (rs.next()) {
//                         String dob = rs.getString("dob");
//                         String[] dobparts = dob.split("/");
//                         String ages = rs.getString("age");
//                         String current = rs.getString("currentdate");
//                         String[] currentparts = current.split("/");
//                         String addressreturned = rs.getString("address");
//                         String city = rs.getString("city");
//                         String state = rs.getString("state");
//                         String country = rs.getString("country");
//                         String jmobile = rs.getString("mobile");

//                         daycombo.setSelectedItem(dobparts[0]);
//                         monthcombo.setSelectedItem(dobparts[1]);
//                         yearcombo.setSelectedItem(dobparts[2]);

//                         age.setText(ages);

//                         cday.setSelectedItem(currentparts[0]);
//                         cmonth.setSelectedItem(currentparts[1]);
//                         cyear.setSelectedItem(currentparts[2]);
//                         address.setText(addressreturned);
//                         citycombo.setSelectedItem(city);
//                         statecombo.removeAllItems();
//                         statecombo.addItem(state);
//                         countrycombo.removeAllItems(); 
//                         countrycombo.addItem(country);
//                         mobile.setText(jmobile);

//                         edu10.setText(rs.getString("education1"));
//                         edu12.setText(rs.getString("education2"));
//                         edu13.setText(rs.getString("education3"));
//                         college10.setText(rs.getString("college1"));
//                         college12.setText(rs.getString("college2"));
//                         college13.setText(rs.getString("college3"));
//                         obtained10.setText(rs.getString("obtained1"));
//                         obtained12.setText(rs.getString("obtained2"));
//                         obtained13.setText(rs.getString("obtained3"));
//                         total10.setText(rs.getString("total1"));
//                         total12.setText(rs.getString("total2"));
//                         total13.setText(rs.getString("total3"));
//                         percentage10.setText(rs.getString("percentage1"));
//                         percentage12.setText(rs.getString("percentage2"));
//                         percentage13.setText(rs.getString("percentage3"));
//                     }

//                     con.close(); // Close the connection when done
                    
//                 } catch (ClassNotFoundException e) {
//                     e.printStackTrace();
//                 } catch (SQLException e) {
//                     e.printStackTrace();
//                 }
//             }
//         });

//         edit.addActionListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent e) {
//                 try {
//                     Class.forName("com.mysql.cj.jdbc.Driver");
//                     Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/data", "root",
//                             "");
//                     Statement st = con.createStatement();
//                     String upday = daycombo.getSelectedItem().toString();
//                     String upmonth = monthcombo.getSelectedItem().toString();
//                     String upyear = yearcombo.getSelectedItem().toString();
//                     String updayc = cday.getSelectedItem().toString();
//                     String upmonthc = cmonth.getSelectedItem().toString();
//                     String upyearc = cyear.getSelectedItem().toString();
//                     String updob = upday + "/" + upmonth + "/" + upyear;
//                     String currentd = updayc + "/" + upmonthc + "/" + upyearc;
//                     int ageup = Integer.parseInt(age.getText());

//                     String sqlquery = "UPDATE projectdata SET "
//                             + "dob='" + updob + "',age='" + ageup + "',currentdate='" + currentd + "',address='"
//                             + address.getText() + "',"
//                             + "city='" + citycombo.getSelectedItem().toString() + "',state='"
//                             + statecombo.getSelectedItem().toString() + "',"
//                             + "country='" + countrycombo.getSelectedItem().toString() + "',mobile='" + mobile.getText()
//                             + "' "
//                             + "WHERE name='" + name.getText() + "'"; // Update by name

//                     int i = st.executeUpdate(sqlquery);
//                     if (i > 0) {
//                         JOptionPane.showMessageDialog(frame, "Record Updated Successfully!");
//                     } else {
//                         JOptionPane.showMessageDialog(frame, "Record Update Failed!");
//                     }
//                 } catch (ClassNotFoundException e1) {
//                     e1.printStackTrace();
//                 } catch (SQLException e1) {
//                     e1.printStackTrace();
//                 }
//             }
//         });

//         add.addActionListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent arg0) {
//                 enabled();
//             }
//         });

//         agec.addActionListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent ae) {
//                 String day = daycombo.getSelectedItem().toString();
//                 String month = monthcombo.getSelectedItem().toString();
//                 String year = yearcombo.getSelectedItem().toString();
//                 String dayc = cday.getSelectedItem().toString();
//                 String monthc = cmonth.getSelectedItem().toString();
//                 String yearc = cyear.getSelectedItem().toString();
//                 if (day.length() != 0 || month.length() != 0 || year.length() != 0 || dayc.length() != 0
//                         || monthc.length() != 0 || yearc.length() != 0) {
//                     age.setText("");
//                     int yearDOB = Integer.parseInt(year);
//                     int monthDOB = Integer.parseInt(month);
//                     int dayDOB = Integer.parseInt(day);
//                     int yearCurrent = Integer.parseInt(yearc);
//                     int monthCurrent = Integer.parseInt(monthc);
//                     int dayCurrent = Integer.parseInt(dayc);

//                     int aged = yearCurrent - yearDOB;
//                     if (yearDOB < 1950 || monthDOB < 1 || monthDOB > 12 || dayDOB < 1 || dayDOB > 31 ||
//                             yearCurrent < 1950 || monthCurrent < 1 || monthCurrent > 12 || dayCurrent < 1
//                             || dayCurrent > 31) {
//                         JOptionPane.showMessageDialog(frame, "Enter valid date of birth");
//                         agec.setSelected(false);
//                     } else {
//                         int age1 = yearCurrent - yearDOB;
//                         if (monthCurrent < monthDOB || (monthCurrent == monthDOB && dayCurrent < dayDOB)) {
//                             age1--;
//                         }
//                         String s = String.valueOf(age1);
//                         age.setText(s);
//                     }
//                 }
//             }
//         });

//         total10.addKeyListener(new KeyListener() {

//             @Override
//             public void keyTyped(KeyEvent e) {

//             }

//             @Override
//             public void keyPressed(KeyEvent e) {

//             }

//             @Override
//             public void keyReleased(KeyEvent e) {

//                 float a = Float.parseFloat(total10.getText());
//                 float b = Float.parseFloat(obtained10.getText());
//                 float c = (b / a) * 100;
//                 String ans = String.format("%.2f", c);
//                 percentage10.setText((ans));
//             }

//         });
//         total13.addKeyListener(new KeyListener() {

//             @Override
//             public void keyTyped(KeyEvent e) {

//             }

//             @Override
//             public void keyPressed(KeyEvent e) {

//             }

//             @Override
//             public void keyReleased(KeyEvent e) {

//                 float a = Float.parseFloat(total13.getText());
//                 float b = Float.parseFloat(obtained13.getText());
//                 float c = (b / a) * 100;
//                 String ans = String.format("%.2f", c);
//                 percentage13.setText((ans));
//             }

//         });
//         total12.addKeyListener(new KeyListener() {

//             @Override
//             public void keyTyped(KeyEvent e) {

//             }

//             @Override
//             public void keyPressed(KeyEvent e) {

//             }

//             @Override
//             public void keyReleased(KeyEvent e) {

//                 float a = Float.parseFloat(total12.getText());
//                 float b = Float.parseFloat(obtained12.getText());
//                 float c = (b / a) * 100;
//                 String ans = String.format("%.2f", c);
//                 percentage12.setText((ans));
//             }

//         });

//     }

//     void disable() {
//         name.setEnabled(false);
//         daycombo.setEnabled(false);
//         monthcombo.setEnabled(false);
//         yearcombo.setEnabled(false);
//         cday.setEnabled(false);
//         cmonth.setEnabled(false);
//         cyear.setEnabled(false);
//         age.setEnabled(false);
//         address.setEnabled(false);
//         citycombo.setEnabled(false);
//         statecombo.setEnabled(false);
//         countrycombo.setEnabled(false);
//         monthcombo.setEnabled(false);
//         mobile.setEnabled(false);

//         percentage10.setEnabled(false);
//         percentage12.setEnabled(false);
//         percentage13.setEnabled(false);
//         total10.setEnabled(false);
//         total12.setEnabled(false);
//         total13.setEnabled(false);
//         obtained10.setEnabled(false);
//         obtained12.setEnabled(false);
//         obtained13.setEnabled(false);
//         college10.setEnabled(false);
//         college12.setEnabled(false);
//         college13.setEnabled(false);
//         edu10.setEnabled(false);
//         edu12.setEnabled(false);
//         edu13.setEnabled(false);
//     }

//     void enabled() {
//         name.setEnabled(true);
//         daycombo.setEnabled(true);
//         monthcombo.setEnabled(true);
//         yearcombo.setEnabled(true);
//         cday.setEnabled(true);
//         cmonth.setEnabled(true);
//         cyear.setEnabled(true);
//         age.setEnabled(true);
//         address.setEnabled(true);
//         citycombo.setEnabled(true);
//         statecombo.setEnabled(true);
//         countrycombo.setEnabled(true);
//         monthcombo.setEnabled(true);
//         mobile.setEnabled(true);

//         percentage10.setEnabled(true);
//         percentage12.setEnabled(true);
//         percentage13.setEnabled(true);
//         total10.setEnabled(true);
//         total12.setEnabled(true);
//         total13.setEnabled(true);
//         obtained10.setEnabled(true);
//         obtained12.setEnabled(true);
//         obtained13.setEnabled(true);
//         college10.setEnabled(true);
//         college12.setEnabled(true);
//         college13.setEnabled(true);
//         edu10.setEnabled(true);
//         edu12.setEnabled(true);
//         edu13.setEnabled(true);
//     }

//     public static void main(String[] args) {
//         new Data_Form();
// }
// }