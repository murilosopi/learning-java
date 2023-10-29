import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = sc.next();
		
		System.out.println("Olá, " + nome + ", seja bem-vindo!");
		
		System.out.print("\n\nDigite um número inteiro: ");
		int numeroInteiro = sc.nextInt();
		System.out.print("Você digitou: " + numeroInteiro);
		
		/*
		 * Deve ser digitado com o marcador de ponto flutuante compatível 
		 * ao padrão do sistema ou do Locale setado
		 * */
		double numeroFlutuante;
		
		System.out.print("\n\nDigite um número com ponto flutuante: ");
		numeroFlutuante = sc.nextDouble();
		System.out.printf("Você digitou: %.2f", numeroFlutuante);
		
		
		System.out.print("\n\nDigite uma palavra: ");
		char primeiraLetra = sc.next().charAt(0);
		System.out.print("A primeira letra dessa palavra é: " + primeiraLetra);
		
		System.out.println("\n\nEscreva um parágrafo");
		sc.nextLine();
		String paragrafo = sc.nextLine();
		
		System.out.println("Hmm... Muito bom teu texto. Dê uma olhada: \n");
		System.out.println('"' + paragrafo + '"');
		
		sc.close();
	}
}
