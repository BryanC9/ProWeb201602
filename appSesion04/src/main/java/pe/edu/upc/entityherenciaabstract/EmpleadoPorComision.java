package pe.edu.upc.entityherenciaabstract;

// La clase EmpleadoPorComision extiende a Empleado.
public class EmpleadoPorComision extends Empleado 
{
   private double ventasBrutas; // ventas totales por semana
   private double tarifaComision; // porcentaje de comision

   // constructor con cinco argumentos
   public EmpleadoPorComision( String primerNombre, String apellidoPaterno, String numeroSeguroSocial, 
      double ventasBrutas, double tarifaComision )
   {
      super( primerNombre, apellidoPaterno, numeroSeguroSocial );
      setVentasBrutas( ventasBrutas );
      setTarifaComision( tarifaComision );
   } 

   // establece la tarifa de comision
   public void setTarifaComision( double tarifaComision )
   {
      if ( tarifaComision > 0.0 && tarifaComision < 1.0 )
         tarifaComision = tarifaComision;
      else
         throw new IllegalArgumentException(
            "La tarifa de comision debe ser > 0.0 y < 1.0" );
   } 
   
   // devuelve la tarifa de comision
   public double getTarifaComision()
   {
      return this.tarifaComision;
   } 

   // establece el monto de ventas brutas
   public void setVentasBrutas( double ventasBrutas )
   {
      if (ventasBrutas >= 0.0 )
         this.ventasBrutas = ventasBrutas;
      else
         throw new IllegalArgumentException(
            "Las ventas brutas deben ser >= 0.0" );
   } 

   // devuelve el monto de ventas brutas
   public double getVentasBrutas()
   {
      return this.ventasBrutas;
   } 

   // calcula los ingresos; sobrescribe el metodo abstracto ingresos en Empleado
   @Override
   public double ingresos()
   {
      return getTarifaComision() * getVentasBrutas();
   } 
   
   // devuelve representacion String de un objeto EmpleadoPorComision
   @Override
   public String toString()
   {
      return String.format( "%s: %s\n%s: $%,.2f; %s: %.2f", 
         "empleado por comision", super.toString(), 
         "ventas brutas", getVentasBrutas(), 
         "tarifa de comision", getTarifaComision() );
   } 
} 

