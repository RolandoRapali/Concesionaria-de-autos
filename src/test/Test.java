package test;

import java.util.ArrayList;
import java.util.List;

import modelo.Auto;
import modelo.Moto;
import modelo.Vehiculo;
import modelo.Concesionaria;

public class Test {

	public static void main(String[] args) {
		Concesionaria concesionaria = new Concesionaria(null);
		char letraBuscada = 'y';

		concesionaria.cargarLista();
		concesionaria.mostrarVehiculos();
		System.out.println("===============");
		System.out.print("Vehiculo que contiene en el modelo la letra '" + letraBuscada + "': ");
		for (Vehiculo vehiculos : concesionaria.buscarVehiculo(letraBuscada)) {
			System.out.println(vehiculos.getMarca() + " " + vehiculos.getModelo() + " $" + vehiculos.getPrecio());
		}
		concesionaria.precioMaxYMin();
		System.out.println("===============");
		System.out.println("Vehiculos ordenados por precio de mayor a menor:");
		for (Vehiculo vehiculos : concesionaria.getLstVehiculos()) {
			System.out.println(vehiculos.getMarca() + " " + vehiculos.getModelo());
		}
	}

}
