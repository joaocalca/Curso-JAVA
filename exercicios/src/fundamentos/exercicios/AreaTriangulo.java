package fundamentos.exercicios;

import javax.swing.JOptionPane;

public class AreaTriangulo {

	public static void main(String[] args) {
		
		String valor1 = JOptionPane.showInputDialog("Informe o valor da base do triângulo: ");
		String valor2 = JOptionPane.showInputDialog("Informe o valor da altura do triângulo: ");
		
		double base = Double.parseDouble(valor1);
		double altura = Double.parseDouble(valor2);
		
		double area = (base * altura) / 2;
		
		JOptionPane.showMessageDialog(null, String.format("O valor da área do triângulo"
				+ " é: %.2f", area));
	}
}
