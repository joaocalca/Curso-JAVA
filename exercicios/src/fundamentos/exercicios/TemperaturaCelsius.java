package fundamentos.exercicios;

import javax.swing.JOptionPane;

public class TemperaturaCelsius {

	public static void main(String[] args) {
		
		String valor1 = JOptionPane.showInputDialog(
				"Informe a temperatura: ");
		
		double celsius = Double.parseDouble(valor1);
		final double ajuste = 32.0;
		final double fator = 1.8;
		
		double fahrenheit = celsius * fator + ajuste;
		
		JOptionPane.showMessageDialog(null, String.format("A temperatura %.2f °C convertida"
				+ " em graus fahrenheit é %.2f °F.", celsius, fahrenheit));
	}
}
