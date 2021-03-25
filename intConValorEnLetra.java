package Ejercicios11a15;

import java.util.Scanner;
public class Ejercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int valor;
		
		System.out.println ("Introduce valor :");
		
		Scanner inputValue;
		inputValue=new Scanner(System.in);
		valor=inputValue.nextInt();
		inputValue.close();
		
		switch (valor)
		{
		case 1: 
			System.out.println ("uno");
			break;
			
		case 2: 
			System.out.println ("dos");
			break;
			
		case 3: 
			System.out.println ("tres");
			break;
			
		case 4: 
			System.out.println ("cuatro");
			break;
			
		case 5: 
			System.out.println ("cicno");
			break;
			
		case 6: 
			System.out.println ("seis");
			break;
			
		case 7: 
			System.out.println ("siete");
			break;
			
		case 8: 
			System.out.println ("ocho");
			break;
			
		case 9: 
			System.out.println ("nueve");
			break;
		
		default :
			System.out.println ("diez");
		}
		
	}

}
