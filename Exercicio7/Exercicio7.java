import javax.swing.JOptionPane;

public class Exercicio7{
	public static void main(String args[]){
		int x, y;
		x = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para x: "));
		y = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para y: "));
		JOptionPane.showMessageDialog(null, retornaValor(x,y));
	}

	public static int retornaValor(int x, int y){
		if(x % y == 0){
			return 1;
		}
		else{
			return 0;
		}
	}
}