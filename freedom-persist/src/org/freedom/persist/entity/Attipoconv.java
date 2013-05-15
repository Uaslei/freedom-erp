package org.freedom.persist.entity;

// Generated 30/01/2013 08:30:43 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Attipoconv generated by hbm2java
 */
@Entity
@Table(name = "ATTIPOCONV")
public class Attipoconv implements java.io.Serializable {

	private AttipoconvId id;
	private Sgfilial sgfilial;
	private String desctpconv;
	private String classtpconv;
	private String codauxtpconv;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set<Atconveniado> atconveniados = new HashSet<Atconveniado>(0);
	private Set<Vdorcamento> vdorcamentos = new HashSet<Vdorcamento>(0);

	public Attipoconv() {
	}

	public Attipoconv(AttipoconvId id, Sgfilial sgfilial, String desctpconv,
			String codauxtpconv, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.desctpconv = desctpconv;
		this.codauxtpconv = codauxtpconv;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Attipoconv(AttipoconvId id, Sgfilial sgfilial, String desctpconv,
			String classtpconv, String codauxtpconv, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt,
			Set<Atconveniado> atconveniados, Set<Vdorcamento> vdorcamentos) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.desctpconv = desctpconv;
		this.classtpconv = classtpconv;
		this.codauxtpconv = codauxtpconv;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.atconveniados = atconveniados;
		this.vdorcamentos = vdorcamentos;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codtpconv", column = @Column(name = "CODTPCONV", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public AttipoconvId getId() {
		return this.id;
	}

	public void setId(AttipoconvId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODFILIAL", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMP", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Sgfilial getSgfilial() {
		return this.sgfilial;
	}

	public void setSgfilial(Sgfilial sgfilial) {
		this.sgfilial = sgfilial;
	}

	@Column(name = "DESCTPCONV", nullable = false, length = 50)
	public String getDesctpconv() {
		return this.desctpconv;
	}

	public void setDesctpconv(String desctpconv) {
		this.desctpconv = desctpconv;
	}

	@Column(name = "CLASSTPCONV", length = 20)
	public String getClasstpconv() {
		return this.classtpconv;
	}

	public void setClasstpconv(String classtpconv) {
		this.classtpconv = classtpconv;
	}

	@Column(name = "CODAUXTPCONV", nullable = false, length = 20)
	public String getCodauxtpconv() {
		return this.codauxtpconv;
	}

	public void setCodauxtpconv(String codauxtpconv) {
		this.codauxtpconv = codauxtpconv;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "attipoconv")
	public Set<Atconveniado> getAtconveniados() {
		return this.atconveniados;
	}

	public void setAtconveniados(Set<Atconveniado> atconveniados) {
		this.atconveniados = atconveniados;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "attipoconv")
	public Set<Vdorcamento> getVdorcamentos() {
		return this.vdorcamentos;
	}

	public void setVdorcamentos(Set<Vdorcamento> vdorcamentos) {
		this.vdorcamentos = vdorcamentos;
	}

}