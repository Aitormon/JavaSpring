package tareaC7_1;

import javax.swing.*;

public class TareaC7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int tirada1 = Integer.parseInt(JOptionPane.showInputDialog("Haga su primera tirada"));
		int tirada2 = Integer.parseInt(JOptionPane.showInputDialog("Haga su segunda tirada"));
		int tirada3 = Integer.parseInt(JOptionPane.showInputDialog("Haga su tercera tirada"));
		
		if(tirada1 == 6 && tirada2 == 6 && tirada3 == 6) {
		System.out.println("Excelente");
		} else if (tirada1 == 6 && tirada2 == 6 && tirada3 < 6){ 
			System.out.println("Muy Bien");
		}else if (tirada1 == 6 && tirada2 < 6 && tirada3 == 6) {

			System.out.println("Muy Bien");
		}else if (tirada1 < 6 && tirada2 == 6 && tirada3 == 6) {
			
			System.out.println("Muy Bien");
			
		}else if (tirada1 == 6 && tirada2 < 6 && tirada3 < 6){ 
			System.out.println("Regular");
		}else if (tirada1 < 6 && tirada2 == 6 && tirada3 < 6) {

			System.out.println("Regular");
		}else if (tirada1 < 6 && tirada2 < 6 && tirada3 == 6) {
			
			System.out.println("Regular");
		}else if (tirada1 < 6 && tirada2 < 6 && tirada3 < 6) {
			
			System.out.println("Pesimo");
		}
			
			
	}

}
