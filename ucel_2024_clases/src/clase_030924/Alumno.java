package clase_030924;

public class Alumno {
	private String nombre;
	private double nota1;
	private double nota2;
	
	public Alumno(String nombre,double nota1,double nota2) {
		this.nombre=nombre;
		this.nota1=nota1;
		this.nota2=nota2;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	
	public double Promedio(double nota1,double nota2) {
		return (nota1+nota2)/2;
	}
	
}
