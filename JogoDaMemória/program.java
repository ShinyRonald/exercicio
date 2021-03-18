import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Geração de número aleatorio
		Random random = new Random();
		int numero1 = random.nextInt(5);
		int numero2 = random.nextInt(5)+10;
		int numero3 = random.nextInt(5)+5;
		int numero4 = random.nextInt(5)+15;
		int numero5 = random.nextInt(5)+25;
		int numero6 = random.nextInt(5)+20;
		
		
		//Geração de pares de cartas
		Cartas carta1 = new Cartas();
		carta1.a = numero1;
		carta1.b = carta1.a;
		
		Cartas carta2 = new Cartas();
		carta2.a = numero2;
		carta2.b = carta2.a;
		
		Cartas carta3 = new Cartas();
		carta3.a = numero3;
		carta3.b = carta3.a;
		
		Cartas carta4 = new Cartas();
		carta4.a = numero4;
		carta4.b = carta4.a;
		
		Cartas carta5 = new Cartas();
		carta5.a = numero5;
		carta5.b = carta5.a;
		
		Cartas carta6 = new Cartas();
		carta6.a = numero6;
		carta6.b = carta6.a;
		
		System.out.println("As cartas:");
		
		 System.out.println(carta1.a + " " + carta1.b);
		 System.out.println(carta2.a + " " + carta2.b);
		 System.out.println(carta3.a + " " + carta3.b);
		 System.out.println(carta4.a + " " + carta4.b);
		 System.out.println(carta5.a + " " + carta5.b);
		 System.out.println(carta6.a + " " + carta6.b);
		
		
		sc.close();
	}

}
