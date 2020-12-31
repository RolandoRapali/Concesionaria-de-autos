package modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class Concesionaria {
	private List<Vehiculo> lstVehiculos;

	public Concesionaria(List<Vehiculo> lstVehiculos) {
		super();
		this.lstVehiculos = new ArrayList<Vehiculo>();
	}

	public List<Vehiculo> getLstVehiculos() {
		return lstVehiculos;
	}

	public void setLstVehiculos(List<Vehiculo> lstVehiculos) {
		this.lstVehiculos = lstVehiculos;
	}

	public void cargarLista() {
		this.lstVehiculos.add(new Auto("Peugeot", "206", 200000d, 2));
		this.lstVehiculos.add(new Moto("Honda", "Titan", 60000d, 125));
		this.lstVehiculos.add(new Auto("Peugeot", "208", 250000d, 5));
		this.lstVehiculos.add(new Moto("Yamada", "YBR", 80500.5d, 160));
	}

	public void mostrarVehiculos() {
		int contador = 0;
		while (this.lstVehiculos.size() > contador) {
			System.out.println(this.lstVehiculos.get(contador));
			contador++;
		}
	}

	public List<Vehiculo> buscarVehiculo(char letraBuscada) {
		int contador = 0;
		int contadorLetra = 0;
		List<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
		for (Vehiculo vehiculoslst : this.lstVehiculos) {
			while (vehiculoslst.getModelo().length() > contadorLetra) {
				if (vehiculoslst.getModelo().toLowerCase().charAt(contadorLetra) == Character
						.toLowerCase(letraBuscada)) {
					vehiculos.add(vehiculoslst);
				}
				contadorLetra++;
			}
			contador++;
			contadorLetra = 0;
		}
		return vehiculos;
	}

	public void ordenarMaxaMin() {
		this.lstVehiculos.sort((Vehiculo v1, Vehiculo v2) -> (Double.compare(v1.getPrecio(), v2.getPrecio())));
	}

	public void precioMaxYMin() {
		ordenarMaxaMin();
		String precioMaximo = this.lstVehiculos.get(this.lstVehiculos.size() - 1).getMarca().concat(" ")
				.concat(this.lstVehiculos.get(this.lstVehiculos.size() - 1).getModelo());
		String precioMinimo = this.lstVehiculos.get(0).getMarca().concat(" ")
				.concat(this.lstVehiculos.get(0).getModelo());
		System.out.println("Vehiculo mas caro: " + precioMaximo);
		System.out.println("Vehiculo mas barato: " + precioMinimo);
	}
}
