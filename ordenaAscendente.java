package Ejercicios11a15;

import java.util.Scanner; 
public class Ejemplo11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		int num2;
		
		System.out.println ("Introduce primer numero :");
		
		Scanner inputValue;
		inputValue=new Scanner(System.in);
		num1=inputValue.nextInt();
		
		System.out.println ("Introduce segundo numero :");
		
		num2=inputValue.nextInt();
		inputValue.close();
		
		
		if (num1 > num2) {
			System.out.println (num1 +">" +num2);
			
		}else {
			System.out.println (num2 +">" +num1);
			
		}

	}

}
