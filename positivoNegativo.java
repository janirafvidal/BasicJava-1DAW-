package Ejercicios6a10;

import java.util.Scanner;
public class Ejemplo10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int numero;
		
		System.out.println("Introduce el numero : ");
		
		Scanner inputValue;
		inputValue=new Scanner (System.in);
		numero=inputValue.nextInt();
		inputValue.close();
		
		if (numero >= 0) {
			System.out.println ("Es un numero positivo");
		}else {
			System.out.println ("Es un numero negativo");
		}
		
	}

}
