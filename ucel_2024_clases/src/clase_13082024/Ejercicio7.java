package clase_13082024;

import javax.swing.JOptionPane;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * : Se desea realizar una aplicación que sume los cuadrados de los treinta
			primeros números naturales, mostrando el resultado en pantalla.
		 */
	
		int resultado=0;
		
		for(int i=0;i<31;i++){
			resultado+=i*i;
		}
		JOptionPane.showMessageDialog(null, "resultado: " + resultado);
	}
	
	

}
