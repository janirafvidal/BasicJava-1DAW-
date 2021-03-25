package Ejercicios21a25;

import java.util.Scanner;
public class Ejercicio22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		int positivos = 0;
		
		System.out.println ("Introduce valor :");
		
		Scanner inputValue=new Scanner (System.in);
		
		
		
		for (int i=0; i<10; i++) {
			num=inputValue.nextInt();
			if (num>0) {
				positivos ++;
			}
		}
		System.out.println ("Hay " +positivos +" numeros positivos");
		
		inputValue.close();
	}

}
