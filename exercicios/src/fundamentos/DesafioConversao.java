package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe o primeiro sal?rio: R$");
		String valor1 = entrada.nextLine().replace(",", ".");
		
		System.out.print("Informe o segundo sal?rio: R$");
		String valor2 = entrada.nextLine().replace(",", ".");
		
		System.out.print("Informe o terceiro sal?rio: R$");
		String valor3 = entrada.nextLine().replace(",", ".");
		
		double salario1 = Double.parseDouble(valor1);
		double salario2 = Double.parseDouble(valor2);
		double salario3 = Double.parseDouble(valor3);
		
		double media = (salario1 + salario2 + salario3) / 3;
		
		System.out.printf("A m?dia dos sal?rios ? R$%.2f", media);
		
		entrada.close();
	}
}
