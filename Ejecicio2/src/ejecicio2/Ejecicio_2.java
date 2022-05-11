package ejecicio2;

import javax.swing.JOptionPane;

public class Ejecicio_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Pablo = 0;//La edades
	int Pilar = 0;//La edades
	int Marcos = 0;//La edades
	int Maria = 0;//La edades
	int Julia = 0;//La edades
	
	int Pablocotizacion = 0;
	int Pilarcotizacion = 0;
	int Marcoscotizacion = 0;
	int Mariacotizacion = 0;
	int Juliacotizacion = 0;

	do {//Bucle para la entrada del usuario

		Pablo = Integer.parseInt(JOptionPane.showInputDialog("Introduzca edad de Pablo"));
	if (Pablo < 1){
		System.out.println("Introduzca un numero entero positivo");
	}
	
	}while(Pablo < 0);
	
	if(jubilado(Pablo) == false){
		System.out.println("No te puedes jubilar");
	}



do {//Bucle para la entrada del usuario

		Pablo = Integer.parseInt(JOptionPane.showInputDialog("Introduzca edad de Pablo"));
	if (Pablo < 1){
		System.out.println("Introduzca un numero entero positivo");
	}
	}while(Pablo < 0);
	
	if(jubilado(Pablo) == false){
		System.out.println("No te puedes jubilar");
	}


	do {//Bucle para la entrada del usuario

		Pablocotizacion = Integer.parseInt(JOptionPane.showInputDialog("Introduzca años cotizados de Pablo"));
	if (Pablocotizacion < 1){
		System.out.println("Introduzca un numero entero positivo");
	}
	}while(Pablocotizacion < 0);



do {//Bucle para la entrada del usuario

		Pilar = Integer.parseInt(JOptionPane.showInputDialog("Introduzca edad de Pilar"));
	if (Pilar < 0){
		System.out.println("Introduzca un numero entero positivo");
	}
	}while(Pilar < 0);
	
	do {//Bucle para la entrada del usuario

		Pilarcotizacion = Integer.parseInt(JOptionPane.showInputDialog("Introduzca edad de Pilar"));
	if (Pilarcotizacion < 0){
		System.out.println("Introduzca un numero entero positivo");
	}
	}while(Pilarcotizacion < 0);
	
	if(jubilado(Pilar) == false){
		System.out.println("No te puedes jubilar");
	}


	do {//Bucle para la entrada del usuario

		Marcos = Integer.parseInt(JOptionPane.showInputDialog("Introduzca edad de Marcos"));
	if (Marcos < 0){
		System.out.println("Introduzca un numero entero positivo");
	}
	}while(Marcos < 0);
	
	if(jubilado(Marcos) == false){
		System.out.println("No te puedes jubilar");
	}
	
	
	do {//Bucle para la entrada del usuario

		Marcoscotizacion = Integer.parseInt(JOptionPane.showInputDialog("Introduzca años cotizados de Marcos"));
	if (Marcoscotizacion < 0){
		System.out.println("Introduzca un numero entero positivo");
	}
	}while(Marcoscotizacion < 0);	
	

	
	
	
	
	
	do {//Bucle para la entrada del usuario

		Maria  = Integer.parseInt(JOptionPane.showInputDialog("Introduzca edad de Maria"));
	if (Maria  < 0){
		System.out.println("Introduzca un numero entero positivo");
	}
	}while(Maria  < 0);
	
	if(jubilado(Maria) == false){
		System.out.println("No te puedes jubilar");
	}
	
	do {//Bucle para la entrada del usuario

		Mariacotizacion = Integer.parseInt(JOptionPane.showInputDialog("Introduzca años cotizados de Maria"));
	if (Mariacotizacion < 0){
		System.out.println("Introduzca un numero entero positivo");
	}
	}while(Mariacotizacion < 0);
	
	
	
	
	do {//Bucle para la entrada del usuario

		Julia = Integer.parseInt(JOptionPane.showInputDialog("Introduzca edad de Julia"));
	if (Julia < 0){
		System.out.println("Introduzca un numero entero positivo");
	}
	}while(Julia < 0);
	
	if(jubilado(Julia) == false){
		System.out.println("No te puedes jubilar");
	}
	
	do {//Bucle para la entrada del usuario

		Mariacotizacion = Integer.parseInt(JOptionPane.showInputDialog("Introduzca años cotizados de Julia"));
	if (Mariacotizacion < 0){
		System.out.println("Introduzca un numero entero positivo");
	}
	}while(Mariacotizacion < 0);


		
		
		
		
		
	}
	
	public static Boolean jubilado(int edad) {
		if(edad < 21) {
			
			return false;
			
			
		}else {
			
			return true;
			
		}
	}
	
	public static Boolean añoscotizados(int edad) {

	}

}
