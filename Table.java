import javax.swing.*;
import java.awt.*;


class Table{
    public static void main(String[]args){
        JFrame frame=new JFrame();
       frame.setBounds(30,100,650,650);
       frame.setTitle("Table");
       frame.setLayout(new BorderLayout());
       String[][] data = { { "001", "sandeep", "21" },
                { "002", "manish", "21" },
                { "003", "Dharmendra", "22" } };

        String[]columnNames = { "Roll NO", "Name", "Age" };

        JTable table = new JTable(data,columnNames );
       
        frame.add(new JScrollPane(table));

        
       frame.setVisible(true);
    }
}

