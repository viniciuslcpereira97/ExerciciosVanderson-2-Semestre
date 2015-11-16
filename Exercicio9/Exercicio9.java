import javax.swing.JOptionPane;

public class Exercicio9{
	
	public static void main(String args[]){
		String letra = JOptionPane.showInputDialog("Digite um caracter");
		if(letra.length() == 1){
			char carac = letra.charAt(0);
		}

	}

	public static void confere(char carac){
		Character letras[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		for(int i = 0 ; i < letras.length ; i++){
			if(carac == letras[i]){
				System.out.println("É uma letra do alfabeto");
			}
		}
	}

}
