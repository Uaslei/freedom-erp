package org.freedom.persist.entity;

// Generated 30/01/2013 08:30:43 by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Cpimportacaocompl generated by hbm2java
 */
@Entity
@Table(name = "CPIMPORTACAOCOMPL")
public class Cpimportacaocompl implements java.io.Serializable {

	private long id;
	private Cpimportacao cpimportacao;
	private String descadic;
	private BigDecimal vlrdespadic;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Cpimportacaocompl() {
	}

	public Cpimportacaocompl(long id, Cpimportacao cpimportacao,
			String descadic, BigDecimal vlrdespadic, Date dtins, Date hins,
			String idusuins) {
		this.id = id;
		this.cpimportacao = cpimportacao;
		this.descadic = descadic;
		this.vlrdespadic = vlrdespadic;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Cpimportacaocompl(long id, Cpimportacao cpimportacao,
			String descadic, BigDecimal vlrdespadic, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.cpimportacao = cpimportacao;
		this.descadic = descadic;
		this.vlrdespadic = vlrdespadic;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	@Id
	@Column(name = "ID", unique = true, nullable = false)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODIMP", referencedColumnName = "CODIMP", nullable = false),
			@JoinColumn(name = "CODFILIAL", referencedColumnName = "CODFILIAL", nullable = false),
			@JoinColumn(name = "CODEMP", referencedColumnName = "CODEMP", nullable = false) })
	public Cpimportacao getCpimportacao() {
		return this.cpimportacao;
	}

	public void setCpimportacao(Cpimportacao cpimportacao) {
		this.cpimportacao = cpimportacao;
	}

	@Column(name = "DESCADIC", nullable = false, length = 50)
	public String getDescadic() {
		return this.descadic;
	}

	public void setDescadic(String descadic) {
		this.descadic = descadic;
	}

	@Column(name = "VLRDESPADIC", nullable = false, precision = 15, scale = 5)
	public BigDecimal getVlrdespadic() {
		return this.vlrdespadic;
	}

	public void setVlrdespadic(BigDecimal vlrdespadic) {
		this.vlrdespadic = vlrdespadic;
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
