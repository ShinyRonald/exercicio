package Controle;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Escrever {
	
	public static void criarArquivo() {
		
	File arquivo = new File("/home/ronald/Documentos");
	
	try {
		
	arquivo.createNewFile();
	
	FileWriter fw     = new FileWriter(arquivo, true);
	BufferedWriter bw = new BufferedWriter(fw);
	
	bw.write("NOME QUANTIDADE VALOR EA\r\n"
			+ "TV       20       1200\r\n"
			+ "MESA     50       500\r\n"
			+ "CAMISA   10       50\r\n"
			+ "TRAVEQUIN 2       50 (a hora)");
	bw.newLine();
	
	bw.close();
	fw.close();
	
	}catch(Exception e) {
		System.out.println("Deu ruim");
	}
	
	}
}
