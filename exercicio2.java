package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite sua temperatura: ");

		double x = sc.nextDouble();

		System.out.println(x > 37 ? "é covid man?" : "ta suave man");
		
		
		sc.close();
	}
}