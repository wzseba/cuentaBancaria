package cuentaBancaria;

import java.util.Objects;

public class Titular {
	private long cbu;
	private String nom;

	public Titular(long cbu, String nom) {
		this.cbu = cbu;
		this.nom = nom;
	}

	public long getCbu() {
		return cbu;
	}

	public void setCbu(long cbu) {
		this.cbu = cbu;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Titular other = (Titular) obj;
		return cbu == other.cbu && Objects.equals(nom, other.nom);
	}

}
