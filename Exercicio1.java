package program;

import java.util.Locale;
import java.util.Scanner;

public class exercicio1 {
	/*
	 * a) o número de pessoas que responderam sim; b) o número de pessoas que
	 * responderam não; c) número de pessoas pessoas do sexo feminino que
	 * responderam. d) número de pessoas do sexo masculino que responderam.
	 */

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a quantidade de pessoas: ");
		int z = sc.nextInt();

		int male = 0;
		int female = 0;
		int gostou = 0;
		int nao_gostou = 0;
		int i = 0;

		do {

			System.out.println("Digite seu sexo (1)Male (2)Female: ");
			System.out.println("Digite se gostou (1)Sim (2)Não: ");

			int x = sc.nextInt();
			int y = sc.nextInt();
			
			x = x == 1 ? male++ : female++;
			y = y == 1 ? gostou++ : nao_gostou++;

			z --;
		} while (z != i);

		System.out.println("O número de pessoas que responderam sim: " + gostou);
		System.out.println("O número de pessoas que responderam não: " + nao_gostou);
		System.out.println("Número de mulheres que responderam: " + female);
		System.out.println("Número de homens que responderam: " + male);

		sc.close();
	}

}

