package program;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();

		System.out.println("Digite seu nome e as 3 notas: ");

		aluno.name = sc.next();
		aluno.nota1 = sc.nextDouble();
		aluno.nota2 = sc.nextDouble();
		aluno.nota3 = sc.nextDouble();

		System.out.printf("Nota final: %.2f\n", aluno.nota());
		
		if (aluno.nota() >= 60) {
			System.out.println("Pass");
		} else {
			System.out.println("Not Pass, Pontos Faltando: "+ aluno.pontosFaltando());
		}
		
		
		
		sc.close();
	}

}
