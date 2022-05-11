package tareasC8;

import javax.swing.JOptionPane;

public class TareaC8_3 {

	public void tareaC8_3() {
		// TODO Auto-generated method stub

		String numero = "";
		int a = 0;

		try {
			// Block of code to try
			numero = (JOptionPane.showInputDialog("Introduzca un numero de 5 digitos"));

			
			
			
			if (numero.length() != 5) {
				a = 5 / 0;
			}
			
			
			

			System.out.println(numero.substring(0,1));
			System.out.println(numero.substring(1,2));
			System.out.println(numero.substring(2,3));
			System.out.println(numero.substring(3,4));
			System.out.println(numero.substring(4,5));
			
			
			
			

		} catch (Exception e) {

			JOptionPane.showMessageDialog(null, "El numero debe tener 5 digitos", "ERROR",
					JOptionPane.ERROR_MESSAGE);

			System.exit(-1);
			// Block of code to handle errors
		}
		
		
		
		
		
		
		
		
		
		
	}

}
