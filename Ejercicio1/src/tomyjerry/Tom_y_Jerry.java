package tomyjerry;

import javax.swing.JOptionPane;

public class Tom_y_Jerry {

	public static void main(String[] args) {
		
int entrada = 0;//La entrada del numero del usuario
		


do {//Bucle para la entrada del usuario

entrada = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero entero positivo"));
if (entrada < 1){
	System.out.println("Introduzca un numero entero positivo");
}

}while(entrada < 1);

if(resultado(entrada) != "otro") {
System.out.println(resultado(entrada));
}else {
	System.out.println(entrada);	
}

	}
	
	
	public static String resultado(int numero) {
		if(numero % 3 == 0 && numero % 5 == 0) {
			return "Tom y Jerry";
		}
		
		if(numero % 3 == 0) {
				return "Tom";
		}
		
		if(numero % 5 == 0) {
			return "Jerry";
		}

			return "otro";	
	}
	
	
	
	

}
