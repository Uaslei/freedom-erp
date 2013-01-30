package org.freedom.persist.entity;

// Generated 30/01/2013 08:30:43 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Lfncm generated by hbm2java
 */
@Entity
@Table(name = "LFNCM")
public class Lfncm implements java.io.Serializable {

	private String codncm;
	private String descncm;
	private String aliqncm;
	private String textoncm;
	private String excecaoncm;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set<Cpitimportacao> cpitimportacaos = new HashSet<Cpitimportacao>(0);
	private Set<Cpimportacaoadic> cpimportacaoadics = new HashSet<Cpimportacaoadic>(
			0);
	private Set<Lfncmnbm> lfncmnbms = new HashSet<Lfncmnbm>(0);

	public Lfncm() {
	}

	public Lfncm(String codncm, String descncm, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt) {
		this.codncm = codncm;
		this.descncm = descncm;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public Lfncm(String codncm, String descncm, String aliqncm,
			String textoncm, String excecaoncm, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt,
			Set<Cpitimportacao> cpitimportacaos,
			Set<Cpimportacaoadic> cpimportacaoadics, Set<Lfncmnbm> lfncmnbms) {
		this.codncm = codncm;
		this.descncm = descncm;
		this.aliqncm = aliqncm;
		this.textoncm = textoncm;
		this.excecaoncm = excecaoncm;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.cpitimportacaos = cpitimportacaos;
		this.cpimportacaoadics = cpimportacaoadics;
		this.lfncmnbms = lfncmnbms;
	}

	@Id
	@Column(name = "CODNCM", unique = true, nullable = false, length = 10)
	public String getCodncm() {
		return this.codncm;
	}

	public void setCodncm(String codncm) {
		this.codncm = codncm;
	}

	@Column(name = "DESCNCM", nullable = false, length = 60)
	public String getDescncm() {
		return this.descncm;
	}

	public void setDescncm(String descncm) {
		this.descncm = descncm;
	}

	@Column(name = "ALIQNCM", length = 6)
	public String getAliqncm() {
		return this.aliqncm;
	}

	public void setAliqncm(String aliqncm) {
		this.aliqncm = aliqncm;
	}

	@Column(name = "TEXTONCM", length = 2000)
	public String getTextoncm() {
		return this.textoncm;
	}

	public void setTextoncm(String textoncm) {
		this.textoncm = textoncm;
	}

	@Column(name = "EXCECAONCM", length = 1000)
	public String getExcecaoncm() {
		return this.excecaoncm;
	}

	public void setExcecaoncm(String excecaoncm) {
		this.excecaoncm = excecaoncm;
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
	@Column(name = "DTALT", nullable = false, length = 10)
	public Date getDtalt() {
		return this.dtalt;
	}

	public void setDtalt(Date dtalt) {
		this.dtalt = dtalt;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "HALT", nullable = false, length = 8)
	public Date getHalt() {
		return this.halt;
	}

	public void setHalt(Date halt) {
		this.halt = halt;
	}

	@Column(name = "IDUSUALT", nullable = false, length = 8)
	public String getIdusualt() {
		return this.idusualt;
	}

	public void setIdusualt(String idusualt) {
		this.idusualt = idusualt;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "lfncm")
	public Set<Cpitimportacao> getCpitimportacaos() {
		return this.cpitimportacaos;
	}

	public void setCpitimportacaos(Set<Cpitimportacao> cpitimportacaos) {
		this.cpitimportacaos = cpitimportacaos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "lfncm")
	public Set<Cpimportacaoadic> getCpimportacaoadics() {
		return this.cpimportacaoadics;
	}

	public void setCpimportacaoadics(Set<Cpimportacaoadic> cpimportacaoadics) {
		this.cpimportacaoadics = cpimportacaoadics;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "lfncm")
	public Set<Lfncmnbm> getLfncmnbms() {
		return this.lfncmnbms;
	}

	public void setLfncmnbms(Set<Lfncmnbm> lfncmnbms) {
		this.lfncmnbms = lfncmnbms;
	}

}
