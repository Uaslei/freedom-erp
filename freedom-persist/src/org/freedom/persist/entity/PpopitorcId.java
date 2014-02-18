package org.freedom.persist.entity;

// Generated 18/02/2014 15:53:28 by Hibernate Tools 4.0.0

/**
 * PpopitorcId generated by hbm2java
 */
public class PpopitorcId implements java.io.Serializable {

	private int codop;
	private short seqop;
	private short codfilial;
	private int codemp;
	private int codorc;
	private int coditorc;
	private char tipoorc;
	private short codfilialoc;
	private int codempoc;

	public PpopitorcId() {
	}

	public PpopitorcId(int codop, short seqop, short codfilial, int codemp,
			int codorc, int coditorc, char tipoorc, short codfilialoc,
			int codempoc) {
		this.codop = codop;
		this.seqop = seqop;
		this.codfilial = codfilial;
		this.codemp = codemp;
		this.codorc = codorc;
		this.coditorc = coditorc;
		this.tipoorc = tipoorc;
		this.codfilialoc = codfilialoc;
		this.codempoc = codempoc;
	}

	public int getCodop() {
		return this.codop;
	}

	public void setCodop(int codop) {
		this.codop = codop;
	}

	public short getSeqop() {
		return this.seqop;
	}

	public void setSeqop(short seqop) {
		this.seqop = seqop;
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

	public int getCodorc() {
		return this.codorc;
	}

	public void setCodorc(int codorc) {
		this.codorc = codorc;
	}

	public int getCoditorc() {
		return this.coditorc;
	}

	public void setCoditorc(int coditorc) {
		this.coditorc = coditorc;
	}

	public char getTipoorc() {
		return this.tipoorc;
	}

	public void setTipoorc(char tipoorc) {
		this.tipoorc = tipoorc;
	}

	public short getCodfilialoc() {
		return this.codfilialoc;
	}

	public void setCodfilialoc(short codfilialoc) {
		this.codfilialoc = codfilialoc;
	}

	public int getCodempoc() {
		return this.codempoc;
	}

	public void setCodempoc(int codempoc) {
		this.codempoc = codempoc;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PpopitorcId))
			return false;
		PpopitorcId castOther = (PpopitorcId) other;

		return (this.getCodop() == castOther.getCodop())
				&& (this.getSeqop() == castOther.getSeqop())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp())
				&& (this.getCodorc() == castOther.getCodorc())
				&& (this.getCoditorc() == castOther.getCoditorc())
				&& (this.getTipoorc() == castOther.getTipoorc())
				&& (this.getCodfilialoc() == castOther.getCodfilialoc())
				&& (this.getCodempoc() == castOther.getCodempoc());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodop();
		result = 37 * result + this.getSeqop();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		result = 37 * result + this.getCodorc();
		result = 37 * result + this.getCoditorc();
		result = 37 * result + this.getTipoorc();
		result = 37 * result + this.getCodfilialoc();
		result = 37 * result + this.getCodempoc();
		return result;
	}

}
