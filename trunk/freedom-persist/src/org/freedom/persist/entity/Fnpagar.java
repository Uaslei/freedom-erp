package org.freedom.persist.entity;

// Generated 30/01/2013 08:30:43 by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
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
 * Fnpagar generated by hbm2java
 */
@Entity
@Table(name = "FNPAGAR")
public class Fnpagar implements java.io.Serializable {

	private FnpagarId id;
	private Sgfilial sgfilial;
	private Fnconta fnconta;
	private Fntipocob fntipocob;
	private Cpforneced cpforneced;
	private Fnplanopag fnplanopag;
	private Cpcompra cpcompra;
	private Fnplanejamento fnplanejamento;
	private Cpordcompra cpordcompra;
	private Fnbanco fnbanco;
	private Fncc fncc;
	private BigDecimal vlrdescpag;
	private BigDecimal vlrmultapag;
	private BigDecimal vlrjurospag;
	private BigDecimal vlrdevpag;
	private BigDecimal vlrparcpag;
	private BigDecimal vlrpagopag;
	private BigDecimal vlrapagpag;
	private Date datapag;
	private Date dtcomppag;
	private String statuspag;
	private Date dtquitpag;
	private int docpag;
	private BigDecimal vlrpag;
	private Integer nroparcpag;
	private String obspag;
	private BigDecimal vlradicpag;
	private Character flag;
	private char emmanut;
	private BigDecimal vlrbaseirrf;
	private BigDecimal vlrbaseinss;
	private BigDecimal vlrretirrf;
	private BigDecimal vlrretinss;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set<Fnitpagar> fnitpagars = new HashSet<Fnitpagar>(0);
	private Set<Lffrete> lffretes = new HashSet<Lffrete>(0);

	public Fnpagar() {
	}

	public Fnpagar(FnpagarId id, Sgfilial sgfilial, Cpforneced cpforneced,
			Fnplanopag fnplanopag, BigDecimal vlrdevpag, BigDecimal vlrparcpag,
			Date dtcomppag, String statuspag, int docpag, char emmanut,
			Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.cpforneced = cpforneced;
		this.fnplanopag = fnplanopag;
		this.vlrdevpag = vlrdevpag;
		this.vlrparcpag = vlrparcpag;
		this.dtcomppag = dtcomppag;
		this.statuspag = statuspag;
		this.docpag = docpag;
		this.emmanut = emmanut;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Fnpagar(FnpagarId id, Sgfilial sgfilial, Fnconta fnconta,
			Fntipocob fntipocob, Cpforneced cpforneced, Fnplanopag fnplanopag,
			Cpcompra cpcompra, Fnplanejamento fnplanejamento,
			Cpordcompra cpordcompra, Fnbanco fnbanco, Fncc fncc,
			BigDecimal vlrdescpag, BigDecimal vlrmultapag,
			BigDecimal vlrjurospag, BigDecimal vlrdevpag,
			BigDecimal vlrparcpag, BigDecimal vlrpagopag,
			BigDecimal vlrapagpag, Date datapag, Date dtcomppag,
			String statuspag, Date dtquitpag, int docpag, BigDecimal vlrpag,
			Integer nroparcpag, String obspag, BigDecimal vlradicpag,
			Character flag, char emmanut, BigDecimal vlrbaseirrf,
			BigDecimal vlrbaseinss, BigDecimal vlrretirrf,
			BigDecimal vlrretinss, Date dtins, Date hins, String idusuins,
			Date dtalt, Date halt, String idusualt, Set<Fnitpagar> fnitpagars,
			Set<Lffrete> lffretes) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.fnconta = fnconta;
		this.fntipocob = fntipocob;
		this.cpforneced = cpforneced;
		this.fnplanopag = fnplanopag;
		this.cpcompra = cpcompra;
		this.fnplanejamento = fnplanejamento;
		this.cpordcompra = cpordcompra;
		this.fnbanco = fnbanco;
		this.fncc = fncc;
		this.vlrdescpag = vlrdescpag;
		this.vlrmultapag = vlrmultapag;
		this.vlrjurospag = vlrjurospag;
		this.vlrdevpag = vlrdevpag;
		this.vlrparcpag = vlrparcpag;
		this.vlrpagopag = vlrpagopag;
		this.vlrapagpag = vlrapagpag;
		this.datapag = datapag;
		this.dtcomppag = dtcomppag;
		this.statuspag = statuspag;
		this.dtquitpag = dtquitpag;
		this.docpag = docpag;
		this.vlrpag = vlrpag;
		this.nroparcpag = nroparcpag;
		this.obspag = obspag;
		this.vlradicpag = vlradicpag;
		this.flag = flag;
		this.emmanut = emmanut;
		this.vlrbaseirrf = vlrbaseirrf;
		this.vlrbaseinss = vlrbaseinss;
		this.vlrretirrf = vlrretirrf;
		this.vlrretinss = vlrretinss;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.fnitpagars = fnitpagars;
		this.lffretes = lffretes;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codpag", column = @Column(name = "CODPAG", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public FnpagarId getId() {
		return this.id;
	}

	public void setId(FnpagarId id) {
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

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "NUMCONTA", referencedColumnName = "NUMCONTA"),
			@JoinColumn(name = "CODFILIALCA", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPCA", referencedColumnName = "CODEMP") })
	public Fnconta getFnconta() {
		return this.fnconta;
	}

	public void setFnconta(Fnconta fnconta) {
		this.fnconta = fnconta;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODTIPOCOB", referencedColumnName = "CODTIPOCOB"),
			@JoinColumn(name = "CODFILIALTC", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPTC", referencedColumnName = "CODEMP") })
	public Fntipocob getFntipocob() {
		return this.fntipocob;
	}

	public void setFntipocob(Fntipocob fntipocob) {
		this.fntipocob = fntipocob;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODFOR", referencedColumnName = "CODFOR", nullable = false),
			@JoinColumn(name = "CODFILIALFR", referencedColumnName = "CODFILIAL", nullable = false),
			@JoinColumn(name = "CODEMPFR", referencedColumnName = "CODEMP", nullable = false) })
	public Cpforneced getCpforneced() {
		return this.cpforneced;
	}

	public void setCpforneced(Cpforneced cpforneced) {
		this.cpforneced = cpforneced;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODPLANOPAG", referencedColumnName = "CODPLANOPAG", nullable = false),
			@JoinColumn(name = "CODFILIALPG", referencedColumnName = "CODFILIAL", nullable = false),
			@JoinColumn(name = "CODEMPPG", referencedColumnName = "CODEMP", nullable = false) })
	public Fnplanopag getFnplanopag() {
		return this.fnplanopag;
	}

	public void setFnplanopag(Fnplanopag fnplanopag) {
		this.fnplanopag = fnplanopag;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODCOMPRA", referencedColumnName = "CODCOMPRA"),
			@JoinColumn(name = "CODFILIALCP", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPCP", referencedColumnName = "CODEMP") })
	public Cpcompra getCpcompra() {
		return this.cpcompra;
	}

	public void setCpcompra(Cpcompra cpcompra) {
		this.cpcompra = cpcompra;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODPLAN", referencedColumnName = "CODPLAN"),
			@JoinColumn(name = "CODFILIALPN", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPPN", referencedColumnName = "CODEMP") })
	public Fnplanejamento getFnplanejamento() {
		return this.fnplanejamento;
	}

	public void setFnplanejamento(Fnplanejamento fnplanejamento) {
		this.fnplanejamento = fnplanejamento;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODEMPOC", referencedColumnName = "CODEMP"),
			@JoinColumn(name = "CODFILIALOC", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODORDCP", referencedColumnName = "CODORDCP") })
	public Cpordcompra getCpordcompra() {
		return this.cpordcompra;
	}

	public void setCpordcompra(Cpordcompra cpordcompra) {
		this.cpordcompra = cpordcompra;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODBANCO", referencedColumnName = "CODBANCO"),
			@JoinColumn(name = "CODFILIALBO", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPBO", referencedColumnName = "CODEMP") })
	public Fnbanco getFnbanco() {
		return this.fnbanco;
	}

	public void setFnbanco(Fnbanco fnbanco) {
		this.fnbanco = fnbanco;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODCC", referencedColumnName = "CODCC"),
			@JoinColumn(name = "ANOCC", referencedColumnName = "ANOCC"),
			@JoinColumn(name = "CODFILIALCC", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPCC", referencedColumnName = "CODEMP") })
	public Fncc getFncc() {
		return this.fncc;
	}

	public void setFncc(Fncc fncc) {
		this.fncc = fncc;
	}

	@Column(name = "VLRDESCPAG", precision = 15, scale = 5)
	public BigDecimal getVlrdescpag() {
		return this.vlrdescpag;
	}

	public void setVlrdescpag(BigDecimal vlrdescpag) {
		this.vlrdescpag = vlrdescpag;
	}

	@Column(name = "VLRMULTAPAG", precision = 15, scale = 5)
	public BigDecimal getVlrmultapag() {
		return this.vlrmultapag;
	}

	public void setVlrmultapag(BigDecimal vlrmultapag) {
		this.vlrmultapag = vlrmultapag;
	}

	@Column(name = "VLRJUROSPAG", precision = 15, scale = 5)
	public BigDecimal getVlrjurospag() {
		return this.vlrjurospag;
	}

	public void setVlrjurospag(BigDecimal vlrjurospag) {
		this.vlrjurospag = vlrjurospag;
	}

	@Column(name = "VLRDEVPAG", nullable = false, precision = 15, scale = 5)
	public BigDecimal getVlrdevpag() {
		return this.vlrdevpag;
	}

	public void setVlrdevpag(BigDecimal vlrdevpag) {
		this.vlrdevpag = vlrdevpag;
	}

	@Column(name = "VLRPARCPAG", nullable = false, precision = 15, scale = 5)
	public BigDecimal getVlrparcpag() {
		return this.vlrparcpag;
	}

	public void setVlrparcpag(BigDecimal vlrparcpag) {
		this.vlrparcpag = vlrparcpag;
	}

	@Column(name = "VLRPAGOPAG", precision = 15, scale = 5)
	public BigDecimal getVlrpagopag() {
		return this.vlrpagopag;
	}

	public void setVlrpagopag(BigDecimal vlrpagopag) {
		this.vlrpagopag = vlrpagopag;
	}

	@Column(name = "VLRAPAGPAG", precision = 15, scale = 5)
	public BigDecimal getVlrapagpag() {
		return this.vlrapagpag;
	}

	public void setVlrapagpag(BigDecimal vlrapagpag) {
		this.vlrapagpag = vlrapagpag;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DATAPAG", length = 10)
	public Date getDatapag() {
		return this.datapag;
	}

	public void setDatapag(Date datapag) {
		this.datapag = datapag;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTCOMPPAG", nullable = false, length = 10)
	public Date getDtcomppag() {
		return this.dtcomppag;
	}

	public void setDtcomppag(Date dtcomppag) {
		this.dtcomppag = dtcomppag;
	}

	@Column(name = "STATUSPAG", nullable = false, length = 2)
	public String getStatuspag() {
		return this.statuspag;
	}

	public void setStatuspag(String statuspag) {
		this.statuspag = statuspag;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTQUITPAG", length = 10)
	public Date getDtquitpag() {
		return this.dtquitpag;
	}

	public void setDtquitpag(Date dtquitpag) {
		this.dtquitpag = dtquitpag;
	}

	@Column(name = "DOCPAG", nullable = false)
	public int getDocpag() {
		return this.docpag;
	}

	public void setDocpag(int docpag) {
		this.docpag = docpag;
	}

	@Column(name = "VLRPAG", precision = 15, scale = 5)
	public BigDecimal getVlrpag() {
		return this.vlrpag;
	}

	public void setVlrpag(BigDecimal vlrpag) {
		this.vlrpag = vlrpag;
	}

	@Column(name = "NROPARCPAG")
	public Integer getNroparcpag() {
		return this.nroparcpag;
	}

	public void setNroparcpag(Integer nroparcpag) {
		this.nroparcpag = nroparcpag;
	}

	@Column(name = "OBSPAG", length = 250)
	public String getObspag() {
		return this.obspag;
	}

	public void setObspag(String obspag) {
		this.obspag = obspag;
	}

	@Column(name = "VLRADICPAG", precision = 15, scale = 5)
	public BigDecimal getVlradicpag() {
		return this.vlradicpag;
	}

	public void setVlradicpag(BigDecimal vlradicpag) {
		this.vlradicpag = vlradicpag;
	}

	@Column(name = "FLAG", length = 1)
	public Character getFlag() {
		return this.flag;
	}

	public void setFlag(Character flag) {
		this.flag = flag;
	}

	@Column(name = "EMMANUT", nullable = false, length = 1)
	public char getEmmanut() {
		return this.emmanut;
	}

	public void setEmmanut(char emmanut) {
		this.emmanut = emmanut;
	}

	@Column(name = "VLRBASEIRRF", precision = 15, scale = 5)
	public BigDecimal getVlrbaseirrf() {
		return this.vlrbaseirrf;
	}

	public void setVlrbaseirrf(BigDecimal vlrbaseirrf) {
		this.vlrbaseirrf = vlrbaseirrf;
	}

	@Column(name = "VLRBASEINSS", precision = 15, scale = 5)
	public BigDecimal getVlrbaseinss() {
		return this.vlrbaseinss;
	}

	public void setVlrbaseinss(BigDecimal vlrbaseinss) {
		this.vlrbaseinss = vlrbaseinss;
	}

	@Column(name = "VLRRETIRRF", precision = 15, scale = 5)
	public BigDecimal getVlrretirrf() {
		return this.vlrretirrf;
	}

	public void setVlrretirrf(BigDecimal vlrretirrf) {
		this.vlrretirrf = vlrretirrf;
	}

	@Column(name = "VLRRETINSS", precision = 15, scale = 5)
	public BigDecimal getVlrretinss() {
		return this.vlrretinss;
	}

	public void setVlrretinss(BigDecimal vlrretinss) {
		this.vlrretinss = vlrretinss;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fnpagar")
	public Set<Fnitpagar> getFnitpagars() {
		return this.fnitpagars;
	}

	public void setFnitpagars(Set<Fnitpagar> fnitpagars) {
		this.fnitpagars = fnitpagars;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fnpagar")
	public Set<Lffrete> getLffretes() {
		return this.lffretes;
	}

	public void setLffretes(Set<Lffrete> lffretes) {
		this.lffretes = lffretes;
	}

}