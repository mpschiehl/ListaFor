
public class Exercicio04 {

	public static void main(String[] args) {
	String texto ="",vazio ="*", cheio= "";
	// criando o quadrado
	for(int i = 0 ;i <21;i++){
		cheio += " *";
	}
	
	
	for(int i = 0 ;i <41;i++){
		vazio += " ";
	}vazio += "*";
	
	texto += cheio +"\n";
	
	for(int i = 0 ;i <19;i++){
		texto += vazio +"\n";
	}
	texto += cheio;
	
	// Exibicao do resultado
	System.out.println(texto);
	}

}
