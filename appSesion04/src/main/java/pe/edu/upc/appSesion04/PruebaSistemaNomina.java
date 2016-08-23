package pe.edu.upc.appSesion04;

import pe.edu.upc.entityherenciaabstract.EmpleadoBaseMasComision;
import pe.edu.upc.entityherenciaabstract.EmpleadoPorComision;
import pe.edu.upc.entityherenciaabstract.Empleado;
import pe.edu.upc.entityherenciaabstract.EmpleadoAsalariado;
import pe.edu.upc.entityherenciaabstract.EmpleadoPorHoras;

// Programa de prueba para la jerarquia de Empleado.

public class PruebaSistemaNomina {
	public static void main(String[] args) {
		
		// crea objetos de las subclases ( Clases Concretas)
	      Empleado empleadoAsalariado = 
	         new EmpleadoAsalariado( "Henry", "Mendoza Puerta", "111-11-1111", 800.00 );
	      Empleado empleadoPorHoras = 
	         new EmpleadoPorHoras( "Karen", "Rodriguez Sifuentes", "222-22-2222", 16.75, 40 );
	      EmpleadoPorComision empleadoPorComision = 
	         new EmpleadoPorComision( 
	         "Patricia", "Plasencia Burgos", "333-33-3333", 10000, .06 );
	      EmpleadoBaseMasComision empleadoBaseMasComision = 
	         new EmpleadoBaseMasComision( 
	         "Andre", "Lavado Rodriguez", "444-44-4444", 5000, .04, 300 );

	      /*System.out.println( "Empleados procesados por separado:\n" );
	      
	      System.out.printf( "%s\n%s: $%,.2f\n\n", 
	         empleadoAsalariado, "ingresos", empleadoAsalariado.ingresos() );
	      System.out.printf( "%s\n%s: $%,.2f\n\n",
	         empleadoPorHoras, "ingresos", empleadoPorHoras.ingresos() );
	      System.out.printf( "%s\n%s: $%,.2f\n\n",
	         empleadoPorComision, "ingresos", empleadoPorComision.ingresos() );
	      System.out.printf( "%s\n%s: $%,.2f\n\n", 
	         empleadoBaseMasComision, 
	         "ingresos", empleadoBaseMasComision.ingresos() );*/

		// crea un arreglo Empleado de cuatro elementos
	      Empleado[] empleados = new Empleado[ 4 ]; 

	      // inicializa el arreglo con objetos Empleado
	      empleados[ 0 ] = empleadoAsalariado;
	      empleados[ 1 ] = empleadoPorHoras;
	      empleados[ 2 ] = empleadoPorComision; 
	      empleados[ 3 ] = empleadoBaseMasComision;

	     System.out.println( "Empleados procesados en forma polimorfica:\n" );
	      
	      // procesa en forma generica a cada elemento en el arreglo de empleados
	      for ( Empleado empleadoActual : empleados ) 
	      {
	         System.out.println( empleadoActual ); // invoca a toString
	         
	         if(empleadoActual instanceof EmpleadoBaseMasComision)
	         {
	        	 EmpleadoBaseMasComision empleado = (EmpleadoBaseMasComision) empleadoActual;
	        	 empleado.setSalarioBase(1.10*empleado.getSalarioBase());
	        	 System.out.println("Nuevo sueldo base: "+empleado.getSalarioBase());
	         }
	         

	         System.out.printf( 
	            "ingresos $%,.2f\n\n", empleadoActual.ingresos() );
	      } // fin de for

	      
	      
	      
		
	}
}
