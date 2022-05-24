import javax.swing.JOptionPane;
public class exec05 {
    public static void main (String args [])
    {
        Integer x,y;
        x=Integer.parseInt(JOptionPane.showInputDialog("digite um valor inteiro:"));
        y=Integer.parseInt(JOptionPane.showInputDialog("digite um valor inteiro:"));
        if (x!=y)
        {
            if (x>y)
                JOptionPane.showMessageDialog(null,y+","+x);
            else
                JOptionPane.showMessageDialog(null,x+","+y);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Números invalidos");
        }   
    }
}