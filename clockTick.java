package Ejercicios16a20;

import java.util.Scanner;
public class Ejercicio18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int hora;
		int minutos;
		int segundos;
		
		System.out.println ("Introduce la hora :");
		
		Scanner inputValue;
		inputValue=new Scanner(System.in);
		hora=inputValue.nextInt();
		
		
		System.out.println ("Introduce los minutos :");
		
		minutos=inputValue.nextInt();
		
		
		System.out.println ("Introduce los segundos :");
		
		segundos=inputValue.nextInt();
		inputValue.close();
		
		segundos = segundos+1;
				
		if (60 == segundos) {
			segundos = 0;
			minutos = minutos +1;
			}
		if (60 == minutos) {
			minutos = 0;
			hora = hora +1;
		}
		if (24 == hora) {
			hora = 0;
		}
		
		System.out.println (hora +" : " +minutos +" : " +segundos);
	}

}
