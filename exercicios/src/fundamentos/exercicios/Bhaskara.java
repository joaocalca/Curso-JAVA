package fundamentos.exercicios;

import javax.swing.JOptionPane;

public class Bhaskara {

	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "Equação: ax² + bx + c = 0");
		
		String valor1 = JOptionPane.showInputDialog("Informe o valor de a: ");
		String valor2 = JOptionPane.showInputDialog("Informe o valor de b: ");
		String valor3 = JOptionPane.showInputDialog("Informe o valor de c: ");
		
		double a = Double.parseDouble(valor1);
		double b = Double.parseDouble(valor2);
		double c = Double.parseDouble(valor3);
		
		double delta = (b * b) - (4 * a * c);
		
		double x1 = (-b + Math.sqrt(delta)) / (2 * a);
		double x2 = (-b - Math.sqrt(delta)) / (2 * a);
		
		JOptionPane.showMessageDialog(null, String.format("O delta da equação"
				+ " %.0fx² + %.0fx + %.0f = 0 é: %.2f", a, b, c, delta));
		JOptionPane.showMessageDialog(null, String.format("O X1 da equação"
				+ " %.0fx² + %.0fx + %.0f = 0 é: %.2f", a, b, c, x1));
		JOptionPane.showMessageDialog(null, String.format("O X2 da equação"
				+ " %.0fx² + %.0fx + %.0f = 0 é: %.2f", a, b, c, x2));
	}

}