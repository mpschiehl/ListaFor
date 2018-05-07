import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o Numero da Tabuada que deseja saber.");
		int valor = Integer.parseInt(teclado.nextLine());
		for(int i = 0;i <= 10;i++){
			System.out.println(valor + " x " + i + " = " +(valor *i));
		}
	}

}
