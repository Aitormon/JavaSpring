package tareaC6_2;

import javax.swing.*;


public class TareaC6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int salario;
		
		int horas = Integer.parseInt(JOptionPane.showInputDialog("Introduzca Horas Trabajadas"));
		
		if(horas <= 40) {
		salario = (horas * 16);
		}else {
			salario = (40 * 16) + ((horas - 40) * 20);
		}
		
		
		
		
		
			System.out.println("Su salario es");
			System.out.print(salario);
			System.out.print(" Euros");
		
		
		
		
		
		
		
	}

}
