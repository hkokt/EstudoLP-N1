import javax.swing.JOptionPane;
public class exec04{
    public static void main (String args[])
    {
        Double Celsius,Far;
        Celsius=Double.parseDouble(JOptionPane.showInputDialog
            ("Digite a temperatura em Celsius"));
  Far=((9*Celsius)+160)/5;
    JOptionPane.showMessageDialog(null,"fahrenheint"
    + Far);
    }
}
