package tareab4;

import javax.swing.*;
import static java.lang.Integer.parseInt;

public class Tareab4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
		String numero1 = JOptionPane.showInputDialog("Introduzca el primer n�mero");
		String numero2 = JOptionPane.showInputDialog("Introduzca el segunda n�mero");
		String numero3 = JOptionPane.showInputDialog("Introduzca el tercer n�mero");

		int suma;
		
		suma = parseInt(numero1) + parseInt(numero2) + parseInt(numero3);
		
		System.out.printf("La suma de los n�meros %d %n", suma);
		
		System.out.printf("El promedio es %d %n", Math.round(suma / 2));
		

	}

}
