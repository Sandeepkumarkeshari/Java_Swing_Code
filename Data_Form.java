import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.sql.*;

class Data_Form {

    JLabel namel, dobl, agel, dateofjoiningl, addressl, cityl, nameinfo, addressinfo, cityinfo, stateinfo, countryinfo,
            mobileinfo, edul, collegel, obtainedl, totall, percentagel;
    JButton add, save, delete, edit, find;
    JTextField name, age, address, mobile, edu10, college10, obtained10, total10, percentage10, edu12, college12,
            obtained12, total12, percentage12,
            edu13, college13, obtained13, total13, percentage13;
    JComboBox<String> daycombo, monthcombo, yearcombo, cday, cmonth, cyear, citycombo, statecombo, countrycombo;
    JCheckBox agec;

    Data_Form() {
        JFrame frame = new JFrame("Form");
        frame.setBounds(50, 50, 800, 680);
        //frame.getContentPane().setBackground(Color.cyan);

        // use of the button

        add = new JButton("ADD");
        add.setBounds(120, 30, 100, 30);
        //add.setBackground(Color.red);
        frame.add(add);
        
     
        edit = new JButton("EDIT");
        edit.setBounds(250, 30, 100, 30);
       // edit.setBackground(Color.red);
        frame.add(edit);
          
        delete = new JButton("DELETE");
        delete.setBounds(380, 30, 100, 30);
       // delete.setBackground(Color.red);
        frame.add(delete);
         
        
        find = new JButton("FIND");
        find.setBounds(510, 30, 100, 30);
       // find.setBackground(Color.red);
        frame.add(find);

        save = new JButton("SAVE");
        save.setBounds(640, 30, 100, 30);
        //save.setBackground(Color.red);
        frame.add(save);


      JLabel  namel = new JLabel("Name  ");
        namel.setBounds(100, 50, 70, 80);
        name = new JTextField();
        name.setBounds(230, 80, 200, 30);
        frame.add(namel);
        frame.add(name);

        dobl = new JLabel("Date of birth  ");
        dobl.setBounds(100, 90, 100, 80);
        frame.add(dobl);

        String[] day = new String[31];
        for (int i = 1; i <= 31; i++) {
            day[i - 1] = Integer.toString(i);
        }

        daycombo = new JComboBox<>(day);
        daycombo.setBounds(230, 120, 40, 30);
        frame.add(daycombo);

        String[] month = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11",
                "12" };
        monthcombo = new JComboBox<>(month);
        monthcombo.setBounds(290, 120, 70, 30);
        frame.add(monthcombo);
        String[] year = new String[100];
        for (int i = 1951; i <= 2023; i++) {
            year[i - 1951] = Integer.toString(i);
        }
        yearcombo = new JComboBox<>(year);
        
        yearcombo.setBounds(370, 120, 100, 30);
        frame.add(yearcombo);
          
        agel = new JLabel("Age");
        agel.setBounds(500, 90, 100, 80);
        age = new JTextField();
        age.setBounds(600, 120, 100, 30);
        age.setEditable(false);
        
        frame.add(age);
        frame.add(agel);

        agec = new JCheckBox();
        agec.setBounds(750, 160, 20, 30);
        frame.add(agec);

        // dobl.addItemListener(new ActionEvent() {
        //     @Override
        //     public void actionPerformed(ActionEvent e){
        //     String sqlquery="SELECT NOW() FROM  project1('"+daycombo.getSelectedItem()+"')";
        //     System.out.println("That is the current date to the server");
        //     }
        // });

        //     mobile.addKeyListener (new KeyListener() {

        //         public void actionPerformed(KeyListener)
        //      {
                
        //     {
                
            
        //          @Override
        //     public void keyReleased(KeyEvent n) {
              
        //         try{
        //         float a = Float.parseFloat(total13.getText());
        //         float b = Float.parseFloat(obtained13.getText());
        //         float c = (b / a) * 100;

        //     if(mobile>=10){
        //         System.out.println("Enter  the valid mobile number!");
        //     }

        //     else
        //     {
        //         System.out.println("That is the valid Mobile number----");
        //     }

        //         String ans = String.format("%.2f", c);
        //         percentage13.setText((ans));
        //     }

        //     catch(Exception q){
        //          System.out.println(q);
        //     }
        // }
        //     });
               
                
       

        dateofjoiningl = new JLabel("Current_Date");
        dateofjoiningl.setBounds(100, 150, 90, 80);
        frame.add(dateofjoiningl);

        String[] days = new String[31];
        for (int i = 1; i <= 31; i++) {
            days[i - 1] = Integer.toString(i);
        }

        cday = new JComboBox<>(day);
        cday.setBounds(230, 180, 40, 30);
        frame.add(cday);

        String[] months = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11",
                "12" };
        cmonth = new JComboBox<>(months);
        cmonth.setBounds(290, 180, 70, 30);
        frame.add(cmonth);
        String[] year1 = new String[100];
        for (int i = 1951; i <= 2023; i++) {
            year1[i - 1951] = Integer.toString(i);
        }
        cyear = new JComboBox<>(year);
        cyear.setBounds(370, 180, 100, 30);
        frame.add(cyear);

        
        JLabel mobilel = new JLabel("Mobile no  ");
        mobilel.setBounds(500, 150, 70, 80);
        mobile = new JTextField();
        mobile.setBounds(600, 180, 130, 30);
        frame.add(mobilel);
        frame.add(mobile);


        addressl = new JLabel("Address  :");
        addressl.setBounds(100, 220, 70, 80);
        address = new JTextField();
        address.setBounds(230, 250, 200, 30);
        frame.add(addressl);
        frame.add(address);
           

        cityl = new JLabel("City  ");
        cityl.setBounds(100, 260, 70, 80);

        citycombo = new JComboBox<>();
        citycombo.setBounds(230, 290, 200, 30);
        frame.add(cityl);
        frame.add(citycombo);

        JLabel statel = new JLabel("State  ");
        statel.setBounds(100, 300, 70, 80);
        statecombo = new JComboBox<>();
        statecombo.setBounds(230, 330, 200, 30);
        frame.add(statel);
        frame.add(statecombo);

        JLabel countryl = new JLabel("Country  ");
        countryl.setBounds(450, 300, 70, 80);
        countrycombo = new JComboBox<>();
        countrycombo.setBounds(550, 330, 200, 30);
        frame.add(countryl);
        frame.add(countrycombo);
           
// //current date validation......

//         JLabel jl=new JLabel("C_Date");
//         jl.setBounds(100,350,70,80);
//         frame.add(jl);
       
        
//       String[] csdate={"1","2","3","4","5","6","7","8","9","10","11","12","13","15","16","17"};
//         JComboBox jc=new JComboBox<>(csdate);
//         jc.setBounds(200, 380, 70, 30);
//         frame.add(jc);
        
//          String[] csmonth={"jan","Feb","March","Apr","May","June","July","Aug","Sep","OCto","Nov","Dec" };
//         JComboBox jc1=new JComboBox<>(csmonth);
//         jc1.setBounds(300, 380, 70, 30);
//         frame.add(jc1);
        
//          String[] csyear={"2015","","2016","2017","2018","2019","2020","2021","2022","" };
//         JComboBox jc2=new JComboBox<>(csyear);
//         jc2.setBounds(420, 380, 70, 30);
//         frame.add(jc2);
        
       

        edul = new JLabel("Education");
        edul.setBounds(100, 420, 70, 80);
        edu10 = new JTextField();
        edu10.setBounds(80, 480, 120, 30);

        edu12 = new JTextField();
        edu12.setBounds(80, 520, 120, 30);

        edu13 = new JTextField();
        edu13.setBounds(80, 560, 120, 30);

        frame.add(edul);
        frame.add(edu10);
        frame.add(edu12);
        frame.add(edu13);

        collegel = new JLabel("College  ");
        collegel.setBounds(240, 420, 70, 80);

        college10 = new JTextField();
        college10.setBounds(220, 480, 120, 30);

        college12 = new JTextField();
        college12.setBounds(220, 520, 120, 30);

        college13 = new JTextField();
        college13.setBounds(220, 560, 120, 30);

        frame.add(collegel);
        frame.add(college10);
        frame.add(college12);
        frame.add(college13);

        obtainedl = new JLabel("Obtained");
        obtainedl.setBounds(390, 420, 70, 80);

        obtained10 = new JTextField();
        obtained10.setBounds(370, 480, 120, 30);

        obtained12 = new JTextField();
        obtained12.setBounds(370, 520, 120, 30);

        obtained13 = new JTextField();
        obtained13.setBounds(370, 560, 120, 30);

        frame.add(obtainedl);
        frame.add(obtained12);
        frame.add(obtained10);
        frame.add(obtained13);

        totall = new JLabel("Total");
        totall.setBounds(520, 420, 70, 80);

        total10 = new JTextField();
        total10.setBounds(500, 480, 120, 30);

        total12 = new JTextField();
        total12.setBounds(500, 520, 120, 30);

        total13 = new JTextField();
        total13.setBounds(500, 560, 120, 30);

        frame.add(totall);
        frame.add(total10);
        frame.add(total12);
        frame.add(total13);

        percentagel = new JLabel(" %Percentage ");
        percentagel.setBounds(670, 420, 80, 80);

        percentage10 = new JTextField();
        percentage10.setBounds(650, 480, 120, 30);

        percentage12 = new JTextField();
        percentage12.setBounds(650, 520, 120, 30);

        percentage13 = new JTextField();
        percentage13.setBounds(650, 560, 120, 30);
        frame.add(percentagel);
        frame.add(percentage10);
        frame.add(percentage12);
        frame.add(percentage13);

        frame.setLayout(null);
        frame.setVisible(true);
        disable();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdata", "root", "");
            Statement st = con.createStatement();
            String sqlquery = "select * from citydata";
            ResultSet rs = st.executeQuery(sqlquery);
            while (rs.next()) {
                String s = rs.getString(2);
                citycombo.addItem(s);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        citycombo.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                try {
                    statecombo.removeAllItems();

                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdata", "root",
                            "");
                    System.out.println("combo box is the connected");
                    Statement st = con.createStatement();

                    String selecteditem = citycombo.getSelectedItem().toString();
                    String sqlquery = "select state from statedata where sid=(select sid from citydata where city='"
                            + selecteditem + "')";
                    ResultSet rs = st.executeQuery(sqlquery);
                    while (rs.next()) {
                        String s = rs.getString("state");
                        statecombo.addItem(s);
                    }
                    Statement st1 = con.createStatement();

                    

                    String sqlquery1 = "select nation from nationdata where nid=(select nid from citydata where city='"
                            + selecteditem + "')";
                    ResultSet rs1 = st1.executeQuery(sqlquery1);
                    while (rs1.next()) {
                        String s = rs1.getString("nation");
                        countrycombo.addItem(s);
                    }
                } catch (ClassNotFoundException e1)
                 {
                    e1.printStackTrace();

                } catch (SQLException e1)
                 {
                    e1.printStackTrace();
                }

            }

        });

        delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdata", "root",
                            "");
                    Statement st = con.createStatement();
                    String sqlquery = "delete from projectdata where name='" + name.getText() + "'";
                    int i = st.executeUpdate(sqlquery);
                    if (i > 0) {
                        JOptionPane.showMessageDialog(frame, "Record deleted succesfully");
                    } else {
                        JOptionPane.showMessageDialog(frame, "Record deleted is the not succesfuly");
                    }

                } catch (ClassNotFoundException e)
            {
                    e.printStackTrace();

                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        });

        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String names = name.getText();
                String dob = daycombo.getSelectedItem().toString() + "/" + monthcombo.getSelectedItem().toString() + "/"
                        + yearcombo.getSelectedItem().toString();
                String currentdate = cday.getSelectedItem().toString() + "/" + cmonth.getSelectedItem().toString() + "/"
                        + cyear.getSelectedItem().toString();
                int ages = Integer.parseInt(age.getText());
                String addressc = address.getText();
                String selectedcity = citycombo.getSelectedItem().toString();
                String selectedstate = statecombo.getSelectedItem().toString();
                String selectedcountry = countrycombo.getSelectedItem().toString();
                String mobilenumber = mobile.getText();

                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root",
                            "");
                    Statement st = con.createStatement();
                    String sqlquery = "add into project1(name,dob,age,currentdate,address,city,state,country,mobile) values('"
                            + name.getText() + "','" + dob + "','" + age.getText() + "','" + currentdate + "','" + address + "','"
                            + citycombo + "','" + statecombo + "','" + countrycombo+ "','" + mobile
                            + "','"+yearcombo+"','"+monthcombo+"','"+daycombo+"')";
                    int i = st.executeUpdate(sqlquery);
                    if (i > 0) {
                        JOptionPane.showMessageDialog(frame, "Data submmited succesfuly");
                    } else {
                        JOptionPane.showMessageDialog(frame, "Data submitted is the not succesfuly");
                    }
//////
                    Statement st1 = con.createStatement();
                    float a = Float.parseFloat(total10.getText());
                    float b = Float.parseFloat(obtained10.getText());
                    float c = Float.parseFloat(percentage10.getText());
                    float a1 = Float.parseFloat(total12.getText());
                    float b1 = Float.parseFloat(obtained12.getText());
                    float c1 = Float.parseFloat(percentage12.getText());
                    float a2 = Float.parseFloat(total13.getText());
                    float b2 = Float.parseFloat(obtained13.getText());
                    float c2 = Float.parseFloat(percentage13.getText());
                    String sqlquery1 = "Insert INTO tabledata (name,education1,college1, total1, obtained1, percentage1,education2,college2, total2, obtained2, percentage2,education3,college3, total3, obtained3, percentage3) VALUES ('"
                            + name.getText() + "','" + edu10.getText() + "','" + college10.getText() + "','" + name.getText() + "','"
                            + b + "','" + c + "','" + edu12.getText() + "','" + college12.getText() + "','" + a1 + "','"
                            + b1 + "','" + c1 + "','" + edu13.getText() + "','" + college13.getText() + "','" + a2
                            + "','" + b2 + "','" + c2 + "')";
                    int i1 = st1.executeUpdate(sqlquery1);
                    if (i1 > 0) {
                        JOptionPane.showMessageDialog(frame, "Marks data is the submitted");
                    } else {
                        JOptionPane.showMessageDialog(frame, "Marks  data is the not submitted");
                    }

                } catch (ClassNotFoundException e1) {
                    e1.printStackTrace();

                } 
                catch (SQLException e1)
                 {
                    e1.printStackTrace();
                }
            }
        });

        find.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdata", "root",
                            "");
                    Statement st = con.createStatement();
                    String sqlquery = "SELECT * fROM projectdata left JOIN marksdata ON projectdata.name = marksdata.name";
                    ResultSet rs = st.executeQuery(sqlquery);
                    while (rs.next()) {
                        String dob = rs.getString("dob");
                        String[] dobparts = dob.split("/");
                        String ages = rs.getString("age");
                        String current = rs.getString("currentdate");
                        String[] currentparts = current.split("/");
                        String addressreturned = rs.getString("address");
                        String city = rs.getString("city");
                        String state = rs.getString("state");
                        String country = rs.getString("country");
                        String jmobile = rs.getString("mobile");

                        daycombo.setSelectedItem(dobparts[0]);
                        monthcombo.setSelectedItem(dobparts[1]);
                        yearcombo.setSelectedItem(dobparts[2]);

                        age.setText(ages);

                        cday.setSelectedItem(currentparts[0]);
                        cmonth.setSelectedItem(currentparts[1]);
                        cyear.setSelectedItem(currentparts[2]);
                        address.setText(addressreturned);
                        citycombo.setSelectedItem(city);
                        statecombo.removeAllItems();
                        statecombo.addItem(state);
                        countrycombo.removeAllItems(); 
                        countrycombo.addItem(country);
                        mobile.setText(jmobile);

                        edu10.setText(rs.getString("education1"));
                        edu12.setText(rs.getString("education2"));
                        edu13.setText(rs.getString("education3"));
                        college10.setText(rs.getString("college1"));
                        college12.setText(rs.getString("college2"));
                        college13.setText(rs.getString("college3"));
                        obtained10.setText(rs.getString("obtained1"));
                        obtained12.setText(rs.getString("obtained2"));
                        obtained13.setText(rs.getString("obtained3"));
                        total10.setText(rs.getString("total1"));
                        total12.setText(rs.getString("total2"));
                        total13.setText(rs.getString("total3"));
                        percentage10.setText(rs.getString("percentage1"));
                        percentage12.setText(rs.getString("percentage2"));
                        percentage13.setText(rs.getString("percentage3"));
                    }

                    con.close(); // Close the connection when done
                    
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        });

        edit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdata", "root",
                            "");
                    Statement st = con.createStatement();
                    String upday = daycombo.getSelectedItem().toString();
                    String upmonth = monthcombo.getSelectedItem().toString();
                    String upyear = yearcombo.getSelectedItem().toString();
                    String updayc = cday.getSelectedItem().toString();
                    String upmonthc = cmonth.getSelectedItem().toString();
                    String upyearc = cyear.getSelectedItem().toString();
                    String updob = upday + "/" + upmonth + "/" + upyear;
                    String currentd = updayc + "/" + upmonthc + "/" + upyearc;
                    int ageup = Integer.parseInt(age.getText());

                    String sqlquery = "UPDATE project1 SET "
                            + "dob='" + updob + "',age='" + ageup + "',currentdate='" + currentd + "',address='"
                            + address.getText() + "',"
                            + "city='" + citycombo.getSelectedItem().toString() + "',state='"
                            + statecombo.getSelectedItem().toString() + "',"
                            + "country='" + countrycombo.getSelectedItem().toString() + "',mobile='" + mobile.getText()
                            + "' "
                            + "WHERE name='" + name.getText() + "'"; // Update by name

                    int i = st.executeUpdate(sqlquery);
                    if (i > 0) {
                        JOptionPane.showMessageDialog(frame, "Record update succesfuly!");
                    } else {
                        JOptionPane.showMessageDialog(frame, "Record update is the not succesfuly!");
                    }
                } catch (ClassNotFoundException e1) {
                    e1.printStackTrace();
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }
        });

        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                enabled();
            }
        });

        agec.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String day = daycombo.getSelectedItem().toString();
                String month = monthcombo.getSelectedItem().toString();
                String year = yearcombo.getSelectedItem().toString();
                String dayc = cday.getSelectedItem().toString();
                String monthc = cmonth.getSelectedItem().toString();
                String yearc = cyear.getSelectedItem().toString();
                if (day.length() != 0 || month.length() != 0 || year.length() != 0 || dayc.length() != 0
                        || monthc.length() != 0 || yearc.length() != 0) {
                    age.setText("");
                    int yearDOB = Integer.parseInt(year);
                    int monthDOB = Integer.parseInt(month);
                    int dayDOB = Integer.parseInt(day);
                    int yearCurrent = Integer.parseInt(yearc);
                    int monthCurrent = Integer.parseInt(monthc);
                    int dayCurrent = Integer.parseInt(dayc);

                    int aged = yearCurrent - yearDOB;
                    if (yearDOB < 1950 || monthDOB < 1 || monthDOB > 12 || dayDOB < 1 || dayDOB > 31 ||
                            yearCurrent < 1950 || monthCurrent < 1 || monthCurrent > 12 || dayCurrent < 1
                            || dayCurrent > 31) {
                        JOptionPane.showMessageDialog(frame, "Enter valid date of birth");
                        agec.setSelected(false);
                    } else {
                        int age1 = yearCurrent - yearDOB;
                        if (monthCurrent < monthDOB || (monthCurrent == monthDOB && dayCurrent < dayDOB)) {
                            age1--;
                        }
                        String s = String.valueOf(age1);
                        age.setText(s);
                        System.out.println("Record is the succesfuly submitted");
                        
                    }
                }
            }
        });


        

        total10.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {

                float a = Float.parseFloat(total10.getText());
                float b = Float.parseFloat(obtained10.getText());
                float c = (b / a) * 100;
                String ans = String.format("%.2f", c);
                percentage10.setText((ans));
            }

        });
        total13.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {

                float a = Float.parseFloat(total13.getText());
                float b = Float.parseFloat(obtained13.getText());
                float c = (b / a) * 100;
                String ans = String.format("%.2f", c);
                percentage13.setText((ans));
            }

        });
        total12.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {

                float a = Float.parseFloat(total12.getText());
                float b = Float.parseFloat(obtained12.getText());
                float c = (b / a) * 100;
                String ans = String.format("%.2f", c);
                percentage12.setText((ans));
            }

        });

    }

    void disable() {
        name.setEnabled(false);
        daycombo.setEnabled(false);
        monthcombo.setEnabled(false);
        yearcombo.setEnabled(false);
        cday.setEnabled(false);
        cmonth.setEnabled(false);
        cyear.setEnabled(false);
        age.setEnabled(false);
        address.setEnabled(false);
        citycombo.setEnabled(false);
        statecombo.setEnabled(false);
        countrycombo.setEnabled(false);
        monthcombo.setEnabled(false);
        mobile.setEnabled(false);

        percentage10.setEnabled(false);
        percentage12.setEnabled(false);
        percentage13.setEnabled(false);
        total10.setEnabled(false);
        total12.setEnabled(false);
        total13.setEnabled(false);
        obtained10.setEnabled(false);
        obtained12.setEnabled(false);
        obtained13.setEnabled(false);
        college10.setEnabled(false);
        college12.setEnabled(false);
        college13.setEnabled(false);
        edu10.setEnabled(false);
        edu12.setEnabled(false);
        edu13.setEnabled(false);
    }

    void enabled() {
        name.setEnabled(true);
        daycombo.setEnabled(true);
        monthcombo.setEnabled(true);
        yearcombo.setEnabled(true);
        cday.setEnabled(true);
        cmonth.setEnabled(true);
        cyear.setEnabled(true);
        age.setEnabled(true);
        address.setEnabled(true);
        citycombo.setEnabled(true);
        statecombo.setEnabled(true);
        countrycombo.setEnabled(true);
        monthcombo.setEnabled(true);
        mobile.setEnabled(true);

        percentage10.setEnabled(true);
        percentage12.setEnabled(true);
        percentage13.setEnabled(true);
        total10.setEnabled(true);
        total12.setEnabled(true);
        total13.setEnabled(true);
        obtained10.setEnabled(true);
        obtained12.setEnabled(true);
        obtained13.setEnabled(true);
        college10.setEnabled(true);
        college12.setEnabled(true);
        college13.setEnabled(true);
        edu10.setEnabled(true);
        edu12.setEnabled(true);
        edu13.setEnabled(true);
    }

    public static void main(String[] args) {
        new Data_Form();
        
}
}