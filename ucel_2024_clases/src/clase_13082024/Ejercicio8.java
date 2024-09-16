package clase_13082024;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Escribir una aplicación que lea un número entero desde teclado y realiza
			la suma de los 100 número siguientes, mostrando el resultado en pantalla.

		 */
		JTextArea area=new JTextArea();
		String valor=JOptionPane.showInputDialog(null, "Ingresa un n entero");
		int n=Integer.parseInt(valor);
		int suma=0;
		area.append("Sumando:\n");
		for(int i=n;i<=100+n;i++){
			area.append(i+"\t");
			suma+=i;
		}
		JOptionPane.showMessageDialog(null, area);
		JOptionPane.showMessageDialog(null, "El resultado es "+ suma);
	}

}
