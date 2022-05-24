import javax.swing.JOptionPane;
public class exec01 {
    public static void main (String args [])
    {
        Integer x,y,z;
        x=Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));
        y=Integer.parseInt(JOptionPane.showInputDialog("Digite outro número inteiro:"));
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
