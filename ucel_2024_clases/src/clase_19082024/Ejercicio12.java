package clase_19082024;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Ejercicio 12: Escriba una aplicación que a partir de la expresión algebraica de la
		ecuación de 1° grado indique un conjunto de 10 pares de coordenadas x,y para
		trazar la recta que representa
		*/
		
		JTextArea area=new JTextArea(10,10);
		JScrollPane scrollPanel=new JScrollPane(area);
		int lineal=0,indepte=0,y=0;
		String varLineal=JOptionPane.showInputDialog("Ingresa la var independiente de y=mx+B");
		String varIndepte=JOptionPane.showInputDialog("Ingresa la var lineal de y=mX+b");
		lineal=Integer.parseInt(varLineal);
		indepte=Integer.parseInt(varIndepte);
		area.setText("La ecuacion lineal y="+ lineal+"x +"+indepte+"\n");
		area.append("x                  y"+"\n");
		for(int x=-5;x<4;x++) 
		{
			y=lineal * x + indepte;
			area.append(x+"                  "+y+"\n");
		}
		JOptionPane.showMessageDialog(null,scrollPanel);
	}	
}
