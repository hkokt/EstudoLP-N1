import javax.swing.JOptionPane;
public class exec02 {
    public static void main (String args [])
    {
        Double x,y,z; 
        x=Double.parseDouble(JOptionPane.showInputDialog("Digite um número real :"));
        y=Double.parseDouble(JOptionPane.showInputDialog("Digite outro número real :"));
           if (x>y) 
            {
                z=x-y;
            }
            else
            {
                z=y-x;
            }
        JOptionPane.showMessageDialog(null, "A diferença do maior número para o menor é de" + " " + z);
    }
}
