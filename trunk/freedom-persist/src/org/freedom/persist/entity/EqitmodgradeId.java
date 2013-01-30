package org.freedom.persist.entity;

// Generated 30/01/2013 08:30:43 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * EqitmodgradeId generated by hbm2java
 */
@Embeddable
public class EqitmodgradeId implements java.io.Serializable {

	private int coditmodg;
	private int codmodg;
	private short codfilial;
	private int codemp;

	public EqitmodgradeId() {
	}

	public EqitmodgradeId(int coditmodg, int codmodg, short codfilial,
			int codemp) {
		this.coditmodg = coditmodg;
		this.codmodg = codmodg;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	@Column(name = "CODITMODG", nullable = false)
	public int getCoditmodg() {
		return this.coditmodg;
	}

	public void setCoditmodg(int coditmodg) {
		this.coditmodg = coditmodg;
	}

	@Column(name = "CODMODG", nullable = false)
	public int getCodmodg() {
		return this.codmodg;
	}

	public void setCodmodg(int codmodg) {
		this.codmodg = codmodg;
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
		if (!(other instanceof EqitmodgradeId))
			return false;
		EqitmodgradeId castOther = (EqitmodgradeId) other;

		return (this.getCoditmodg() == castOther.getCoditmodg())
				&& (this.getCodmodg() == castOther.getCodmodg())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCoditmodg();
		result = 37 * result + this.getCodmodg();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}
