package clase_160924;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.*;

public class Ventana extends JFrame {
	
	private JTextField txtUsuario;
    private JPasswordField txtPass;
    private Usuario usuarioValido; // Usuario ya registrado

    public Ventana(){
    	// Genero un usuario
    	Usuario usuarioValido=new Usuario("admin","admin");
        // Configuración de la ventana
        setTitle("Login");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centrar la ventana

        // Panel principal
        JPanel panel = new JPanel();
        panel.setLayout(null); // Usar layout nulo para posiciones absolutas

        // Etiqueta para Usuario
        JLabel lblUsuario = new JLabel("Usuario:");
        lblUsuario.setBounds(20, 20, 80, 25);
        panel.add(lblUsuario);

        // Campo de texto para ingresar Usuario
        txtUsuario = new JTextField(20);
        txtUsuario.setBounds(100, 20, 160, 25);
        panel.add(txtUsuario);

        // Etiqueta para Contraseña
        JLabel lblContrasena = new JLabel("Contraseña:");
        lblContrasena.setBounds(20, 50, 80, 25);
        panel.add(lblContrasena);

        // Campo de texto para ingresar Contraseña
        txtPass = new JPasswordField(20);
        txtPass.setBounds(100, 50, 160, 25);
        panel.add(txtPass);

        // Botón de Login
        JButton btnLogin = new JButton("Aceptar");
        btnLogin.setBounds(100, 85, 80, 25);
        panel.add(btnLogin);
        		
        		
        		
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                validarUsuario(usuarioValido.getUser(),usuarioValido.getPassword()); // Validar los datos ingresados
            }
        });
        
        // Añadir el panel a la ventana
        add(panel);
    }
    
    



	private void validarUsuario(String user,String password) {
		
		String usuario=txtUsuario.getText();
		String pass=new String(txtPass.getPassword());
		
		
		
		if(usuario.equals(user) && pass.equals(password)) {
			JOptionPane.showMessageDialog(this,"Logueo exitoso");
			
		}
		else {
			JOptionPane.showMessageDialog(this,"Error user o pass incorrectos");
		}
	}

}
