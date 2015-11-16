import javax.swing.JOptionPane;

public class Exercicio6{
	public static void main(String args[]){
		int resp = 0;
		resp = Integer.parseInt(JOptionPane.showInputDialog("Deseja executar? Digite 1 para executar ou 0 para sair"));
		if(resp==1){
			int n = 0;
			n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
			primo(n);
		}
		else{

		}
	}

	public static void primo(int num){
		boolean teste = true;
		
		while(teste){
			for(int i = 2; i < num ; i++){
				if(num%i==0){
					teste = false;
				}
			}
		}
	}
}