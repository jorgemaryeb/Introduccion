public class Moneda {
	
	public static void main (String args[]) {
		final double EUROS_A_DOLARES = 1.18115;
		final double DOLARES_A_EUROS = 0.85045;
		double euros = 15;
		double dolares = 15;
		System.out.println( euros + "€ son " + (euros * EUROS_A_DOLARES) + "$");
		System.out.println( dolares + "$ son " + (dolares * DOLARES_A_EUROS) + "€");
		
	}
}

