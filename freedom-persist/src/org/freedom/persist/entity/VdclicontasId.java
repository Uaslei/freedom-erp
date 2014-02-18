package org.freedom.persist.entity;

// Generated 18/02/2014 15:53:28 by Hibernate Tools 4.0.0

/**
 * VdclicontasId generated by hbm2java
 */
public class VdclicontasId implements java.io.Serializable {

	private int codcli;
	private short codfilial;
	private int codemp;
	private String conta;

	public VdclicontasId() {
	}

	public VdclicontasId(int codcli, short codfilial, int codemp, String conta) {
		this.codcli = codcli;
		this.codfilial = codfilial;
		this.codemp = codemp;
		this.conta = conta;
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

	public String getConta() {
		return this.conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof VdclicontasId))
			return false;
		VdclicontasId castOther = (VdclicontasId) other;

		return (this.getCodcli() == castOther.getCodcli())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp())
				&& ((this.getConta() == castOther.getConta()) || (this
						.getConta() != null && castOther.getConta() != null && this
						.getConta().equals(castOther.getConta())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodcli();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		result = 37 * result
				+ (getConta() == null ? 0 : this.getConta().hashCode());
		return result;
	}

}
