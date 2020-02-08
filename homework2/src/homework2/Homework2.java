

package homework2;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
//it is just example
public class Homework2 {

 
    
    
    
    public static void main(String[] args) {
        JLabel q =new JLabel("email or name");
          JLabel q1=new JLabel("password");
           
        
   JButton b1 = new JButton("sgin in");
          JButton b2 = new JButton("cancel");
    
     
        
  Frame f= new Frame("log in");  
    TextField t1,t2;  
    t1=new TextField("name ");  
    t1.setBounds(170, 50, 130, 30);  
    t2=new TextField("password");  
    t2.setBounds(170, 90, 130, 30);  
    f.add(t1); f.add(t2);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true);  
    f.add(b1);
    f.add(q);
    f.add(q1);
        f.add(b2);
         b1.setBounds(70, 300, 100, 30);
  b2.setBounds(170, 300, 100, 30);
    
     q.setBounds(50, 10, 150, 100);         
            
            q1.setBounds(50, 50, 150, 100);
        
     
    final TextField tf=new TextField();  
    tf.setBounds(50,50, 150,20);  
    Button b=new Button("Click Here");  
    b.setBounds(50,100,60,30);  

    
   new checkbox();  
    b1.addActionListener(new checkbox());
    }  

   
    }
    

