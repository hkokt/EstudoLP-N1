import javax.swing.JOptionPane;
public class exec07{
    public static void main (String args [])
    {
double volume,largura,comprimento,altura;
    largura = Double.parseDouble(JOptionPane.showInputDialog("DIGITE A LARGURA"));
    altura = Double.parseDouble(JOptionPane.showInputDialog("DIGITE A ALTURA"));
    comprimento = Double.parseDouble(JOptionPane.showInputDialog("DIGITE A COMPRIMENTO"));
         volume=largura*altura*comprimento;
       JOptionPane.showMessageDialog(null,"O VOLUME NO PARALELEPIPEDO É" + " " + volume);
    }
}
