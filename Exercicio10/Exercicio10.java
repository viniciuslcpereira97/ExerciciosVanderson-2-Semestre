import javax.swing.JOptionPane;

public class Exercicio10{
	public static void main(String args[]){
		String text = JOptionPane.showInputDialog("Digite uma palavra");
		if(text.length() > 0){
			JOptionPane.showMessageDialog(null, capicua(text));
		}
	}

	public static int capicua(String text){
		String capicua = "";
		for(int i = text.length()-1 ; i >= 0 ; i--){
			capicua+= text.charAt(i);
		}
		if(text.equals(capicua)){
			return 1;
		}
		else{
			return 0;
		}
	}
} 