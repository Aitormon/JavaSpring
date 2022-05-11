package tareasc12;

//import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Tarea_C12_2 {
	
	public int claseeconomica = 0;
	public int primeraclase = 0;
	public byte asientos = 10;
	public byte numero;
	 

	public void TareaC12_2() {
		boolean salir = false;
		
		
	//	String Resultado = "";
		

		//byte plazas = 10;
		

		
		do{
			
			
			if(asientos == 0) {
				JOptionPane.showMessageDialog(null, "El proximo próximo vuelo saldra en 3 horas", "Plazas completas",
						JOptionPane.PLAIN_MESSAGE);
				System.exit(1);
			}
			
			
			
		try {
			
			do {
		
			numero = Byte.parseByte(JOptionPane.showInputDialog("Introduzca el numero de plazas que desa reservar (1 - " + asientos + ")"));
		if (numero < 1 || numero > asientos){
			JOptionPane.showMessageDialog(null, "Lo sentimos, solo quedan " + asientos, "ERROR",
					JOptionPane.ERROR_MESSAGE);
			
		}
		
			
				}while(numero < 1 || numero > asientos);
		
		} catch (Exception e) {	
			
			
			JOptionPane.showMessageDialog(null, "VALORES INCORRECTOS", "ERROR",
					JOptionPane.ERROR_MESSAGE);


			// Block of code to handle errors
		}
		

		
		clase_de_asiento(numero);
		
		JOptionPane.showMessageDialog(null, "Numero de plazas en primera clase:" + primeraclase + " " + "Numero de plazas en clase economica:" + claseeconomica, "Plazas",
				JOptionPane.PLAIN_MESSAGE);
		
		if(asientos != 0) {
		int dialogButton = JOptionPane.YES_NO_OPTION;
		JOptionPane.showConfirmDialog (null, "¿desea reservar mas plazas?","ERROR", dialogButton);	
		if(dialogButton == JOptionPane.YES_OPTION) {
			salir = false;
		}else {
			salir = true;
			System.exit(1);
		}
		}
		
		}while(salir == false);
		
	}

	
	
	
	void clase_de_asiento(byte plazas) {
		
		byte numero = 0;
		boolean valido = true;
		
//		try {
//			
//			do {
		
		do {
		numero = Byte.parseByte(JOptionPane.showInputDialog("En que clase quieres el asiento numero " + plazas + "? 1-Primera Clase 2-Clase"));
		if(numero == 1) {//quiere primera clase
			
			if(primeraclase == 5) {//Esta lleno
			int dialogButton = JOptionPane.YES_NO_OPTION;
			JOptionPane.showConfirmDialog (null, "La primera clase está completa ¿desea reservar ese asiento en clase turista?","ERROR", dialogButton);	
			if(dialogButton == JOptionPane.YES_OPTION) {
				claseeconomica++;
				asientos -= 1;
				plazas -= 1;
			}else {
				JOptionPane.showMessageDialog(null, "El proximo próximo vuelo saldra en 3 horas", "Plazas completas",
						JOptionPane.PLAIN_MESSAGE);
				System.exit(1);
			}
	
			}
			
			primeraclase++;
			asientos -= 1;
			plazas -= 1;
			
			
		}else {//Quiere clase turista
			if(primeraclase == 5) {
			int dialogButton = JOptionPane.YES_NO_OPTION;
			JOptionPane.showConfirmDialog (null, "La clase turista está completa ¿desea reservar ese asiento en segunda clase?","ERROR", dialogButton);	
			if(dialogButton == JOptionPane.YES_OPTION) {
				primeraclase++;
				asientos -= 1;
				plazas -= 1;
			}else {

				JOptionPane.showMessageDialog(null, "El proximo próximo vuelo saldra en 3 horas", "Plazas completas",
						JOptionPane.PLAIN_MESSAGE);
				System.exit(1);
			}
			
			}

		}
		
		claseeconomica++;
		asientos -= 1;
		plazas -= 1;
		
		}while(plazas == 0);
		
		
		
	}


	
	

	

	
}
