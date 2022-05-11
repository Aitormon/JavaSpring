package tareab5_1;
import javax.swing.*;
import java.lang.Integer;

public class Tareab5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String numero1 = JOptionPane.showInputDialog("Introduzca el primer número");
		String numero2 = JOptionPane.showInputDialog("Introduzca el segunda número");
		
		int a = (Integer.parseInt(numero1));
		int b = (Integer.parseInt(numero2));
		
	String resto = (a%b == 0) ? "si es multiplo":"no es multiplo";
	
		System.out.println(resto);
		
		
	}

}
