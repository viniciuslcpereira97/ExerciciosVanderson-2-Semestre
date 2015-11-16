import javax.swing.JOptionPane;
public class Exercicio3{
	public static void main(String args[]){
		String name="";
		name = JOptionPane.showInputDialog("Digite o seu nome: ");
		geraCabecalho(name);
	}

	public static void geraCabecalho(String nome){
		String cabecalho ="===================================================================================\nFIT - Faculdade Impacta de Tecnologia\nDisciplina: Lógica de programação de Computadores\nNome: " + nome + "\n===================================================================================";
		JOptionPane.showMessageDialog(null, cabecalho);
	}
}