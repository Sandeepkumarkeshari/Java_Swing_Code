// Source code is decompiled from a .class file using FernFlower decompiler.
import java.awt.Color;
import java.awt.Cursor;
import java.awt.LayoutManager;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class Login{
   Login() {
   }

   public static void main(String[] var0) {
      JFrame var1 = new JFrame();
      var1.setBounds(100, 100, 750, 650);
      var1.setTitle("Login Form");
      var1.setLayout((LayoutManager)null);
      JLabel var2 = new JLabel("User name:");
      var2.setBounds(70, 50, 150, 30);
      JTextField var3 = new JTextField("Enter the user name");
      var3.setBounds(180, 50, 150, 30);
      JLabel var4 = new JLabel("user password:");
      var4.setBounds(70, 80, 150, 30);
      JTextField var5 = new JTextField("enter the user password");
      var5.setBounds(180, 80, 150, 30);
      JButton var6 = new JButton("click");
      var6.setBounds(180, 130, 150, 50);
      var6.setBackground(Color.red);
      Cursor var7 = new Cursor(12);
      var6.setCursor(var7);
      var1.add(var2);
      var1.add(var4);
      var1.add(var3);
      var1.add(var5);
      var1.add(var6);
      var1.setVisible(true);
   }
}
