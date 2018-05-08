
public class Exercicio02 {

	public static void main(String[] args) {
	String texto = "";
		for(int j=0;j<=10;j++ ){
			for(int i = 0;i <= 10;i++){
			
				texto += i + " x " + j + " = " +(i * j);
							
			}texto +=("\n");

	}System.out.println(texto);
	}
}
