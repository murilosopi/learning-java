import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// Locale.setDefault(Locale.US);
		
		System.out.println("Hello world");
		
		String nome = "Murilo Sopi";
		int idade = 18;
		double peso = 50.95;
		double altura = 1.65;
		
		System.out.println("Nome: " + nome);
		System.out.printf("Peso: %.2f\n", peso);
		System.out.println("Idade: "+ idade);
		
		/*
		 * %f -> ponto flutuante
		 * %d -> inteiro
		 * %s -> texto
		 * %n -> quebra de linha 
		 * */
		System.out.printf("Altura do %s é %.2f metros.%n%n", nome, altura);
		
		// Exercício saída de dados:
		
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.0;
		double measure = 53.234567;
		
		String template = "%s, which price is $ %.2f%n";
		
		System.out.println("Products:");
		
		System.out.printf(template, product1, price1);
		System.out.printf(template, product2, price2);
		
		System.out.printf("%nRecord: %d years old, code %d and gender: %s%n", age, code, gender);
		
		System.out.printf("%nMeasure with eight decimal places: %.8f", measure);
		
		System.out.printf("%nRounded (three decimal places): %.3f", measure);
		
		Locale.setDefault(Locale.US);
		System.out.printf("%nUS decimal point: %.3f", measure);
	}

}
