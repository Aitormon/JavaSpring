package tareasC9;

import javax.swing.JOptionPane;


public class TareasC9_4 {

	
public void tareasC9_4() {
		
		String palabra1 = "";
		String palabra2 = "";
		
		int a = 0;


		try {
			// Block of code to try
			palabra1 = JOptionPane.showInputDialog("Introduzca la primera palabra");
			
			if (palabra1 == ""){
				a = 5 / 0;
			}
			
			palabra2 = JOptionPane.showInputDialog("Introduzca la segunda palabra");

			if (palabra2 == "" ){
				a = 5 / 0;
			}
			
			
			if(palabra1.compareTo(palabra2) == 32 || palabra1.compareTo(palabra2) == -32) {//Son iguales
				System.out.println("Bien - casi lo mismo");
			}else if(palabra1.compareTo(palabra2) == 0){
				System.out.println("Genial – son iguales");
						
			}else if(palabra1.length() == palabra2.length()){
				System.out.println("Al menos tienen la misma longitud");
				
			}else {
				
				System.out.println("¡¡No se parecen en nada!!");
			}
				



		} catch (Exception e) {

			JOptionPane.showMessageDialog(null, "No introduzca cadenas vacías ni números", "ERROR",
					JOptionPane.ERROR_MESSAGE);

			System.exit(-1);
			// Block of code to handle errors
		}
	
}
}
