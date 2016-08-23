package pe.edu.upc.entity;
// La clase Factura implementa a PorPagar.

import pe.edu.upc.interfaces.Metodos;
import pe.edu.upc.interfaces.PorPagar;

public class Factura  implements PorPagar, Metodos{
	private String numeroPieza;
	private String descripcionPieza;
	private int cantidad;
	private double precioPorArticulo;

	// constructor con cuatro argumentos
	public Factura(String numeroPieza, String descripcionPieza, int cantidad, double precioPorArticulo) {
		this.numeroPieza = numeroPieza;
		this.descripcionPieza = descripcionPieza;
		setCantidad(cantidad); // valida y almacena la cantidad
		setPrecioPorArticulo(precioPorArticulo); // valida y almacena el precio
													// por art�culo
	}

	// establece el numero de pieza
	public void setNumeroPieza(String pieza) {
		this.numeroPieza = pieza;
	}

	// obtiene el numero de pieza
	public String getNumeroPieza() {
		return this.numeroPieza;
	}

	// establece la descripcion
	public void setDescripcionPieza(String descripcionPieza) {
		this.descripcionPieza = descripcionPieza;
	}

	// obtiene la descripcion
	public String getDescripcionPieza() {
		return this.descripcionPieza;
	}

	// establece la cantidad
	public void setCantidad(int cantidad) {
		if (cantidad >= 0)
			this.cantidad = cantidad;
		else
			throw new IllegalArgumentException("Cantidad debe ser >= 0");
	}

	// obtener cantidad
	public int getCantidad() {
		return this.cantidad;
	}

	// establece el precio por articulo
	public void setPrecioPorArticulo(double precioPorArticulo) {
		if (precioPorArticulo >= 0.0)
			this.precioPorArticulo = precioPorArticulo;
		else
			throw new IllegalArgumentException("El precio por articulo debe ser >= 0");
	}

	// obtiene el precio por articulo
	public double getPrecioPorArticulo() {
		return this.precioPorArticulo;
	}

	// devuelve representacion String de un objeto Factura
	@Override
	public String toString() {
		return String.format("%s: \n%s: %s (%s) \n%s: %d \n%s: $%,.2f", "factura", "numero de pieza", getNumeroPieza(),
				getDescripcionPieza(), "cantidad", getCantidad(), "precio por articulo", getPrecioPorArticulo());
	}

	@Override
	public double obtenerMontoPago() {
		// TODO Auto-generated method stub
		return 0.10*(this.cantidad*this.precioPorArticulo);
	}

	@Override
	public double obtenerMontoPago2() {
		// TODO Auto-generated method stub
		return this.cantidad*this.precioPorArticulo;
	}
	

} // fin de la clase Factura
