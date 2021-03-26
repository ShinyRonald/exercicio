package exercicio;

import java.util.Locale;
import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {

		/*
		 * k) O custo ao consumidor de um carro novo é a soma do custo de fabricação
		 * mais a porcentagem do distribuidor e dos impostos. Supondo que o percentual
		 * do distribuidor seja de 28% e os impostos de 45%, escreva um algoritmo que
		 * leia o custo de fabricação de um carro e escreva o custo ao consumidor.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o custo de fabricação: ");
		
		double custo_inicial = sc.nextDouble();
		double distribuidor = 0.28;
		double imposto = 0.45;
		double consumidor = (custo_inicial*distribuidor)*imposto + custo_inicial;
		
		System.out.printf("%.3f",consumidor);

		sc.close();

	}

}
