package clase_12082024;


import java.text.DecimalFormat;

import javax.swing.*;


public class EjemploUno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//JOptionPane.showMessageDialog(null, "Hola mundo");
		
		// Declaracion de variables
		
		
		//System.out.print("Mi primer programa java");
		//System.out.println(numero);
		//String nro1,nro2;
		DecimalFormat formato= new DecimalFormat("0.00");
		String nro1 = JOptionPane.showInputDialog("Ingrese un valor entero");
		//String nro2 = JOptionPane.showInputDialog("Ingrese un valor entero");
		
		double primerNro=Double.parseDouble(nro1);
		//double segundoNro=Integer.parseInt(nro2);
		double resultado=primerNro%2;
		JOptionPane.showMessageDialog(null, "El resultado del resto es: "+ formato.format(resultado));
		// Estructuras
		/*
		 * if (Condicion)		for(inicial;valor tope;variacion)
		 * {					{
		 * 							inicial;
		 * 						}
		 * }
		 * else{
		 * }
		 * 
		 * inicializacion;
		 *  While(tope){
		 *  	
		 *  	variacion;
		 *  
		 *  }
		 *  
		 *  inicializacion;
		 *  
		 *  do{
		 *  
		 *  	variacion;
		 *  
		 *  }while(condicion);
		 *  
		 *  switch(var){
		 *  
		 *  
		 *  
		 *		case var:
		 *			break;
		 *
		 *
		 *
		 *		default:
		 *			break;
		 *  }
		 *  
		 */
		
		
		
		
	}

}
