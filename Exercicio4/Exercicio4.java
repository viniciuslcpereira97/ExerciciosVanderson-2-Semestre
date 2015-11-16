import javax.swing.JOptionPane;
public class Exercicio4{
	public static void main(String args[]){
		int n;
		n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
		roman(n);
	}

	public static void roman(int num){
		String roman="Número digitado em romano -> ";
		String nm = num.toString();
		JOptionPane.showMessageDialog(null, nm.length);
	}
}