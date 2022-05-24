import javax.swing.JOptionPane;
public class exec02{
    public static void main(String args []){
    double litros = 0 , tempo, vel, result;
    tempo = Double.parseDouble(JOptionPane.showInputDialog("Digite o tempo de percurso em horas : ")); 
    vel = Double.parseDouble(JOptionPane.showInputDialog("Digite a velocidade média : "));
    result = func(tempo, vel,  litros);
    JOptionPane.showMessageDialog(null, " A quantidade de litros gastos é : "+result );
}
        public static double func (double tempo, double vel, double litros){
            double result;
                    result = (vel * tempo) / 12 ;
                    return result;
        }
}
