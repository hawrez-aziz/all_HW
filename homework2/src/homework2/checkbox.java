
package homework2;

import java.awt.Checkbox;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.*;

public class checkbox extends JFrame implements ActionListener{
  
    public void actionPerformed(ActionEvent ae) {
       JButton b1 = new JButton("connnnn");
          JButton b2 = new JButton("hoho");
          
          
       Frame f= new Frame("Checkbox Example");  
        Checkbox checkbox1 = new Checkbox("C++");  
        checkbox1.setBounds(100,100, 50,50);  
        Checkbox checkbox2 = new Checkbox("Java", true);  
        checkbox2.setBounds(100,150, 50,50);  
        f.add(checkbox1);  
        f.add(checkbox2);  
        f.add(b1);
        f.add(b2);
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true);  
  b1.setBounds(70, 300, 70, 30);
  b2.setBounds(170, 300, 70, 30);
    }

}