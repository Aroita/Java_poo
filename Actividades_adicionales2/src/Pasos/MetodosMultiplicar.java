package Pasos;

import java.util.Scanner;

/*Crear un programa que muestre por pantalla la tabla de multiplicar de un nº dado por teclado.*/

public class MetodosMultiplicar {

	public static void tablaMultiplicar(int num) {
		// TODO Auto-generated method stub
		
		//multiplica nº hasta 10 y el motodo se ejecutara en app.java
		for(int i=0; i<=10; i++) {
			System.out.println( num + " x " + i +" = "+ (num*i));
			
		}
		

	}

}
