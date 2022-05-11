package tareab4_2;


import javax.swing.*;

import static java.lang.Double.parseDouble;


public class Tareab4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
		double a = parseDouble(JOptionPane.showInputDialog("Introduzca el primer número"));
		double b = parseDouble(JOptionPane.showInputDialog("Introduzca el segunda número"));
		double c = parseDouble(JOptionPane.showInputDialog("Introduzca el tercer número"));


		/*try {
			double d = (c - b) /a;
			String x;
			x = (a == 0) = "Error: has introducido un valor iagual a 0" :
				"El valor de de x en la ecuacion ax+b = c";
		}*/
		
		double ecuacion = (c-b)/a;
		
		System.out.println(ecuacion);

		//"El resultado de la ecuacion es %n", 
	}
}