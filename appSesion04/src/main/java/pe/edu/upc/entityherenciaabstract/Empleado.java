package pe.edu.upc.entityherenciaabstract;

// La superclase abstracta Empleado.

public abstract class Empleado 
{
   private String primerNombre;
   private String apellidoPaterno;
   private String numeroSeguroSocial;

   // constructor con tres argumentos
   public Empleado( String primerNombre, String apellidoPaterno, String numeroSeguroSocial )
   {
      this.primerNombre = primerNombre;
      this.apellidoPaterno = apellidoPaterno;
      this.numeroSeguroSocial = numeroSeguroSocial;
   } 

   // establece el primer nombre
   public void setPrimerNombre( String primerNombre )
   {
      this.primerNombre = primerNombre;  
   } 

   // devuelve el primer nombre
   public String getPrimerNombre()
   {
      return this.primerNombre;
   } 

   // establece el apellido paterno
   public void setApellidoPaterno( String apellidoPaterno )
   {
      this.apellidoPaterno = apellidoPaterno; 
   } 
   
   // devuelve el apellido paterno
   public String getApellidoPaterno()
   {
      return this.apellidoPaterno;
   } 

   // establece el numero de seguro social
   public void setNumeroSeguroSocial( String numeroSeguroSocial )
   {
      this.numeroSeguroSocial = numeroSeguroSocial; 
   }

   // devuelve el numero de seguro social
   public String getNumeroSeguroSocial()
   {
      return this.numeroSeguroSocial;
   } 

   // devuelve representacion String de un objeto Empleado
   @Override
   public String toString()
   {
      return String.format( "%s %s\nnumero de seguro social: %s", 
         this.getPrimerNombre(), this.getApellidoPaterno(), this.getNumeroSeguroSocial() );
   } 

   // metodo abstracto sobrescrito por las subclases concretas
   public abstract double ingresos(); // aqui no hay implementacion
} 

