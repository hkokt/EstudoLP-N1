import javax.swing.JOptionPane;
public class exec09{
    public static void main(String args[])
    {
        int a,b,resultado;
            a=Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valorinteiro"));
            b=Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor inteiro"));
                resultado = Math.pow(a,2) + Math.pow(b,2);
                 JOptionPane.showMessageDialog(null,"a soma do quadrado dos dois valores é de "+" "+ resultado);   
    }
}
 
