package exercio7;

import java.util.Locale;
import java.util.Scanner;

public class exercio7 {

	public static void main(String[] args) {

		/*
		 * i) Uma empresa concederá um aumento a seus funcionários de acordo com seus
		 * cargos. Para o cargo de “programador” o aumento será de 30%. Para todos os
		 * outros cargos o aumento é de 10%. Faça um algoritmo onde o usuário informe
		 * seu cargo e salário e imprima o novo salário de acordo com o aumento que será
		 * concedido.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite seu cargo (1) pra programador e (2) pra outros e seu salário: ");
		
		int x = sc.nextInt();
		double y = sc.nextDouble();
		double programador = 0.3;
		double outros = 0.1;
		
		y = x == 1 ? y*programador+y : y*outros+y; 
		
		System.out.printf( "Seu salário com aumento: $%.3f", y);
		
				
	sc.close();
	}

}
