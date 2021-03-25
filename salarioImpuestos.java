package Ejercicios16a20;

import java.util.Scanner;
public class Ejercicio19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double precio;
		int horas;
		double bruto;
		double impuestos;
		double neto;
		
		System.out.println("Introduce precio por hora :");
		Scanner inputValue;
		inputValue=new Scanner(System.in);
		precio=inputValue.nextDouble();
		
		System.out.println("Introduce numero de horas :");
		horas=inputValue.nextInt();
		inputValue.close();

		
		if (horas<=35) {
			bruto=precio*horas;
			
		}else {
			bruto=(precio*35)+((horas-35)*1.5 * precio);
		}
		
		
		if (bruto<=500) {
			impuestos=0;
		}else if (bruto<=900){
			impuestos=(bruto-500)*0.25;
			
		}else {
			impuestos=(bruto-900)*0.45;
		
		}
		
		neto=bruto-impuestos;

		System.out.println ("Salario bruto :" +bruto +"€");
		System.out.println ("Salario neto :" +neto +"€");
		System.out.println ("Impuestos :" +impuestos +"€");
		
	}

}
