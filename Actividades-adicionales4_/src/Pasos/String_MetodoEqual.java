package Pasos;
import java.util.Scanner;

/*Escribe un programa que muestre por pantalla el eco de todo lo que el usuario 
 * introduzca hasta que escriba "salir" y terminara.*/

public class String_MetodoEqual {

	public static void main(String[] args) {
		Scanner t =new Scanner(System.in);
		
		String palabra;
		//buvle do while se ejecuta de 1 a x veces
		do {
			System.out.println("dime una palabra:");
			//y la guardamos en la variable palabra
			palabra = t.next();
			System.out.println("eco "+ palabra);
			
		}while(!palabra.equals("salir") );
		
		t.close();

	}

}
