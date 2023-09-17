package cuentaBancaria;

public abstract class CuentaBancaria {
	
	private long numeroCuenta;
	protected double saldo;

	public Titular getTitular() {
		return titular;
	}

	private Titular titular;

	public CuentaBancaria(long numeroCuenta, double saldo, Titular titular) {

		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
		this.titular = titular;
	}

	public double darSaldo() {
		return saldo;
	}

	public void depositar(double monto) {
		saldo = monto;
	}

	public abstract void extraer(double monto);
}
