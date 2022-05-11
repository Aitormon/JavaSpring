package tareasC8;

import javax.swing.JOptionPane;

public class TareasC8_10 {

	public void tareasC8_10() {
		// TODO Auto-generated method stub

		double Resultado = 0;
		int cantidad = 0;
		int conversion = 0;
		int a = 0;

		try {
			// Block of code to try
			conversion = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el tipo de conversion 1-Dolar 2-Yen 3-libras"));

			if (conversion < 1 || conversion > 3) {
				a = 5 / 0;
			}

		} catch (Exception e) {

			JOptionPane.showMessageDialog(null, "ERROR", "Lo que ha introducido no es válido",
					JOptionPane.ERROR_MESSAGE);

			System.exit(-1);
			// Block of code to handle errors
		}

		try {
			// Block of code to try
			cantidad = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la cantidad"));

			if (cantidad < 0) {
				a = 5 / 0;
			}

		} catch (Exception e) {

			JOptionPane.showMessageDialog(null, "ERROR", "Lo que ha introducido no es válido",
					JOptionPane.ERROR_MESSAGE);

			System.exit(-1);
			// Block of code to handle errors
		}

		if(conversion == 1) {
			Resultado = cantidad * 0.92;
			System.out.println(Resultado);
			System.out.println("Dolares");
		}else if( conversion == 2 ){
			Resultado = cantidad * 139.54;
			System.out.println(Resultado);
			System.out.println("Yenes");
		}else if (conversion == 3) {
			Resultado = cantidad * 0.83;
			System.out.println(Resultado);
			System.out.println("Libras");
		}
		
		
		
		
		
	}

}
