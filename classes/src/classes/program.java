package classes;

import java.util.Locale;
import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product produto = new Product();
		
		System.out.println("Digite o nome: \nDigite o Preço: \nDigite a Quantidade em estoque: ");
		produto.name = sc.next();
		produto.price = sc.nextDouble();
		produto.quantity = sc.nextInt();
		
		System.out.println(produto);
		

		sc.close();
	}

}
