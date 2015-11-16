import javax.swing.JOptionPane;

public class Exercicio2{
	public static void main(String args[]){
		int resp = 0;
		resp = JOptionPane.showInputDialog("Deseja executar? Digite 1 para executar ou 0 para sair");
		if(resp==1){
			int n=0;
			n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
			getText(n);
		}
		else{
			
		}
	}
	public static void getText(int num){
		String extenso="Número digitado por extenso -> ";
		switch(num){
			case 0:
			extenso += "Zero";
			break;
			case 1:
			extenso += "Um";
			break;
			case 2:
			extenso += "Dois";
			break;
			case 3:
			extenso += "Três";
			break;
			case 4:
			extenso += "Quatro";
			break;
			case 5:
			extenso += "Cinco";
			break;
			case 6:
			extenso += "Seis";
			break;
			case 7:
			extenso += "Sete";
			break;
			case 8:
			extenso += "Oito";
			break;
			case 9:
			extenso += "Nove";
			break;
			case 10:
			extenso += "Dez";
			break;
			default:
			extenso = "Número inválido, digite um número de 0-10";
			break;
		}
		JOptionPane.showMessageDialog(null, extenso);
	}
}