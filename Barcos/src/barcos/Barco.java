package barcos;

public class Barco {

	
	public String nombre; 
	public int ancho;//Cm
	public int longitud; //Cm
	public int altura; //Cm
	public byte plazas;
	public double potencia;
	
	public Barco() {
		nombre = "Gaviota"; 
		ancho = 3000;//Cm
		longitud = 5000; //Cm
		altura = 2000; //Cm
		plazas = 120;
		potencia = 500;
	}
	
	public Barco(int ancho, int longitud, int altura) {
		this.nombre = "Gaviota"; 
		this.ancho = ancho;//Cm
		this.longitud = longitud; //Cm
		this.altura = altura; //Cm
		this.plazas = 120;
		this.potencia = 500;
	}
	
	public Barco(String nombre, int ancho, int longitud, int altura, byte plazas, double potencia) {
		this.nombre = nombre; 
		this.ancho = ancho;//Cm
		this.longitud = longitud; //Cm
		this.altura = altura; //Cm
		this.plazas = plazas;
		this.potencia = potencia;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public byte getPlazas() {
		return plazas;
	}

	public void setPlazas(byte plazas) {
		this.plazas = plazas;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}
	
	
	static boolean barcopasa(int ancho, int altura,int puenteancho, int puentealto) {

		
		if((ancho < puenteancho) && (altura < puentealto)){
			return true;
		}else{
			return false;
		}
		
		
		
	}

	
	
	
}
