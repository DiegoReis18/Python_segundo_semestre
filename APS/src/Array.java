import java.util.Vector;

public class Array {

	public static void main(String args[]) {
		Vector<Auxi> conj = new Vector();
		Auxi p;
		p = new Auxi(40,30);
		conj.add(p);
		
		for (int i = 0; i < conj.size();i++) {
			conj.get(i).Mostrar();
		}
		
	}
}
