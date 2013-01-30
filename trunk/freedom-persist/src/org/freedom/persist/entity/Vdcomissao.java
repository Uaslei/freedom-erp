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
 * Vdcomissao generated by hbm2java
 */
@Entity
@Table(name = "VDCOMISSAO")
public class Vdcomissao implements java.io.Serializable {

	private VdcomissaoId id;
	private Sgfilial sgfilial;
	private Fnitreceber fnitreceber;
	private Vdvenda vdvenda;
	private Vdvendedor vdvendedor;
	private Fnpagtocomi fnpagtocomi;
	private char tipocomi;
	private BigDecimal vlrvendacomi;
	private BigDecimal vlrcomi;
	private BigDecimal vlrpagocomi;
	private BigDecimal vlrapagcomi;
	private Date datacomi;
	private Date dtcompcomi;
	private Date dtvenccomi;
	private Date dtpagtocomi;
	private String statuscomi;
	private Character flag;
	private Integer codempct;
	private Short codfilialct;
	private Integer codpcomiant;
	private char emmanut;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set<Fnlanca> fnlancas = new HashSet<Fnlanca>(0);

	public Vdcomissao() {
	}

	public Vdcomissao(VdcomissaoId id, Sgfilial sgfilial, char tipocomi,
			BigDecimal vlrvendacomi, BigDecimal vlrcomi,
			BigDecimal vlrpagocomi, BigDecimal vlrapagcomi, Date datacomi,
			Date dtcompcomi, Date dtvenccomi, String statuscomi, char emmanut,
			Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.tipocomi = tipocomi;
		this.vlrvendacomi = vlrvendacomi;
		this.vlrcomi = vlrcomi;
		this.vlrpagocomi = vlrpagocomi;
		this.vlrapagcomi = vlrapagcomi;
		this.datacomi = datacomi;
		this.dtcompcomi = dtcompcomi;
		this.dtvenccomi = dtvenccomi;
		this.statuscomi = statuscomi;
		this.emmanut = emmanut;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Vdcomissao(VdcomissaoId id, Sgfilial sgfilial,
			Fnitreceber fnitreceber, Vdvenda vdvenda, Vdvendedor vdvendedor,
			Fnpagtocomi fnpagtocomi, char tipocomi, BigDecimal vlrvendacomi,
			BigDecimal vlrcomi, BigDecimal vlrpagocomi, BigDecimal vlrapagcomi,
			Date datacomi, Date dtcompcomi, Date dtvenccomi, Date dtpagtocomi,
			String statuscomi, Character flag, Integer codempct,
			Short codfilialct, Integer codpcomiant, char emmanut, Date dtins,
			Date hins, String idusuins, Date dtalt, Date halt, String idusualt,
			Set<Fnlanca> fnlancas) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.fnitreceber = fnitreceber;
		this.vdvenda = vdvenda;
		this.vdvendedor = vdvendedor;
		this.fnpagtocomi = fnpagtocomi;
		this.tipocomi = tipocomi;
		this.vlrvendacomi = vlrvendacomi;
		this.vlrcomi = vlrcomi;
		this.vlrpagocomi = vlrpagocomi;
		this.vlrapagcomi = vlrapagcomi;
		this.datacomi = datacomi;
		this.dtcompcomi = dtcompcomi;
		this.dtvenccomi = dtvenccomi;
		this.dtpagtocomi = dtpagtocomi;
		this.statuscomi = statuscomi;
		this.flag = flag;
		this.codempct = codempct;
		this.codfilialct = codfilialct;
		this.codpcomiant = codpcomiant;
		this.emmanut = emmanut;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.fnlancas = fnlancas;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codcomi", column = @Column(name = "CODCOMI", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public VdcomissaoId getId() {
		return this.id;
	}

	public void setId(VdcomissaoId id) {
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
			@JoinColumn(name = "CODREC", referencedColumnName = "CODREC"),
			@JoinColumn(name = "NPARCITREC", referencedColumnName = "NPARCITREC"),
			@JoinColumn(name = "CODFILIALRC", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPRC", referencedColumnName = "CODEMP") })
	public Fnitreceber getFnitreceber() {
		return this.fnitreceber;
	}

	public void setFnitreceber(Fnitreceber fnitreceber) {
		this.fnitreceber = fnitreceber;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODVENDA", referencedColumnName = "CODVENDA"),
			@JoinColumn(name = "TIPOVENDA", referencedColumnName = "TIPOVENDA"),
			@JoinColumn(name = "CODFILIALVE", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPVE", referencedColumnName = "CODEMP") })
	public Vdvenda getVdvenda() {
		return this.vdvenda;
	}

	public void setVdvenda(Vdvenda vdvenda) {
		this.vdvenda = vdvenda;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODVEND", referencedColumnName = "CODVEND"),
			@JoinColumn(name = "CODFILIALVD", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPVD", referencedColumnName = "CODEMP") })
	public Vdvendedor getVdvendedor() {
		return this.vdvendedor;
	}

	public void setVdvendedor(Vdvendedor vdvendedor) {
		this.vdvendedor = vdvendedor;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODPCOMI", referencedColumnName = "CODPCOMI"),
			@JoinColumn(name = "CODFILIALCI", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPCI", referencedColumnName = "CODEMP") })
	public Fnpagtocomi getFnpagtocomi() {
		return this.fnpagtocomi;
	}

	public void setFnpagtocomi(Fnpagtocomi fnpagtocomi) {
		this.fnpagtocomi = fnpagtocomi;
	}

	@Column(name = "TIPOCOMI", nullable = false, length = 1)
	public char getTipocomi() {
		return this.tipocomi;
	}

	public void setTipocomi(char tipocomi) {
		this.tipocomi = tipocomi;
	}

	@Column(name = "VLRVENDACOMI", nullable = false, precision = 15, scale = 5)
	public BigDecimal getVlrvendacomi() {
		return this.vlrvendacomi;
	}

	public void setVlrvendacomi(BigDecimal vlrvendacomi) {
		this.vlrvendacomi = vlrvendacomi;
	}

	@Column(name = "VLRCOMI", nullable = false, precision = 15, scale = 5)
	public BigDecimal getVlrcomi() {
		return this.vlrcomi;
	}

	public void setVlrcomi(BigDecimal vlrcomi) {
		this.vlrcomi = vlrcomi;
	}

	@Column(name = "VLRPAGOCOMI", nullable = false, precision = 15, scale = 5)
	public BigDecimal getVlrpagocomi() {
		return this.vlrpagocomi;
	}

	public void setVlrpagocomi(BigDecimal vlrpagocomi) {
		this.vlrpagocomi = vlrpagocomi;
	}

	@Column(name = "VLRAPAGCOMI", nullable = false, precision = 15, scale = 5)
	public BigDecimal getVlrapagcomi() {
		return this.vlrapagcomi;
	}

	public void setVlrapagcomi(BigDecimal vlrapagcomi) {
		this.vlrapagcomi = vlrapagcomi;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DATACOMI", nullable = false, length = 10)
	public Date getDatacomi() {
		return this.datacomi;
	}

	public void setDatacomi(Date datacomi) {
		this.datacomi = datacomi;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTCOMPCOMI", nullable = false, length = 10)
	public Date getDtcompcomi() {
		return this.dtcompcomi;
	}

	public void setDtcompcomi(Date dtcompcomi) {
		this.dtcompcomi = dtcompcomi;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTVENCCOMI", nullable = false, length = 10)
	public Date getDtvenccomi() {
		return this.dtvenccomi;
	}

	public void setDtvenccomi(Date dtvenccomi) {
		this.dtvenccomi = dtvenccomi;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTPAGTOCOMI", length = 10)
	public Date getDtpagtocomi() {
		return this.dtpagtocomi;
	}

	public void setDtpagtocomi(Date dtpagtocomi) {
		this.dtpagtocomi = dtpagtocomi;
	}

	@Column(name = "STATUSCOMI", nullable = false, length = 2)
	public String getStatuscomi() {
		return this.statuscomi;
	}

	public void setStatuscomi(String statuscomi) {
		this.statuscomi = statuscomi;
	}

	@Column(name = "FLAG", length = 1)
	public Character getFlag() {
		return this.flag;
	}

	public void setFlag(Character flag) {
		this.flag = flag;
	}

	@Column(name = "CODEMPCT")
	public Integer getCodempct() {
		return this.codempct;
	}

	public void setCodempct(Integer codempct) {
		this.codempct = codempct;
	}

	@Column(name = "CODFILIALCT")
	public Short getCodfilialct() {
		return this.codfilialct;
	}

	public void setCodfilialct(Short codfilialct) {
		this.codfilialct = codfilialct;
	}

	@Column(name = "CODPCOMIANT")
	public Integer getCodpcomiant() {
		return this.codpcomiant;
	}

	public void setCodpcomiant(Integer codpcomiant) {
		this.codpcomiant = codpcomiant;
	}

	@Column(name = "EMMANUT", nullable = false, length = 1)
	public char getEmmanut() {
		return this.emmanut;
	}

	public void setEmmanut(char emmanut) {
		this.emmanut = emmanut;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "vdcomissao")
	public Set<Fnlanca> getFnlancas() {
		return this.fnlancas;
	}

	public void setFnlancas(Set<Fnlanca> fnlancas) {
		this.fnlancas = fnlancas;
	}

}
