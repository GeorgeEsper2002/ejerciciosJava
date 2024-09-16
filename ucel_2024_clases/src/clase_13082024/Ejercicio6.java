package clase_13082024;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Ejercicio 6: Ingresar un número entero e indicar si es primo o compuesto y mostrar
			sus divisores. (Uso de sentencias de ingreso, salida, decisión lógica y reiteración).

		 */
		JTextArea area=new JTextArea();
		int n;
		String valor=JOptionPane.showInputDialog("Ingresa un n entero");
		n=Integer.parseInt(valor);
		
		if(n%1 !=0 && n%n!=0) 
		{
			JOptionPane.showMessageDialog(null,"El numero " +n+" es compuesto");
		}
		else {
			JOptionPane.showMessageDialog(null,"El numero " +n+" es primo");
		}
		area.append("Los divisores de " +n+" son: \n");// setText para la primera linea
		for(int i=1;i<=n;i++){
			
			if(n%i==0){
				area.append(i+"\n");
				//JOptionPane.showMessageDialog(null, "Divisores de"+n+" : "+i);// me muestra de a 1
			}
			
		}
		JOptionPane.showMessageDialog(null, area);
		
		
		
		
	}

}
