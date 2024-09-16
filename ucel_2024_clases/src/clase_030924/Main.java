package clase_030924;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			String nombre=JOptionPane.showInputDialog(null, "Ingresa el nombre del alumno:");
			double nota1=Double.parseDouble(JOptionPane.showInputDialog("Ingresa la nota del primer examen:"));
			double nota2=Double.parseDouble(JOptionPane.showInputDialog("Ingresa la nota del segundo examen:"));
			Alumno alumno=new Alumno(nombre,nota1,nota2);
			JOptionPane.showMessageDialog(null,"El promedio del alumno :"+ alumno.getNombre()+" es: "+alumno.Promedio(alumno.getNota1(), alumno.getNota2()));

			
		}
		catch(NullPointerException e ){
			JOptionPane.showMessageDialog(null, "No se ingresaron datos.");
		}
		catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null,"Se ingresaron numeros erroneos");
			
		}
		
		
		
	}

}
