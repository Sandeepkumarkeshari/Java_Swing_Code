import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import com.mysql.cj.jdbc.Driver;
import javax.swing.*;
import java.sql.*;

class Man {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setBounds(200, 50, 850, 750);
        frame.setLayout(null);
        frame.setTitle("Form");
        frame.getContentPane().setBackground(Color.cyan);

        // that is the add button

        JButton add = new JButton("ADD");
        add.setBounds(30, 30, 100, 50);
        add.setBackground(Color.red);

        // that is the edit button

        JButton edit = new JButton("EDIT ");
        edit.setBounds(180, 30, 100, 50);
        edit.setBackground(Color.red);

        // that is the delete button

        JButton delete = new JButton("DELETE");
        delete.setBounds(330, 30, 100, 50);
        delete.setBackground(Color.red);

        // that is the find button

        JButton find = new JButton("FIND");
        find.setBounds(480, 30, 100, 50);
        find.setBackground(Color.red);

        // that is the save button

        JButton save = new JButton("SAVE");
        save.setBounds(630, 30, 100, 50);
        save.setBackground(Color.red);
        // name

        JLabel jl = new JLabel("NAME:");
        jl.setBounds(30, 100, 100, 30);

        JTextField name = new JTextField();
        name.setBounds(100, 100, 150, 30);

        // dob

        JLabel jl1 = new JLabel("DOB:");
        jl1.setBounds(30, 150, 100, 30);

        JTextField dob = new JTextField();
        dob.setBounds(100, 150, 150, 30);

        // age

        JLabel jl2 = new JLabel("AGE:");
        jl2.setBounds(300, 150, 100, 30);

        JTextField age = new JTextField();
        age.setBounds(400, 150, 150, 30);

        // doj

        JLabel jl3 = new JLabel("DOJ:");
        jl3.setBounds(30, 200, 100, 30);

        JTextField doj = new JTextField();
        doj.setBounds(100, 200, 150, 30);

        // mobile

        JLabel jl4 = new JLabel("MOBILE:");
        jl4.setBounds(300, 200, 100, 30);

        JTextField mobile = new JTextField();
        mobile.setBounds(400, 200, 150, 30);

        // address

        JLabel jl5 = new JLabel("ADDRESS:");
        jl5.setBounds(30, 250, 100, 30);

        JTextField address = new JTextField();
        address.setBounds(100, 250, 150, 30);

        // city

        JLabel jl6 = new JLabel("CITY:");
        jl6.setBounds(30, 300, 100, 30);

        JTextField city = new JTextField();
        city.setBounds(100, 300, 150, 30);

        // state

        JLabel jl7 = new JLabel("STATE:");
        jl7.setBounds(30, 350, 100, 30);

        String[] jc = { "UP", "MP", "Gujrat", "Noida" };
        JComboBox state = new JComboBox<>(jc);
        state.setBounds(100, 350, 150, 30);

        // country

        JLabel jl8 = new JLabel("COUNTRY:");
        jl8.setBounds(300, 350, 100, 30);
        String[] jc1 = { "India", "USA", "UK", "China", "Nepal" };
        JComboBox country = new JComboBox<>(jc1);
        country.setBounds(400, 350, 150, 30);

        // That is the table

        // class

        JLabel jl9 = new JLabel("Class");
        jl9.setBounds(120, 400, 100, 50);

        JTextField clas1 = new JTextField();
        clas1.setBounds(80, 450, 120, 30);

        JTextField clas2 = new JTextField();
        clas2.setBounds(80, 500, 120, 30);

        JTextField clas3 = new JTextField();
        clas3.setBounds(80, 550, 120, 30);

        // collage
        JLabel jl10 = new JLabel("Collage");
        jl10.setBounds(250, 400, 120, 30);

        JTextField collage = new JTextField();
        collage.setBounds(220, 450, 120, 30);

        JTextField collage1 = new JTextField();
        collage1.setBounds(220, 500, 120, 30);

        JTextField collage2 = new JTextField();
        collage2.setBounds(220, 550, 120, 30);

        // obtaining
        JLabel jl11 = new JLabel("Obtaining");
        jl11.setBounds(380, 400, 120, 30);

        JTextField obtaining = new JTextField();
        obtaining.setBounds(360, 450, 120, 30);

        JTextField obtaining1 = new JTextField();
        obtaining1.setBounds(360, 500, 120, 30);

        JTextField obtaining2 = new JTextField();
        obtaining2.setBounds(360, 550, 120, 30);

        // obtained
        JLabel jl12 = new JLabel("Obtained");
        jl12.setBounds(510, 400, 120, 30);

        JTextField obtained = new JTextField();
        obtained.setBounds(490, 450, 120, 30);

        JTextField obtained1 = new JTextField();
        obtained1.setBounds(490, 500, 120, 30);

        JTextField obtained2 = new JTextField();
        obtained2.setBounds(490, 550, 120, 30);

        // obtained
        JLabel jl13 = new JLabel("%Autocalculator");
        jl13.setBounds(640, 400, 120, 30);

        JTextField auto = new JTextField();
        auto.setBounds(620, 450, 120, 30);

        JTextField auto1 = new JTextField();
        auto1.setBounds(620, 500, 120, 30);

        JTextField auto2 = new JTextField();
        auto2.setBounds(620, 550, 120, 30);

        frame.add(jl9);
        frame.add(clas1);
        frame.add(clas2);
        frame.add(clas3);

        frame.add(jl10);
        frame.add(collage);
        frame.add(collage1);
        frame.add(collage2);

        frame.add(jl11);
        frame.add(obtaining);
        frame.add(obtaining1);
        frame.add(obtaining2);

        frame.add(jl12);
        frame.add(obtained);
        frame.add(obtained1);
        frame.add(obtained2);

        frame.add(jl13);
        frame.add(auto);
        frame.add(auto1);
        frame.add(auto2);

        frame.add(add);
        frame.add(edit);
        frame.add(delete);
        frame.add(find);
        frame.add(save);
        frame.add(jl);
        frame.add(jl1);
        frame.add(jl2);
        frame.add(jl3);
        frame.add(jl4);
        frame.add(jl5);
        frame.add(jl6);
        frame.add(jl7);
        frame.add(jl8);
        frame.add(name);
        frame.add(dob);
        frame.add(age);
        frame.add(doj);
        frame.add(mobile);
        frame.add(address);
        frame.add(city);
        frame.add(state);
        frame.add(country);
        frame.setVisible(true);
    }
}