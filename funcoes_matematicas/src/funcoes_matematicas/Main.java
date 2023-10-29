package funcoes_matematicas;

public class Main {

	public static void main(String[] args) {
		// Fórmula de bhaskara:
		
		double x1, x2, delta, a, b, c;
		
		a = 1.0;
		b = -1.0;
		c = -6.0;
		
		delta = Math.pow(a, 2.0) - 4 * a * c;
		
		
		if(delta < 0) {
			System.out.println("Não há raiz real...");
		} else {
			x1 = (-b + Math.sqrt(delta)) / 2 * a;
			x2 = (-b - Math.sqrt(delta)) / 2 * a;
			
			System.out.println("As raízes são: " + x1 + " e " + x2);
		}
	}

}
