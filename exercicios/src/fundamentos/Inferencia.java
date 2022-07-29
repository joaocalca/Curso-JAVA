package fundamentos;

public class Inferencia {
	
	public static void main(String[] args) {
		
		double a = 4.5;
		System.out.println(a);
		
		a = 12;
		System.out.println(a);
		
		// a = "...";
		
		// Inferência de Tipos
		
		var b = 4.5;
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);
		c = "Outro Texto";
		System.out.println(c);
		
		// c = 4.5;
		
		double d;  // Declaração da variável
		d = 123.65;  // Atribuido um valor a variável
		System.out.println(d);  // Exibido o valor atribuido a variável
	}
}
