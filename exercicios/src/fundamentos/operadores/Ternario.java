package fundamentos.operadores;

public class Ternario {

	public static void main(String[] args) {
		
		double media = 8.6;
		String resultadoFinal = media >= 7 ?
				"aprovado." : "em recuperação.";
		System.out.println("O aluno está " + resultadoFinal);
		
		double nota = 9.9;
		boolean BomComportamento = false;
		boolean PassouPorMedia = nota >= 7;
		boolean TemDesconto = BomComportamento && PassouPorMedia;
		String resultado = TemDesconto ? "Sim." : "Não.";
		
		System.out.printf("O aluno tem desconto? %s ", resultado);
	}
}
