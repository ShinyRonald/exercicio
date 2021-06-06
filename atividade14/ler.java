package main;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ler {

	public static void main(String[] args) {
		
		Path caminho = Paths.get("C:\\Users\\Ronald\\Desktop\\a.txt");
		
		try {
			
		byte[] texto = Files.readAllBytes(caminho);
		String leitura = new String(texto);
		
		System.out.println(leitura);
		
		} catch (Exception e) {
			System.out.println("Deu errado");
		}
		
	}

}
