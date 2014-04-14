package org.freedom.persist.entity;

// Generated 14/04/2014 10:17:08 by Hibernate Tools 4.0.0

/**
 * PvcaixaimpId generated by hbm2java
 */
public class PvcaixaimpId implements java.io.Serializable {

	private int codimp;
	private int codcaixa;
	private short codfilial;
	private int codemp;

	public PvcaixaimpId() {
	}

	public PvcaixaimpId(int codimp, int codcaixa, short codfilial, int codemp) {
		this.codimp = codimp;
		this.codcaixa = codcaixa;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	public int getCodimp() {
		return this.codimp;
	}

	public void setCodimp(int codimp) {
		this.codimp = codimp;
	}

	public int getCodcaixa() {
		return this.codcaixa;
	}

	public void setCodcaixa(int codcaixa) {
		this.codcaixa = codcaixa;
	}

	public short getCodfilial() {
		return this.codfilial;
	}

	public void setCodfilial(short codfilial) {
		this.codfilial = codfilial;
	}

	public int getCodemp() {
		return this.codemp;
	}

	public void setCodemp(int codemp) {
		this.codemp = codemp;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PvcaixaimpId))
			return false;
		PvcaixaimpId castOther = (PvcaixaimpId) other;

		return (this.getCodimp() == castOther.getCodimp())
				&& (this.getCodcaixa() == castOther.getCodcaixa())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodimp();
		result = 37 * result + this.getCodcaixa();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}
