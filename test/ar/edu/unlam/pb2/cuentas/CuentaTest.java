package ar.edu.unlam.pb2.cuentas;

import static org.junit.Assert.*;

import org.junit.Test;

public class CuentaTest {

	@Test
	public void testDepositarDineroEnCuentaSueldo() {
		CuentaSueldo miCuenta = new CuentaSueldo(0001, "Rasengan",20000.0);
		miCuenta.depositarDinero(5000.0);
		Double actual = miCuenta.mostrarSaldo();
		Double expected = 25000.0;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testDepositarDineroNegativo() {
		CuentaSueldo miCuenta = new CuentaSueldo(0002,"Chidori",20000.0);
		miCuenta.depositarDinero(-9000.0);
		Double actual = miCuenta.mostrarSaldo();
		Double expected = 20000.0;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testExtraerDinero() {
		CuentaSueldo miCuenta = new CuentaSueldo (0002,"Katon",10000.0);
		miCuenta.extraerDinero(10000.0);
		Double expected = 0.0;
		Double actual = miCuenta.mostrarSaldo();
		assertEquals(expected, actual);
	}
	
	@Test
	public void testExtraerMasDeLoQueTengo() {
		CuentaSueldo miCuenta = new CuentaSueldo (0003,"Kamui",15000.0);
		miCuenta.extraerDinero(20000.0);
		Double expected = 15000.0;
		Double actual = miCuenta.mostrarSaldo();
		assertEquals(expected, actual);
				
	}
	
	@Test
	public void testExtraerConCostoAdicional() {
		CajaDeAhorro miCaja = new CajaDeAhorro(0001,"Makuton",20000.0);
		miCaja.extraerDinero(1000.0);
		miCaja.extraerDinero(1000.0);
		miCaja.extraerDinero(1000.0);
		miCaja.extraerDinero(1000.0);
		miCaja.extraerDinero(1000.0);
		//extraer dos veces con costo adicional
		miCaja.extraerDinero(1000.0);
		miCaja.extraerDinero(1000.0);
		
		Double expected = 12988.0;
		Double actual = miCaja.mostrarSaldo();
		
	}

}
