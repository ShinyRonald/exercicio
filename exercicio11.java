package exerciciol2;

import java.util.Locale;
import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
		int one = 0;
		int sec = 0;
		int three = 0;
		int four = 0;
		int white = 0;
		int nulo = 0;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 1, 2, 3, 4 para os respectivos canditados,"
				+ " 5 para branco e qualquer outro número para nulo: " 
				+ "Digite 0 para concluir a votação: ");
		
		int votos = sc.nextInt();
		
		
		do {
			switch(votos) {
			case 1:
				one++;
				break;
			case 2:
				sec ++;
				break;
			case 3:
				three ++;
				break;
			case 4:
				four ++;
				break;
			case 5:
				white ++;
				break;
			default:
				nulo ++;
				break;
				}
			System.out.println("Digite 1, 2, 3, 4 para os respectivos canditados,"
					+ " 5 para branco e qualquer outro número para nulo: " 
					+ "Digite 0 para concluir a votação: ");
			votos = sc.nextInt();
		} while(votos != 0);
		
		System.out.println("total de votos para cada candidato: "
				+ "\nPrimeiro: " + one +
				"\nSegundo: " + sec +
				"\nTerceiro: " + three +
				"\nQuarto: " + four +
				"\nEm branco: " + white +
				"\nNulo: " + nulo);
		
		sc.close();
	}

}
