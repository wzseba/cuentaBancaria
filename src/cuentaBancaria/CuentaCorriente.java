package cuentaBancaria;

public class CuentaCorriente extends CuentaBancaria {

	public CuentaCorriente(long numeroCuenta, double saldo, Titular titular) {
		super(numeroCuenta, saldo, titular);
	}

	public void extraer(double monto) {
		this.saldo -= monto;
	}
}
