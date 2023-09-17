package cuentaBancaria;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CuentaBancariaTest {

	@Test
	public void testTitular() {
		Titular t = new Titular(12345, "Pepe");
	assertEquals(12345, t.getCbu());
	assertEquals("Pepe", t.getNom());
	
	
	CajaAhorro ca = new CajaAhorro(666, 00, t);
	assertEquals(t, ca.getTitular());
	}
}
