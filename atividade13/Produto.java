package Atividade12;

public class Produto {
	
	String nome;
	double preço;
	int quantidade;
	
	public double valorTotalEstoque(){
		
		return preço*quantidade;
	}
	
	public void addProduto(int quantidade) {
		
		this.quantidade += quantidade;
		
	}
	
	public void removerProduto(int quantidade) {
		
		this.quantidade -= quantidade;
		
	}
	
}
