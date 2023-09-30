// import javax.swing.JFrame;
// import javax.swing.JLabel;
// import javax.swing.JTextField;
// import javax.swing.JComboBox;
// import javax.swing.JButton;

// class Revise_Form{
//     public static void main(String[] args){
//         JFrame frame=new JFrame();
//         frame.setTitle("Revise_Form");
//         frame.setBounds(50,100,500,600);
//         frame.setLayout(null);

//  //First name

//         JLabel label1=new JLabel("FIRST NAME :");
//         label1.setBounds(50,50,100,30);
//         frame.add(label1);

//         JTextField field1=new JTextField("");
//         field1.setBounds(150,50,200,30);
//         frame.add(field1);

//  //Middle name

//         JLabel label2=new JLabel("MIDDLE NAME:");
//         label2.setBounds(50,100,100,30);
//         frame.add(label2);

//         JTextField field2=new JTextField();
//         field2.setBounds(150,100,200,30);
//         frame.add(field2);

// //Last name
//         JLabel label3=new JLabel("LAST NAME:");
//         label3.setBounds(50,150,100,30);
//         frame.add(label3);

//         JTextField field3=new JTextField();
//         field3.setBounds(150,150,200,30);
//         frame.add(field3);

// //Age

//         JLabel label4=new JLabel("AGE:");
//         label4.setBounds(50,200,100,30);
//         frame.add(label4);
        
//         JTextField field4=new JTextField();
//         field4.setBounds(150,200,200,30);
//         frame.add(field4);

//  //mobile 
 
//         JLabel label5=new JLabel("MOBIEL NO:");
//         label5.setBounds(50,250,100,30);
//         frame.add(label5);

//         JTextField field5=new JTextField();
//         field5.setBounds(150,250,200,30);
//         frame.add(field5);

//  //dob
        
//         JLabel label6=new JLabel("DOB:");
//         label6.setBounds(50,300,100,30);
//         frame.add(label6);

//        String[] day=new String[31];
//        for(int i=1;i<=31;i++){
//         day[i-1]=Integer.toString(i);
//        }

//        JComboBox combo=new JComboBox<>(day);
//        combo.setBounds(100,300,50,30);
//        frame.add(combo);

//        String[] months={"January","February","March","Aprl","May","June","July","August","September","October","November","December"};
//        JComboBox combo1=new JComboBox<>(months);
//        combo1.setBounds(170,300,100,30);
//        frame.add(combo1);

//        String[] year=new String[100];
//        for(int j=1985;j<=2050;j++){
//         year[j-1985]=Integer.toString(j);
//        }

//        JComboBox combo3=new JComboBox<>(year);
//        combo3.setBounds(300,300,100,30);
//        frame.add(combo3);
// //add button

//        JButton button=new JButton("ADD");
//        button.setBounds(50,350,100,50);
//        frame.add(button);

// //find button

//        JButton button1=new JButton("FIND");
//        button1.setBounds(170,350,100,50);
//        frame.add(button1);

// //save

//        JButton button2=new JButton("SAVE", null);
//        button2.setBounds(290, 350, 100, 50);
//        frame.add(button2);

//  //Delete 
          
       

//         frame.setVisible(true);
        
//     }
// }

