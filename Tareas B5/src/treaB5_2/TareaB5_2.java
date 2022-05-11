package treaB5_2;

import java.util.InputMismatchException;

import javax.swing.*;

public class TareaB5_2 {

	public static void main(String[] args) {
		final double pi = 3.1416; 
		// TODO Auto-generated method stub
		try {
		int radio = Integer.parseInt(JOptionPane.showInputDialog("Radio de la circunferecia?"));
		
		if(radio < 1) {
			int a = 5 / 0;
			
		}
			
		
		System.out.println("La longitud de la circunferencia es de");
		System.out.println(radio * (2 * pi));
		
		System.out.println("La area de la circunferencia es de");
		System.out.println(radio * (Math.pow(pi ,2)));
		
		
		} catch(InputMismatchException e) {
		
			JOptionPane.showMessageDialog(null,"ERROR", "Lo que ha introducido no es válido", JOptionPane.ERROR_MESSAGE);
			
			System.exit(-1);
		}
		

		
		
		
	}

}
