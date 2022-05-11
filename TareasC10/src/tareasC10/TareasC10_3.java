package tareasC10;

import javax.swing.JOptionPane;

public class TareasC10_3 {

	
public void tareasC10_3() {
		
		boolean salir = false;
			
		byte numero = 0;
		String resultadofinal = "";
		boolean salirbucle = false;

		do{
		
		try {
			
	
		while(salirbucle == false) {
			numero++;
	        resultadofinal = resultadofinal + numero + " ";//"\n";
	        if(numero > 99) {
	        	salirbucle = true;
	        }
	    }
		
		
		//System.out.println(resultadofinal);
		JOptionPane.showMessageDialog(null,resultadofinal,"LOS NUMEROS DEL 1 AL 100 SON:",JOptionPane.PLAIN_MESSAGE);
		
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
