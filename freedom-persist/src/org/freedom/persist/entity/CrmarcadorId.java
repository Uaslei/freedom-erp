package org.freedom.persist.entity;

// Generated 30/01/2013 08:30:43 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * CrmarcadorId generated by hbm2java
 */
@Embeddable
public class CrmarcadorId implements java.io.Serializable {

	private int codmarcor;
	private short codfilial;
	private int codemp;

	public CrmarcadorId() {
	}

	public CrmarcadorId(int codmarcor, short codfilial, int codemp) {
		this.codmarcor = codmarcor;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	@Column(name = "CODMARCOR", nullable = false)
	public int getCodmarcor() {
		return this.codmarcor;
	}

	public void setCodmarcor(int codmarcor) {
		this.codmarcor = codmarcor;
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
		if (!(other instanceof CrmarcadorId))
			return false;
		CrmarcadorId castOther = (CrmarcadorId) other;

		return (this.getCodmarcor() == castOther.getCodmarcor())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodmarcor();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}
