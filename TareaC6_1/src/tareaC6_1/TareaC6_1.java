package tareaC6_1;

import javax.swing.*;


public class TareaC6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int precio = Integer.parseInt(JOptionPane.showInputDialog("Introduzca Precio"));
		
		if(precio > 300) {
		System.out.println("Usted tiene un descuento del 20%!!");	
		precio = (precio-(precio * 20 / 100));
		}
		
		
		
		
		
			System.out.println("El precio de su compra es");
			System.out.println(precio);


		
		
		
		
	}

}
