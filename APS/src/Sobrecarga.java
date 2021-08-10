import javax.swing.JOptionPane;
public class Sobrecarga {
	public static int soma(int n1,int n2,int n3) {
		return n1+n2+n3;
	}
	public static int soma(int n1,int n2) {
		return n1+n2;
	}
	public static void main(String args[]) {
		int num1,num2,num3,aux,res;
		aux=4;
		while(aux!=3) {
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor"));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor"));
		num3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro valor"));
		aux  = Integer.parseInt(JOptionPane.showInputDialog("Qual soma deseja?"
				+ "\n1- Soma dupla\n2- Soma tripla\n3- Finalizar programa"));
		switch(aux) {
		case 1:
			res = soma(num1,num2);
			JOptionPane.showMessageDialog(null,"Soma dupla\n\n"+num1+"+"+num2+"="+res);
			break;
		case 2:
			res = soma(num1,num2,num3);
			JOptionPane.showMessageDialog(null,"Soma tripla\n\n"+num1+"+"+num2+"+"+num3+"="+res);
			break;
		case 3:
			JOptionPane.showMessageDialog(null,"FIM");
			System.exit(0);
			break;
		}
	}
	}
}
