package Ejercicios26a30;

public class Ejercicio29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		boolean esPrimo=true;
		
		for (int num=3; num<=100; num=num+2) {
			esPrimo = true;
			if (num%2!=0) {
				for (int i=3; i<=num/2; i= i+2) {
					if (num%i==0) {
						esPrimo=false;
					}
				}
			}
			
			if (esPrimo) {
				System.out.println( num + " es un numero primo");
			}
		}
	}
}
