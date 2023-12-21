package Paso;
import java.util.Scanner;

/*programa que pregunte al usuario una cantidad a invertir, el interes anual y 
 * nº de años y que muestre el capital obtenido en la inversion cada año.*/

public class Interese_capital {

	public static void main(String[] args) {
		
		Scanner t= new Scanner(System.in);
		
		System.out.println("dime el capital");
		double capital=t.nextDouble();
		
		System.out.println("dime el interes anual");
		double interes = t.nextDouble();
		
		System.out.println("dime el nº de anios");
		int anios =t.nextInt();
		
		
		for(int i=1; i<=anios; i++) {
			double renta = capital*interes/100;
			System.out.println("capital obtenido en año" + i + " = " + renta);
			capital +=renta;
			//capital=capital+renta; (hace lo mismo q la de arriba cappita +=renta)
			
			
			
			
		}
	
	
	}

}
