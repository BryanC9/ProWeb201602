package pe.edu.upc.entityherenciaabstract;

// La clase EmpleadoPorHoras extiende a Empleado.

public class EmpleadoPorHoras extends Empleado {
	
	private double sueldo; // sueldo por hora
	private double horas; // horas trabajadas por semana
	
	public EmpleadoPorHoras(String primerNombre, String apellidoPaterno, String numeroSeguroSocial, 
			double sueldo, double horas) {
		super(primerNombre, apellidoPaterno, numeroSeguroSocial);
		this.sueldo = sueldo;
		this.horas = horas;
		// TODO Auto-generated constructor stub
	}
	
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}


	public double getHoras() {
		return horas;
	}
	public void setHoras(double horas) {
		this.horas = horas;
	}

	@Override
	public double ingresos() {
		// TODO Auto-generated method stub
	if(getHoras()<=40)
		return getSueldo()*getHoras();
	else
		return 40 * getSueldo() + ( getHoras() - 40 ) * getSueldo() * 1.5;
	}

	@Override
	public String toString() {
		return "EmpleadoPorHoras [sueldo=" + sueldo + ", horas=" + horas + ", toString()=" + super.toString() + "]";
	}

	
	// return 40 * getSueldo() + ( getHoras() - 40 ) * getSueldo() * 1.5;

	// return String.format( "empleado por horas: %s\n%s: $%,.2f; %s: %,.2f",

}
