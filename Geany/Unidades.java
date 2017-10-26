public class Unidades {
	
	static final double LIBRA_A_KILOGRAMO = 0.453592;
	static final double PIES_A_METROS = 0.3048;
	static final double YARDAS_A_METROS = 0.9144;
	static final double MILLAS_A_METROS = 1609.34;
	static final double ACRES_A_HECTAREAS = 0.404686;
	static final double ONZAS_A_MILILITROS = 29.5735;
	static final double GALONES_A_LITROS = 3.78541;


	public static void main (String args[]) {
		
		cambiarLibraAKilogramo (15);
		cambiarPiesAMetros (15);
		cambiarYardasAMetros (15);
		cambiarMillasAMetros (15);
		cambiarAcresAHectareas (15);
		cambiarOnzasAMililitros (15);
		cambiarGalonesALitros (15);
		
	}
	public static void cambiarLibraAKilogramo (double libras) {
		
	
		System.out.println( libras + " libras son " + ( libras * LIBRA_A_KILOGRAMO ) + " kg");	
			
	}	
		
	public static void cambiarPiesAMetros (double pies){
		
		System.out.println( pies + " pies son " + ( pies * PIES_A_METROS ) + " m");
	
		
	}	
	
	public static void cambiarYardasAMetros (double yardas){
		
		System.out.println( yardas + " yardas son " + ( yardas * YARDAS_A_METROS ) + " m");
	
		
	}
	
	public static void cambiarMillasAMetros (double millas){
		
		System.out.println( millas + " millas son " + ( millas * MILLAS_A_METROS ) + " m");
	
		
	}
	
	public static void cambiarAcresAHectareas (double acres){
		
		System.out.println( acres + " acres son " + ( acres * ACRES_A_HECTAREAS ) + " ha");
	
		
	}
	
	public static void cambiarOnzasAMililitros (double onzas){
		
		System.out.println( onzas + " onzas son " + ( onzas * ONZAS_A_MILILITROS ) + " mL");
	
		
	}
	
	public static void cambiarGalonesALitros (double galones){
		
		System.out.println( galones + " galones son " + ( galones * GALONES_A_LITROS ) + " L");
	
		
	}
	
}

