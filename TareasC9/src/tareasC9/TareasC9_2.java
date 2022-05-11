package tareasC9;

import javax.swing.JOptionPane;

public class TareasC9_2 {

	
	public void tareasC9_2() {
		
		int costo = 0;
		byte edad = 0;
		byte accidentes = 0;
		int segurobasico = 500;
		
		int a = 0;
		

		try {
			// Block of code to try
			edad = Byte.parseByte(JOptionPane.showInputDialog("Introduzca su edad"));
			
			if (edad < 18) {
				a = 5 / 0;
			}
			
			
			accidentes = Byte.parseByte(JOptionPane.showInputDialog("Introduzca numero de accidentes"));

			if (accidentes > 5) {
				a = 5 / 0;
			}
			
			costo = segurobasico;
			
			if(edad < 25)
			costo = costo + 100;
			
			switch(accidentes) {
			case 1:
				costo = costo + 50;
			break;
			case 2:
				costo = costo + 125;
			break;
			case 3:
				costo = costo + 225;
			break;
			case 4:
				costo = costo + 375;
			break;
			case 5:
				costo = costo + 575;
			break;
			
			
			}
			
			
			System.out.printf("El coste del seguro sera %d", costo);


		} catch (Exception e) {

			JOptionPane.showMessageDialog(null, "No podemos asegurarle en su caso", "ERROR",
					JOptionPane.ERROR_MESSAGE);

			System.exit(-1);
			// Block of code to handle errors
		}



	}
	
	
	
	
}
