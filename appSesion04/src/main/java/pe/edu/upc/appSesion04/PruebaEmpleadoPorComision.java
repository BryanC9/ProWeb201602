package pe.edu.upc.appSesion04;

import pe.edu.upc.entity.EmpleadoPorComision;

//Programa de prueba de la clase EmpleadoPorComision.

public class PruebaEmpleadoPorComision {
	public static void main(String[] args) {
		// crea instancia de objeto EmpleadoPorComision
		EmpleadoPorComision empleado = new EmpleadoPorComision("Henry", "Mendoza Puerta", "222-22-2222", 10000, .06);

		// obtiene datos del empleado por comisión
		System.out.println("Informacion del empleado obtenida por los metodos establecer: \n");
		System.out.printf("%s %s\n", "El primer nombre es", empleado.getPrimerNombre());
		System.out.printf("%s %s\n", "El apellido paterno es", empleado.getApellidoPaterno());
		System.out.printf("%s %s\n", "El numero de seguro social es", empleado.getNumeroSeguroSocial());
		System.out.printf("%s %.2f\n", "Las ventas brutas son", empleado.getVentasBrutas());
		System.out.printf("%s %.2f\n", "La tarifa de comision es", empleado.getTarifaComision());

		empleado.setVentasBrutas(500); // establece las ventas brutas
		empleado.setTarifaComision(.1); // establece la tarifa de
												// comisión

		System.out.printf("\n%s:\n\n%s\n", "Informacion actualizada del empleado, obtenida mediante toString",
				empleado);
	} // fin de main
} // fin de la clase PruebaEmpleadoPorComision
