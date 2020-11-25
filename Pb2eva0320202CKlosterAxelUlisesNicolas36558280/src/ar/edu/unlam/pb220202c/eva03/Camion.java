package ar.edu.unlam.pb220202c.eva03;

public class Camion extends Vehiculo implements Imultable{
	
	private Integer cantidadDeEjes;
	
	public Camion(String patente, Integer velocidadActual, Integer cantidadDeEjes) {
		super(patente, velocidadActual, velocidadActual);
		this.limiteVelocidad = 80;
		this.cantidadDeEjes = cantidadDeEjes;
	}
	
	

	public Integer getCantidadDeEjes() {
		return cantidadDeEjes;
	}



	public void setCantidadDeEjes(Integer cantidadDeEjes) {
		this.cantidadDeEjes = cantidadDeEjes;
	}



	@Override
	public Boolean enInfraccion() {
		if(getVelocidadActual() > 80) {
			return true;
		} else {
			return false;
		}
	}
	//Si es necesario Utilice herencia o implemente de Interfaces
	//Se debe crear contructeres getters y Setters y los que crean conveniente

	//el Limite de velociadad para autos es de 80km
	//en caso que supere dicho limite el este sera multado

	
}
