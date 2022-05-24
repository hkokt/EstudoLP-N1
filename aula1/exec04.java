import javax.swing.JOptionPane;
public class exec04 {
    public static void main (String args [])
    {
    Double n1,n2,n3,n4,tot,media;
    n1=Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota:"));
    n2=Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota:"));
    n3=Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota:"));
    n4=Double.parseDouble(JOptionPane.showInputDialog("Digite a quarta nota:"));
        tot=n1+n2+n3+n4;
        media=tot/4;
        if (media >= 6)
        {
            JOptionPane.showMessageDialog(null, "Aluno aprovado com média de " + media);
        }
        else if ((media>=3)&&(media<6))
        {
            JOptionPane.showMessageDialog(null, "Aluno em recuperação com média de " + media);
        }
        else 
        {
            JOptionPane.showMessageDialog(null, "Aluno reprovado com média de " + media);   
        }  
    }
}