package org.freedom.persist.entity;

// Generated 30/01/2013 08:30:43 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * VdauxvendaId generated by hbm2java
 */
@Embeddable
public class VdauxvendaId implements java.io.Serializable {

	private int codvenda;
	private short codauxv;
	private char tipovenda;
	private short codfilial;
	private int codemp;

	public VdauxvendaId() {
	}

	public VdauxvendaId(int codvenda, short codauxv, char tipovenda,
			short codfilial, int codemp) {
		this.codvenda = codvenda;
		this.codauxv = codauxv;
		this.tipovenda = tipovenda;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	@Column(name = "CODVENDA", nullable = false)
	public int getCodvenda() {
		return this.codvenda;
	}

	public void setCodvenda(int codvenda) {
		this.codvenda = codvenda;
	}

	@Column(name = "CODAUXV", nullable = false)
	public short getCodauxv() {
		return this.codauxv;
	}

	public void setCodauxv(short codauxv) {
		this.codauxv = codauxv;
	}

	@Column(name = "TIPOVENDA", nullable = false, length = 1)
	public char getTipovenda() {
		return this.tipovenda;
	}

	public void setTipovenda(char tipovenda) {
		this.tipovenda = tipovenda;
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
		if (!(other instanceof VdauxvendaId))
			return false;
		VdauxvendaId castOther = (VdauxvendaId) other;

		return (this.getCodvenda() == castOther.getCodvenda())
				&& (this.getCodauxv() == castOther.getCodauxv())
				&& (this.getTipovenda() == castOther.getTipovenda())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodvenda();
		result = 37 * result + this.getCodauxv();
		result = 37 * result + this.getTipovenda();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}
