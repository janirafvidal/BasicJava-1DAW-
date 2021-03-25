package Ejercicios21a25;

import java.util.Scanner;
public class Ejercicio25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		int factorial=1;
		
		System.out.println ("Introduce numero :");
		Scanner inputValue=new Scanner(System.in);
		num=inputValue.nextInt();

		for (int i=2; i<=num; i++) {
			factorial = factorial*i;
		}
			
		System.out.println ("El factorial de " +num +" es " +factorial);
		inputValue.close();
	}

}
