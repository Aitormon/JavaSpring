package iniciacion;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MiClaseCoche renault = new MiClaseCoche("Renault", "R26", 4, 4228 ,1777 ,1437);
		
		System.out.println("Mi coche tiene " + renault.setRuedas() + " ruedas." 
				+ "Es un coche de carrera");
		
		renault.setRuedas(4);
		renault.setLongitud(1000);
		
	}

}
