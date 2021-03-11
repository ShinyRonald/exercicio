import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o número: ");
		int x = sc.nextInt();
		
		x = x+10;
		System.out.println(x);
		sc.close();

	}

}
