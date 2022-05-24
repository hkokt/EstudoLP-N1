import javax.swing.*;
public class exec03{
public static void main(String[] args) {
    double x, y, soma ;
    y=Double.parseDouble(JOptionPane.showInputDialog("Digite um divisor: "));
    x=1;
    while (x>0)
    {
        y= (1/y) + (1/y - (1/(x+x)));
        x--;
    }
JOptionPane.showMessageDialog(null, 1/y);
            
}
}
