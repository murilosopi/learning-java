import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Adivinhe o número que eu tô pensando...");
		
		int numero;
		int total = 0;
		
		while((numero = sc.nextInt()) != 0) {
			System.out.println("Número errado: " + numero);
			
			total += numero;
		}
		
		System.out.println("Você acertou o número!!!!");
		
		System.out.print("A soma dos números escolhidos foi: " + total);
		
		sc.close();
	}

}
