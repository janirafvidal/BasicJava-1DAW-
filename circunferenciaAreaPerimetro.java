package Ejercicios6a10;

import java.util.Scanner;
public class Ejemplo6 {
	/**
	 * 
	 * @author 11164700
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double radius;
		double pi; 
		double area; 
		double perimetro; 
		
		System.out.println("Introduce el valor del radio : ");
		
		Scanner inputValue;
		inputValue=new Scanner (System.in);
		radius=inputValue.nextFloat();
		inputValue.close();
		
		//final double pi=3.14159
		pi=3.14159;
		area=pi*radius*radius;
		perimetro=2*pi*radius;
		
		System.out.println("El area es igual a "+area 
						+"   y el perimetro es " +perimetro);
		
		
	}

}
