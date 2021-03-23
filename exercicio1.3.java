package Exercicios;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite sua idade: ");

		int x = sc.nextInt();

		if (x <= 17) {
			System.out.println("Num podi");
		} else
			System.out.println("pode tirar");
		
		sc.close();
	}
}
