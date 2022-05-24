import javax.swing.JOptionPane;
public class exec06 {
    public static void main (String args [])
    {
    Integer a,b,c,d;
    a=Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
    b=Integer.parseInt(JOptionPane.showInputDialog("Digite um número maior que o primeiro:"));
    c=Integer.parseInt(JOptionPane.showInputDialog("Digite um número maior que o segundo:"));
    d=Integer.parseInt(JOptionPane.showInputDialog("Digite um número qualquer:"));
    if (d>c)
    {
    JOptionPane.showMessageDialog(null, a+","+b+","+c+","+d); 
    }
    else if (d<a)
    {
    JOptionPane.showMessageDialog(null, d+","+a+","+b+","+c);     
    }
    else if ((d<b)&&(d>a))
    {
    JOptionPane.showMessageDialog(null, a+","+d+","+b+","+c);   
    }
    else
    {
    JOptionPane.showMessageDialog(null, a+","+b+","+d+","+c);   
    }
    }
}