package clase_13082024;
import javax.swing.JOptionPane;
public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Ejercicio 5: Ingresar un número entero e indicar si es primo o compuesto. (Uso de
			sentencias de ingreso, salida, decisión lógica y reiteración)
		 */
		String nro=JOptionPane.showInputDialog("Ingresa un numero entero.");
		int n=Integer.parseInt(nro);
		if(n%1 !=0 && n%n!=0) 
		{
			JOptionPane.showMessageDialog(null,"El numero " +n+" es compuesto");
		}
		else {
			JOptionPane.showMessageDialog(null,"El numero " +n+" es primo");
		}
	}

}
