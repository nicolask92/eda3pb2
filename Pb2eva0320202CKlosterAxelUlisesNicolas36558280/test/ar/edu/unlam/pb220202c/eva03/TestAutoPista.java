package ar.edu.unlam.pb220202c.eva03;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestAutoPista {

	@Test
	public void queSePuedaRegistrarTelepase() {
		Autopista autopista = new Autopista();
		Automovil auto = new Automovil("AB-558-DC", 75);
		Boolean agregar = autopista.registrarTelepase(1, auto);

		assertTrue(agregar);
	}

	@Test(expected = VehiculoNotFounException.class)
	public void queAlSalirDelAutopistaNoestaEncirculacionLanceUnaExcepcion() throws VehiculoNotFounException {
		Autopista autopista = new Autopista();

		Automovil auto = new Automovil("AB-558-DC", 75);

		autopista.salirAutpista(auto);
	}

	@Test
	public void queVerifiqueQueSeObtengaUnaListaDeAutosInsfractoresOrdenadaPorPatente() {

	}

	@Test
	public void queDosVehiculosNoPuedanCircularAlMismoTiempo() throws VehiculoNotFounException {
		Autopista autopista = new Autopista();

		Automovil auto = new Automovil("AB-558-DC", 75);
		
		Integer valorEsperado = 1;

		autopista.registrarTelepase(1, auto);
		autopista.ingresarAutopista(1);
		autopista.ingresarAutopista(1);

		assertEquals(valorEsperado, autopista.cantidadDeVehiculosENCirculacion());
	}

	@Test
	public void siSeExcedeLaVelocidadQueMarqueMultado() {
		Automovil auto = new Automovil("AB-558-DC", 140);
		
		assertTrue(auto.enInfraccion());
	}

}
