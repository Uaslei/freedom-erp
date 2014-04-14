package org.freedom.persist.entity;

// Generated 14/04/2014 10:17:08 by Hibernate Tools 4.0.0

import java.math.BigDecimal;

/**
 * VwtmpcustoitrmaId generated by hbm2java
 */
public class VwtmpcustoitrmaId implements java.io.Serializable {

	private Integer codemp;
	private Short codfilial;
	private Integer codrma;
	private Short coditrma;
	private Integer codprod;
	private BigDecimal custodata;

	public VwtmpcustoitrmaId() {
	}

	public VwtmpcustoitrmaId(Integer codemp, Short codfilial, Integer codrma,
			Short coditrma, Integer codprod, BigDecimal custodata) {
		this.codemp = codemp;
		this.codfilial = codfilial;
		this.codrma = codrma;
		this.coditrma = coditrma;
		this.codprod = codprod;
		this.custodata = custodata;
	}

	public Integer getCodemp() {
		return this.codemp;
	}

	public void setCodemp(Integer codemp) {
		this.codemp = codemp;
	}

	public Short getCodfilial() {
		return this.codfilial;
	}

	public void setCodfilial(Short codfilial) {
		this.codfilial = codfilial;
	}

	public Integer getCodrma() {
		return this.codrma;
	}

	public void setCodrma(Integer codrma) {
		this.codrma = codrma;
	}

	public Short getCoditrma() {
		return this.coditrma;
	}

	public void setCoditrma(Short coditrma) {
		this.coditrma = coditrma;
	}

	public Integer getCodprod() {
		return this.codprod;
	}

	public void setCodprod(Integer codprod) {
		this.codprod = codprod;
	}

	public BigDecimal getCustodata() {
		return this.custodata;
	}

	public void setCustodata(BigDecimal custodata) {
		this.custodata = custodata;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof VwtmpcustoitrmaId))
			return false;
		VwtmpcustoitrmaId castOther = (VwtmpcustoitrmaId) other;

		return ((this.getCodemp() == castOther.getCodemp()) || (this
				.getCodemp() != null && castOther.getCodemp() != null && this
				.getCodemp().equals(castOther.getCodemp())))
				&& ((this.getCodfilial() == castOther.getCodfilial()) || (this
						.getCodfilial() != null
						&& castOther.getCodfilial() != null && this
						.getCodfilial().equals(castOther.getCodfilial())))
				&& ((this.getCodrma() == castOther.getCodrma()) || (this
						.getCodrma() != null && castOther.getCodrma() != null && this
						.getCodrma().equals(castOther.getCodrma())))
				&& ((this.getCoditrma() == castOther.getCoditrma()) || (this
						.getCoditrma() != null
						&& castOther.getCoditrma() != null && this
						.getCoditrma().equals(castOther.getCoditrma())))
				&& ((this.getCodprod() == castOther.getCodprod()) || (this
						.getCodprod() != null && castOther.getCodprod() != null && this
						.getCodprod().equals(castOther.getCodprod())))
				&& ((this.getCustodata() == castOther.getCustodata()) || (this
						.getCustodata() != null
						&& castOther.getCustodata() != null && this
						.getCustodata().equals(castOther.getCustodata())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCodemp() == null ? 0 : this.getCodemp().hashCode());
		result = 37 * result
				+ (getCodfilial() == null ? 0 : this.getCodfilial().hashCode());
		result = 37 * result
				+ (getCodrma() == null ? 0 : this.getCodrma().hashCode());
		result = 37 * result
				+ (getCoditrma() == null ? 0 : this.getCoditrma().hashCode());
		result = 37 * result
				+ (getCodprod() == null ? 0 : this.getCodprod().hashCode());
		result = 37 * result
				+ (getCustodata() == null ? 0 : this.getCustodata().hashCode());
		return result;
	}

}
