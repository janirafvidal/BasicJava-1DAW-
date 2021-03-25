package Ejercicios1a5Janira;

import java.util.Scanner;
public class Ejemplo4 {

	public static void main(String[] args) {
		
		float side;
		float squareArea;
		
		System.out.println("Introcude el valor del lado: ");
		
		Scanner inputValue;
		inputValue = new Scanner (System.in);
		side = inputValue.nextFloat();
		inputValue.close();
		
		squareArea = side * side;
		System.out.println("El area del cuadrado es igual a " +squareArea);
		

	}

}
