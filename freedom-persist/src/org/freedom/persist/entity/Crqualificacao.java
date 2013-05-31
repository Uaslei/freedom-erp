package org.freedom.persist.entity;

// Generated 31/05/2013 12:00:37 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Crqualificacao generated by hbm2java
 */
@Entity
@Table(name = "CRQUALIFICACAO")
public class Crqualificacao implements java.io.Serializable {

	private CrqualificacaoId id;
	private String descqualific;
	private char finaliza;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set<Crchamado> crchamados = new HashSet<Crchamado>(0);

	public Crqualificacao() {
	}

	public Crqualificacao(CrqualificacaoId id, String descqualific,
			char finaliza, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.descqualific = descqualific;
		this.finaliza = finaliza;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Crqualificacao(CrqualificacaoId id, String descqualific,
			char finaliza, Date dtins, Date hins, String idusuins, Date dtalt,
			Date halt, String idusualt, Set<Crchamado> crchamados) {
		this.id = id;
		this.descqualific = descqualific;
		this.finaliza = finaliza;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.crchamados = crchamados;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)),
			@AttributeOverride(name = "codqualific", column = @Column(name = "CODQUALIFIC", nullable = false)) })
	public CrqualificacaoId getId() {
		return this.id;
	}

	public void setId(CrqualificacaoId id) {
		this.id = id;
	}

	@Column(name = "DESCQUALIFIC", nullable = false, length = 100)
	public String getDescqualific() {
		return this.descqualific;
	}

	public void setDescqualific(String descqualific) {
		this.descqualific = descqualific;
	}

	@Column(name = "FINALIZA", nullable = false, length = 1)
	public char getFinaliza() {
		return this.finaliza;
	}

	public void setFinaliza(char finaliza) {
		this.finaliza = finaliza;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "crqualificacao")
	public Set<Crchamado> getCrchamados() {
		return this.crchamados;
	}

	public void setCrchamados(Set<Crchamado> crchamados) {
		this.crchamados = crchamados;
	}

}
