package Pasos;

import java.util.Scanner;

public class if_else_basico {

	public static void main(String[] args) {
		/* escribe un programa que pida al usuario un nº entero positivo y muestre por pantalla
		la cuenta atras desde ese nº hasta cero separados por comas.
		*/
		Scanner t= new Scanner(System.in);
		System.out.println("dime un nº positivo: ");
		//el nº escrito se almacena en la variable num
		int num=t.nextInt();
		
		
		//comprobar que el nº sea entero positivo con if/else
		if(num>0) {
			
			//ejecuta
			while(num > 0) {
				System.out.println(num + ", ");
				num--; //es igual que num = num1
			}
			System.out.println(0);
		//else si no es nº psoitivo	
		}else
			System.out.println("el nº no es correcto");
		
		
		
		
		t.close();
		
	}

}
