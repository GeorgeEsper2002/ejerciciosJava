package clase_13082024;
import javax.swing.JOptionPane;
public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Ejercicio 3: Indicar si el número entero ingresado es par o impar. (Uso de
			sentencias de ingreso, salida, cálculo matemático y decisión lógica).

		 */
		
		String numero=JOptionPane.showInputDialog("Ingresa un numero entero");
		int n=Integer.parseInt(numero);
		if(n%2==0){
			JOptionPane.showMessageDialog(null, "El numero ingresado es par");
		}
		else {
			JOptionPane.showMessageDialog(null, "El numero ingresado es impar");
		}
	}

}
