package org.freedom.persist.entity;

// Generated 31/05/2013 12:00:37 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * VdtipocliId generated by hbm2java
 */
@Embeddable
public class VdtipocliId implements java.io.Serializable {

	private int codtipocli;
	private short codfilial;
	private int codemp;

	public VdtipocliId() {
	}

	public VdtipocliId(int codtipocli, short codfilial, int codemp) {
		this.codtipocli = codtipocli;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	@Column(name = "CODTIPOCLI", nullable = false)
	public int getCodtipocli() {
		return this.codtipocli;
	}

	public void setCodtipocli(int codtipocli) {
		this.codtipocli = codtipocli;
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
		if (!(other instanceof VdtipocliId))
			return false;
		VdtipocliId castOther = (VdtipocliId) other;

		return (this.getCodtipocli() == castOther.getCodtipocli())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodtipocli();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}
