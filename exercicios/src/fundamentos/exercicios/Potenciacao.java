package fundamentos.exercicios;

import javax.swing.JOptionPane;

public class Potenciacao {

	public static void main(String[] args) {
		
		String valor1 = JOptionPane.showInputDialog("Informe um valor: ");
		
		double num1 = Double.parseDouble(valor1);
		
		double quadrado = Math.pow(num1, 2);
		double cubo = Math.pow(num1, 3);
		
		JOptionPane.showMessageDialog(null, String.format("O resultado do valor %.2f ao quadrado"
				+ " é %.2f e ao cubo é %.2f", num1, quadrado, cubo));
	}
}
