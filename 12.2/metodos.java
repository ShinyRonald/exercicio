package Atividades;

import java.util.Scanner;

public class metodos {
	
	String nomeDosMedicos[] = new String[10];
	int valorParaCadastro = 0;

	public void cadastro() {

		System.out.println("Digite o nome e a especialidade a serem cadastradas: ");
		String cadastro;
		cadastro = new Scanner(System.in).nextLine();

		nomeDosMedicos[valorParaCadastro] = cadastro;

		valorParaCadastro++;
		

	}

	public void consulta() {

		for (int i = 0; i < nomeDosMedicos.length; i++) {

			if (nomeDosMedicos[i] == null)continue;
			System.out.println(nomeDosMedicos[i]);
		}
	}
}
