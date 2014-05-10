package org.freedom.persist.entity;

// Generated 10/05/2014 10:27:15 by Hibernate Tools 4.0.0

/**
 * LfserieId generated by hbm2java
 */
public class LfserieId implements java.io.Serializable {

	private String serie;
	private short codfilial;
	private int codemp;

	public LfserieId() {
	}

	public LfserieId(String serie, short codfilial, int codemp) {
		this.serie = serie;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	public String getSerie() {
		return this.serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
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
		if (!(other instanceof LfserieId))
			return false;
		LfserieId castOther = (LfserieId) other;

		return ((this.getSerie() == castOther.getSerie()) || (this.getSerie() != null
				&& castOther.getSerie() != null && this.getSerie().equals(
				castOther.getSerie())))
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getSerie() == null ? 0 : this.getSerie().hashCode());
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}
