//classe filha
import javax.swing.JOptionPane;

public class Sobrescrita2 extends Sobrescrita{
	public static int conta(int m1,int m2) {
		return m1+m2;
	}
	public static void main(String args[]) {
		Sobrescrita a = new Sobrescrita();
		int num1,num2,aux,res;
		aux=4;
		while(aux!=3) {
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor"));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor"));
		aux  = Integer.parseInt(JOptionPane.showInputDialog("Qual soma deseja?"
				+ "\n1- Soma\n2- Multiplicação\n3- Finalizar programa"));
		switch(aux) {
		case 1:
			res = conta(num1,num2);
			JOptionPane.showMessageDialog(null,"Soma\n\n"+num1+"+"+num2+"="+res);
			break;
		case 2:
			res = a.conta(num1,num2);
			JOptionPane.showMessageDialog(null,"Multiplicação\n\n"+num1+"*"+num2+"="+res);
			break;
		case 3:
			JOptionPane.showMessageDialog(null,"FIM");
			System.exit(0);
			break;
		}
	}
	}
}
