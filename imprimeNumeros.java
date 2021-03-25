package Ejercicios26a30;

import java.util.Scanner;
public class Ejercicio27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		
		System.out.println ("Introduce numero :");
		
		Scanner inputValue=new Scanner(System.in);
		num=inputValue.nextInt();
		inputValue.close();
		
		for (int i=1; i<=num; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print (j+" ");
			}
			System.out.println ("");
		}
		
	}

}
