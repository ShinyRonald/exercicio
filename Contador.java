package main;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Contador {

	public static void main(String[] args) throws Exception {
		
		//Input
		Scanner sc = new Scanner(System.in);
		byte resultado;
		
		//Resultados
		int win = 0;
		int lose = 0;
		
		//Repeti��o pra atribui��o dos resultados
		//Quando for 3 � encerrado
		do {
			System.out.println("Win(1) Lose(2) End(3): ");
			resultado = sc.nextByte();
			
		switch (resultado) {
		case 1:
			win ++;
			
			//Atribuindo 0 para poder repetir
			resultado = 0;
			
			break;
		case 2:
			lose ++;
			resultado = 0;
			break;
		}
	} while(resultado != 3 );
		
		//Escrever o txt
		Path caminho = Paths.get("/home/ronald/Documentos/a.txt");
		String texto = "GP TF: "+win+"/"+lose +" ";
		byte[] textoEmByte = texto.getBytes();
		Files.write(caminho, textoEmByte);
		
		//Fechar o scanner
		sc.close();
		
		//Fechar o app
		System.exit(0);
	}

}
