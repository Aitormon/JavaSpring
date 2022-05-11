package iniciacion;

public class MiClaseCoche {
	
	private String marca;
	private String modelo;
	private byte ruedas; //4 o 5
	private short longitud; //mm
	private short anchura;//mm
	private short altura;//mm
	
	public MiClaseCoche(short longitud,short anchura,short altura) {
		
		this.longitud = longitud;
		this.anchura = anchura;
		this.altura = altura;

	}

	public MiClaseCoche(String marca,String modelo,byte ruedas,
			short longitud,short anchura,short altura) {
		
		this.marca = marca = "Citroen";
		this.modelo = modelo = "2 Chevaux";
		this.ruedas = ruedas = 4;
		this.longitud = longitud;
		this.anchura = anchura;
		this.altura = altura;

	}
	
	
	
	public String getMarca() {
		return marca;
	}



	public void setMarca(String marca) {
		this.marca = marca;
	}



	public String getModelo() {
		return modelo;
	}



	public void setModelo(String modelo) {
		this.modelo = modelo;
	}



	public short getLongitud() {
		return longitud;
	}



	public void setLongitud(short longitud) {
		this.longitud = longitud;
	}



	public short getAnchura() {
		return anchura;
	}



	public void setAnchura(short anchura) {
		this.anchura = anchura;
	}



	public short getAltura() {
		return altura;
	}



	public void setAltura(short altura) {
		this.altura = altura;
	}



	public void setRuedas(byte ruedas) {
		if(num < 0 || num > 4) {
			System.out.println("Numero de ruedas incorrecto");	
		}else {
	this.ruedas = num;	
		}
	}



	public byte getRuedas() {
		return ruedas;
		
	}
	

	
}
