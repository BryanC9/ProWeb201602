package pe.edu.upc.entity;

// La clase EmpleadoBaseMasComision representa a un empleado que recibe
//un salario base, además de la comisión.

public class EmpleadoBaseMasComision {
	private String primerNombre;
	private String apellidoPaterno;
	private String numeroSeguroSocial;
	private double ventasBrutas; // ventas totales por semana
	private double tarifaComision; // porcentaje de comisión
	private double salarioBase; // salario base por semana

	// constructor con seis argumentos
	public EmpleadoBaseMasComision(String primerNombre, String apellidoPaterno, String numeroSeguroSocial,
			double ventasBrutas, double tarifaComision, double salarioBase) {
		this.primerNombre = primerNombre;
		this.apellidoPaterno = apellidoPaterno;
		this.numeroSeguroSocial = numeroSeguroSocial;
		setVentasBrutas(ventasBrutas); // valida y almacena las ventas brutas
		setTarifaComision(tarifaComision); // valida y almacena la tarifa de
											// comisión
		setSalarioBase(salarioBase); // valida y almacena el salario base
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
		return this.apellidoPaterno;
	}

	// establece el número de seguro social
	public void setNumeroSeguroSocial(String numeroSeguroSocial) {
		this.numeroSeguroSocial = numeroSeguroSocial; // debe validar
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

	// establece el salario base
	public void setSalarioBase(double salarioBase) {
		if (salarioBase >= 0.0)
			this.salarioBase = salarioBase;
		else
			throw new IllegalArgumentException("El salario base debe ser >= 0.0");
	}

	// devuelve el salario base
	public double getSalarioBase() {
		return this.salarioBase;
	}

	// calcula los ingresos
	public double ingresos() {
		return this.salarioBase + (this.tarifaComision * this.ventasBrutas);
	}

	// devuelve representación String de EmpleadoBaseMasComision
	@Override // indica que este método sobrescribe el método de la superclase
	public String toString() {
		return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f\n%s: %.2f", "empleado por comision con sueldo base",
				primerNombre, apellidoPaterno, "numero de seguro social", numeroSeguroSocial, "ventas brutas",
				ventasBrutas, "tarifa de comision", tarifaComision, "salario base", salarioBase);
	}
}
