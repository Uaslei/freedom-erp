package org.freedom.persist.entity;

// Generated 30/01/2013 08:30:43 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * PpopentradaId generated by hbm2java
 */
@Embeddable
public class PpopentradaId implements java.io.Serializable {

	private int codop;
	private short seqop;
	private short seqent;
	private short codfilial;
	private int codemp;

	public PpopentradaId() {
	}

	public PpopentradaId(int codop, short seqop, short seqent, short codfilial,
			int codemp) {
		this.codop = codop;
		this.seqop = seqop;
		this.seqent = seqent;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	@Column(name = "CODOP", nullable = false)
	public int getCodop() {
		return this.codop;
	}

	public void setCodop(int codop) {
		this.codop = codop;
	}

	@Column(name = "SEQOP", nullable = false)
	public short getSeqop() {
		return this.seqop;
	}

	public void setSeqop(short seqop) {
		this.seqop = seqop;
	}

	@Column(name = "SEQENT", nullable = false)
	public short getSeqent() {
		return this.seqent;
	}

	public void setSeqent(short seqent) {
		this.seqent = seqent;
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
		if (!(other instanceof PpopentradaId))
			return false;
		PpopentradaId castOther = (PpopentradaId) other;

		return (this.getCodop() == castOther.getCodop())
				&& (this.getSeqop() == castOther.getSeqop())
				&& (this.getSeqent() == castOther.getSeqent())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodop();
		result = 37 * result + this.getSeqop();
		result = 37 * result + this.getSeqent();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}