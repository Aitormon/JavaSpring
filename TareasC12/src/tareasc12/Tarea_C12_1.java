package tareasc12;

import javax.swing.JOptionPane;
import java.util.regex.*;

public class Tarea_C12_1 {

	
	static Pattern patron = Pattern.compile("[0-9]{7,8}[A-Z a-z]");
	static Pattern patron2 = Pattern.compile("[A-Z a-z]{0,1}");
	static Pattern patron3 = Pattern.compile("[0-9]");
	String Resultado = "";
	public static String dni;
	int telefono = 0;
	String nombre = "";
	String Datos[] = new String[3];
	
	public void TareaC12_1() {

			Datos[0] = ComprobarDNI();
			Datos[1] = ComprobarNombre();
			Datos[2] = Integer.toString(ComprobarTelefono());

		}
	
	public static String ComprobarDNI(){
		boolean correcto = false;
		
	do {	
		
		dni = (JOptionPane.showInputDialog("Introduzca su DNI"));
		
		Matcher mat = patron.matcher(dni);
		if(mat.matches()) {
			correcto = true;
		}else{
			JOptionPane.showMessageDialog(null, "DNI INCORRECTO", "ERROR",
					JOptionPane.ERROR_MESSAGE);
			correcto = false;
		}
		
	}while(correcto = false);

	return dni;

	}
	
	public String ComprobarNombre(){
		boolean correcto = false;
		
		do {	
			
			
			nombre = (JOptionPane.showInputDialog("Introduzca su Nombre"));
			

			if(nombre.length() > 2) {
				correcto = true;
			}else{
				JOptionPane.showMessageDialog(null, "NOMBRE INCORRECTO", "ERROR",
						JOptionPane.ERROR_MESSAGE);
				correcto = false;
				
			}
			
		}while(correcto = false);

		return nombre;

	}
	
	public Integer ComprobarTelefono(){
		boolean correcto = false;
		String tlf = "";

		do {	
			
			
			telefono = Integer.parseInt(JOptionPane.showInputDialog("Introduzca su Telefono"));
			
			tlf = Integer.toString(telefono);
			
			if(tlf.length() < 9 || tlf.charAt(0) != 6) {
				JOptionPane.showMessageDialog(null, "TELEFONO INCORRECTO", "ERROR",
						JOptionPane.ERROR_MESSAGE);
				correcto = false;
			}else{
				correcto = true;
			}
			
		}while(correcto = false);

		return telefono;
	}
	
	

	
}
