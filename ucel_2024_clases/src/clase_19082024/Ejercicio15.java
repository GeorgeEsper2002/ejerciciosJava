package clase_19082024;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
public class Ejercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Ejercicio 15 Se desea cargar un lote de n votantes por teclado, se conoce su sexo
			(M= masculino y F= femenino) y su posibilidad de elección (1, 2, 3 y 4). Se desea
			conocer:
			a. Cantidad de votantes masculinos y femeninos.
			b. Cantidad de votos por cada elección.
			c. Porcentaje con respecto al total de votos por cada selección.
			d. Cantidad de votos en blanco y su porcentaje.
			s. salir
		 */
		int opcion,eleccion,optMenu=1;
		String opt = " ";
		JTextArea menu= new JTextArea();
		JTextArea area=new JTextArea();
		JTextArea areaVotar=new JTextArea();
		int elec1=0,elec2=0,elec3=0,elec4=0,votos=0,hombres=0,mujeres=0;
		String sexo;
		menu.setText("Opciones Menu:\n");
		menu.append("1.Cargar Datos elecciones.\n");
		menu.append("2.Mostrar Datos elecciones\n");
		menu.append("0.Salir.");
		area.setText("Opciones:\n");
		area.append("a. Cantidad de votantes masculinos y femeninos.\n");
		area.append("b. Cantidad de votos por cada elección.\n");
		area.append("c. Porcentaje con respecto al total de votos por cada selección.\n");
		area.append("d. Cantidad de votos en blanco y su porcentaje.\n");
		area.append("s.salir.");
		areaVotar.setText("Eleccion:\n");
		areaVotar.append("1.Partido 1\n");
		areaVotar.append("2.Partido 2\n");
		areaVotar.append("3.Partido 3\n");
		areaVotar.append("4.Partido 4\n");
		areaVotar.append("0.Votar en blanco.\n");
		areaVotar.append("-1.Salir seccion elecciones");
		//while(true){
		//	opt; 
		
			do{
				JOptionPane.showMessageDialog(null,menu);
				optMenu=Integer.parseInt(JOptionPane.showInputDialog("Ingresa una opcion o 0-Salir:"));
				switch (optMenu) {	
					case 0:
						break;
					case 1:	
						JOptionPane.showMessageDialog(null,area);
						do {
							JOptionPane.showMessageDialog(null,areaVotar);
							sexo=JOptionPane.showInputDialog("Ingresa tu sexo (F o M):");
							eleccion=Integer.parseInt(JOptionPane.showInputDialog("Ingresa -1 para salir"));
							if(sexo.equalsIgnoreCase("f")) {
								mujeres++;
							}
							else if(sexo.equalsIgnoreCase("m")) {
								hombres++;
							}
							switch(eleccion) {
								case -1:
									break;
								case 1:
									elec1++;
									votos++;
									break;
								case 2:
									elec2++;
									votos++;
									break;
								case 3:
									elec3++;
									votos++;
									break;
								case 4:
									elec4++;
									votos++;
									break;
							
							}
						}while(eleccion!=-1);
					case 2:
						JOptionPane.showMessageDialog(null,area);
						opt=JOptionPane.showInputDialog("");
						//switch() {
						
						
				}
				optMenu=Integer.parseInt(JOptionPane.showInputDialog("Ingresa una opcion o 0-Salir:"));
				
			}while(optMenu!=0);
				
		
		/*
		catch(NullPointerException e) {
			JOptionPane.showMessageDialog(null, "No se ingresaron datos");
		}
		catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Dato invalido");
		}
		*/
					
		}
	
	
}
	

									
