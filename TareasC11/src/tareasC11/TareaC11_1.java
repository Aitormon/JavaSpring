package tareasC11;

import javax.swing.JOptionPane;

public class TareaC11_1 {

public void Tarea_C11_1() {
		
		boolean salir = false;
			
		String mesa1[] = {"Alumno1","Alumno2","Alumno3","Alumno4"};
		String mesa2[] = {"Alumno4","Alumno5","Alumno6","Alumno7"};
		String mesa3[] = {"Alumno8","Alumno9","Alumno10","Alumno11"};
		String mesa4[] = {"Alumno12","Alumno13","Alumno13","Alumno15"};
		
		String Resultado = "";
		

		do{//Bucle principal del metodo
		
		try {//Try principal del metodo
			
		
			

		for(String i : mesa1){
			Resultado = Resultado  + i + " y ";
		}
		
		System.out.printf("La mesa número 1 es compuesta por %s", Resultado);
					
		for(String i : mesa2){
			Resultado = Resultado  + i + " y ";
		}
		
		System.out.printf("La mesa número 2 es compuesta por %s", Resultado);
		
		for(String i : mesa3){
			Resultado = Resultado  + i + " y ";
		}
		
		System.out.printf("La mesa número 3 es compuesta por %s", Resultado);
		
		for(String i : mesa4){
			Resultado = Resultado  + i + " y ";
		}
			
		System.out.printf("La mesa número 4 es compuesta por %s", Resultado);

		
		
		
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
