package tareasd13;

import javax.swing.JOptionPane;

public class EntradaUsuario {

	public void Entrada_Usuario() {
		//boolean salir = false;
		byte numero;
		
	try {
		
		do {
	
			numero = Byte.parseByte(JOptionPane.showInputDialog("Introduzca un numero entre el 1 y el 100"));
	if (numero < 1 || numero > 100){
		JOptionPane.showMessageDialog(null, "Introduzca un numero entre el 1 y el 100", "ERROR",
				JOptionPane.ERROR_MESSAGE);
		
	}
	
		}while(numero < 1 || numero > 100);
		
		//salir = true;
	
	} catch (Exception e) {	
		
		
		JOptionPane.showMessageDialog(null, "VALORES INCORRECTOS", "ERROR",
				JOptionPane.ERROR_MESSAGE);

	}
	
	
	
	
}
}
