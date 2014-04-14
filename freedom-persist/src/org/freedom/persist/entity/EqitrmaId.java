package org.freedom.persist.entity;

// Generated 14/04/2014 10:17:08 by Hibernate Tools 4.0.0

/**
 * EqitrmaId generated by hbm2java
 */
public class EqitrmaId implements java.io.Serializable {

	private int codrma;
	private short coditrma;
	private short codfilial;
	private int codemp;

	public EqitrmaId() {
	}

	public EqitrmaId(int codrma, short coditrma, short codfilial, int codemp) {
		this.codrma = codrma;
		this.coditrma = coditrma;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	public int getCodrma() {
		return this.codrma;
	}

	public void setCodrma(int codrma) {
		this.codrma = codrma;
	}

	public short getCoditrma() {
		return this.coditrma;
	}

	public void setCoditrma(short coditrma) {
		this.coditrma = coditrma;
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
		if (!(other instanceof EqitrmaId))
			return false;
		EqitrmaId castOther = (EqitrmaId) other;

		return (this.getCodrma() == castOther.getCodrma())
				&& (this.getCoditrma() == castOther.getCoditrma())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodrma();
		result = 37 * result + this.getCoditrma();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}
