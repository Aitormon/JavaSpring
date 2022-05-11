package tareasC8;

import javax.swing.JOptionPane;

public class TareaC8_2 {

	public void tareaC8_2() {
		// TODO Auto-generated method stub
		boolean bisiesto = false;
		final byte div1 = 4;
		final byte div2 = 100;
		final short div3 = 400;
		int año = 0;
		int a = 0;

		try {
			// Block of code to try
			año = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el año"));

			if (año < 1) {
				a = 5 / 0;
			}
			
			
			
			if(año%div1 == 0 && año%div2 == 0 && año%div3 == 0) {

			bisiesto = true;	
			}
			
			if(bisiesto == true) {
			System.out.println("El año es bisiesto");
			}else {
				System.out.println("El año no es bisiesto");
				
			}
			

		} catch (Exception e) {

			JOptionPane.showMessageDialog(null, "ERROR", "Lo que ha introducido no es válido",
					JOptionPane.ERROR_MESSAGE);

			System.exit(-1);
			// Block of code to handle errors
		}

		
		
		
		
		
		
		
		
	}

}
