package fundamentos.exercicios;

import javax.swing.JOptionPane;

public class IMC {

	public static void main(String[] args) {
		
		String valor1 = JOptionPane.showInputDialog("Informe o seu peso: ").replace(",", ".");
		String valor2 = JOptionPane.showInputDialog("Informe a sua altura: ").replace(",", ".");
		
		double peso = Double.parseDouble(valor1);
		double altura = Double.parseDouble(valor2);
		
		double IMC = peso / Math.pow(altura, 2);
		
		JOptionPane.showMessageDialog(null, String.format(" O índice de massa corporal"
				+ " do usuário(IMC) é de %.2f.", IMC));
	}
}
