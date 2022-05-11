package tareasC9;

import javax.swing.JOptionPane;

public class TareasC9_3 {

	public void tareasC9_3(){
	
	
		int numero = 0;

		int a = 0;

		try {
			// Block of code to try
			numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero"));

			if ((numero < 5) || (numero > 7 && numero < 11) || (numero > 33)) {
				System.out.println("Bien");
			}else {
				System.out.println("Mal");
				
			}


		} catch (Exception e) {

			JOptionPane.showMessageDialog(null, "ERROR", "Lo que ha introducido no es válido",
					JOptionPane.ERROR_MESSAGE);

			System.exit(-1);
			// Block of code to handle errors
		}
	
		
		
	
	
		
		
		
		
		
		
		
	}
}
