package Atividade12;

import java.util.Locale;
import java.util.Scanner;

public class atividade122 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Produto produto = new Produto();

		System.out.println("Digite o nome:\nPre�o: \nQuantidade em estoque: ");
		produto.nome = sc.nextLine();
		produto.pre�o = sc.nextDouble();
		produto.quantidade = sc.nextInt();

		System.out.println("Nome:" + produto.nome + " Pre�o:$" + produto.pre�o + " Quantidade:" + produto.quantidade);

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
