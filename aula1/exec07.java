import javax.swing.JOptionPane;
public class exec07 {
    public static void main (String args [])
    {
    Integer n1;
    n1=Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));
    if ((n1%3==0)&&(n1%2==0))
        {
            JOptionPane.showMessageDialog(null, n1 + " É divisível por 2 e 3.");
        }
    else 
    {
        JOptionPane.showMessageDialog(null, "Valor não divisível por 2 e 3.");
    }
   }
}