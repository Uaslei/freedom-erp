package org.freedom.persist.entity;

// Generated 30/01/2013 08:30:43 by Hibernate Tools 3.4.0.CR1

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
 * Cpcomprasol generated by hbm2java
 */
@Entity
@Table(name = "CPCOMPRASOL")
public class Cpcomprasol implements java.io.Serializable {

	private CpcomprasolId id;
	private Cpitsolicitacao cpitsolicitacao;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Cpcomprasol() {
	}

	public Cpcomprasol(CpcomprasolId id, Cpitsolicitacao cpitsolicitacao,
			Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.cpitsolicitacao = cpitsolicitacao;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Cpcomprasol(CpcomprasolId id, Cpitsolicitacao cpitsolicitacao,
			Date dtins, Date hins, String idusuins, Date dtalt, Date halt,
			String idusualt) {
		this.id = id;
		this.cpitsolicitacao = cpitsolicitacao;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codcompra", column = @Column(name = "CODCOMPRA", nullable = false)),
			@AttributeOverride(name = "coditcompra", column = @Column(name = "CODITCOMPRA", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)),
			@AttributeOverride(name = "codsol", column = @Column(name = "CODSOL", nullable = false)),
			@AttributeOverride(name = "coditsol", column = @Column(name = "CODITSOL", nullable = false)),
			@AttributeOverride(name = "codfilialsl", column = @Column(name = "CODFILIALSL", nullable = false)),
			@AttributeOverride(name = "codempsl", column = @Column(name = "CODEMPSL", nullable = false)) })
	public CpcomprasolId getId() {
		return this.id;
	}

	public void setId(CpcomprasolId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODSOL", referencedColumnName = "CODSOL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODITSOL", referencedColumnName = "CODITSOL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODFILIALSL", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMPSL", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Cpitsolicitacao getCpitsolicitacao() {
		return this.cpitsolicitacao;
	}

	public void setCpitsolicitacao(Cpitsolicitacao cpitsolicitacao) {
		this.cpitsolicitacao = cpitsolicitacao;
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
