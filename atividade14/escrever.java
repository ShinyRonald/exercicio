package main;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.JOptionPane;

public class escrever {

	public static void main(String[] args) {
		
		Path caminho = Paths.get("C:\\Users\\Ronald\\Desktop\\a.txt");
		String texto = JOptionPane.showInputDialog("O que quer escrever ?");
		byte[] textoEmByte = texto.getBytes();
		
		try {
			
			Files.write(caminho,textoEmByte);
			
		}catch(Exception e) {
			System.out.println("deu ruim");
		}

	}

}
