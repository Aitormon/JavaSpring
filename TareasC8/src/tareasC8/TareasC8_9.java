package tareasC8;

import javax.swing.JOptionPane;

public class TareasC8_9 {

	public void tareasC8_9() {
		// TODO Auto-generated method stub

		String numero = "";
		int a = 0;

		try {
			// Block of code to try
			numero = (JOptionPane.showInputDialog("Introduzca un numero de 5 digitos"));

			
			
			
			if (numero.length() != 5) {
				a = 5 / 0;
			}

			
			if(numero.substring(0,1).equals(numero.substring(4,5)) && numero.substring(1,2).equals(numero.substring(3,4))) {
				System.out.println("El número es capicúa");
			}else{
				System.out.println("El número NO es capicúa");
			}
		
	

		} catch (Exception e) {

			JOptionPane.showMessageDialog(null, "El numero debe tener 5 digitos", "ERROR",
					JOptionPane.ERROR_MESSAGE);

			System.exit(-1);
			// Block of code to handle errors
		}
		
		
		
		
		
	}

}
