package fundamentos;

public class NotacaoPonto {
	
	public static void main(String[] args) {
		
		String s = "Bom dia X";
		s = s.replace("X", "Senhora");
		s = s.toUpperCase();
		s = s.concat("!!!");
		
		System.out.println(s);
		System.out.println("Samily".toUpperCase());
		
		String x = "Joao".toUpperCase();
		System.out.println(x);
		
		String y = "Bom dia X"
				.replace("X", "Samily")
				.toUpperCase()
				.concat("!!!");
		System.out.println(y);
		
		// Tipos primitivos não tem o operador "."
		int a = 2;
		System.out.println(a);
	}
}
