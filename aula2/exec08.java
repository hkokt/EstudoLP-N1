import javax.swing.JOptionPane;
public class exec08{
       public static void main (String args [])
     {
         double dep, rend;
            dep = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do depósito:"));
                rend=(dep*(1.3/100))+ dep;
                              JOptionPane.showMessageDialog(null,"Depois de um mês o deposito rendeu" + " " + rend);
     }
}
