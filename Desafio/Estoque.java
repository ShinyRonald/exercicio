package Controle;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.Scanner;

public class Estoque {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int escolha = 0;
		
		do {

		System.out.println("1 - Consulta de estoque\n"
				+ "2 - Adicionar\n"
				+ "3 - Limpar\n"
				+ "4 - Apagar o arquivo\n"
				+ "5 - Sair");
		
		escolha = sc.nextInt();
		
		File arquivo = new File("C:\\Users\\Ronald\\Desktop\\desafio.txt");
		
		switch(escolha) {
		
		case 1:		
			
			try {
				
				if(!arquivo.exists()) {
					
					Escrever esc = new Escrever();
					esc.criarArquivo();
					
				}
				
				FileReader     fr = new FileReader(arquivo);
				BufferedReader br = new BufferedReader(fr);
				
				while (br.ready()) {
				
				String linha = br.readLine();
				
				System.out.println(linha);
				}
				br.close();
				fr.close();
				
				
			}catch(Exception e) {
				System.out.println("Deu ruim");
			}
			
			break;
		case 2:
			
			try {
				
			if (!arquivo.exists()) {
				
			Escrever esc = new Escrever();
			esc.criarArquivo();
			
			}
			
			FileWriter     fw = new FileWriter(arquivo, true);
			BufferedWriter bw = new BufferedWriter(fw);
			
			//2 sc porque nextLine é bugado se tiver só 1 não vai
			sc.nextLine();
			String scanner  = sc.nextLine();
		
			
			bw.write(scanner);
			bw.newLine();
			bw.close();
			fw.close();
		
			
			} catch (IOException ex) {
			ex.printStackTrace();
			}
			
			break;
		case 3:
			
			File limpa = new File("C:\\Users\\Ronald\\Desktop\\desafio.txt");
			
			try {
				
			FileWriter     fw = new FileWriter(limpa);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("");
			
			bw.close();
			
			} catch(Exception e) {
				System.out.println("Bom dia");
			}
			
			break;
			
		case 4:
			
			arquivo.delete();

			
			break;
		}
		
		}while(escolha != 5);
		
		
		sc.close();
	}

}
