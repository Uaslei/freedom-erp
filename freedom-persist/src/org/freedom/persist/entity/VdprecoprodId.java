package org.freedom.persist.entity;

// Generated 30/01/2013 08:30:43 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * VdprecoprodId generated by hbm2java
 */
@Embeddable
public class VdprecoprodId implements java.io.Serializable {

	private int codprecoprod;
	private int codprod;
	private short codfilial;
	private int codemp;

	public VdprecoprodId() {
	}

	public VdprecoprodId(int codprecoprod, int codprod, short codfilial,
			int codemp) {
		this.codprecoprod = codprecoprod;
		this.codprod = codprod;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	@Column(name = "CODPRECOPROD", nullable = false)
	public int getCodprecoprod() {
		return this.codprecoprod;
	}

	public void setCodprecoprod(int codprecoprod) {
		this.codprecoprod = codprecoprod;
	}

	@Column(name = "CODPROD", nullable = false)
	public int getCodprod() {
		return this.codprod;
	}

	public void setCodprod(int codprod) {
		this.codprod = codprod;
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
		if (!(other instanceof VdprecoprodId))
			return false;
		VdprecoprodId castOther = (VdprecoprodId) other;

		return (this.getCodprecoprod() == castOther.getCodprecoprod())
				&& (this.getCodprod() == castOther.getCodprod())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodprecoprod();
		result = 37 * result + this.getCodprod();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}
