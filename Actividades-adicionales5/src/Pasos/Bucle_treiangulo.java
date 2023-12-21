package Pasos;
import java.util.Scanner;

/*Escribe un programa que al usuario un nº entero y muestre por pantalla un 
 * triangulo rectangulo de asteriscos*, de altura el nº introducido.
 * */

public class Bucle_treiangulo {

	public static void main(String[] args) {
		Scanner t =new Scanner(System.in);
		
		System.out.println("dime un nº para la priramide ");
		
		int num1=t.nextInt();
		
		
		//bucle anidade uno filas y otro columnas
		for(int i=1; i< num1+1; i++) {  //este for: recorre las filas
			for(int j=0; j<i; j++) {  //este for: recorre columnas
				System.out.print(" * ");
			}
			System.out.println();
		}//cierre de for
		
		
		
		t.close();

	}

}
