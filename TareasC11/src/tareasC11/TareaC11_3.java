package tareasC11;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.ArrayList;

public class TareaC11_3 {

	

	public void Tarea_C11_3() {
			


			
			String Resultado = "";


			ArrayList<String> Lenguajes = new ArrayList<String>();
			
			Lenguajes.add(0,"Pascal");
			Lenguajes.add(1,"C#");
			Lenguajes.add(2,"HTML");
			Lenguajes.add(3,"Java");
			
			Resultado = Lenguajes.get(2);
			
			JOptionPane.showMessageDialog(null,Resultado,"El tercer elemento es:",JOptionPane.PLAIN_MESSAGE);
			
			Lenguajes.set(2, "Cobol");
			
			for(String i : Lenguajes) {
				if(i == "Java" ) {
			Resultado = i;
				}
			}
			
			JOptionPane.showMessageDialog(null,Resultado,"El tercer elemento ha sido reemplazado por",JOptionPane.PLAIN_MESSAGE);
			
			Resultado = "El elemento no existe";
			
			for(String i : Lenguajes) {
				if(i == "HTML" ) {
			Resultado = i;
				}
			}
			
			JOptionPane.showMessageDialog(null,Resultado,"El elemento no existe",JOptionPane.PLAIN_MESSAGE);
			
			

			System.exit(0);//Todo ha salido bien, salir del bucle do
				

		
		
		
	}
	
	
}
