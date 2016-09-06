package pe.edu.upc.entityherenciaabstract;

// La clase EmpleadoBaseMasComision extiende a EmpleadoPorComision.

public class EmpleadoBaseMasComision extends EmpleadoPorComision 
{
   private double salarioBase; // salario base por semana

   // constructor con seis argumentos
   public EmpleadoBaseMasComision( String primerNombre, String apellidoPaterno, String numeroSeguroSocial, 
		   double ventasBrutas, double tarifaComision, double salario )
   {
      super( primerNombre, apellidoPaterno, numeroSeguroSocial, ventasBrutas, tarifaComision );
      setSalarioBase( salario ); // valida y almacena el salario base
   } 

   // establece el salario base
   public void setSalarioBase( double salarioBase )
   {
      if (salarioBase >= 0.0 )
         this.salarioBase = salarioBase;
      else
         throw new IllegalArgumentException(
            "El salario base debe ser >= 0.0" );
   } 

   // devuelve el salario base
   public double getSalarioBase()
   {
      return this.salarioBase;
   } 

   // calcula los ingresos; sobrescribe el metodo ingresos en EmpleadoPorComision
   @Override
   public double ingresos()
   {
      return getSalarioBase() + super.ingresos();
   } 

   // devuelve representacion String de un objeto EmpleadoBaseMasComision
   @Override
   public String toString()
   {
      return String.format( "%s %s; %s: $%,.2f", 
         "con salario base", super.toString(), 
         "salario base", getSalarioBase() );
   } 
} 


