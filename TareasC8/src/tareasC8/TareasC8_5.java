package tareasC8;

import javax.swing.JOptionPane;

public class TareasC8_5 {

	public void tareasC8_5() {
		// TODO Auto-generated method stub

		double numero = 0.0;
		int a = 0;
		
		try {
			// Block of code to try
			numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero"));


			if (numero == 0) {
				a = 5 / 0;
			}

	
			System.out.printf("El inverso es: %.2f", (1/numero)); 
			
			

			
			
			
			

		} catch (Exception e) {

			JOptionPane.showMessageDialog(null, "Numero nulo", "ERROR",
					JOptionPane.ERROR_MESSAGE);

			System.exit(-1);
			// Block of code to handle errors
		}
		
		
		
		
	}

}
