package fundamentos;

import javax.swing.JOptionPane;

public class DesafioCalculadora {

	public static void main(String[] args) {
		
		String valor1 = JOptionPane.showInputDialog(
				"Informe o primeiro valor: ");
		String valor2 = JOptionPane.showInputDialog(
				"Informe o segundo valor: ");
		String operador = JOptionPane.showInputDialog(
				"Informe a operação: ");
		
		double num1 = Double.parseDouble(valor1);
		double num2 = Double.parseDouble(valor2);
		
		double resultado = "+".equals(operador) ? num1 + num2 : 0;
		resultado = "-".equals(operador) ? num1 - num2 : resultado;
		resultado = "*".equals(operador) ? num1 * num2 : resultado;
		resultado = "/".equals(operador) ? num1 / num2 : resultado;
		resultado = "%".equals(operador) ? num1 % num2 : resultado;
		
		JOptionPane.showMessageDialog(null, "" + num1 + " " + operador + " " + num2 + " = " + resultado);
	}
}
