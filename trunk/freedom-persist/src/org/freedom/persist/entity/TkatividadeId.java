package org.freedom.persist.entity;

// Generated 20/11/2013 10:59:59 by Hibernate Tools 4.0.0

/**
 * TkatividadeId generated by hbm2java
 */
public class TkatividadeId implements java.io.Serializable {

	private int codativ;
	private short codfilial;
	private int codemp;

	public TkatividadeId() {
	}

	public TkatividadeId(int codativ, short codfilial, int codemp) {
		this.codativ = codativ;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	public int getCodativ() {
		return this.codativ;
	}

	public void setCodativ(int codativ) {
		this.codativ = codativ;
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
		if (!(other instanceof TkatividadeId))
			return false;
		TkatividadeId castOther = (TkatividadeId) other;

		return (this.getCodativ() == castOther.getCodativ())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodativ();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}
