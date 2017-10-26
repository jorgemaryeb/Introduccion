public class TestUnidades {
	
	public static void main (String args[]) {
		
		double lado1 = Libreria.cambiarYardasAMetros(4);
		double lado2 = Libreria.cambiarYardasAMetros(8);
		double area = lado1 * lado2;
		System.out.println("El area es: "+ area + " m²");
		//otra forma
		double lado3 = 8;
		double lado4 = 4;
		double area2 = Libreria.cambiarYardasAMetros (lado3) * Libreria.cambiarYardasAMetros (lado4);
		System.out.println(area2);
	
	}
}

