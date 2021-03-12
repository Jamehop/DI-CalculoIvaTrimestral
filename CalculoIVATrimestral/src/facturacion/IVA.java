package facturacion;

public enum IVA
{
	SUPERREDUCIDO("Super reducido", 4), 
	REDUCIDO("Reducido", 10), 
	NORMAL("Normal", 21);
	
	private final String nombreTipoIVA;
	private final double porcentaje;
	
	private IVA(String nombreTipoIVA, int porcentaje){
		this.nombreTipoIVA = nombreTipoIVA;
		this.porcentaje = porcentaje;
	}

	public String getNombreTipoIVA() {
		return nombreTipoIVA;
	}

	public double getPorcentaje() {
		return porcentaje;
	}
	
}
