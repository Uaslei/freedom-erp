package org.freedom.persist.entity;

// Generated 14/04/2014 10:17:08 by Hibernate Tools 4.0.0

/**
 * VdclirefpId generated by hbm2java
 */
public class VdclirefpId implements java.io.Serializable {

	private int codcli;
	private short codrefp;
	private short codfilial;
	private int codemp;

	public VdclirefpId() {
	}

	public VdclirefpId(int codcli, short codrefp, short codfilial, int codemp) {
		this.codcli = codcli;
		this.codrefp = codrefp;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	public int getCodcli() {
		return this.codcli;
	}

	public void setCodcli(int codcli) {
		this.codcli = codcli;
	}

	public short getCodrefp() {
		return this.codrefp;
	}

	public void setCodrefp(short codrefp) {
		this.codrefp = codrefp;
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
		if (!(other instanceof VdclirefpId))
			return false;
		VdclirefpId castOther = (VdclirefpId) other;

		return (this.getCodcli() == castOther.getCodcli())
				&& (this.getCodrefp() == castOther.getCodrefp())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodcli();
		result = 37 * result + this.getCodrefp();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}
