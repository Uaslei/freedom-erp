package org.freedom.persist.entity;

// Generated 30/01/2013 08:30:43 by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * Pplistaopvw01Id generated by hbm2java
 */
@Embeddable
public class Pplistaopvw01Id implements java.io.Serializable {

	private Integer codemp;
	private Short codfilial;
	private Date dtemitop;
	private Date dtfabrop;
	private Integer codop;
	private Short seqop;
	private String descest;
	private String sitop;
	private BigDecimal tempotot;
	private BigDecimal tempofin;
	private Integer faseatual;
	private Integer totfases;
	private BigDecimal qtdsug;
	private BigDecimal qtdprev;
	private BigDecimal qtdfinal;
	private Integer codprod;
	private String refprod;
	private String codsecao;

	public Pplistaopvw01Id() {
	}

	public Pplistaopvw01Id(Integer codemp, Short codfilial, Date dtemitop,
			Date dtfabrop, Integer codop, Short seqop, String descest,
			String sitop, BigDecimal tempotot, BigDecimal tempofin,
			Integer faseatual, Integer totfases, BigDecimal qtdsug,
			BigDecimal qtdprev, BigDecimal qtdfinal, Integer codprod,
			String refprod, String codsecao) {
		this.codemp = codemp;
		this.codfilial = codfilial;
		this.dtemitop = dtemitop;
		this.dtfabrop = dtfabrop;
		this.codop = codop;
		this.seqop = seqop;
		this.descest = descest;
		this.sitop = sitop;
		this.tempotot = tempotot;
		this.tempofin = tempofin;
		this.faseatual = faseatual;
		this.totfases = totfases;
		this.qtdsug = qtdsug;
		this.qtdprev = qtdprev;
		this.qtdfinal = qtdfinal;
		this.codprod = codprod;
		this.refprod = refprod;
		this.codsecao = codsecao;
	}

	@Column(name = "CODEMP")
	public Integer getCodemp() {
		return this.codemp;
	}

	public void setCodemp(Integer codemp) {
		this.codemp = codemp;
	}

	@Column(name = "CODFILIAL")
	public Short getCodfilial() {
		return this.codfilial;
	}

	public void setCodfilial(Short codfilial) {
		this.codfilial = codfilial;
	}

	@Column(name = "DTEMITOP", length = 10)
	public Date getDtemitop() {
		return this.dtemitop;
	}

	public void setDtemitop(Date dtemitop) {
		this.dtemitop = dtemitop;
	}

	@Column(name = "DTFABROP", length = 10)
	public Date getDtfabrop() {
		return this.dtfabrop;
	}

	public void setDtfabrop(Date dtfabrop) {
		this.dtfabrop = dtfabrop;
	}

	@Column(name = "CODOP")
	public Integer getCodop() {
		return this.codop;
	}

	public void setCodop(Integer codop) {
		this.codop = codop;
	}

	@Column(name = "SEQOP")
	public Short getSeqop() {
		return this.seqop;
	}

	public void setSeqop(Short seqop) {
		this.seqop = seqop;
	}

	@Column(name = "DESCEST", length = 50)
	public String getDescest() {
		return this.descest;
	}

	public void setDescest(String descest) {
		this.descest = descest;
	}

	@Column(name = "SITOP", length = 2)
	public String getSitop() {
		return this.sitop;
	}

	public void setSitop(String sitop) {
		this.sitop = sitop;
	}

	@Column(name = "TEMPOTOT", precision = 0, scale = 5)
	public BigDecimal getTempotot() {
		return this.tempotot;
	}

	public void setTempotot(BigDecimal tempotot) {
		this.tempotot = tempotot;
	}

	@Column(name = "TEMPOFIN", precision = 0, scale = 5)
	public BigDecimal getTempofin() {
		return this.tempofin;
	}

	public void setTempofin(BigDecimal tempofin) {
		this.tempofin = tempofin;
	}

	@Column(name = "FASEATUAL")
	public Integer getFaseatual() {
		return this.faseatual;
	}

	public void setFaseatual(Integer faseatual) {
		this.faseatual = faseatual;
	}

	@Column(name = "TOTFASES")
	public Integer getTotfases() {
		return this.totfases;
	}

	public void setTotfases(Integer totfases) {
		this.totfases = totfases;
	}

	@Column(name = "QTDSUG", precision = 15, scale = 5)
	public BigDecimal getQtdsug() {
		return this.qtdsug;
	}

	public void setQtdsug(BigDecimal qtdsug) {
		this.qtdsug = qtdsug;
	}

	@Column(name = "QTDPREV", precision = 15, scale = 5)
	public BigDecimal getQtdprev() {
		return this.qtdprev;
	}

	public void setQtdprev(BigDecimal qtdprev) {
		this.qtdprev = qtdprev;
	}

	@Column(name = "QTDFINAL", precision = 15, scale = 5)
	public BigDecimal getQtdfinal() {
		return this.qtdfinal;
	}

	public void setQtdfinal(BigDecimal qtdfinal) {
		this.qtdfinal = qtdfinal;
	}

	@Column(name = "CODPROD")
	public Integer getCodprod() {
		return this.codprod;
	}

	public void setCodprod(Integer codprod) {
		this.codprod = codprod;
	}

	@Column(name = "REFPROD", length = 20)
	public String getRefprod() {
		return this.refprod;
	}

	public void setRefprod(String refprod) {
		this.refprod = refprod;
	}

	@Column(name = "CODSECAO", length = 13)
	public String getCodsecao() {
		return this.codsecao;
	}

	public void setCodsecao(String codsecao) {
		this.codsecao = codsecao;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof Pplistaopvw01Id))
			return false;
		Pplistaopvw01Id castOther = (Pplistaopvw01Id) other;

		return ((this.getCodemp() == castOther.getCodemp()) || (this
				.getCodemp() != null && castOther.getCodemp() != null && this
				.getCodemp().equals(castOther.getCodemp())))
				&& ((this.getCodfilial() == castOther.getCodfilial()) || (this
						.getCodfilial() != null
						&& castOther.getCodfilial() != null && this
						.getCodfilial().equals(castOther.getCodfilial())))
				&& ((this.getDtemitop() == castOther.getDtemitop()) || (this
						.getDtemitop() != null
						&& castOther.getDtemitop() != null && this
						.getDtemitop().equals(castOther.getDtemitop())))
				&& ((this.getDtfabrop() == castOther.getDtfabrop()) || (this
						.getDtfabrop() != null
						&& castOther.getDtfabrop() != null && this
						.getDtfabrop().equals(castOther.getDtfabrop())))
				&& ((this.getCodop() == castOther.getCodop()) || (this
						.getCodop() != null && castOther.getCodop() != null && this
						.getCodop().equals(castOther.getCodop())))
				&& ((this.getSeqop() == castOther.getSeqop()) || (this
						.getSeqop() != null && castOther.getSeqop() != null && this
						.getSeqop().equals(castOther.getSeqop())))
				&& ((this.getDescest() == castOther.getDescest()) || (this
						.getDescest() != null && castOther.getDescest() != null && this
						.getDescest().equals(castOther.getDescest())))
				&& ((this.getSitop() == castOther.getSitop()) || (this
						.getSitop() != null && castOther.getSitop() != null && this
						.getSitop().equals(castOther.getSitop())))
				&& ((this.getTempotot() == castOther.getTempotot()) || (this
						.getTempotot() != null
						&& castOther.getTempotot() != null && this
						.getTempotot().equals(castOther.getTempotot())))
				&& ((this.getTempofin() == castOther.getTempofin()) || (this
						.getTempofin() != null
						&& castOther.getTempofin() != null && this
						.getTempofin().equals(castOther.getTempofin())))
				&& ((this.getFaseatual() == castOther.getFaseatual()) || (this
						.getFaseatual() != null
						&& castOther.getFaseatual() != null && this
						.getFaseatual().equals(castOther.getFaseatual())))
				&& ((this.getTotfases() == castOther.getTotfases()) || (this
						.getTotfases() != null
						&& castOther.getTotfases() != null && this
						.getTotfases().equals(castOther.getTotfases())))
				&& ((this.getQtdsug() == castOther.getQtdsug()) || (this
						.getQtdsug() != null && castOther.getQtdsug() != null && this
						.getQtdsug().equals(castOther.getQtdsug())))
				&& ((this.getQtdprev() == castOther.getQtdprev()) || (this
						.getQtdprev() != null && castOther.getQtdprev() != null && this
						.getQtdprev().equals(castOther.getQtdprev())))
				&& ((this.getQtdfinal() == castOther.getQtdfinal()) || (this
						.getQtdfinal() != null
						&& castOther.getQtdfinal() != null && this
						.getQtdfinal().equals(castOther.getQtdfinal())))
				&& ((this.getCodprod() == castOther.getCodprod()) || (this
						.getCodprod() != null && castOther.getCodprod() != null && this
						.getCodprod().equals(castOther.getCodprod())))
				&& ((this.getRefprod() == castOther.getRefprod()) || (this
						.getRefprod() != null && castOther.getRefprod() != null && this
						.getRefprod().equals(castOther.getRefprod())))
				&& ((this.getCodsecao() == castOther.getCodsecao()) || (this
						.getCodsecao() != null
						&& castOther.getCodsecao() != null && this
						.getCodsecao().equals(castOther.getCodsecao())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCodemp() == null ? 0 : this.getCodemp().hashCode());
		result = 37 * result
				+ (getCodfilial() == null ? 0 : this.getCodfilial().hashCode());
		result = 37 * result
				+ (getDtemitop() == null ? 0 : this.getDtemitop().hashCode());
		result = 37 * result
				+ (getDtfabrop() == null ? 0 : this.getDtfabrop().hashCode());
		result = 37 * result
				+ (getCodop() == null ? 0 : this.getCodop().hashCode());
		result = 37 * result
				+ (getSeqop() == null ? 0 : this.getSeqop().hashCode());
		result = 37 * result
				+ (getDescest() == null ? 0 : this.getDescest().hashCode());
		result = 37 * result
				+ (getSitop() == null ? 0 : this.getSitop().hashCode());
		result = 37 * result
				+ (getTempotot() == null ? 0 : this.getTempotot().hashCode());
		result = 37 * result
				+ (getTempofin() == null ? 0 : this.getTempofin().hashCode());
		result = 37 * result
				+ (getFaseatual() == null ? 0 : this.getFaseatual().hashCode());
		result = 37 * result
				+ (getTotfases() == null ? 0 : this.getTotfases().hashCode());
		result = 37 * result
				+ (getQtdsug() == null ? 0 : this.getQtdsug().hashCode());
		result = 37 * result
				+ (getQtdprev() == null ? 0 : this.getQtdprev().hashCode());
		result = 37 * result
				+ (getQtdfinal() == null ? 0 : this.getQtdfinal().hashCode());
		result = 37 * result
				+ (getCodprod() == null ? 0 : this.getCodprod().hashCode());
		result = 37 * result
				+ (getRefprod() == null ? 0 : this.getRefprod().hashCode());
		result = 37 * result
				+ (getCodsecao() == null ? 0 : this.getCodsecao().hashCode());
		return result;
	}

}
