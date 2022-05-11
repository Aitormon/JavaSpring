package tareasC9;

import javax.swing.JOptionPane;

public class TareasC9_1 {


	public void tareasC9_1() {
	
		double Resultado = 0;
		double Kilogramos = 0;

		int a = 0;

		try {
			// Block of code to try
			Kilogramos = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el peso en libras"));

			if (Kilogramos < 1) {
				a = 5 / 0;
			}
			
			Resultado = Kilogramos / 2.2;
			System.out.print(Kilogramos);
			System.out.printf(" Libras Son: %.3f", Resultado);
			System.out.println(" Kilogramos");

		} catch (Exception e) {

			JOptionPane.showMessageDialog(null, "ERROR", "Lo que ha introducido no es válido",
					JOptionPane.ERROR_MESSAGE);

			System.exit(-1);
			// Block of code to handle errors
		}



	}
	
	
	
	
}
	

