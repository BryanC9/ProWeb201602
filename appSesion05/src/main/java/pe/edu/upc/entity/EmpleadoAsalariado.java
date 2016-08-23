package pe.edu.upc.entity;
// La clase EmpleadoAsalariado extiende a Empleado, que implementa a PorPagar.

public class EmpleadoAsalariado extends Empleado 
{
   private double salarioSemanal;

   // constructor con cuatro argumentos
   public EmpleadoAsalariado(String primerNombre, String apellidoPaterno, String numeroSeguroSocial,
      double salarioSemanal )
   {
      super( primerNombre, apellidoPaterno, numeroSeguroSocial ); // pasa argumentos al constructor de Empleado
      setSalarioSemanal( salarioSemanal ); // valida y almacena el salario
   } 

   // establece el salario
   public void setSalarioSemanal( double salarioSemanal )
   {
      if (salarioSemanal >= 0.0 )
         this.salarioSemanal = salarioSemanal;
      else
         throw new IllegalArgumentException(
            "El salario semanal debe ser >= 0.0" );
   } 

   // devuelve el salario
   public double getSalarioSemanal()
   {
      return salarioSemanal;
   } 

   

   // devuelve representacion String de un objeto EmpleadoAsalariado
   @Override
   public String toString()
   {
      return String.format( "empleado asalariado: %s\n%s: $%,.2f", 
         super.toString(), "salario semanal", getSalarioSemanal() );
   }

@Override
public double obtenerMontoPago() {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public double obtenerMontoPago2() {
	// TODO Auto-generated method stub
	return 0;
}


   
} 

