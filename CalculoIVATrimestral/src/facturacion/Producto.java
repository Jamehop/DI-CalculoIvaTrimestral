package facturacion;

public class Producto 
{
	private double importe;
	private String descripcion;
	private IVA tipoIVA;

	public Producto(double importe, String descripcion) {
		this.importe = importe;
		this.descripcion = descripcion;
	}
	public Producto(double importe, String descripcion, IVA tipoIVA) {
		this.importe = importe;
		this.descripcion = descripcion;
		this.tipoIVA = tipoIVA;
	}

	public double getImporte() {
		return importe;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public IVA getTipoIVA() {
		return tipoIVA;
	}
}

