import javax.swing.JOptionPane;
public class exec03{
   public static void main (String args[])
   {
       Double Altura,Base,Area;
       Altura=Double.parseDouble(JOptionPane.showInputDialog
               ("Digite a altura"));
       Base=Double.parseDouble(JOptionPane.showInputDialog
               ("Digite a base"));
       Area=(Base*Altura)/2;
       JOptionPane.showMessageDialog(null,"A Area é de"+ Area);
               
   }
}
