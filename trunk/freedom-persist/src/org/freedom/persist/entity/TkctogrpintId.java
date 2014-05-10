package org.freedom.persist.entity;

// Generated 10/05/2014 10:27:15 by Hibernate Tools 4.0.0

/**
 * TkctogrpintId generated by hbm2java
 */
public class TkctogrpintId implements java.io.Serializable {

	private int codcto;
	private short codfilial;
	private int codemp;
	private String codgrup;
	private short codfilialgp;
	private int codempgp;

	public TkctogrpintId() {
	}

	public TkctogrpintId(int codcto, short codfilial, int codemp,
			String codgrup, short codfilialgp, int codempgp) {
		this.codcto = codcto;
		this.codfilial = codfilial;
		this.codemp = codemp;
		this.codgrup = codgrup;
		this.codfilialgp = codfilialgp;
		this.codempgp = codempgp;
	}

	public int getCodcto() {
		return this.codcto;
	}

	public void setCodcto(int codcto) {
		this.codcto = codcto;
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

	public String getCodgrup() {
		return this.codgrup;
	}

	public void setCodgrup(String codgrup) {
		this.codgrup = codgrup;
	}

	public short getCodfilialgp() {
		return this.codfilialgp;
	}

	public void setCodfilialgp(short codfilialgp) {
		this.codfilialgp = codfilialgp;
	}

	public int getCodempgp() {
		return this.codempgp;
	}

	public void setCodempgp(int codempgp) {
		this.codempgp = codempgp;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TkctogrpintId))
			return false;
		TkctogrpintId castOther = (TkctogrpintId) other;

		return (this.getCodcto() == castOther.getCodcto())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp())
				&& ((this.getCodgrup() == castOther.getCodgrup()) || (this
						.getCodgrup() != null && castOther.getCodgrup() != null && this
						.getCodgrup().equals(castOther.getCodgrup())))
				&& (this.getCodfilialgp() == castOther.getCodfilialgp())
				&& (this.getCodempgp() == castOther.getCodempgp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodcto();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		result = 37 * result
				+ (getCodgrup() == null ? 0 : this.getCodgrup().hashCode());
		result = 37 * result + this.getCodfilialgp();
		result = 37 * result + this.getCodempgp();
		return result;
	}

}
