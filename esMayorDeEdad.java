package Ejercicios6a10;

import java.util.Scanner;
public class Ejemplo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int edad;
		
		System.out.println("Introduce tu edad : ");
		
		Scanner inputValue;
		inputValue=new Scanner (System.in);
		edad=inputValue.nextInt();
		inputValue.close();
		
		if (edad >= 18) {
			System.out.println ("Eres mayor de edad!");
		}
		
	}

}
