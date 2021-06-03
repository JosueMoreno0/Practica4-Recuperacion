package app.ito.poo;
import clases.ito.poo.Calzado;
public class MyApp {
	
	static void run() {
		Calzado calzados= (new Calzado(66666,"piel","sinteco",50,new String[]{"Azul","negro","beige","Cafe"}));
		float costoTotal=calzados.costoPorLote(10.0);
		
		System.out.println (calzados);
		System.out.println("Costo de lote:  "+costoTotal);
	}

	public static void main(String[] args) {
		run();
	} 

}
