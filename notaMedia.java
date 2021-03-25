package Ejercicios21a25;

import java.util.Scanner;
public class Ejercicio24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nota;
		int media;
		int total = 0;
		int suma = 0;
		boolean diez = false;
		
		System.out.println ("Introduce tus notas :");
		
		Scanner inputValue=new Scanner(System.in);
		
		do  {
			nota=inputValue.nextInt();
			if (nota>0) {
				total ++;
				suma += nota;
			} if (10==nota) {
				diez = true;
				}
		}while (nota!=-1);
		
		media = suma / total;
		System.out.println ("La nota media es :" +media );

		if (true==diez) {
			System.out.println ("Entre las notas se incluye el 10");
		}

		inputValue.close();
	}

}
