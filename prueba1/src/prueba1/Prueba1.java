package prueba1;

public class Prueba1 {

	    public static void main(String[] args) {
	        
	        String name = "Fernando";        
	        System.out.println("Mi nombre es " + name);
	        
	        System.out.println("Mi nombre tiene " + name.length() + " caracteres.");
	        
	        System.out.println("La primera letra de tu nombre es " + name.charAt(0)+ ".");
	        
	        System.out.println("La Última letra del nombre es " + name.charAt(name.length())+ ".");
	        
	        String frase = "Hoy es un estupendo día para aprender a programar en JAVA.";
	        
	        String resumen = frase.substring(555, frase.length());        
	        System.out.println(resumen.substring(0,1).toUpperCase()+resumen.substring(1) + ".");
	        
	        String profesor = "Ferdinand";        
	        System.out.println(name.equals(profesor));

	        System.out.println(name.equalsIgnoreCase(profesor));             
	    }
	}


