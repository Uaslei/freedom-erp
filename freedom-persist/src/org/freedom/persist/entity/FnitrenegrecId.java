package org.freedom.persist.entity;

// Generated 18/02/2014 15:53:28 by Hibernate Tools 4.0.0

/**
 * FnitrenegrecId generated by hbm2java
 */
public class FnitrenegrecId implements java.io.Serializable {

	private short coditrenegrec;
	private int codrenegrec;
	private short codfilial;
	private int codemp;

	public FnitrenegrecId() {
	}

	public FnitrenegrecId(short coditrenegrec, int codrenegrec,
			short codfilial, int codemp) {
		this.coditrenegrec = coditrenegrec;
		this.codrenegrec = codrenegrec;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	public short getCoditrenegrec() {
		return this.coditrenegrec;
	}

	public void setCoditrenegrec(short coditrenegrec) {
		this.coditrenegrec = coditrenegrec;
	}

	public int getCodrenegrec() {
		return this.codrenegrec;
	}

	public void setCodrenegrec(int codrenegrec) {
		this.codrenegrec = codrenegrec;
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
		if (!(other instanceof FnitrenegrecId))
			return false;
		FnitrenegrecId castOther = (FnitrenegrecId) other;

		return (this.getCoditrenegrec() == castOther.getCoditrenegrec())
				&& (this.getCodrenegrec() == castOther.getCodrenegrec())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCoditrenegrec();
		result = 37 * result + this.getCodrenegrec();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}
