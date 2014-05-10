package org.freedom.persist.entity;

// Generated 10/05/2014 10:27:15 by Hibernate Tools 4.0.0

/**
 * SgprocessoId generated by hbm2java
 */
public class SgprocessoId implements java.io.Serializable {

	private int codproc;
	private short codfilial;
	private int codemp;

	public SgprocessoId() {
	}

	public SgprocessoId(int codproc, short codfilial, int codemp) {
		this.codproc = codproc;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	public int getCodproc() {
		return this.codproc;
	}

	public void setCodproc(int codproc) {
		this.codproc = codproc;
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
		if (!(other instanceof SgprocessoId))
			return false;
		SgprocessoId castOther = (SgprocessoId) other;

		return (this.getCodproc() == castOther.getCodproc())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodproc();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}
