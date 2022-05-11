package tareasC8;

import javax.swing.JOptionPane;

public class TareasC8_4 {

	public void tareasC8_4() {
		// TODO Auto-generated method stub

		int numero = 0;
		String grado = "";
		int a = 0;
		
		try {
			// Block of code to try
			numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca su resultado"));


			if (numero < 0 || numero > 100) {
				a = 5 / 0;
			}

			if(numero < 101 && numero > 89) {
				grado = "A";
			}else if(numero < 90 && numero > 79){
				grado = "B";
			}else if(numero < 80 && numero > 69){
				grado = "C";
			}else if(numero < 70 && numero > 49){
				grado = "D";
			}else if(numero < 50 && numero > -1){
				grado = "E";
			}
			
			
			
			
			System.out.println(grado);

			
			
			
			

		} catch (Exception e) {

			JOptionPane.showMessageDialog(null, "Numero incorrecto", "ERROR",
					JOptionPane.ERROR_MESSAGE);

			System.exit(-1);
			// Block of code to handle errors
		}
		
		
		
		
		
		
	}

}
