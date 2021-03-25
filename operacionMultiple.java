package Ejercicios1a5Janira;

import java.util.Scanner;
public class Ejemplo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		int num2;
		int suma;
		int resta;
		int multiplicacion;
		int division;
		
		System.out.println("Introduce el primer numero: ");
		
		Scanner inputValue;
		inputValue=new Scanner (System.in);
		num1=inputValue.nextInt();
		
		System.out.println("Introduce el segundo numero: ");
		
		num2=inputValue.nextInt();
		inputValue.close();
		
		suma = num1 + num2;
		resta = num1 - num2;
		multiplicacion = num1 * num2;
		division = num1 / num2;
		
		System.out.println("Suma : " +suma + "  "	
						+ "Resta : " +resta	+ "  " 
						+ "Multiplicaci�n : " +multiplicacion +"  "
						+ "Divisi�n : " +division +"  "); 
	}

}
