package fundamentos.exercicios;

import javax.swing.JOptionPane;

public class TemperaturaFahrenheit {

	public static void main(String[] args) {
		
		String valor1 = JOptionPane.showInputDialog(
				"Informe a temperatura: ");
		
		double fahrenheit = Double.parseDouble(valor1);
		final double ajuste = 32.0;
		final double fator = 5.0 / 9.0;
		
		double celsius = (fahrenheit - ajuste) * fator;
		
		JOptionPane.showMessageDialog(null, String.format("A temperatura %.2f °F convertida"
				+ " em graus celsius é %.2f °C.", fahrenheit, celsius));
	}
}