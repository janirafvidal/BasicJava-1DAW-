package Ejercicios16a20;

import java.util.Scanner;
public class Ejercicio17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int mes;
		
		System.out.println ("Introduce el numero del mes :");
		
		Scanner inputValue;
		inputValue=new Scanner(System.in);
		mes=inputValue.nextInt();
		inputValue.close();
		
		switch (mes) {
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println ("Tiene 30 dias");
			break;
			
		case 2:
			System.out.println ("Tiene 28 dias");
			break;
			
		default:
			System.out.println ("Tiene 31 dias");


		}
		
		
	}

}
