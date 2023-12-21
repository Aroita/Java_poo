package Pasos;

//importar la clase de entrada y salida del teclado:
import java.util.Scanner;

public class Lectuta_teclado {
	
	//declaro una constante
	public static final int SUMAR = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Escribe un numero: ");
		
		//al next se le aplica el tipo de dato
		int num1= teclado.nextInt();
		
		//a la variable num1 recoge el numero por pantalla
		System.out.println(SUMAR+num1);
		//cierra la conexion del scanner para que no consuma recursos
		teclado.close();
		
		

	}

}
