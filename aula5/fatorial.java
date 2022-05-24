import javax.swing.*;
public class fatorial{
    public static void main (String args[]){
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número : "));
        JOptionPane.showMessageDialog(null,"O fatorila é : "+funcfat(num));
    }        
        static int funcfat(int n){
            int fat=0;
            if(n!=1)
               {
                 fat =  n*funcfat(n-1);
                 return fat;
               }
            else
              {
               return 1;
              }
        } 
}