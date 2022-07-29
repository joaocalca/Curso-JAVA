package fundamentos;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {
		
		// Conversão implícita
		double a = 1;
		System.out.println(a);
		
		// Conversão explícita (CAST) - Evitar utilizar
		float b = (float) 1.123456788888;  // Também pode utilizar 1.123456788888F;
		System.out.println(b);
		
		int c = 300;
		byte d = (byte) c;
		System.out.println(d);
		
		double e = 1.99999;
		int f = (int) e;
		System.out.println(f);
	}
}
