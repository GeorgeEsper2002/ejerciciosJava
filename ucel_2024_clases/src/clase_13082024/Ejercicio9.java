package clase_13082024;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Escriba una aplicación que lea tres números enteros positivos, y que
			calcule e imprima en pantalla el menor y el mayor de todos ellos.

		 */
		
		String numero1,numero2,numero3;
		int n1,n2,n3,mayor=0,menor=0;
		numero1=JOptionPane.showInputDialog("Ingresa un n entero");
		numero2=JOptionPane.showInputDialog("Ingresa un n entero");
		numero3=JOptionPane.showInputDialog("Ingresa un n entero");
		n1=Integer.parseInt(numero1);
		n2=Integer.parseInt(numero2);
		n3=Integer.parseInt(numero3);
		// Logica mayor
		if(n1>n2 && n1>n3) 
		{
			mayor=n1;
		}
		if(n2>n1 && n2>n3){
			mayor=n2;
			
		}
		if(n3>n1 && n3>n2){
			mayor=n3;
		}
		// Logica menor
		if(n1<n2 && n1<n3) {
			menor=n1;
		}
		if(n2<n1 && n2<n3) {
			menor=n2;
		}
		if(n3<n2 && n3<n1) {
			menor=n3;
		}
		
		JOptionPane.showMessageDialog(null,"El numero mayor es :" + mayor);
		JOptionPane.showMessageDialog(null,"El numero menor es :" + menor);
	}
}
