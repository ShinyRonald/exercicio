package Atividades;

import java.util.Locale;
import java.util.Scanner;

public class exercicio12 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nomeDosMedicos[] = new String[10];
		int valorSelecionado;
		int valorParaCadastro = 0;
		
		do {
			
			System.out.println("MENU\n"
					+ "==================\n"
					+ "1 – Cadastro\n"
					+ "2 – Consulta\n"
					+ "3 – Sair");
			
			valorSelecionado = sc.nextInt();
			sc.nextLine();
			
			switch(valorSelecionado) {
			case 1:
				
				System.out.println("Digite o nome e a especialidade a serem cadastradas: ");
				String cadastro;
				cadastro = sc.nextLine();
				
				nomeDosMedicos[valorParaCadastro] = cadastro;
				
				valorParaCadastro++;
				
				break;
			case 2:
				
				for(int i = 0; i < nomeDosMedicos.length;i++) {
					System.out.println(nomeDosMedicos[i]);
				}
				
				break;
				
			}
			
			
			
		} while (valorSelecionado != 3);

		
		sc.close();
	}

}
