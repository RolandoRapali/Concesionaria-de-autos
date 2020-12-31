package modelo;

public class Auto extends Vehiculo {
	private int puerta;

	public Auto(String marca, String modelo, double precio, int puerta) {
		super(marca, modelo, precio);
		this.puerta = puerta;
	}

	public int getPuerta() {
		return puerta;
	}

	public void setPuerta(int puerta) {
		this.puerta = puerta;
	}

	@Override
	public String toString() {
		return "Marca: " + marca + " // Modelo: " + modelo + " // Puertas: " + puerta + " // Precio: $" + precio;
	}
}
