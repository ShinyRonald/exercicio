package exercio7;

import java.util.Locale;
import java.util.Scanner;

public class exercio7 {

	public static void main(String[] args) {

		/*
		 * i) Uma empresa conceder� um aumento a seus funcion�rios de acordo com seus
		 * cargos. Para o cargo de �programador� o aumento ser� de 30%. Para todos os
		 * outros cargos o aumento � de 10%. Fa�a um algoritmo onde o usu�rio informe
		 * seu cargo e sal�rio e imprima o novo sal�rio de acordo com o aumento que ser�
		 * concedido.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite seu cargo (1) pra programador e (2) pra outros e seu sal�rio: ");
		
		int x = sc.nextInt();
		double y = sc.nextDouble();
		double programador = 0.3;
		double outros = 0.1;
		
		y = x == 1 ? y*programador+y : y*outros+y; 
		
		System.out.printf( "Seu sal�rio com aumento: $%.3f", y);
		
				
	sc.close();
	}

}
