package tareasC8;

import javax.swing.JOptionPane;

public class TareaC8_2 {

	public void tareaC8_2() {
		// TODO Auto-generated method stub
		boolean bisiesto = false;
		final byte div1 = 4;
		final byte div2 = 100;
		final short div3 = 400;
		int a�o = 0;
		int a = 0;

		try {
			// Block of code to try
			a�o = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el a�o"));

			if (a�o < 1) {
				a = 5 / 0;
			}
			
			
			
			if(a�o%div1 == 0 && a�o%div2 == 0 && a�o%div3 == 0) {

			bisiesto = true;	
			}
			
			if(bisiesto == true) {
			System.out.println("El a�o es bisiesto");
			}else {
				System.out.println("El a�o no es bisiesto");
				
			}
			

		} catch (Exception e) {

			JOptionPane.showMessageDialog(null, "ERROR", "Lo que ha introducido no es v�lido",
					JOptionPane.ERROR_MESSAGE);

			System.exit(-1);
			// Block of code to handle errors
		}

		
		
		
		
		
		
		
		
	}

}
