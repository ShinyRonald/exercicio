package exercicio;

import java.util.Locale;
import java.util.Scanner;

public class exercicio9 {

	public static void main(String[] args) {
		/*
		 * l) Fa�a um programa onde o usu�rio informe 2 valores e a opera��o que deseja
		 * realizar. As seguintes opera��es podem ser realizadas:soma, subtra��o,
		 * multiplica��o e divis�o.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 1 - soma\n2 - subtra��o\n3- multiplica��o\n4- divis�o: ");
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
