package Pasos;

import java.util.Scanner;

public class CompararString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner t = new Scanner(System.in);
		String nombre = t.nextLine();
		String nombre2 = "Blanca";
		
		
		//camapara los string 
		//con metodo equals() muestra true o false
		System.out.println(nombre.equals(nombre2));

	}

}
