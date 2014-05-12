package org.freedom.persist.entity;

// Generated 12/05/2014 09:11:34 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * AtatendimentoitrecId generated by hbm2java
 */
@Embeddable
public class AtatendimentoitrecId implements java.io.Serializable {

	private int codatendo;
	private short codfilial;
	private int codemp;
	private int codrec;
	private int nparcitrec;
	private short codfilialir;
	private int codempir;

	public AtatendimentoitrecId() {
	}

	public AtatendimentoitrecId(int codatendo, short codfilial, int codemp,
			int codrec, int nparcitrec, short codfilialir, int codempir) {
		this.codatendo = codatendo;
		this.codfilial = codfilial;
		this.codemp = codemp;
		this.codrec = codrec;
		this.nparcitrec = nparcitrec;
		this.codfilialir = codfilialir;
		this.codempir = codempir;
	}

	@Column(name = "CODATENDO", nullable = false)
	public int getCodatendo() {
		return this.codatendo;
	}

	public void setCodatendo(int codatendo) {
		this.codatendo = codatendo;
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

	@Column(name = "CODREC", nullable = false)
	public int getCodrec() {
		return this.codrec;
	}

	public void setCodrec(int codrec) {
		this.codrec = codrec;
	}

	@Column(name = "NPARCITREC", nullable = false)
	public int getNparcitrec() {
		return this.nparcitrec;
	}

	public void setNparcitrec(int nparcitrec) {
		this.nparcitrec = nparcitrec;
	}

	@Column(name = "CODFILIALIR", nullable = false)
	public short getCodfilialir() {
		return this.codfilialir;
	}

	public void setCodfilialir(short codfilialir) {
		this.codfilialir = codfilialir;
	}

	@Column(name = "CODEMPIR", nullable = false)
	public int getCodempir() {
		return this.codempir;
	}

	public void setCodempir(int codempir) {
		this.codempir = codempir;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AtatendimentoitrecId))
			return false;
		AtatendimentoitrecId castOther = (AtatendimentoitrecId) other;

		return (this.getCodatendo() == castOther.getCodatendo())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp())
				&& (this.getCodrec() == castOther.getCodrec())
				&& (this.getNparcitrec() == castOther.getNparcitrec())
				&& (this.getCodfilialir() == castOther.getCodfilialir())
				&& (this.getCodempir() == castOther.getCodempir());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodatendo();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		result = 37 * result + this.getCodrec();
		result = 37 * result + this.getNparcitrec();
		result = 37 * result + this.getCodfilialir();
		result = 37 * result + this.getCodempir();
		return result;
	}

}
