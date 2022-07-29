package fundamentos;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		
		// Informações do Funcionário
		
		// Tipos númericos inteiros
		byte AnosDeEmpresa = 23;
		short NumeroDeVoos = 542;
		int ID = 56789;
		long PontosAcumulados = 3_134_845_223L;
		
		// Tipos númericos reais
		float Salario = 11_445.44F;
		double VendasAcumuladas = 2_991_797_103.01;
		
		// Tipo booleano
		boolean EstaDeFerias = false;  // true
		
		// Tipo caractere
		char Status = 'A'; // ativo
		
		// Utilização das variáveis
		System.out.println("Anos de Empresa: " + AnosDeEmpresa * 365);
		System.out.println("Número de Viagens: " + NumeroDeVoos / 2);
		System.out.println("Pontos por Real: " + PontosAcumulados / VendasAcumuladas);
		System.out.println("Funcionário " + ID + ": ganha -> R$" + Salario);
		System.out.println("Férias? " + EstaDeFerias);
		System.out.println("Status: " + Status);
		
	}
}
