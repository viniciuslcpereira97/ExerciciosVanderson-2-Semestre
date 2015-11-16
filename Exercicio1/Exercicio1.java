import javax.swing.JOptionPane;

public class Exercicio1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int resp = 0 ;
		resp = JOptionPane.showInputDialog("Deseja executar? Digite 1 para executar ou 0 para sair");
		if(resp==1){
			int n=0;
			n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número correspondente a um mês"));
			getMes(n);	
		}
		else{

		}
	}
	
	public static void getMes(int num){
		String mes;
		switch(num){
		case 1:
				mes = "Janeiro";
				break;
		case 2:
			mes = "Fevereiro";
			break;
		case 3:
			mes = "Março";
			break;
		case 4:
			mes = "Abril";
			break;
		case 5:
			mes = "Maio";
			break;
		case 6:
			mes = "Junho";
			break;
		case 7:
			mes = "Julho";
			break;
		case 8:
			mes = "Agosto";
			break;
		case 9:
			mes = "Setembro";
			break;
		case 10:
			mes = "Outubro";
			break;
		case 11:
			mes = "Novembro";
			break;
		case 12:
			mes = "Dezembro";
			break;
		default: 
			mes = "Mês inválido";	
			break;
		}
		JOptionPane.showMessageDialog(null, mes);
	}
}
