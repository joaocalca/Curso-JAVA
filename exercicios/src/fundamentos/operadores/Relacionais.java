package fundamentos.operadores;

public class Relacionais {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 'a';
		
		System.out.println(a == b);
		
		System.out.println(3 > 4);
		System.out.println(3 >= 3);
		System.out.println(3 < 7);
		System.out.println(30 <= 7);
		System.out.println(30 != 7);
		
		double nota = 9.9;
		boolean BomComportamento = false;
		boolean PassouPorMedia = nota >= 7;
		boolean TemDesconto = BomComportamento && PassouPorMedia;
		
		System.out.println("O aluno tem desconto? " + TemDesconto);
	}
}
