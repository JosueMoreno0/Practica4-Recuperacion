package app.ito.poo;
import java.time.LocalDate;

import clases.ito.poo.CuentaBancaria;
public class MyApp {
	static void run() {
		CuentaBancaria c=new CuentaBancaria(565865,"Josue Moreno", 10000, LocalDate.of(2021, 10, 10));
	System.out.println(c);
	System.out.println("Se hace un retiro de:  "+c.retiro(1000));
	System.out.println(c);
	System.out.println("Se hace un deposito de:  "+c.deposito(20000));
	System.out.println(c);
	
	}
	public static void main(String []args) {
		run();
		
	}
}
