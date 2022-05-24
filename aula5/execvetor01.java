import javax.swing.JOptionPane;
public class execvetor01 {
    public static void main(String args[])
    {   
        int v[]=new int [5];
        int soma=0;
        int i;
        double media = 0;
        for (i=0;i<5;i++)
        {
            v[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
            if (v[i]>10 && v[i]<201)
                    {
                soma=soma + v[i];  
                media = soma /(i+1);
                    }
        }
          System.out.println(soma);
          System.out.println(media);
                  }
}
