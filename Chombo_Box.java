import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JComboBox;
class Chomobo_Box{
    public static void main(String[]args){
        JFrame jf=new JFrame();
       
        jf.setTitle("Chombo Box");
        jf.setLayout(null);
        jf.setBounds(100,100,650,650);
        jf.getContentPane().setBackground(Color.red);
        jf.setForeground(Color.red);
        
        String[] values={"Delhi","Noida","Varansi","Gujrat","RayBareli","Mirzapur"};
       JComboBox jc= new JComboBox(values);

       jc.setBounds(100, 100, 200, 100);

       jf.add(jc);
        jf.setVisible(true);
    }
}
