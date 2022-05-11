package miprimeroproyecto.b;

public class Test {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 20;

		if (num1 > num2) {
			System.out.println("El primer número es el más grande");
		} else if (num1 == num2) {
			System.out.println("El primer número es igual al segundo");
		} else {
			System.out.println("El primer número es inferior al segundo");
		}

		if (num1 != num2) {
			System.out.println("El primer número es distinto al segundo");
		}

		String palabra = "palabra";
		String otraPalabra = "Palabra";

		if (palabra == "palabra" && num1 == 10) {
			System.out.println("Hemos encontrado la solución");
		} 
		
		String miUltimaPalabra = (num1 > num2) ? "palabra" : "cambio de valor";
		System.out.println(miUltimaPalabra);
		
		num1 = 11;
		num1++;
		// num1 vale 12
		System.out.println("num1 vale " + num1);		
		num2 = ++num1;
		System.out.println("num1 vale " + num1 + " y num2 vale " + num2);

		int num3 = 100; 
		int num4 = 200; 
		int num6 = 100; 
		int num5 = 2;
		num3 -= num4; 
		System.out.println("num3 vale " + num3 + " y num4 vale " + num4);
	
		double num7 = (double)num6 / (double)num5;
		System.out.println("num7 vale " + num7);
		System.out.println("num6 vale " + num6);
			
		//CONSTANTES
		final int NUM = 12; 
		int num8 = NUM+12;
		//NUM++;
		num6 = (num6 + 1) + NUM+1; 
		
		num6++; // num6=num6+1; 
		num6--; // num6=num6-1; 
		num6+=num6; //num6=num6+num6;						
	}
}

