package tareasC8;

import javax.swing.JOptionPane;

public class TareasC8_6 {

	public void tareasC8_6() {
		// TODO Auto-generated method stub

		
		int numero = 0;
		int a = 0;
		
		try {
			// Block of code to try
			numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero"));


			if (numero == 0) {
				a = 5 / 0;
			}

	
			
			System.out.println(Math.abs(numero)); 
			
			

			
			
			
			

		} catch (Exception e) {

			JOptionPane.showMessageDialog(null, "Numero nulo", "ERROR",
					JOptionPane.ERROR_MESSAGE);

			System.exit(-1);
			// Block of code to handle errors
		}
		
		
		
		
		
	}

}
