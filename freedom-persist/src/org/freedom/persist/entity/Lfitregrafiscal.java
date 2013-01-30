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
 * Lfitregrafiscal generated by hbm2java
 */
@Entity
@Table(name = "LFITREGRAFISCAL")
public class Lfitregrafiscal implements java.io.Serializable {

	private LfitregrafiscalId id;
	private Lfnatoper lfnatoper;
	private Lfregrafiscal lfregrafiscal;
	private Eqtipomov eqtipomov;
	private char noufitrf;
	private char cvitrf;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Lfitregrafiscal() {
	}

	public Lfitregrafiscal(LfitregrafiscalId id, Lfnatoper lfnatoper,
			Lfregrafiscal lfregrafiscal, char noufitrf, char cvitrf,
			Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.lfnatoper = lfnatoper;
		this.lfregrafiscal = lfregrafiscal;
		this.noufitrf = noufitrf;
		this.cvitrf = cvitrf;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Lfitregrafiscal(LfitregrafiscalId id, Lfnatoper lfnatoper,
			Lfregrafiscal lfregrafiscal, Eqtipomov eqtipomov, char noufitrf,
			char cvitrf, Date dtins, Date hins, String idusuins, Date dtalt,
			Date halt, String idusualt) {
		this.id = id;
		this.lfnatoper = lfnatoper;
		this.lfregrafiscal = lfregrafiscal;
		this.eqtipomov = eqtipomov;
		this.noufitrf = noufitrf;
		this.cvitrf = cvitrf;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codnat", column = @Column(name = "CODNAT", nullable = false, length = 4)),
			@AttributeOverride(name = "codregra", column = @Column(name = "CODREGRA", nullable = false, length = 4)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public LfitregrafiscalId getId() {
		return this.id;
	}

	public void setId(LfitregrafiscalId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODNAT", referencedColumnName = "CODNAT", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODFILIAL", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMP", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Lfnatoper getLfnatoper() {
		return this.lfnatoper;
	}

	public void setLfnatoper(Lfnatoper lfnatoper) {
		this.lfnatoper = lfnatoper;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODREGRA", referencedColumnName = "CODREGRA", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODFILIAL", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMP", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Lfregrafiscal getLfregrafiscal() {
		return this.lfregrafiscal;
	}

	public void setLfregrafiscal(Lfregrafiscal lfregrafiscal) {
		this.lfregrafiscal = lfregrafiscal;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODTIPOMOV", referencedColumnName = "CODTIPOMOV"),
			@JoinColumn(name = "CODFILIALTM", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPTM", referencedColumnName = "CODEMP") })
	public Eqtipomov getEqtipomov() {
		return this.eqtipomov;
	}

	public void setEqtipomov(Eqtipomov eqtipomov) {
		this.eqtipomov = eqtipomov;
	}

	@Column(name = "NOUFITRF", nullable = false, length = 1)
	public char getNoufitrf() {
		return this.noufitrf;
	}

	public void setNoufitrf(char noufitrf) {
		this.noufitrf = noufitrf;
	}

	@Column(name = "CVITRF", nullable = false, length = 1)
	public char getCvitrf() {
		return this.cvitrf;
	}

	public void setCvitrf(char cvitrf) {
		this.cvitrf = cvitrf;
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
