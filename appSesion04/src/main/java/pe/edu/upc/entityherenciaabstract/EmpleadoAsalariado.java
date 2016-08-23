package pe.edu.upc.entityherenciaabstract;

// La clase concreta EmpleadoAsalariado extiende a la clase abstracta Empleado.

public class EmpleadoAsalariado extends Empleado {
	private double salarioSemanal;

	public EmpleadoAsalariado(String primerNombre, String apellidoPaterno, String numeroSeguroSocial,
			 double salarioSemanal) {
		super(primerNombre, apellidoPaterno, numeroSeguroSocial);
		this.salarioSemanal = salarioSemanal;
		// TODO Auto-generated constructor stub
	}

	public double getSalarioSemanal() {
		return salarioSemanal;
	}

	public void setSalarioSemanal(double salarioSemanal) {
		this.salarioSemanal = salarioSemanal;
	}

	@Override
	public double ingresos() {
		// TODO Auto-generated method stub
		return salarioSemanal;
	}

	@Override
	public String toString() {
		return "EmpleadoAsalariado [salarioSemanal=" + salarioSemanal + ", toString()=" + super.toString() + "]";
	}
	
	// String.format( "empleado asalariado: %s\n%s: $%,.2f",

}
