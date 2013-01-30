package org.freedom.persist.entity;

// Generated 30/01/2013 08:30:43 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * EqgrupoId generated by hbm2java
 */
@Embeddable
public class EqgrupoId implements java.io.Serializable {

	private String codgrup;
	private short codfilial;
	private int codemp;

	public EqgrupoId() {
	}

	public EqgrupoId(String codgrup, short codfilial, int codemp) {
		this.codgrup = codgrup;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	@Column(name = "CODGRUP", nullable = false, length = 14)
	public String getCodgrup() {
		return this.codgrup;
	}

	public void setCodgrup(String codgrup) {
		this.codgrup = codgrup;
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

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof EqgrupoId))
			return false;
		EqgrupoId castOther = (EqgrupoId) other;

		return ((this.getCodgrup() == castOther.getCodgrup()) || (this
				.getCodgrup() != null && castOther.getCodgrup() != null && this
				.getCodgrup().equals(castOther.getCodgrup())))
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCodgrup() == null ? 0 : this.getCodgrup().hashCode());
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}
