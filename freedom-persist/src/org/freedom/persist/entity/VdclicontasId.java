package org.freedom.persist.entity;

// Generated 31/05/2013 12:00:37 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * VdclicontasId generated by hbm2java
 */
@Embeddable
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

	@Column(name = "CODCLI", nullable = false)
	public int getCodcli() {
		return this.codcli;
	}

	public void setCodcli(int codcli) {
		this.codcli = codcli;
	}

	@Column(name = "CODFILIAL", nullable = false)
	public short getCodfilial() {
		return this.codfilial;
	}

	public void setCodfilial(short codfilial) {
		this.codfilial = codfilial;
	}

	@Column(name = "CODEMP", nullable = false)
	public int getCodemp() {
		return this.codemp;
	}

	public void setCodemp(int codemp) {
		this.codemp = codemp;
	}

	@Column(name = "CONTA", nullable = false, length = 20)
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
