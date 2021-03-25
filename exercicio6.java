import java.util.Locale;
import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {

		/*
		 * g) Faça um programa que leia o peso e a altura do usuário e informa se o
		 * mesmo está obeso. Lembre que para saber se uma pessoa está obesa deve-se
		 * utilizar a formula: imc = peso/altura2. Caso o resultado do imc seja maior
		 * que 30 o usuário está obeso..
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o peso e a altura: ");

		double x = sc.nextDouble();
		double y = sc.nextDouble();
		double imc = y / Math.pow(x, 2);

		System.out.printf(imc > 29.99 ? "Obesidade" : "Não obesidade");

		sc.close();
	}

}
