package program;

public class Aluno {
	String name;
	double nota1;
	double nota2;
	double nota3;

	public double nota() {
		return nota1 + nota2 + nota3;

	}
	
	public double pontosFaltando() {
		if (nota()<= 60.0) {
			return 60.0 - nota();
		} else {
			return 0.0;
		}
	} 

	public String toString() {
		return String.format("%.2f", nota() + "\n");

	}

}
