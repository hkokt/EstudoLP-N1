import javax.swing.JOptionPane;
public class exec04{
        public static void main(String args[]){
        double n1,n2,n3;
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número real : "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número real : "));
        n3= maiormenor(n1,n2);
        JOptionPane.showMessageDialog(null," a diferença do maior número é : " +  n3);
    }
    static double maiormenor(double n1, double n2){
        double result=0;
        if (n1>n2){
            result = n1;
        }
        else{
            result = n2;
        }
        return result;
    }
}