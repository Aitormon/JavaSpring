package tareas_e15;

import javax.swing.JOptionPane;	

public class Alumno {

public String nombre_apellido;


public enum nivel{
	PRIMERO,
	SEGUNDO,
	TERCERO,
	CUARTO,
	QUINTO,
	SEXTO,
}

public Double nota_lengua;
public Double nota_matematicas;
public Double nota_natu;
public Double nota_soci;
byte indicenivel;

public Alumno() {
	nombre_apellido = "DESCONOCIDO";
	indicenivel = 1;
	nota_lengua = 0.0;
	nota_matematicas = 0.0;
	nota_natu = 0.0;
	nota_soci = 0.0;
}

public void Tarea_C11_1() {
	
	boolean salir = false;
		
	int numero = 0;
	
	String Resultado = "";
	


	
		
		
	
	
	JOptionPane.showMessageDialog(null,Resultado,"RESULTADO",JOptionPane.PLAIN_MESSAGE);
	
	salir = true;
	System.exit(0);//Todo ha salido bien, salir del bucle do
		




}














}
