package Pasos;



public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int tablas = 1;
		//mientras tabla se mayor o =
		while(tablas <= 10) {
		
		//llamar al metodo(otra pagina class llamada MetodosMultiplicar y el static tablaMultiplicar)
		MetodosMultiplicar.tablaMultiplicar(tablas);
		System.out.println("---------------------");
		tablas++;
		}

	}

}
