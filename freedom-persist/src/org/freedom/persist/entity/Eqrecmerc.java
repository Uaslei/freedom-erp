package org.freedom.persist.entity;

// Generated 14/04/2014 10:17:08 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Eqrecmerc generated by hbm2java
 */
public class Eqrecmerc implements java.io.Serializable {

	private EqrecmercId id;
	private Eqtiporecmerc eqtiporecmerc;
	private Eqproduto eqproduto;
	private Sgfilial sgfilial;
	private Cpforneced cpforneced;
	private Vdcliente vdcliente;
	private Eqalmox eqalmox;
	private Vdvendedor vdvendedor;
	private Sgbairro sgbairro;
	private Vdtransp vdtransp;
	private Atatendente atatendente;
	private String placaveiculo;
	private String refprod;
	private String idusualt;
	private String status;
	private char tipofrete;
	private Date dtent;
	private Date dtprevret;
	private Integer docrecmerc;
	private String solicitante;
	private BigDecimal mediaamostragem;
	private Short rendaamostragem;
	private String obsrecmerc;
	private BigDecimal desconto;
	private char emmanut;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private Set eqitrecmercs = new HashSet(0);
	private Set cpcompras = new HashSet(0);
	private Set lffretes = new HashSet(0);
	private Set vdvendas = new HashSet(0);
	private Set eqrmas = new HashSet(0);
	private Set eqmovseries = new HashSet(0);

	public Eqrecmerc() {
	}

	public Eqrecmerc(EqrecmercId id, Eqtiporecmerc eqtiporecmerc,
			Sgfilial sgfilial, String status, char tipofrete, Date dtent,
			char emmanut, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.eqtiporecmerc = eqtiporecmerc;
		this.sgfilial = sgfilial;
		this.status = status;
		this.tipofrete = tipofrete;
		this.dtent = dtent;
		this.emmanut = emmanut;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Eqrecmerc(EqrecmercId id, Eqtiporecmerc eqtiporecmerc,
			Eqproduto eqproduto, Sgfilial sgfilial, Cpforneced cpforneced,
			Vdcliente vdcliente, Eqalmox eqalmox, Vdvendedor vdvendedor,
			Sgbairro sgbairro, Vdtransp vdtransp, Atatendente atatendente,
			String placaveiculo, String refprod, String idusualt,
			String status, char tipofrete, Date dtent, Date dtprevret,
			Integer docrecmerc, String solicitante, BigDecimal mediaamostragem,
			Short rendaamostragem, String obsrecmerc, BigDecimal desconto,
			char emmanut, Date dtins, Date hins, String idusuins, Date dtalt,
			Date halt, Set eqitrecmercs, Set cpcompras, Set lffretes,
			Set vdvendas, Set eqrmas, Set eqmovseries) {
		this.id = id;
		this.eqtiporecmerc = eqtiporecmerc;
		this.eqproduto = eqproduto;
		this.sgfilial = sgfilial;
		this.cpforneced = cpforneced;
		this.vdcliente = vdcliente;
		this.eqalmox = eqalmox;
		this.vdvendedor = vdvendedor;
		this.sgbairro = sgbairro;
		this.vdtransp = vdtransp;
		this.atatendente = atatendente;
		this.placaveiculo = placaveiculo;
		this.refprod = refprod;
		this.idusualt = idusualt;
		this.status = status;
		this.tipofrete = tipofrete;
		this.dtent = dtent;
		this.dtprevret = dtprevret;
		this.docrecmerc = docrecmerc;
		this.solicitante = solicitante;
		this.mediaamostragem = mediaamostragem;
		this.rendaamostragem = rendaamostragem;
		this.obsrecmerc = obsrecmerc;
		this.desconto = desconto;
		this.emmanut = emmanut;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.eqitrecmercs = eqitrecmercs;
		this.cpcompras = cpcompras;
		this.lffretes = lffretes;
		this.vdvendas = vdvendas;
		this.eqrmas = eqrmas;
		this.eqmovseries = eqmovseries;
	}

	public EqrecmercId getId() {
		return this.id;
	}

	public void setId(EqrecmercId id) {
		this.id = id;
	}

	public Eqtiporecmerc getEqtiporecmerc() {
		return this.eqtiporecmerc;
	}

	public void setEqtiporecmerc(Eqtiporecmerc eqtiporecmerc) {
		this.eqtiporecmerc = eqtiporecmerc;
	}

	public Eqproduto getEqproduto() {
		return this.eqproduto;
	}

	public void setEqproduto(Eqproduto eqproduto) {
		this.eqproduto = eqproduto;
	}

	public Sgfilial getSgfilial() {
		return this.sgfilial;
	}

	public void setSgfilial(Sgfilial sgfilial) {
		this.sgfilial = sgfilial;
	}

	public Cpforneced getCpforneced() {
		return this.cpforneced;
	}

	public void setCpforneced(Cpforneced cpforneced) {
		this.cpforneced = cpforneced;
	}

	public Vdcliente getVdcliente() {
		return this.vdcliente;
	}

	public void setVdcliente(Vdcliente vdcliente) {
		this.vdcliente = vdcliente;
	}

	public Eqalmox getEqalmox() {
		return this.eqalmox;
	}

	public void setEqalmox(Eqalmox eqalmox) {
		this.eqalmox = eqalmox;
	}

	public Vdvendedor getVdvendedor() {
		return this.vdvendedor;
	}

	public void setVdvendedor(Vdvendedor vdvendedor) {
		this.vdvendedor = vdvendedor;
	}

	public Sgbairro getSgbairro() {
		return this.sgbairro;
	}

	public void setSgbairro(Sgbairro sgbairro) {
		this.sgbairro = sgbairro;
	}

	public Vdtransp getVdtransp() {
		return this.vdtransp;
	}

	public void setVdtransp(Vdtransp vdtransp) {
		this.vdtransp = vdtransp;
	}

	public Atatendente getAtatendente() {
		return this.atatendente;
	}

	public void setAtatendente(Atatendente atatendente) {
		this.atatendente = atatendente;
	}

	public String getPlacaveiculo() {
		return this.placaveiculo;
	}

	public void setPlacaveiculo(String placaveiculo) {
		this.placaveiculo = placaveiculo;
	}

	public String getRefprod() {
		return this.refprod;
	}

	public void setRefprod(String refprod) {
		this.refprod = refprod;
	}

	public String getIdusualt() {
		return this.idusualt;
	}

	public void setIdusualt(String idusualt) {
		this.idusualt = idusualt;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public char getTipofrete() {
		return this.tipofrete;
	}

	public void setTipofrete(char tipofrete) {
		this.tipofrete = tipofrete;
	}

	public Date getDtent() {
		return this.dtent;
	}

	public void setDtent(Date dtent) {
		this.dtent = dtent;
	}

	public Date getDtprevret() {
		return this.dtprevret;
	}

	public void setDtprevret(Date dtprevret) {
		this.dtprevret = dtprevret;
	}

	public Integer getDocrecmerc() {
		return this.docrecmerc;
	}

	public void setDocrecmerc(Integer docrecmerc) {
		this.docrecmerc = docrecmerc;
	}

	public String getSolicitante() {
		return this.solicitante;
	}

	public void setSolicitante(String solicitante) {
		this.solicitante = solicitante;
	}

	public BigDecimal getMediaamostragem() {
		return this.mediaamostragem;
	}

	public void setMediaamostragem(BigDecimal mediaamostragem) {
		this.mediaamostragem = mediaamostragem;
	}

	public Short getRendaamostragem() {
		return this.rendaamostragem;
	}

	public void setRendaamostragem(Short rendaamostragem) {
		this.rendaamostragem = rendaamostragem;
	}

	public String getObsrecmerc() {
		return this.obsrecmerc;
	}

	public void setObsrecmerc(String obsrecmerc) {
		this.obsrecmerc = obsrecmerc;
	}

	public BigDecimal getDesconto() {
		return this.desconto;
	}

	public void setDesconto(BigDecimal desconto) {
		this.desconto = desconto;
	}

	public char getEmmanut() {
		return this.emmanut;
	}

	public void setEmmanut(char emmanut) {
		this.emmanut = emmanut;
	}

	public Date getDtins() {
		return this.dtins;
	}

	public void setDtins(Date dtins) {
		this.dtins = dtins;
	}

	public Date getHins() {
		return this.hins;
	}

	public void setHins(Date hins) {
		this.hins = hins;
	}

	public String getIdusuins() {
		return this.idusuins;
	}

	public void setIdusuins(String idusuins) {
		this.idusuins = idusuins;
	}

	public Date getDtalt() {
		return this.dtalt;
	}

	public void setDtalt(Date dtalt) {
		this.dtalt = dtalt;
	}

	public Date getHalt() {
		return this.halt;
	}

	public void setHalt(Date halt) {
		this.halt = halt;
	}

	public Set getEqitrecmercs() {
		return this.eqitrecmercs;
	}

	public void setEqitrecmercs(Set eqitrecmercs) {
		this.eqitrecmercs = eqitrecmercs;
	}

	public Set getCpcompras() {
		return this.cpcompras;
	}

	public void setCpcompras(Set cpcompras) {
		this.cpcompras = cpcompras;
	}

	public Set getLffretes() {
		return this.lffretes;
	}

	public void setLffretes(Set lffretes) {
		this.lffretes = lffretes;
	}

	public Set getVdvendas() {
		return this.vdvendas;
	}

	public void setVdvendas(Set vdvendas) {
		this.vdvendas = vdvendas;
	}

	public Set getEqrmas() {
		return this.eqrmas;
	}

	public void setEqrmas(Set eqrmas) {
		this.eqrmas = eqrmas;
	}

	public Set getEqmovseries() {
		return this.eqmovseries;
	}

	public void setEqmovseries(Set eqmovseries) {
		this.eqmovseries = eqmovseries;
	}

}
