package Ejercicios21a25;

import java.util.Scanner;
public class Ejercicio21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int year;

		System.out.println ("Introduce numero del año :");
		
		Scanner inputValue=new Scanner (System.in);
		year=inputValue.nextInt();
		inputValue.close();		
		
		if ((year % 400 == 0) && (year % 100 !=0) ||  (year % 4 == 0)) {
			System.out.println ("El año " +year +" es bisiesto.");
		}else {
			System.out.println ("El año " +year +" no es bisiesto.");
		}
		
	}

}
