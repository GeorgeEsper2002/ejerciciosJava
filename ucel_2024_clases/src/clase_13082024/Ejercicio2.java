package clase_13082024;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Ejercicio2 {

	public static void main(String[] args) {
		/*
		 * Ejercicio 2: Sumar dos números enteros y mostrar el resultado. (Uso de sentencias
			de ingreso, salida y cálculo matemático). 
		 */
		
		//DecimalFormat formato= new DecimalFormat("0.00");
		String nro1 = JOptionPane.showInputDialog("Ingrese un n entero");
		String nro2 = JOptionPane.showInputDialog("Ingrese otro n  entero");
		
		int primerNro=Integer.parseInt(nro1);
		int segundoNro=Integer.parseInt(nro2);
		int resultado=primerNro+segundoNro;
		JOptionPane.showMessageDialog(null, "El resultado de la suma es: "+ (resultado));

	}

}
