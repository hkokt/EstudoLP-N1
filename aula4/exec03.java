import javax.swing.JOptionPane;
public class exec03{
    public static void main(String args[]){
        int n1,n2,n3;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro : "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro : "));
        n3= maiormenor(n1,n2);
        JOptionPane.showMessageDialog(null," a diferença do maior pro menor é de : " +  n3);
    }
    static int maiormenor(int n1, int n2){
        int result=0;
        if (n1>n2){
            result = n1-n2;
        }
        else{
            result = n2 - n1;
        }
        return result;
    }
}
