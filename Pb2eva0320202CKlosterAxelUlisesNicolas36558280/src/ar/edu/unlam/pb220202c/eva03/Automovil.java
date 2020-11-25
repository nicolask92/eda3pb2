package ar.edu.unlam.pb220202c.eva03;

public class Automovil extends Vehiculo implements Imultable{

	public Automovil(String patente, Integer velocidadActual) {
		super(patente, velocidadActual, velocidadActual);
		limiteVelocidad = 130;
	}

	@Override
	public Boolean enInfraccion() {
		if(getVelocidadActual() > 130) {
			return true;
		} else {
			return false;
		}
	}

	//Si es necesario Utilice herencia o implemente de Interfaces
//	Se debe crear contructeres getters y Setters y loos que crean convenientes
	
//el Limite de velociadad para autos es de 130km
//en caso que supere dicho limite el este sera multado

	
	
   
	
}
