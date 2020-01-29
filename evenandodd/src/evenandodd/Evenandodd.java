
package evenandodd;
import java.io.*;
import javax.swing.JOptionPane;

public class Evenandodd {

    public static void main(String[] args) {
        for (int b = 0; b < 990; b++) {
            
        
        String s;
      int i;
      s = JOptionPane.showInputDialog(null, "Enter a Number: ");
      i=Integer.parseInt(s);
      if(i%2==0)
         JOptionPane.showMessageDialog(null, "the number is even " + i);
      else
         JOptionPane.showMessageDialog(null, "the number is odd " + i);
      
      String message = "Try another Number?";
    int answer = JOptionPane.showConfirmDialog(null, message);
    if (answer== JOptionPane.YES_OPTION){}
    else if(answer==JOptionPane.NO_OPTION){System.exit(0);}
    else if (answer==JOptionPane.CANCEL_OPTION){System.exit(0);}
      }
    }
    
}
