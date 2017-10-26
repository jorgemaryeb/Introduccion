public class AreaRectangulo {
	
	public static void main (String args[]) {
		
		double lado1 = cambiarYardasAMetros(4);
		double lado2 = cambiarYardasAMetros(8);
		double area = lado1 * lado2;
		System.out.println("El area es: "+ area + " m²");
		//otra forma
		double lado3 = 8;
		double lado4 = 4;
		double area2 = cambiarYardasAMetros (lado3) * cambiarYardasAMetros (lado4);
		System.out.println(area2);
		
	}
	
	public static double cambiarYardasAMetros (double yardas) {
		double metros = yardas * 0.9144;
		return metros;
	}
	
	//otra forma de hacerlo
	//public static double cambiarYardasAMetros (double yardas) {
		//return yardas * 0.9144;
	//}
	
}

