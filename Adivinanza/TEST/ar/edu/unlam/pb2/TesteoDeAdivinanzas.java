package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TesteoDeAdivinanzas {

	@Test //OBLIGATORIO PARA LOS TEST, Sino el m�todo de abajo no lo reconoce como un test.
	public void testDeMetodoNumerosIguales() {
		Adivinanza pruebaUno = new Adivinanza(69); //Creaci�n de objeto, Adivinanza(69) es llamar al m�todo constructor.
		boolean esperado = false; //Le puse false porque abajo al llamar al m�todo numerosIguales, le asigne 32 en vez de 69.
		assertEquals(esperado,pruebaUno.numerosIguales(32));
	}
	@Test
	public void testDeMetodoNumeroMayor(){
		Adivinanza pruebaDos = new Adivinanza(25);
		assertTrue(pruebaDos.valorMayorQueRespuesta(35));//Puse un assertTrue, porque al 35 ser mayor que 25, deberia retornar true.
	}
	@Test
	public void estoNoSeDebeHacerNunca(){			//Esto es lo que se cambia con el ToString 
		Adivinanza pruebaTres = new Adivinanza(124); //Proba a sacarlo y vas a ver que te va a mostrar por consola la direcci�n
		System.out.println(pruebaTres);				//de memoria. En cambio, si lo pones, te muestra el valor de respuesta.
	}
}
