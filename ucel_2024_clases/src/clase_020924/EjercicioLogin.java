package clase_020924;


import javax.swing.JOptionPane;
import java.util.Arrays;
public class EjercicioLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] usuarios= {
				{"INES","00000"},
				{"PEDRO","11111"},
				{"JUAN","22222"},
				{"ANA","33333"},
				{"MABEL","44444"}
		};
		
		try {
			String usuario=JOptionPane.showInputDialog("Ingresa tu usuario:");
			String password=JOptionPane.showInputDialog("Ingresa tu password");
			for(int i=0;i<usuarios.length;i++) {
					if(usuario.equalsIgnoreCase(usuarios[i][0])){
						JOptionPane.showMessageDialog(null, "Usuario Correcto");
						if(password.equals(usuarios[i][1])){
							JOptionPane.showMessageDialog(null, "Contraseña correcta");
							break;
						}
						else {
							JOptionPane.showMessageDialog(null, "Contraseña incorrecta");
							break;
						}
						
					}
				}
			
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null, "No se ingresaron datos");
			
		}
	}

}
