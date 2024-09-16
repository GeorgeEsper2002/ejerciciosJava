package clase_13082024;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.text.DecimalFormat;
public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *  Escriba una aplicación que lea temperaturas expresadas en grados
			Fahrenheit y las convierta a grados Celsius mostrándola. El programa finalizará
			cuando lea un valor de temperatura igual a 999. La conversión de grados Farenheit
			(F) a Celsius (C) está dada por C = 5/9(F − 32)

		 */
		DecimalFormat formato= new DecimalFormat("0.00");
		double temperatura,resultado;
		String valor=JOptionPane.showInputDialog("Ingresa la temperatura en fahrenheit: ");
		while(Double.parseDouble(valor)!=999) {
			temperatura=Float.parseFloat(valor);
			resultado=(5/9.00)*(temperatura-32);
			JOptionPane.showMessageDialog(null, "°F: "+formato.format(temperatura)+" C°:"+formato.format(resultado));
			valor=JOptionPane.showInputDialog("Ingresa la temperatura en fahrenheit(999 para salir): ");
		}
		JOptionPane.showMessageDialog(null,"Programa finalizado.");
		
		
	}

}
