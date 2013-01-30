package org.freedom.persist.entity;

// Generated 30/01/2013 08:30:43 by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Fnittbjuros generated by hbm2java
 */
@Entity
@Table(name = "FNITTBJUROS")
public class Fnittbjuros implements java.io.Serializable {

	private FnittbjurosId id;
	private Fntbjuros fntbjuros;
	private BigDecimal percittbj;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Fnittbjuros() {
	}

	public Fnittbjuros(FnittbjurosId id, Fntbjuros fntbjuros,
			BigDecimal percittbj, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.fntbjuros = fntbjuros;
		this.percittbj = percittbj;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Fnittbjuros(FnittbjurosId id, Fntbjuros fntbjuros,
			BigDecimal percittbj, Date dtins, Date hins, String idusuins,
			Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.fntbjuros = fntbjuros;
		this.percittbj = percittbj;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codtbj", column = @Column(name = "CODTBJ", nullable = false)),
			@AttributeOverride(name = "mesittbj", column = @Column(name = "MESITTBJ", nullable = false)),
			@AttributeOverride(name = "anoittbj", column = @Column(name = "ANOITTBJ", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public FnittbjurosId getId() {
		return this.id;
	}

	public void setId(FnittbjurosId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODTBJ", referencedColumnName = "CODTBJ", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODFILIAL", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMP", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Fntbjuros getFntbjuros() {
		return this.fntbjuros;
	}

	public void setFntbjuros(Fntbjuros fntbjuros) {
		this.fntbjuros = fntbjuros;
	}

	@Column(name = "PERCITTBJ", nullable = false, precision = 7, scale = 3)
	public BigDecimal getPercittbj() {
		return this.percittbj;
	}

	public void setPercittbj(BigDecimal percittbj) {
		this.percittbj = percittbj;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTINS", nullable = false, length = 10)
	public Date getDtins() {
		return this.dtins;
	}

	public void setDtins(Date dtins) {
		this.dtins = dtins;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "HINS", nullable = false, length = 8)
	public Date getHins() {
		return this.hins;
	}

	public void setHins(Date hins) {
		this.hins = hins;
	}

	@Column(name = "IDUSUINS", nullable = false, length = 8)
	public String getIdusuins() {
		return this.idusuins;
	}

	public void setIdusuins(String idusuins) {
		this.idusuins = idusuins;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTALT", length = 10)
	public Date getDtalt() {
		return this.dtalt;
	}

	public void setDtalt(Date dtalt) {
		this.dtalt = dtalt;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "HALT", length = 8)
	public Date getHalt() {
		return this.halt;
	}

	public void setHalt(Date halt) {
		this.halt = halt;
	}

	@Column(name = "IDUSUALT", length = 8)
	public String getIdusualt() {
		return this.idusualt;
	}

	public void setIdusualt(String idusualt) {
		this.idusualt = idusualt;
	}

}
