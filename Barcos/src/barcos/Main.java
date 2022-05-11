package barcos;


public class Main {

	public static void main(String[] args) {
		
		
		final int puente1_alto = 50;
		final int puente1_ancho = 50;
		final int puente2_alto = 40;
		final int puente2_ancho = 40;
		final int puente3_alto = 30;
		final int puente3_ancho = 60;
		
		Barco nuevobarco1 = new Barco();
		Barco nuevobarco2 = new Barco(10, 20, 50);
		Barco nuevobarco3 = new Barco("Marea",300, 500, 70, (byte)100, (double)55.4);
		
	
		
		System.out.println("El primer barco se llama " + nuevobarco1.getNombre());
		System.out.println("El primer barco tiene una anchura de " + nuevobarco1.getAncho());
		System.out.println("El primer barco tiene una longitud de " + nuevobarco1.getLongitud());
		System.out.println("El primer barco tiene una altura de " + nuevobarco1.getAltura());
		System.out.println("El primer barco tiene " + nuevobarco1.getPlazas() + " plazas");
		System.out.println("El primer barco tiene una potencia de " + nuevobarco1.getPotencia());
		System.out.println();
		
		System.out.println("El segundo barco se llama " + nuevobarco2.getNombre());
		System.out.println("El segundo barco tiene una anchura de " + nuevobarco2.getAncho());
		System.out.println("El segundo barco tiene una longitud de " + nuevobarco2.getLongitud());
		System.out.println("El segundo barco tiene una altura de " + nuevobarco2.getAltura());
		System.out.println("El segundo barco tiene " + nuevobarco2.getPlazas() + " plazas");
		System.out.println("El segundo barco tiene una potencia de " + nuevobarco2.getPotencia());
		System.out.println();
		
		System.out.println("El tercer barco se llama " + nuevobarco3.getNombre());
		System.out.println("El tercer barco tiene una anchura de " + nuevobarco3.getAncho());
		System.out.println("El tercer barco tiene una longitud de " + nuevobarco3.getLongitud());
		System.out.println("El tercer barco tiene una altura de " + nuevobarco3.getAltura());
		System.out.println("El tercer barco tiene " + nuevobarco3.getPlazas() + " plazas");
		System.out.println("El tercer barco tiene una potencia de " + nuevobarco3.getPotencia());
		System.out.println();
		
		if(Barco.barcopasa(nuevobarco1.getAncho(), nuevobarco1.getAltura(),puente1_ancho,puente1_alto) == true){
			System.out.println("El primer barco pasa el primer puente");
		}else{
			System.out.println("El primer barco no puede pasar el primer puente");
		}
		
		if(Barco.barcopasa(nuevobarco1.getAncho(), nuevobarco1.getAltura(),puente2_ancho,puente2_alto) == true){
			System.out.println("El primer barco pasa el segundo puente");
		}else{
			System.out.println("El primer barco no puede pasar el segundo puente");
		}
		
		if(Barco.barcopasa(nuevobarco1.getAncho(), nuevobarco1.getAltura(),puente3_ancho,puente3_alto) == true){
			System.out.println("El primer barco pasa el tercero puente");
		}else{
			System.out.println("El primer barco no puede pasar el tercero puente");
		}
		
		System.out.println();
			
		
		if(Barco.barcopasa(nuevobarco2.getAncho(), nuevobarco1.getAltura(),puente1_ancho,puente2_alto) == true){
			System.out.println("El segundo barco pasa el primer puente");
		}else{
			System.out.println("El segundo barco no puede pasar el primer puente");
		}
		
		if(Barco.barcopasa(nuevobarco2.getAncho(), nuevobarco1.getAltura(),puente2_ancho,puente2_alto) == true){
			System.out.println("El segundo barco pasa el segundo puente");
		}else{
			System.out.println("El segundo barco no puede pasar el segundo puente");
		}
		
		if(Barco.barcopasa(nuevobarco2.getAncho(), nuevobarco1.getAltura(),puente3_ancho,puente3_alto) == true){
			System.out.println("El segundo barco pasa el tercero puente");
		}else{
			System.out.println("El segundo barco no puede pasar el tercero puente");
		}
		
		System.out.println();
		
		if(Barco.barcopasa(nuevobarco3.getAncho(), nuevobarco1.getAltura(),puente1_ancho,puente2_alto) == true){
			System.out.println("El tercer barco pasa el primer puente");
		}else{
			System.out.println("El tercer barco no puede pasar el primer puente");
		}
		
		if(Barco.barcopasa(nuevobarco3.getAncho(), nuevobarco1.getAltura(),puente2_ancho,puente2_alto) == true){
			System.out.println("El tercer barco pasa el segundo puente");
		}else{
			System.out.println("El tercer barco no puede pasar el segundo puente");
		}
		
		if(Barco.barcopasa(nuevobarco3.getAncho(), nuevobarco1.getAltura(),puente3_ancho,puente3_alto) == true){
			System.out.println("El tercer barco pasa el tercero puente");
		}else{
			System.out.println("El tercer barco no puede pasar el tercero puente");
		}
		
		
	}
	


}
