import javax.swing.JOptionPane;
public class exec06{
    public static void main (String args[])
    {
        int a,b,x,y;
        a=Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de x"));
        b=Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de y"));
x=b;
y=a;
      JOptionPane.showMessageDialog(null,"o calor de x agora é"+" "+x);
      JOptionPane.showMessageDialog(null,"o calor de y agora é"+" "+ y);
    }
}
