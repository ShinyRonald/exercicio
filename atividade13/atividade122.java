package Atividade12;

import java.util.Locale;
import java.util.Scanner;

public class atividade122 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Produto produto = new Produto();

		System.out.println("Digite o nome:\nPreço: \nQuantidade em estoque: ");
		produto.nome = sc.nextLine();
		produto.preço = sc.nextDouble();
		produto.quantidade = sc.nextInt();

		System.out.println("Nome:" + produto.nome + " Preço:$" + produto.preço + " Quantidade:" + produto.quantidade);

		System.out.println("Digite quantos adicionar ao stoque: ");

		int quantidade = sc.nextInt();
		produto.addProduto(quantidade);

		System.out.println(produto.quantidade);

		System.out.println("Digite quantos remover ao stoque: ");
		quantidade = sc.nextInt();
		produto.removerProduto(quantidade);

		System.out.println(produto.quantidade);

		sc.close();
	}

}
