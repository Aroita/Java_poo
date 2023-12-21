package Pasos;


import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner t = new Scanner (System.in);
		System.out.println("Dime un nº: ");
		
		int tabla = t.nextInt();
		
		t.close();
		
		//llamar al metodo(otra pagina class llamada MetodosMultiplicar y el static tablaMultiplicar)
		MetodosMultiplicar.tablaMultiplicar(tabla);

	}

}
