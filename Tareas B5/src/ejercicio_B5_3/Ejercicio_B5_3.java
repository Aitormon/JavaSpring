package ejercicio_B5_3;

import javax.swing.*;

public class Ejercicio_B5_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String nombre = JOptionPane.showInputDialog("Introduzca su nombre");
		String apellido = JOptionPane.showInputDialog("Introduzca su apellido");
		
		String primeraletra;

		apellido = apellido.toUpperCase();
		//primeraletra = ;
		//primeraletra = primeraletra.toUpperCase();
		nombre = nombre.substring(0,1).toUpperCase() + nombre.substring(1);
		
		//nombre = nombre.substring(0).toUpperCase();
		System.out.println(nombre);
		System.out.println(apellido);
		
	}

}
