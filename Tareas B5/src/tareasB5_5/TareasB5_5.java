package tareasB5_5;

import javax.swing.JOptionPane;

public class TareasB5_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			  //  Block of code to try
			double numero = Double.parseDouble(JOptionPane.showInputDialog("Introduzca un numero entero positivo"));
			
			int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero entero positivo"));
			
			if(numero < 0) {
			int a =	5 / 0;
			}
			
			if(numero2 < 0) {
			int a =	5 / 0;
			}
			
			System.out.printf("La potencia del numero 1 es: %.2f", (Math.exp(numero)));
			System.out.printf("La potencia del numero 2 es: ", (Math.exp(numero2)));
			System.out.printf("La raiz cuadrada del numero 1 es: %.2f", (Math.sqrt(numero)));
			System.out.printf("La raiz cuadrada del numero 2 es: ", (Math.sqrt(numero2)));
			System.out.printf("La valor absoluto del numero 1 es: %.2f", (Math.abs(numero)));
			System.out.printf("La valor absoluto del numero 2 es: ", (Math.abs(numero2)));
			System.out.printf("El logaritmo del numero 1 es: %.2f", (Math.log(numero)));
			System.out.printf("El logaritmo del numero 2 es: ", (Math.log(numero2)));
		
			
			
			
			
			
			
		}catch(Exception e) {
				
				JOptionPane.showMessageDialog(null,"ERROR", "Lo que ha introducido no es válido", JOptionPane.ERROR_MESSAGE);
				
				System.exit(-1);
			  //  Block of code to handle errors
			}
		
		
		
		
		
		
	}

}
