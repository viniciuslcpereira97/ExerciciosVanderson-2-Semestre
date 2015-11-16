import javax.swing.JOptionPane;

public class Exercicio5 {
	
	public static void main(String[] args) {
		int resp = 0;
		resp = JOptionPane.showInputDialog("Deseja executar? Digite 1 para executar ou 0 para sair");
		if(resp==1){
			int n;
			n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número correspondente a um dia da semana: "));
			diasSemana(n);
		}
		else{
			
		}
	}
	
	public static void diasSemana(int num){
		String dia = "";
		switch(num){
		case 1:
			dia = "DOM";
			break;
		case 2:
			dia = "SEG";
			break;
		case 3:
			dia = "TER";
			break;
		case 4:
			dia = "QUA";
			break;
		case 5:
			dia = "QUI";
			break;
		case 6:
			dia = "SEX";
			break;
		case 7:
			dia = "SAB";
			break;
		}
		JOptionPane.showMessageDialog(null, dia);
	}

}
