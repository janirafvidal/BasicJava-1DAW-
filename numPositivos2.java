package Ejercicios21a25;

import java.util.Scanner;

public class Ejercicio23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int num;
		int positivos = 0;
		
		Scanner inputValue=new Scanner (System.in);
		
		System.out.println ("Introduce numeros :");
		
		do  {
			num=inputValue.nextInt();
			if (num>0) {
				positivos ++;
			}
		}while (num!=0);
			
		
		System.out.println ("Hay " +positivos +" numeros positivos");
		
		inputValue.close();
	}

}

