package org.freedom.persist.entity;

// Generated 12/05/2014 09:11:34 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * LftabicmsId generated by hbm2java
 */
@Embeddable
public class LftabicmsId implements java.io.Serializable {

	private String ufti;
	private int codfilial;
	private int codemp;

	public LftabicmsId() {
	}

	public LftabicmsId(String ufti, int codfilial, int codemp) {
		this.ufti = ufti;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	@Column(name = "UFTI", nullable = false, length = 2)
	public String getUfti() {
		return this.ufti;
	}

	public void setUfti(String ufti) {
		this.ufti = ufti;
	}

	@Column(name = "CODFILIAL", nullable = false)
	public int getCodfilial() {
		return this.codfilial;
	}

	public void setCodfilial(int codfilial) {
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
		if (!(other instanceof LftabicmsId))
			return false;
		LftabicmsId castOther = (LftabicmsId) other;

		return ((this.getUfti() == castOther.getUfti()) || (this.getUfti() != null
				&& castOther.getUfti() != null && this.getUfti().equals(
				castOther.getUfti())))
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getUfti() == null ? 0 : this.getUfti().hashCode());
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}
