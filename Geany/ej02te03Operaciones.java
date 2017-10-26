public class  ej02te03Operaciones{
	
	public static void main (String args[]) {
		int a 	 = 1;
		double d = 1.0;
		a = 46/9;
		System.out.println("Valor espserado 5.11111 " + a);
		//se obtiene 5 por que es una operación entre enteros
		a = 46%9 + 4 * 4 -2;
		System.out.println("Valor esperado 15 " + a);
		a = 45 + 43 % 5 * (23 * 3 % 2);
		System.out.println("Valor esperado 48 " + a);
		//en caso de igualdad de prioridades, operamos de izquierda a derecha
		a = 1; //reseteo a valor inicial
		a %= 3 / a + 3; // a = a % (3 / a + 3)
		System.out.println("Valor esperado 1 " + a);
		d= 4 + d * d + 4; //prioridad * sobre +
		System.out.println("Valor esperado 9.0 " + d);
		//el valor es 9.0 porque d es double
		a = 1;
		d = 1.0;
		d += 1.5 * 3 + (++a); // d = d + (1.5 * 3 + (++a))
		System.out.println("Valor esperado 7.5 " + d);
		a = 1;
		d = 1.0;
		d -= 1.5 * 3 + a++; // d = d - (1.5 * 3 + a++)
		System.out.println("Valor esperado -4.5 " + d);
		//al poner el postincremento a valdria 2
		System.out.println("Valor esperado 2 " + a);
	
	}
}

