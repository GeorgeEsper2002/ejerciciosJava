package clase_13082024;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
public class Ejercicio10 {

	public static void main(String[] args) {
		// Ejercicio 10: Generalizar el ejercicio 9 para n números enteros.
		String nro;
		int n,mayor=0,menor=0;
		String numeros=JOptionPane.showInputDialog("Ingresa la cantidad de n a ingresar: ");
		int N=Integer.parseInt(numeros);
		for(int i=0;i<N;i++) {
			
			 nro=JOptionPane.showInputDialog("Ingresa un numero:");
			 n=Integer.parseInt(nro);
			if(n>mayor) {
				mayor=n;
			}
			else if(menor>n) {
				menor=n;
			}
		}
		
		JOptionPane.showMessageDialog(null, "Mayor: "+mayor);
		JOptionPane.showMessageDialog(null, "Menor: "+menor);
		
		
		
		
	}

}
