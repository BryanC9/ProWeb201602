package pe.edu.upc.entity;

// La clase EmpleadoPorComision representa a un empleado por comisión que
//recibe un porcentaje de las ventas brutas.
public class EmpleadoPorComision {
	private String primerNombre;
	private String apellidoPaterno;
	private String numeroSeguroSocial;
	private double ventasBrutas; // ventas semanales totales
	private double tarifaComision; // porcentaje de comisión

	// constructor con cinco argumentos
	public EmpleadoPorComision(String primerNombre, String apellidoPaterno, String numeroSeguroSocial,
			double VentasBrutas, double TarifaComision) {
		this.primerNombre = primerNombre;
		this.apellidoPaterno = apellidoPaterno;
		this.numeroSeguroSocial = numeroSeguroSocial;
		setVentasBrutas(VentasBrutas); // valida y almacena las ventas brutas
		setTarifaComision(TarifaComision); // valida y almacena la tarifa de comisión
	}

	// establece el primer nombre
	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre; 
	}

	// devuelve el primer nombre
	public String getPrimerNombre() {
		return this.primerNombre;
	}

	// establece el apellido paterno
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno; 
	}

	// devuelve el apellido paterno
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	// establece el número de seguro social
	public void setNumeroSeguroSocial(String numeroSeguroSocial) {
		this.numeroSeguroSocial = numeroSeguroSocial; 
	}

	// devuelve el número de seguro social
	public String getNumeroSeguroSocial() {
		return this.numeroSeguroSocial;
	}

	// establece el monto de ventas brutas
	public void setVentasBrutas(double ventasBrutas) {
		if (ventasBrutas >= 0.0)
			this.ventasBrutas = ventasBrutas;
		else
			throw new IllegalArgumentException("Las ventas brutas deben ser >= 0.0");
	}

	// devuelve el monto de ventas brutas
	public double getVentasBrutas() {
		return this.ventasBrutas;
	}

	// establece la tarifa de comisión
	public void setTarifaComision(double tarifaComision) {
		if (tarifaComision > 0.0 && tarifaComision < 1.0)
			this.tarifaComision = tarifaComision;
		else
			throw new IllegalArgumentException("La tarifa de comisión debe ser > 0.0 y < 1.0");
	}

	// devuelve la tarifa de comisión
	public double getTarifaComision() {
		return this.tarifaComision;
	}

	// calcula los ingresos
	public double ingresos() {
		return this.tarifaComision * this.ventasBrutas;
	}

	// devuelve representación String del objeto EmpleadoPorComision
	@Override // indica que este método sobrescribe el método de una superclase
	public String toString() {
		return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f", "empleado por comision", primerNombre,
				apellidoPaterno, "numero de seguro social", numeroSeguroSocial, "ventas brutas", ventasBrutas,
				"tarifa de comision", tarifaComision);
	}
}
