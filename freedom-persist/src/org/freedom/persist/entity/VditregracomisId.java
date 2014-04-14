package org.freedom.persist.entity;

// Generated 14/04/2014 10:17:08 by Hibernate Tools 4.0.0

/**
 * VditregracomisId generated by hbm2java
 */
public class VditregracomisId implements java.io.Serializable {

	private int codregrcomis;
	private short seqitrc;
	private short codfilial;
	private int codemp;

	public VditregracomisId() {
	}

	public VditregracomisId(int codregrcomis, short seqitrc, short codfilial,
			int codemp) {
		this.codregrcomis = codregrcomis;
		this.seqitrc = seqitrc;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	public int getCodregrcomis() {
		return this.codregrcomis;
	}

	public void setCodregrcomis(int codregrcomis) {
		this.codregrcomis = codregrcomis;
	}

	public short getSeqitrc() {
		return this.seqitrc;
	}

	public void setSeqitrc(short seqitrc) {
		this.seqitrc = seqitrc;
	}

	public short getCodfilial() {
		return this.codfilial;
	}

	public void setCodfilial(short codfilial) {
		this.codfilial = codfilial;
	}

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
		if (!(other instanceof VditregracomisId))
			return false;
		VditregracomisId castOther = (VditregracomisId) other;

		return (this.getCodregrcomis() == castOther.getCodregrcomis())
				&& (this.getSeqitrc() == castOther.getSeqitrc())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodregrcomis();
		result = 37 * result + this.getSeqitrc();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}
