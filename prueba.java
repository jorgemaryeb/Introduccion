public class prueba {
public static void main(String[] args) {
	//Definición de colores y fondo
	String rojo = "\033[31m";
	String fondoRojo = "\033[41m";
	String verde = "\033[32m";
	String fondoVerde = "\033[42m";
	String naranja= "\033[33m";
	String fondoNaranja= "\033[43m";
	String azul = "\033[34m";
	String fondoAzul = "\033[44m";
	String morado = "\033[35m";
	String fondoMorado = "\033[45m";
	String blanco = "\033[37m";
	String fondoBlanco = "\033[47m";
	String negro = "\033[30m";
	String fondoNegro = "\033[40m";
	String defecto = "\033[39m";
	String fondoDefecto = "\033[49m";
	//Mandar a consola datos 
	System.out.println("\n\n"+fondoNaranja + "LUNES\t" + fondoNegro + "MARTES\t"+ fondoRojo+"MIÉRCOLES\t"+fondoAzul+"JUEVES\t"+fondoMorado+"VIERNES");
	System.out.println(rojo+fondoBlanco + "1ª HORA\t" + fondoVerde + "1ª HORA\t"+ fondoNegro+"1ª HORA\t\t"+fondoMorado+"1ª HORA\t"+fondoNaranja+"1ª HORA");
	System.out.println(verde+fondoAzul + "2ª HORA\t" + fondoBlanco + "2ª HORA\t"+ fondoAzul+"2ª HORA\t\t"+fondoNaranja+"2ª HORA\t"+fondoMorado+"2ª HORA");
	System.out.println(azul+fondoNegro + "3ª HORA\t" + fondoMorado + "3ª HORA\t"+ fondoVerde+"3ª HORA\t\t"+fondoNaranja+"3ª HORA\t"+fondoRojo+"3ª HORA");
	System.out.println(defecto+fondoDefecto+"\t\tRECREO\t\t");
	System.out.println(rojo+fondoBlanco + "4ª HORA\t" + fondoVerde + "4ª HORA\t"+ fondoNaranja+"4ª HORA\t\t"+fondoMorado+"4ª HORA\t"+fondoAzul+"4ª HORA");
	System.out.println(naranja+fondoAzul + "5ª HORA\t" + fondoBlanco + "5ª HORA\t"+ fondoAzul+"5ª HORA\t\t"+fondoBlanco+"5ª HORA\t"+fondoNegro+"5ª HORA");
	System.out.println(morado+fondoRojo + "6ª HORA\t" + fondoAzul + "6ª HORA\t"+ fondoVerde+"6ª HORA\t\t"+fondoNaranja+"6ª HORA\t"+fondoVerde+"6ª HORA"+fondoDefecto+defecto+"\n\n");
	}
}

