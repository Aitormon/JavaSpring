package tareasC8;

import javax.swing.JOptionPane;

public class TareasC8_8 {

	public void tareasC8_8() {
		int numero1;
		int numero2;
		int numero3;
		int numero4;
		int numero5;
		int numero6;
		int numero7;
		int numero8;
		int numero9;
		int numero10;
		int numero11;
		int numero12;
		
		try {
			// Block of code to try
			numero1 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el primer numero"));
			numero2 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el segundo numero"));
			
			numero3 = numero1;
			numero4 = numero2;
			numero5 = numero1;
			numero6 = numero2;
			numero7 = numero1;
			numero8 = numero2;
			numero9 = numero1;
			numero10 = numero2;
			numero11 = numero1;
			numero12 = numero2;

			
			System.out.println(numero1);
			System.out.println(numero2);
			System.out.println(numero3 += numero4);
			System.out.println(numero5 -= numero6);
			System.out.println(numero7 *= numero8);
			System.out.println(numero9 /= numero10);
			System.out.println(numero11 %= numero12);
		


		} catch (Exception e) {

			JOptionPane.showMessageDialog(null, "Numero incorrecto", "ERROR",
					JOptionPane.ERROR_MESSAGE);

			System.exit(-1);
			// Block of code to handle errors
		}
		
		
		
		
		
		
		
		
		
	}

}
