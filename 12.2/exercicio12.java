package Atividades;

import java.util.Locale;
import java.util.Scanner;

public class exercicio12 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int valorSelecionado;
		int valorParaCadastro = 0;
		metodos a = new metodos();
		
		do {
			
			System.out.println("MENU\n"
					+ "==================\n"
					+ "1 – Cadastro\n"
					+ "2 – Consulta\n"
					+ "3 – Sair");
			
			valorSelecionado = sc.nextInt();
			
			switch(valorSelecionado) {
			case 1:
				
				a.cadastro();
				
				
				break;
			case 2:
				
				a.consulta();
				
				break;
					 
				}
			
			
		}while(valorSelecionado!=3);

	sc.close();
}

}
