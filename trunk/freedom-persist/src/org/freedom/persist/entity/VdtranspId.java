package org.freedom.persist.entity;

// Generated 20/11/2013 10:59:59 by Hibernate Tools 4.0.0

/**
 * VdtranspId generated by hbm2java
 */
public class VdtranspId implements java.io.Serializable {

	private int codtran;
	private short codfilial;
	private int codemp;

	public VdtranspId() {
	}

	public VdtranspId(int codtran, short codfilial, int codemp) {
		this.codtran = codtran;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	public int getCodtran() {
		return this.codtran;
	}

	public void setCodtran(int codtran) {
		this.codtran = codtran;
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
		if (!(other instanceof VdtranspId))
			return false;
		VdtranspId castOther = (VdtranspId) other;

		return (this.getCodtran() == castOther.getCodtran())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodtran();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}
