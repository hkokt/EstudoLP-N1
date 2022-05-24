import javax.swing.JOptionPane;
import java.lang.*;
public class exec05{
    public static void main (String args[])
    {
        Double a,b,c,delta;
        a=Double.parseDouble(JOptionPane.showInputDialog    
                ("DIGITE O VALOR DE A"));
        b=Double.parseDouble(JOptionPane.showInputDialog    
                ("DIGITE O VALOR DE B"));
        c=Double.parseDouble(JOptionPane.showInputDialog    
                ("DIGITE O VALOR DE C"));
    delta = (b*b) - 4*a*c;
    if (delta < 0)
    {
        JOptionPane.showMessageDialog(null,"O valor de delta é negativo");
    }
    else
    {   double r1=((-b)+(Math.sqrt(delta)))/(2*a);
        double r2=((-b)-(Math.sqrt(delta)))/(2*a);
    JOptionPane.showMessageDialog(null,"O valor de x1 é" + " "+ r1);
            JOptionPane.showMessageDialog(null,"O valor de x2 é" +" "+ r2);
    }
    }
}
