package tareasC10;


import javax.swing.JOptionPane;

public class TareasC10_5 {

public void tareasC10_5() {
		
		boolean salir = false;
			
		int numero = 0;

		String Resultado = "";
		
		do{
			
			try {
		
				while (numero != 1001) {
					numero++;
					
					if(esPrimo(numero)) {
						
						
						Resultado = Resultado + numero + " ";	
	
					}
	
					
				}

			
		System.out.println(Resultado);
		
		
		salir = true;
		System.exit(0);//Todo ha salido bien, salir del bucle do
			
		} catch (Exception e) {	
			
			
			JOptionPane.showMessageDialog(null, "VALORES INCORRECTOS", "ERROR",
					JOptionPane.ERROR_MESSAGE);


		}
			
		}while(salir == false);
	
	}


public static boolean esPrimo(int numero){
	  int contador = 2;
	  boolean primo=true;
	  while ((primo) && (contador!=numero)){
	    if (numero % contador == 0)
	      primo = false;
	    contador++;
	  }
	  return primo;
	}	

	
}
