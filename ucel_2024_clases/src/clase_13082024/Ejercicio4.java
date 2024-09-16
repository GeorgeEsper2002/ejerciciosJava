package clase_13082024;
import javax.swing.JOptionPane;
public class Ejercicio4 {

	public static void main(String[] args) {
		/*
		 * Ejercicio 4: Sumar diez números enteros y mostrar el resultado. (Uso de sentencias
			de ingreso, salida y reiteración).
		 */

		int suma=0;
		int n;
		for(int i=0;i<10;i++) {
		
			String numero=JOptionPane.showInputDialog("Ingresa un numero");
			n=Integer.parseInt(numero);
			suma+=n;
		}
		JOptionPane.showMessageDialog(null, "Suma 10 n enteros: "+ suma);
		
	}

}
