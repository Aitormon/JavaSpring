package tareasC10;

import javax.swing.JOptionPane;

public class TareasC10_2 {

public void tareasC10_2() {
		
		boolean salir = false;
			
		int numero = 0;
		String resultadofinal = "";
		long factorial = 0;
		int multiplicador = 0;

		do{
		
		try {
			
		do {
		
			numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero positivo"));
		
		if (numero < 1){
			System.out.println("INTRODUZCA UN NUMERO POSITIVO");
		}

		}while(numero < 1);
		
		multiplicador = numero - 1;
		
	    do {
	    	factorial = numero * multiplicador;
	        resultadofinal = resultadofinal + factorial + "\n";
	        multiplicador--;
	    }while(multiplicador != 0);
		
		
		//System.out.println(resultadofinal);
		JOptionPane.showMessageDialog(null,resultadofinal,"LOS FACTORIALES SON",JOptionPane.PLAIN_MESSAGE);
		
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
