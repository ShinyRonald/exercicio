import java.util.Locale;
import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		
		/* d) Fa�a um programa que leia 2 provas e um trabalho (
		  . Caso a m�dia final seja maior ou igual a 7 imprimir a mensagem
		  �aprovado�, caso contr�rio, imprimir a mensagem �reprovado�. */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite os dois n�meros: ");

		double x = sc.nextDouble();
		double y = sc.nextDouble();
		double z = sc.nextDouble();
		
		x = (x + y + z)/3;
		
		System.out.println(x > 6.99 ? "Aprovado" : "Reprovado");

		
		sc.close();

	}

}
