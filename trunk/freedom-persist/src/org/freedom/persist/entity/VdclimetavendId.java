package org.freedom.persist.entity;

// Generated 10/05/2014 10:27:15 by Hibernate Tools 4.0.0

/**
 * VdclimetavendId generated by hbm2java
 */
public class VdclimetavendId implements java.io.Serializable {

	private int codcli;
	private short codfilial;
	private int codemp;
	private short anometavend;

	public VdclimetavendId() {
	}

	public VdclimetavendId(int codcli, short codfilial, int codemp,
			short anometavend) {
		this.codcli = codcli;
		this.codfilial = codfilial;
		this.codemp = codemp;
		this.anometavend = anometavend;
	}

	public int getCodcli() {
		return this.codcli;
	}

	public void setCodcli(int codcli) {
		this.codcli = codcli;
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

	public short getAnometavend() {
		return this.anometavend;
	}

	public void setAnometavend(short anometavend) {
		this.anometavend = anometavend;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof VdclimetavendId))
			return false;
		VdclimetavendId castOther = (VdclimetavendId) other;

		return (this.getCodcli() == castOther.getCodcli())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp())
				&& (this.getAnometavend() == castOther.getAnometavend());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodcli();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		result = 37 * result + this.getAnometavend();
		return result;
	}

}
