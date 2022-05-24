import javax.swing.*;
public class exec04{
    public static void main(String[] args) {
        int x,y, tabuada;
        y=Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro : "));
        for (x=1;x<=10;x++)
        {
            tabuada=y*x;
            JOptionPane.showMessageDialog(null,y+" * "+x+"="+ tabuada);
        }
    }
}
