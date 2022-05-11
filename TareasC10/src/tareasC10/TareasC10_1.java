package tareasC10;

import javax.swing.JOptionPane;

public class TareasC10_1 {

	
	public void tareasC10_1() {
		
		boolean salir = false;
			
		byte tabla;
		String resultadofinal = "";


		do{
		
		try {
			
		do {
		
		tabla = Byte.parseByte(JOptionPane.showInputDialog("Introduzca la tabla de multiplicar"));
		if (tabla < 1 || tabla > 10){
			System.out.println("INTRODUZCA UN NUMERO ENTRE EL 1 Y EL 10");
		}

		}while(tabla < 1 || tabla > 10);
		
		
		for(byte x = 1; x < 11; x++) {
		resultadofinal = resultadofinal + tabla + " x " + x + " = " + (x * tabla) + "\n";
			
		}
		
		//System.out.println(resultadofinal);
		JOptionPane.showMessageDialog(null,resultadofinal,"LA TABLA ES",JOptionPane.PLAIN_MESSAGE);
		
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
