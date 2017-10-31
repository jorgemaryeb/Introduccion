public class TestMatematicas {
	
	public static void main(String args[]){

		int numero = 18;
		boolean resultadoUno = Matematicas.esPar(numero);
		System.out.println("El numero " + numero + " ¿es par? " + resultadoUno);
		
		boolean resultadoDos = Matematicas.esDivsiblePorTres(numero);
		System.out.println("El numero " + numero + " ¿es par? " + resultadoDos);
		
		boolean resultadoTres = Matematicas.esDivsiblePorCinco(numero);
		System.out.println("El numero " + numero + " ¿es par? " + resultadoTres);
	
	}

}
