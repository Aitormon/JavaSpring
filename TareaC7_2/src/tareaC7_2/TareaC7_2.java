package tareaC7_2;

import javax.swing.*;

public class TareaC7_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			  //  Block of code to try
			int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero entero positivo"));
			
			
			if(numero < 0) {
			int a =	5 / 0;
			}
			
			if(numero > 999) {
				System.out.println("Su número tiene 4 cifras");
			}else if(numero > 99){
				System.out.println("Su número tiene 3 cifras");
			}else if(numero > 9){
				System.out.println("Su número tiene 2 cifras");
			}else {
				System.out.println("Su número tiene 1 cifra");
			}
		
		
		}catch(Exception e) {
				
				JOptionPane.showMessageDialog(null,"ERROR", "Lo que ha introducido no es válido", JOptionPane.ERROR_MESSAGE);
				
				System.exit(-1);
			  //  Block of code to handle errors
			}
		
		}
		
		
	
		
	}


