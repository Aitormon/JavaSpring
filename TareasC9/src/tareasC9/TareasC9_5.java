package tareasC9;

import javax.swing.JOptionPane;

public class TareasC9_5 {

	public void tareasC9_5() {
	
	boolean salir = false;
		
	float calorias = 0.0f;
	float peso = 0.0f;
	String actividad = "";
	byte multiplicador = 0;

	do{
	
	try {
		
	do {
	
	peso = Float.parseFloat(JOptionPane.showInputDialog("Introduzca su peso"));
	if (peso < 1.0f || peso > 1000.0f){
		System.out.println("Peso incorrecto");
	}
	
	}while(peso < 1.0f || peso > 1000.0f);
	
	
	do {
	
	actividad = JOptionPane.showInputDialog("Introduzca si es activo o sedentario (a o s)");

	actividad.toLowerCase();
	
	if ((actividad.length() < 1 && actividad.length() > 1) && (actividad.substring(0).equals("a") == false && actividad.substring(0).equals("b")  == false)){
		System.out.println("Introduzca solamente a o s");
	}
	
	
	}while((actividad.length() < 1 && actividad.length() > 1) && (actividad.substring(0).equals("a") == false && actividad.substring(0).equals("b")  == false));
	
		
	if(actividad.equals("a")) {	
		multiplicador = 15;
	}
	
	if(actividad.equals("s")) {	
		multiplicador = 13;
	}
	
	calorias = peso * multiplicador;
	
	
	System.out.printf("Las calorias que deberia consumir son: %.2f", calorias);
	
	salir = true;
	System.exit(0);//Todo ha salido bien, salir del bucle do
		
	} catch (Exception e) {	
		
		
		JOptionPane.showMessageDialog(null, "VALORES INCORRECTOS", "ERROR",
				JOptionPane.ERROR_MESSAGE);


		// Block of code to handle errors
	}
		
	}while(salir == false);
		
		
	}
		
		
	}

