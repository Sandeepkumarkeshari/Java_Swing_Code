import java.awt.Color;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class Hospital_Form{
    public static void main(String[]args){
        JFrame frame=new JFrame();
        frame.setBounds(200,50,1200,850);
        frame.setTitle("Hospital_Form");
        frame.setLayout(null);
        
   
 //UHID no:
            JLabel namel=new JLabel("UHID No:");
            namel.setBounds(30,50,100,30);
            frame.add(namel);       

           JTextField name=new JTextField(null, null, 0);
           name.setBounds(150, 50, 200, 30);
           frame.add(name);
 
 //date
           JLabel agel=new JLabel("Date");
           agel.setBounds(370, 50, 100, 30);
           frame.add(agel);
           
           JTextField age=new JTextField(null, null, 0);
           age.setBounds(430,50,200,30);
           frame.add(age);

//patient name

           JLabel patientl=new JLabel("Patient's name:");
           patientl.setBounds(30, 100, 100, 30);
           frame.add(patientl);

 //patient textfield

            String[] mr={"Mr","Mrs"};

            JComboBox mr1=new JComboBox<>(mr);
            mr1.setBounds(150,100,50,30);
            frame.add(mr1);
           

            JTextField firstname=new JTextField("FirstName:");
            firstname.setBounds(220, 100, 100, 30);
            frame.add(firstname);

            JTextField middlename=new JTextField("MiddleName:");
            middlename.setBounds(320, 100, 150, 30);
            frame.add(middlename);

            JTextField lastname=new JTextField("LastName:");
            lastname.setBounds(470, 100, 150, 30);
            frame.add(lastname);

//guardion name
        
            JLabel guardionl=new JLabel("Guardian's name:");
           guardionl.setBounds(30, 150, 100, 30);
           frame.add(guardionl);

            JTextField so=new JTextField("S/O:");
            so.setBounds(150, 150, 100, 30);
            frame.add(so);

            JTextField gurdian=new JTextField("");
            gurdian.setBounds(250, 150, 380, 30);
            frame.add(gurdian);

//relation
            JLabel relationl=new JLabel("Guardian's name:");
           relationl.setBounds(30, 200, 100, 30);
           frame.add(relationl);

           
            JTextField relation=new JTextField("");
            relation.setBounds(150, 200, 100, 30);
            frame.add(relation);


            JTextField mobilel=new JTextField("Mobile:");
            mobilel.setBounds(250, 200, 100, 30);
            frame.add(mobilel);

            JTextField mobile=new JTextField("");
            mobile.setBounds(350, 200, 100, 30);
            frame.add(mobile);

//email
            JLabel emaill=new JLabel("Email:");
           emaill.setBounds(30, 250, 100, 30);
           frame.add(emaill);


         JTextField email=new JTextField("");
            email.setBounds(150, 250, 380, 30);
            frame.add(email);
           
          
//id type
            JLabel idl=new JLabel("ID type:");
            idl.setBounds(30, 300, 100, 30);
            frame.add(idl);

            String[] id1={"Aadhar","Pan","DL","Passport"};
            JComboBox jc=new JComboBox<>(id1);
            jc.setBounds(150, 300, 100, 30);
            frame.add(jc);

            JTextField id2=new JTextField();
            id2.setBounds(270, 300, 200, 30);
            frame.add(id2);

//cast religion
           
            JLabel castl=new JLabel("Caste:");
            castl.setBounds(30, 350, 100, 30);
            frame.add(castl);

            String[] castc={"Religion","Marital status","Age","Class"};

            JComboBox jc2=new JComboBox<>(castc);
            jc2.setBounds(150,350,100,30);
            frame.add(jc2);

            JTextField religion=new JTextField(null, null, 0);
            religion.setBounds(250, 350, 100, 30);
            frame.add(religion);

             JTextField maritial=new JTextField(null, null, 0);
            maritial.setBounds(250, 380, 100, 30);
            frame.add( maritial);

             JTextField age1=new JTextField(null, null, 0);
            age1.setBounds(250, 410, 100, 30);
            frame.add(age1);
            
            JTextField class1=new JTextField(null, null, 0);
            class1.setBounds(250, 440, 100, 30);
            frame.add(class1);

//gender            
            JLabel genderl=new JLabel("Gender:");
            genderl.setBounds(30, 400, 100, 30);
            frame.add(genderl);

            String[] gender={"Male","Femail","Other"};
             JComboBox jc3=new JComboBox<>(gender);
             jc3.setBounds(150, 400, 100, 30);
             frame.add(jc3);



             
        frame.setVisible(true);
    }
}