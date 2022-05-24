import javax.swing.*;
public class exec02{
    public static void main(String [] args)
    {
        int i, num;
        num=Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
        i=num;
        while (i>1)
        {
         num=num*(i-1)   ;
         i--;
        }       
        JOptionPane.showMessageDialog(null,"o fatorial é: "+num);
    }
    
}
