package ar.edu.unlam.pb220202c.eva03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class Autopista {
	// Si es necesario Utilice herencia o implemente de Interfaces
	// Se debe crear contructeres getters y Setters y los atributos o metodos que
	// crean convenientes
	private HashMap<Integer, Vehiculo> telepase;
	private HashSet<Vehiculo> vehiculosEnCirculacion;

	public Autopista() {
		this.telepase = new HashMap<>();
		this.vehiculosEnCirculacion = new HashSet<>();
	}

	public Boolean registrarTelepase(Integer numeroTelpase, Vehiculo vehiculo) {
		if (!telepase.containsKey(numeroTelpase)) {
			telepase.put(numeroTelpase, vehiculo);
			return true;
		} else {
			return false;
		}
	}

	public Boolean ingresarAutopista(Integer numeroTelepase) throws VehiculoNotFounException {
		// si el telepase no esta registrado lanza una Exceptios del tipo
		// VehiculoNotFounException
		// y no permite ingresar al autopista

		Vehiculo telepase = this.telepase.get(numeroTelepase);
		
		if(telepase == null) {
			throw new VehiculoNotFounException();
		} else {
			return vehiculosEnCirculacion.add(telepase);
		}
	}

	public void salirAutpista(Vehiculo vehiculo) throws VehiculoNotFounException {
		// lanza Una exception VehiculoNotFounException si no esta en circulacion
		if(telepase.containsValue(vehiculo)) {
			telepase.remove(vehiculo);
		} else {
			throw new VehiculoNotFounException();
		}
	}

	public TreeSet<Vehiculo> obtenerVehiculosConExcesosDeVelocidadOrdenadosPorPatente() {

		return null;
	}

	public Integer cantidadDeVehiculosENCirculacion() {

		return vehiculosEnCirculacion.size();
	}

	public Integer cantidadDeVehiculosConTelepase() {
		return telepase.size();
	}

	public void setTelepase(HashMap<Integer, Vehiculo> telepase) {
		this.telepase = telepase;
	}
	
}
