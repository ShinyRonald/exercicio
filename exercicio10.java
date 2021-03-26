package exercicio;

import java.util.Locale;
import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {

		/*
		 * n) Elabore um algoritmo que dada à idade de um nadador classifique sua
		 * categoria de acordo com a tabela abaixo. Desconsidere o nadador abaixo de 5
		 * anos. a) infantil A = 5-7 anos b) infantil B = 8-10 anos c) juvenil A = 11-13
		 * anos d) juvenil B = 14-17 anos e) adulto = maiores de 18 anos
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");
		int x = sc.nextInt();
		
		if(x < 8) {
			System.out.println("Infantil A");
		} else if(x < 11) {
			System.out.println("Infantil B");
		} else if(x < 14) {
			System.out.println("Juvenil A");
		} else if(x < 18) {
			System.out.println("Juvenil B");
		} else {
			System.out.println("Adulto");
		}
		
		sc.close();
	}

}
