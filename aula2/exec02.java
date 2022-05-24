import javax.swing.JOptionPane
public class exec02 {
    public static void main(String arg[])
    {
        Double SalarioReceber,SalarioReajuste;
        SalarioReceber=Double.parseDouble(JOptionPane.showInputDialog
                    ("Digite um salário"));
SalarioReajuste=SalarioReceber*1.15;
JOptionPane.showMessageDialog(null,"Salário comreajuste"+SalarioReajuste);

    }
    
}
