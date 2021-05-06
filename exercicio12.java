package Atividades;

import java.util.Locale;
import java.util.Scanner;

public class exercicio12 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String[][] medicos = new String[10][10];
		int valor = 0;
		String nome = "";
		String especialidade = "";
		int i = 5;
		
		do {
		System.out.println("      MENU\r\n"
				+ "==================\r\n"
				+ "1– Cadastro\r\n"
				+ "2– Consulta\r\n"
				+ "3– Sair");
		
		valor = sc.nextInt();
		
		switch (valor) {
		case 1:
			
			System.out.println("Digite o nome do médico e a especialidade: ");
			
			nome = sc.next();
			especialidade = sc.next();
			
			medicos[i][i] = nome + " " + especialidade;
			
			i++;
		break;
		
		case 2:
		medicos[0][0] = "Ronald lindão";
		medicos[1][1] = "Patrickera boladão";
		medicos[2][2] = "Eliacy a rainha dos doguinhos";
		medicos[3][3] = "Anthony o gado do sotaque";
		medicos[4][4] = "Ronald segunda personalidade mais bonita ainda";
		
		System.out.println("Medicos disponíveis:\n"
		+medicos[0][0]+"\n"
		+medicos[1][1]+"\n"
		+medicos[2][2]+"\n"
		+medicos[3][3]+"\n"
		+medicos[4][4]+"\n"
		+medicos[5][5]+"\n"
		+medicos[6][6]+"\n"
		+medicos[7][7]+"\n"
		+medicos[8][8]+"\n"
		+medicos[9][9]+"\n");

		break;
		}
		
		} while(valor != 3);
		
		sc.close();
	}

}
