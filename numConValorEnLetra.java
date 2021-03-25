package Ejercicios11a15;

import java.util.Scanner;
public class Ejemplo14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nota;
		
		System.out.println ("Introduce tu nota : ");
		
		Scanner inputValue;
		inputValue=new Scanner(System.in);
		nota=inputValue.nextInt();
		inputValue.close();
			
		
		if (nota < 3) {
			System.out.println ("Muy Deficiente");
				
		}else if (nota < 5) {
			System.out.println ("Insuficiente");
			
		}else if (nota < 6) {
			System.out.println ("Suficiente");
			
		}else if (nota < 7) {
			System.out.println ("Bien");
			
		}else if (nota < 9) {
			System.out.println ("Notable");
			
		}else {
			System.out.println ("Sobresaliente");
	
		}
		
			
		
	}

}
