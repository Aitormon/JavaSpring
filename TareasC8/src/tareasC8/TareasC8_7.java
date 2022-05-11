package tareasC8;

import javax.swing.JOptionPane;

public class TareasC8_7 {

	
	public void tareasC8_7() {
		// TODO Auto-generated method stub

		
		int numero = 0;
		int numero2 = 0;
		
		try {
			// Block of code to try
			numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el primer numero"));
			numero2 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el segundo numero"));

			
			if (numero == numero2) {
				System.out.println("Los dos numeros son iguales");
			}else if(numero < numero2){
				System.out.println("El primer numero es menor que el segundo");
			}else if(numero > numero2){
				System.out.println("El primer numero es mayor que el segundo");
				
			}
		


		} catch (Exception e) {

			JOptionPane.showMessageDialog(null, "Numero incorrecto", "ERROR",
					JOptionPane.ERROR_MESSAGE);

			System.exit(-1);
			// Block of code to handle errors
		}
		
		
		
		
	}

}
