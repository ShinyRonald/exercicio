package Atividade12;

public class Produto {
	
	String nome;
	double pre�o;
	int quantidade;
	
	public double valorTotalEstoque(){
		
		return pre�o*quantidade;
	}
	
	public void addProduto(int quantidade) {
		
		this.quantidade += quantidade;
		
	}
	
	public void removerProduto(int quantidade) {
		
		this.quantidade -= quantidade;
		
	}
	
}
