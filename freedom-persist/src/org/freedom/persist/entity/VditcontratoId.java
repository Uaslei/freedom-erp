package org.freedom.persist.entity;

// Generated 30/01/2013 08:30:43 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * VditcontratoId generated by hbm2java
 */
@Embeddable
public class VditcontratoId implements java.io.Serializable {

	private int codcontr;
	private short coditcontr;
	private short codfilial;
	private int codemp;

	public VditcontratoId() {
	}

	public VditcontratoId(int codcontr, short coditcontr, short codfilial,
			int codemp) {
		this.codcontr = codcontr;
		this.coditcontr = coditcontr;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	@Column(name = "CODCONTR", nullable = false)
	public int getCodcontr() {
		return this.codcontr;
	}

	public void setCodcontr(int codcontr) {
		this.codcontr = codcontr;
	}

	@Column(name = "CODITCONTR", nullable = false)
	public short getCoditcontr() {
		return this.coditcontr;
	}

	public void setCoditcontr(short coditcontr) {
		this.coditcontr = coditcontr;
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
		if (!(other instanceof VditcontratoId))
			return false;
		VditcontratoId castOther = (VditcontratoId) other;

		return (this.getCodcontr() == castOther.getCodcontr())
				&& (this.getCoditcontr() == castOther.getCoditcontr())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodcontr();
		result = 37 * result + this.getCoditcontr();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}
