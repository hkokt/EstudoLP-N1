import javax.swing.JOptionPane;
public class exec01{
    public static void main(String args[])
    {
int Lado,Area;
Lado = Integer.parseInt(JOptionPane.showInputDialog
                            ("DIGITE UM VALOR"));
Area=(Lado*Lado);
JOptionPane.showMessageDialog(null,"A AREA DO QUADRADO"+Area);
        }
}