package Ejercicios6a10;

import java.util.Scanner;
public class Ejemplo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float realPrice;
		float discountPrice;
		float totalDiscount;
		
		System.out.println("Introduce precio real: ");
		
		Scanner inputValue;
		inputValue=new Scanner (System.in);
		realPrice=inputValue.nextFloat();
		
		
		System.out.println("Introduce precio descuento: ");
		
		discountPrice=inputValue.nextFloat();
		inputValue.close();
		
		totalDiscount=(realPrice-discountPrice)/realPrice*100;
		
		System.out.println("Descuento total del " +totalDiscount +"%");
		
	}

}
