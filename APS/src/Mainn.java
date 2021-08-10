import javax.swing.JOptionPane;
public class Mainn
{
 public static void main(String[] args) {
      	double QC,CC,PR,EX;
      	QC = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a quantidade de carbono"));
    	CC = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a capacidade máxima do cilindro"));
    	double capacidade = QC/CC;
    	JOptionPane.showMessageDialog(null,"Quantidade ocupada no cilindro: "+capacidade);
    	PR = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a profundidade"));
    	EX = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a Extensão do local"));
        double numsei = QC/(PR*EX);

        JOptionPane.showMessageDialog(null,"Resultado: "+numsei);
    }
}