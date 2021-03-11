package program;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	/*
	 * a) o n�mero de pessoas que responderam sim;
	 *  b) o n�mero de pessoas que responderam n�o; 
	 *  c) n�mero de pessoas pessoas do sexo feminino que responderam. 
	 *  d) n�mero de pessoas do sexo masculino que responderam.
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

		for (int i = 0; z != i; z--) {

			System.out.println("Digite seu sexo (1)Male (2)Female: ");
			System.out.println("Digite se gostou (1)Sim (2)N�o: ");
			int x = sc.nextInt();
			int y = sc.nextInt();
			switch (x) {
			case 1:
				male++;
				break;
			case 2:
				female++;
				break;
			}

			switch (y) {
			case 1:
				gostou++;
				break;
			case 2:
				nao_gostou++;
				break;
			}
		}
		System.out.println("O n�mero de pessoas que responderam sim: "+ gostou);
		System.out.println("O n�mero de pessoas que responderam n�o: "+ nao_gostou);
		System.out.println("N�mero de mulheres que responderam: "+ female);
		System.out.println("N�mero de homens que responderam: "+ male);
		
		sc.close();
	}

}
