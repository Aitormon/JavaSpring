package tareasC11;

import javax.swing.JOptionPane;



public class TareaC11_2 {

public void Tarea_C11_2() {
		
		boolean salir = false;
			
		int mes = 0;
		
		int dias[] = {31,28,31,30,31,30,30,31,30,31,30,31};
		
		String Resultado = "";
		

		do{//Bucle principal del metodo
		
		try {//Try principal del metodo
			
			do {
				
			mes = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un mes 1-12"));
				
			if (mes < 1 || mes > 12){
				System.err.println("Introduzca un mes 1-12");
			}
			
			}while(mes < 1 || mes > 12);

		
		Resultado = "Ese mes tiene " + dias[mes-1] + " dias";	

		
		JOptionPane.showMessageDialog(null,Resultado,"RESULTADO",JOptionPane.PLAIN_MESSAGE);
		
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
