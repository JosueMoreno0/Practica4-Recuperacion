package app.ito.poo;
import clases.ito.poo.Fruta;
public class MyApp {
	
	static void run() {
		
		Fruta f= new Fruta("Pera", 4046, "Japon", 1, 2500, 40000);
		System.out.println(f);
		
		f.agregarPeriodo("10/02/2020", 4f);
		f.agregarPeriodo("04/08/2019", 1f);
		f.agregarPeriodo("07/08/2020", 4.4f);
		
		System.out.println(f);
		System.out.println(f.borrarPeriodo(1));
		
		System.out.println("Costo por cada periodo:  "+f.costoPeriodo(0));
		System.out.println("Ganancias totales por periodo:  "+f.ganancia(0));
	}
	
	
	public static void main (String []args) {
		
		run();
		
	}
}
