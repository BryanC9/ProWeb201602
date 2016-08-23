package pe.edu.upc.interfaces;

public interface PorPagar {

	//static: el dato es global
	//final: el dato es constante
	static final double  IVG = 0.18;
	double obtenerMontoPago();
}
