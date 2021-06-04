package app.ito.poo;

import clases.ito.poo.cuerpoCeleste;
import clases.ito.poo.ubicacion;
public class MyApp {

	public static void run(){
		
		cuerpoCeleste astro= new cuerpoCeleste("Hélice",new ubicacion(13.943F,98.145F,"Enero, febrero",9000F),"Gaseosa");
		System.out.println(astro);
		
		astro.desplazamiento(100, 500);
		System.out.println(astro);
		
		astro.desplazamiento(200, 750);
		System.out.println(astro);		
	}
	
	
	public static void main(String[] args) {
		run();
	}
}