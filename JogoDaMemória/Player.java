
public class Player {

	private String nome;
	private int pontos;
	private int jogadas;

	public jogador (String nomeJogador) {
		
		nome = (nomeJogador.equals("")? "Nome do individuo e zezinho ": nomeJogador );
		pontos = 0;
		jogadas = 0;
		
	}

	public String obterNome() {
		return nome;
		
	}
	
	private int obterPontos() {
		
		return pontos;
		
	} 
	
	public void adicionarPontos() {
		
		pontos ++;
		
	}
	
	public void perderPontos() {
		
		pontos --;
	}
	private int numeroDeJogadas() {
		
		return jogadas;
		
	} 
	
	public void adicionarJogadas() {
		
		jogadas ++;
		
	}
	
	public void perderJogadas() {
		
		jogadas --;
	}

}
