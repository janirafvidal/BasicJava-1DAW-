package Ejercicios26a30;

import java.util.Scanner;
public class Ejercicio28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		boolean esPrimo=true;
		
		System.out.println ("Introduce numero : ");
		
		Scanner inputValue=new Scanner (System.in);
		num=inputValue.nextInt();
		
		if (num%2!=0) {
			for (int i=3; i<=num/2; i= i+2) {
			
				if (num%i ==0) {
					esPrimo=false;
				}
			}
		}else {
			esPrimo=false;
		}
			
		
		if (esPrimo) {
			System.out.println("Es un numero primo");
		}else 
			System.out.println("No es un numero primo");
	
		inputValue.close();
	
}

}