package Ejercicios16a20;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char operacion = ' ';
		String cadena;
		int num1;
		int num2;
		
		System.out.println ("Introduce primer numero :");
		
		Scanner inputValue;
		inputValue=new Scanner (System.in);
		num1=inputValue.nextInt();
		
		System.out.println ("Introduce segundo numero :");
		
		num2=inputValue.nextInt();
		
		System.out.println ("Introduce operaci�n :");
		
		//Scanner reader=new Scanner(System.in);
		cadena=inputValue.next();
	//	reader.close();
		inputValue.close();

		
		operacion = cadena.charAt(0);
		
		switch (operacion) {
		case '+':
			System.out.println (num1+num2);
			break;
		
		case '-':
			System.out.println (num1-num2);
			break;

		case '*':
			System.out.println (num1*num2);
			break;
			
		default:
			System.out.println (num1/num2);
		}
			
		
	}

}
