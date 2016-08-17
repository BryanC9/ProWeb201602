package pe.edu.upc.entity;

public class Fruta {
	//atributos de instancia
	private String nombre;
	private String color;
	private String sabor;
	private boolean puedoHacerJugo;
	//atributos de clase
	public static String LugarOrigen="UPC";
	
	//Constructor sobrecarga
	public Fruta(){
		this.nombre = "Indefinido";
		this.color = "S/C";
		this.sabor = "S/S";
		this.puedoHacerJugo=false;
	}
	public Fruta(String nombre, String color, String sabor) {
		super();//Heredar constructor clase Padre
		this.nombre = nombre; //this: hacer instancia a los atributos de la clase
		this.color = color;
		this.sabor = sabor;
		this.puedoHacerJugo=false;
	}
	
	//Metodos de acceso a datos (get y set)
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getSabor() {
		return sabor;
	}
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	public boolean isPuedoHacerJugo() {
		return puedoHacerJugo;
	}
	public void setPuedoHacerJugo(boolean puedoHacerJugo) {
		this.puedoHacerJugo = puedoHacerJugo;
	}
	
	//Sobrescritura de metodos heredados
	@Override
	public String toString() {
		return "Fruta [nombre=" + nombre + ", color=" + color + ", sabor=" + sabor + ", puedoHacerJugo="
				+ puedoHacerJugo + "]";
	}
	

}
