package Ejercicios16a20;

import java.util.Scanner;
public class Ejercicio20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double precio;
		double descuento;
		double total;
		
		System.out.println("Introduce precio :");
		Scanner inputValue;
		inputValue=new Scanner(System.in);
		precio=inputValue.nextDouble();
		
		if (precio<6) {
			descuento=0;
		}else if (precio<60) {
			descuento=precio*0.05;
		}else {
			descuento=precio*0.1;
		}
		
		total=precio-descuento;
		
		System.out.println("El precio final total es :" +total);
	}

}
// float siempre con f al final sino no compila