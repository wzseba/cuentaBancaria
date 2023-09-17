package cuentaBancaria;

public class CajaAhorro extends CuentaBancaria {
	public CajaAhorro(long numeroCuenta, double saldo, Titular titular) {
		super(numeroCuenta, saldo, titular);
	}

	public void extraer(double monto) {
		if (saldo >= monto) {
			saldo -= monto;
		}
	}
}
