package tareasC10;

import javax.swing.JOptionPane;

public class TareasC10_4 {

	public void tareasC10_4() {
		
		boolean salir = false;
			
		int numero = 0;
		
		String Resultado = "";
		

		do{
		
		try {
			
		do {
		
			numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero entero positivo"));
		if (numero < 1){
			System.err.println("Numero incorrecto");
		}
		
		}while(numero < 1);
		

	    if (numero % 2 == 0) {
	    	Resultado = "El número es par";
	    } else {
	    	Resultado = "El número es impar";
	    }
		
		
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
