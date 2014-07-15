package org.freedom.persist.entity;

// Generated 12/05/2014 09:11:34 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * AtatendoagendaId generated by hbm2java
 */
@Embeddable
public class AtatendoagendaId implements java.io.Serializable {

	private int codatendo;
	private int codemp;
	private short codfilial;
	private int codage;
	private String tipoage;
	private int codagd;
	private short codfilialag;
	private int codempag;

	public AtatendoagendaId() {
	}

	public AtatendoagendaId(int codatendo, int codemp, short codfilial,
			int codage, String tipoage, int codagd, short codfilialag,
			int codempag) {
		this.codatendo = codatendo;
		this.codemp = codemp;
		this.codfilial = codfilial;
		this.codage = codage;
		this.tipoage = tipoage;
		this.codagd = codagd;
		this.codfilialag = codfilialag;
		this.codempag = codempag;
	}

	@Column(name = "CODATENDO", nullable = false)
	public int getCodatendo() {
		return this.codatendo;
	}

	public void setCodatendo(int codatendo) {
		this.codatendo = codatendo;
	}

	@Column(name = "CODEMP", nullable = false)
	public int getCodemp() {
		return this.codemp;
	}

	public void setCodemp(int codemp) {
		this.codemp = codemp;
	}

	@Column(name = "CODFILIAL", nullable = false)
	public short getCodfilial() {
		return this.codfilial;
	}

	public void setCodfilial(short codfilial) {
		this.codfilial = codfilial;
	}

	@Column(name = "CODAGE", nullable = false)
	public int getCodage() {
		return this.codage;
	}

	public void setCodage(int codage) {
		this.codage = codage;
	}

	@Column(name = "TIPOAGE", nullable = false, length = 5)
	public String getTipoage() {
		return this.tipoage;
	}

	public void setTipoage(String tipoage) {
		this.tipoage = tipoage;
	}

	@Column(name = "CODAGD", nullable = false)
	public int getCodagd() {
		return this.codagd;
	}

	public void setCodagd(int codagd) {
		this.codagd = codagd;
	}

	@Column(name = "CODFILIALAG", nullable = false)
	public short getCodfilialag() {
		return this.codfilialag;
	}

	public void setCodfilialag(short codfilialag) {
		this.codfilialag = codfilialag;
	}

	@Column(name = "CODEMPAG", nullable = false)
	public int getCodempag() {
		return this.codempag;
	}

	public void setCodempag(int codempag) {
		this.codempag = codempag;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AtatendoagendaId))
			return false;
		AtatendoagendaId castOther = (AtatendoagendaId) other;

		return (this.getCodatendo() == castOther.getCodatendo())
				&& (this.getCodemp() == castOther.getCodemp())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodage() == castOther.getCodage())
				&& ((this.getTipoage() == castOther.getTipoage()) || (this
						.getTipoage() != null && castOther.getTipoage() != null && this
						.getTipoage().equals(castOther.getTipoage())))
				&& (this.getCodagd() == castOther.getCodagd())
				&& (this.getCodfilialag() == castOther.getCodfilialag())
				&& (this.getCodempag() == castOther.getCodempag());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodatendo();
		result = 37 * result + this.getCodemp();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodage();
		result = 37 * result
				+ (getTipoage() == null ? 0 : this.getTipoage().hashCode());
		result = 37 * result + this.getCodagd();
		result = 37 * result + this.getCodfilialag();
		result = 37 * result + this.getCodempag();
		return result;
	}

}