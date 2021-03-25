package Ejercicios26a30;

import java.util.Scanner;
public class Ejercicio26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		int multiplicador=0;
		
		Scanner inputValue=new Scanner (System.in);
		
		System.out.println ("Introduce numero :");
		num=inputValue.nextInt();
		inputValue.close();
		
		System.out.println ("Tabla del " +num);
		
		for (int i=1; i<=10; i++) {
			multiplicador++;
			System.out.println (num +" x " +multiplicador +" = " +(num*multiplicador));
		}
	}

}
