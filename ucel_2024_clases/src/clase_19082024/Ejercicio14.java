package clase_19082024;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
public class Ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Ejercicio 14: Escriba una aplicación que permita conocer el costo de una compra. La
			selección puede ser hecha entre 5 artículos diferentes. (Uso de while y switch)
		 */
		
		double total=0;
		int option;
		String n;
		
		JTextArea area=new JTextArea(10,50);
		area.setText("Compra de articulos\n");
		area.append("Articulo 1: $50\n");
		area.append("Articulo 2: $75\n");
		area.append("Articulo 3: $100\n");
		area.append("Articulo 4: $150\n");
		area.append("Articulo 5: $200\n");
		JOptionPane.showMessageDialog(null,area);
		do {
			n=JOptionPane.showInputDialog("Ingresa articulos o 0 para salir");
			option=Integer.parseInt(n);
			switch(option) {
				
				case 0:
					break;
				case 1:
					JOptionPane.showMessageDialog(null,"Articulo Agregado");
					total+=50;
					break;
				case 2:
					JOptionPane.showMessageDialog(null,"Articulo Agregado");
					total+=75;
					break;
				case 3:
					JOptionPane.showMessageDialog(null,"Articulo Agregado");
					total+=100;
					break;
				case 4:
					JOptionPane.showMessageDialog(null,"Articulo Agregado");
					total+=150;
					break;
				case 5:
					JOptionPane.showMessageDialog(null,"Articulo Agregado");
					total+=200;
					break;
				
			}
			 JOptionPane.showMessageDialog(null,area);
		
			
		}while(option!=0);
		
		JOptionPane.showMessageDialog(null,"Total:"+total);
		
		
		
	}

}
