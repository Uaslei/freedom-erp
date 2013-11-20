package org.freedom.persist.entity;

// Generated 20/11/2013 10:59:59 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;

/**
 * Lflivrofiscal generated by hbm2java
 */
public class Lflivrofiscal implements java.io.Serializable {

	private LflivrofiscalId id;
	private Sgfilial sgfilial;
	private Lfnatoper lfnatoper;
	private int codempet;
	private short codfilialet;
	private int codemitlf;
	private String serielf;
	private int docinilf;
	private Date dtemitlf;
	private Date dteslf;
	private int docfimlf;
	private String especielf;
	private String uflf;
	private BigDecimal vlrcontabillf;
	private BigDecimal vlrbaseicmslf;
	private BigDecimal aliqicmslf;
	private BigDecimal vlricmslf;
	private BigDecimal vlrisentasicmslf;
	private BigDecimal vlroutrasicmslf;
	private BigDecimal vlrbaseipilf;
	private BigDecimal aliqipilf;
	private BigDecimal vlripilf;
	private BigDecimal vlrisentasipilf;
	private BigDecimal vlroutrasipilf;
	private String obslf;
	private Integer codempmn;
	private Short codfilialmn;
	private Integer codmodnota;
	private char situacaolf;
	private BigDecimal vlrbaseicmsstlf;
	private BigDecimal vlricmsstlf;
	private BigDecimal vlracessoriaslf;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Lflivrofiscal() {
	}

	public Lflivrofiscal(LflivrofiscalId id, Sgfilial sgfilial, int codempet,
			short codfilialet, int codemitlf, String serielf, int docinilf,
			Date dtemitlf, Date dteslf, int docfimlf, String especielf,
			String uflf, char situacaolf, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.codempet = codempet;
		this.codfilialet = codfilialet;
		this.codemitlf = codemitlf;
		this.serielf = serielf;
		this.docinilf = docinilf;
		this.dtemitlf = dtemitlf;
		this.dteslf = dteslf;
		this.docfimlf = docfimlf;
		this.especielf = especielf;
		this.uflf = uflf;
		this.situacaolf = situacaolf;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Lflivrofiscal(LflivrofiscalId id, Sgfilial sgfilial,
			Lfnatoper lfnatoper, int codempet, short codfilialet,
			int codemitlf, String serielf, int docinilf, Date dtemitlf,
			Date dteslf, int docfimlf, String especielf, String uflf,
			BigDecimal vlrcontabillf, BigDecimal vlrbaseicmslf,
			BigDecimal aliqicmslf, BigDecimal vlricmslf,
			BigDecimal vlrisentasicmslf, BigDecimal vlroutrasicmslf,
			BigDecimal vlrbaseipilf, BigDecimal aliqipilf, BigDecimal vlripilf,
			BigDecimal vlrisentasipilf, BigDecimal vlroutrasipilf,
			String obslf, Integer codempmn, Short codfilialmn,
			Integer codmodnota, char situacaolf, BigDecimal vlrbaseicmsstlf,
			BigDecimal vlricmsstlf, BigDecimal vlracessoriaslf, Date dtins,
			Date hins, String idusuins, Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.lfnatoper = lfnatoper;
		this.codempet = codempet;
		this.codfilialet = codfilialet;
		this.codemitlf = codemitlf;
		this.serielf = serielf;
		this.docinilf = docinilf;
		this.dtemitlf = dtemitlf;
		this.dteslf = dteslf;
		this.docfimlf = docfimlf;
		this.especielf = especielf;
		this.uflf = uflf;
		this.vlrcontabillf = vlrcontabillf;
		this.vlrbaseicmslf = vlrbaseicmslf;
		this.aliqicmslf = aliqicmslf;
		this.vlricmslf = vlricmslf;
		this.vlrisentasicmslf = vlrisentasicmslf;
		this.vlroutrasicmslf = vlroutrasicmslf;
		this.vlrbaseipilf = vlrbaseipilf;
		this.aliqipilf = aliqipilf;
		this.vlripilf = vlripilf;
		this.vlrisentasipilf = vlrisentasipilf;
		this.vlroutrasipilf = vlroutrasipilf;
		this.obslf = obslf;
		this.codempmn = codempmn;
		this.codfilialmn = codfilialmn;
		this.codmodnota = codmodnota;
		this.situacaolf = situacaolf;
		this.vlrbaseicmsstlf = vlrbaseicmsstlf;
		this.vlricmsstlf = vlricmsstlf;
		this.vlracessoriaslf = vlracessoriaslf;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public LflivrofiscalId getId() {
		return this.id;
	}

	public void setId(LflivrofiscalId id) {
		this.id = id;
	}

	public Sgfilial getSgfilial() {
		return this.sgfilial;
	}

	public void setSgfilial(Sgfilial sgfilial) {
		this.sgfilial = sgfilial;
	}

	public Lfnatoper getLfnatoper() {
		return this.lfnatoper;
	}

	public void setLfnatoper(Lfnatoper lfnatoper) {
		this.lfnatoper = lfnatoper;
	}

	public int getCodempet() {
		return this.codempet;
	}

	public void setCodempet(int codempet) {
		this.codempet = codempet;
	}

	public short getCodfilialet() {
		return this.codfilialet;
	}

	public void setCodfilialet(short codfilialet) {
		this.codfilialet = codfilialet;
	}

	public int getCodemitlf() {
		return this.codemitlf;
	}

	public void setCodemitlf(int codemitlf) {
		this.codemitlf = codemitlf;
	}

	public String getSerielf() {
		return this.serielf;
	}

	public void setSerielf(String serielf) {
		this.serielf = serielf;
	}

	public int getDocinilf() {
		return this.docinilf;
	}

	public void setDocinilf(int docinilf) {
		this.docinilf = docinilf;
	}

	public Date getDtemitlf() {
		return this.dtemitlf;
	}

	public void setDtemitlf(Date dtemitlf) {
		this.dtemitlf = dtemitlf;
	}

	public Date getDteslf() {
		return this.dteslf;
	}

	public void setDteslf(Date dteslf) {
		this.dteslf = dteslf;
	}

	public int getDocfimlf() {
		return this.docfimlf;
	}

	public void setDocfimlf(int docfimlf) {
		this.docfimlf = docfimlf;
	}

	public String getEspecielf() {
		return this.especielf;
	}

	public void setEspecielf(String especielf) {
		this.especielf = especielf;
	}

	public String getUflf() {
		return this.uflf;
	}

	public void setUflf(String uflf) {
		this.uflf = uflf;
	}

	public BigDecimal getVlrcontabillf() {
		return this.vlrcontabillf;
	}

	public void setVlrcontabillf(BigDecimal vlrcontabillf) {
		this.vlrcontabillf = vlrcontabillf;
	}

	public BigDecimal getVlrbaseicmslf() {
		return this.vlrbaseicmslf;
	}

	public void setVlrbaseicmslf(BigDecimal vlrbaseicmslf) {
		this.vlrbaseicmslf = vlrbaseicmslf;
	}

	public BigDecimal getAliqicmslf() {
		return this.aliqicmslf;
	}

	public void setAliqicmslf(BigDecimal aliqicmslf) {
		this.aliqicmslf = aliqicmslf;
	}

	public BigDecimal getVlricmslf() {
		return this.vlricmslf;
	}

	public void setVlricmslf(BigDecimal vlricmslf) {
		this.vlricmslf = vlricmslf;
	}

	public BigDecimal getVlrisentasicmslf() {
		return this.vlrisentasicmslf;
	}

	public void setVlrisentasicmslf(BigDecimal vlrisentasicmslf) {
		this.vlrisentasicmslf = vlrisentasicmslf;
	}

	public BigDecimal getVlroutrasicmslf() {
		return this.vlroutrasicmslf;
	}

	public void setVlroutrasicmslf(BigDecimal vlroutrasicmslf) {
		this.vlroutrasicmslf = vlroutrasicmslf;
	}

	public BigDecimal getVlrbaseipilf() {
		return this.vlrbaseipilf;
	}

	public void setVlrbaseipilf(BigDecimal vlrbaseipilf) {
		this.vlrbaseipilf = vlrbaseipilf;
	}

	public BigDecimal getAliqipilf() {
		return this.aliqipilf;
	}

	public void setAliqipilf(BigDecimal aliqipilf) {
		this.aliqipilf = aliqipilf;
	}

	public BigDecimal getVlripilf() {
		return this.vlripilf;
	}

	public void setVlripilf(BigDecimal vlripilf) {
		this.vlripilf = vlripilf;
	}

	public BigDecimal getVlrisentasipilf() {
		return this.vlrisentasipilf;
	}

	public void setVlrisentasipilf(BigDecimal vlrisentasipilf) {
		this.vlrisentasipilf = vlrisentasipilf;
	}

	public BigDecimal getVlroutrasipilf() {
		return this.vlroutrasipilf;
	}

	public void setVlroutrasipilf(BigDecimal vlroutrasipilf) {
		this.vlroutrasipilf = vlroutrasipilf;
	}

	public String getObslf() {
		return this.obslf;
	}

	public void setObslf(String obslf) {
		this.obslf = obslf;
	}

	public Integer getCodempmn() {
		return this.codempmn;
	}

	public void setCodempmn(Integer codempmn) {
		this.codempmn = codempmn;
	}

	public Short getCodfilialmn() {
		return this.codfilialmn;
	}

	public void setCodfilialmn(Short codfilialmn) {
		this.codfilialmn = codfilialmn;
	}

	public Integer getCodmodnota() {
		return this.codmodnota;
	}

	public void setCodmodnota(Integer codmodnota) {
		this.codmodnota = codmodnota;
	}

	public char getSituacaolf() {
		return this.situacaolf;
	}

	public void setSituacaolf(char situacaolf) {
		this.situacaolf = situacaolf;
	}

	public BigDecimal getVlrbaseicmsstlf() {
		return this.vlrbaseicmsstlf;
	}

	public void setVlrbaseicmsstlf(BigDecimal vlrbaseicmsstlf) {
		this.vlrbaseicmsstlf = vlrbaseicmsstlf;
	}

	public BigDecimal getVlricmsstlf() {
		return this.vlricmsstlf;
	}

	public void setVlricmsstlf(BigDecimal vlricmsstlf) {
		this.vlricmsstlf = vlricmsstlf;
	}

	public BigDecimal getVlracessoriaslf() {
		return this.vlracessoriaslf;
	}

	public void setVlracessoriaslf(BigDecimal vlracessoriaslf) {
		this.vlracessoriaslf = vlracessoriaslf;
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

	public String getIdusualt() {
		return this.idusualt;
	}

	public void setIdusualt(String idusualt) {
		this.idusualt = idusualt;
	}

}
