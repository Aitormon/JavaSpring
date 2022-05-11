package tareasC10;

import javax.swing.JOptionPane;

public class TareasC10_6 {

public void tareasC10_6() {
		
		boolean salir = false;
		
		boolean salirbucle = false;
			
		int numero = 0;
		
		String Resultado = "";
		
		final short kilometros = 1609;
		

		do{
		
		try {
			
		while(numero != 10){
			numero++;
			if(numero == 1) {
			Resultado = Resultado + numero + " Milla son " + numero * kilometros + "\n";
			}else {
				Resultado = Resultado + numero + " Millas son " + numero * kilometros + "\n";	
			}
			
		}
		
		JOptionPane.showMessageDialog(null,Resultado,"RESULTADO",JOptionPane.PLAIN_MESSAGE);
		
		salir = true;
		System.exit(0);//Todo ha salido bien, salir del bucle do
			
		} catch (Exception e) {	
			
			
			JOptionPane.showMessageDialog(null, "VALORES INCORRECTOS", "ERROR",
					JOptionPane.ERROR_MESSAGE);


			// Block of code to handle errors
		}
			
		}while(salirbucle == false);
			
			
		
		
		
		}
	
	
	
	
}
