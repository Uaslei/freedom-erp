package org.freedom.persist.entity;

// Generated 20/11/2013 10:59:59 by Hibernate Tools 4.0.0

/**
 * AtatendimentoId generated by hbm2java
 */
public class AtatendimentoId implements java.io.Serializable {

	private int codatendo;
	private short codfilial;
	private int codemp;

	public AtatendimentoId() {
	}

	public AtatendimentoId(int codatendo, short codfilial, int codemp) {
		this.codatendo = codatendo;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	public int getCodatendo() {
		return this.codatendo;
	}

	public void setCodatendo(int codatendo) {
		this.codatendo = codatendo;
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
		if (!(other instanceof AtatendimentoId))
			return false;
		AtatendimentoId castOther = (AtatendimentoId) other;

		return (this.getCodatendo() == castOther.getCodatendo())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodatendo();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}
