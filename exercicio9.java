package exercicio;

import java.util.Locale;
import java.util.Scanner;

public class exercicio9 {

	public static void main(String[] args) {
		/*
		 * l) Faça um programa onde o usuário informe 2 valores e a operação que deseja
		 * realizar. As seguintes operações podem ser realizadas:soma, subtração,
		 * multiplicação e divisão.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 1 - soma\n2 - subtração\n3- multiplicação\n4- divisão: ");
		System.out.println("\nE digite os valores: ");
		
		int x = sc.nextInt();
		double y = sc.nextDouble();
		double z = sc.nextDouble();
		
		switch(x) {
		case 1:
			y = y + z;
			break;
		case 2:
			y = y - z;
			break;
		case 3:
			y = y*z;
			break;
		case 4:
			y = y/z;
			break;
		}
		
		System.out.println(y);
		sc.close();
	}

}
