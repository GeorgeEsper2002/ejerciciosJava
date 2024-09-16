package clase_19082024;

import javax.swing.JOptionPane;
import java.math.*;
public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Ejercicio 13: Escriba una aplicación que lea los coeficientes a, b y c de una ecuación
			de segundo, y estudie si tiene o no solución. En caso positivo, las soluciones se
			calcularán e imprimirán en pantalla.
		 */
		int a,b,c;
		String v1,v2,v3;
		double discriminante;
		v1=JOptionPane.showInputDialog("ax2+bx+c -> Ingresa a:");
		v2=JOptionPane.showInputDialog("ax2+bx+c -> Ingresa b:");
		v3=JOptionPane.showInputDialog("ax2+bx+c -> Ingresa c:");
		a=Integer.parseInt(v1);
		b=Integer.parseInt(v2);
		c=Integer.parseInt(v3);
		discriminante=Math.sqrt(b^2-4*a*c);
		
		if(discriminante>0) {
			JOptionPane.showMessageDialog(null,"La ecuacion "+a+"x^2 +"+b+"x +"+c+" Tiene solucion");
		}
		else {
		JOptionPane.showMessageDialog(null,"La ecuacion "+a+"x^2 +"+b+"x +"+c+" no Tiene solucion");
			}
	}

}
