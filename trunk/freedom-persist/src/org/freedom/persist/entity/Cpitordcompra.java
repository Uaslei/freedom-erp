package org.freedom.persist.entity;

// Generated 10/05/2014 10:27:15 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Cpitordcompra generated by hbm2java
 */
public class Cpitordcompra implements java.io.Serializable {

	private CpitordcompraId id;
	private Eqproduto eqproduto;
	private Cpordcompra cpordcompra;
	private BigDecimal qtditordcp;
	private BigDecimal precoitordcp;
	private BigDecimal qtdapitordcp;
	private BigDecimal vlrbrutitordcp;
	private BigDecimal vlrbrutapitordcp;
	private BigDecimal aliqipiitordcp;
	private BigDecimal vlripiitordcp;
	private BigDecimal vlripiapitordcp;
	private BigDecimal vlrliqitordcp;
	private BigDecimal vlrliqapitordcp;
	private String refprod;
	private String statusitoc;
	private String statusapitoc;
	private String statusrecitoc;
	private String justcancitoc;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set cpitordcomprapes = new HashSet(0);

	public Cpitordcompra() {
	}

	public Cpitordcompra(CpitordcompraId id, Eqproduto eqproduto,
			Cpordcompra cpordcompra, BigDecimal qtditordcp,
			BigDecimal precoitordcp, String refprod, String statusitoc,
			String statusapitoc, String statusrecitoc, Date dtins, Date hins,
			String idusuins) {
		this.id = id;
		this.eqproduto = eqproduto;
		this.cpordcompra = cpordcompra;
		this.qtditordcp = qtditordcp;
		this.precoitordcp = precoitordcp;
		this.refprod = refprod;
		this.statusitoc = statusitoc;
		this.statusapitoc = statusapitoc;
		this.statusrecitoc = statusrecitoc;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Cpitordcompra(CpitordcompraId id, Eqproduto eqproduto,
			Cpordcompra cpordcompra, BigDecimal qtditordcp,
			BigDecimal precoitordcp, BigDecimal qtdapitordcp,
			BigDecimal vlrbrutitordcp, BigDecimal vlrbrutapitordcp,
			BigDecimal aliqipiitordcp, BigDecimal vlripiitordcp,
			BigDecimal vlripiapitordcp, BigDecimal vlrliqitordcp,
			BigDecimal vlrliqapitordcp, String refprod, String statusitoc,
			String statusapitoc, String statusrecitoc, String justcancitoc,
			Date dtins, Date hins, String idusuins, Date dtalt, Date halt,
			String idusualt, Set cpitordcomprapes) {
		this.id = id;
		this.eqproduto = eqproduto;
		this.cpordcompra = cpordcompra;
		this.qtditordcp = qtditordcp;
		this.precoitordcp = precoitordcp;
		this.qtdapitordcp = qtdapitordcp;
		this.vlrbrutitordcp = vlrbrutitordcp;
		this.vlrbrutapitordcp = vlrbrutapitordcp;
		this.aliqipiitordcp = aliqipiitordcp;
		this.vlripiitordcp = vlripiitordcp;
		this.vlripiapitordcp = vlripiapitordcp;
		this.vlrliqitordcp = vlrliqitordcp;
		this.vlrliqapitordcp = vlrliqapitordcp;
		this.refprod = refprod;
		this.statusitoc = statusitoc;
		this.statusapitoc = statusapitoc;
		this.statusrecitoc = statusrecitoc;
		this.justcancitoc = justcancitoc;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.cpitordcomprapes = cpitordcomprapes;
	}

	public CpitordcompraId getId() {
		return this.id;
	}

	public void setId(CpitordcompraId id) {
		this.id = id;
	}

	public Eqproduto getEqproduto() {
		return this.eqproduto;
	}

	public void setEqproduto(Eqproduto eqproduto) {
		this.eqproduto = eqproduto;
	}

	public Cpordcompra getCpordcompra() {
		return this.cpordcompra;
	}

	public void setCpordcompra(Cpordcompra cpordcompra) {
		this.cpordcompra = cpordcompra;
	}

	public BigDecimal getQtditordcp() {
		return this.qtditordcp;
	}

	public void setQtditordcp(BigDecimal qtditordcp) {
		this.qtditordcp = qtditordcp;
	}

	public BigDecimal getPrecoitordcp() {
		return this.precoitordcp;
	}

	public void setPrecoitordcp(BigDecimal precoitordcp) {
		this.precoitordcp = precoitordcp;
	}

	public BigDecimal getQtdapitordcp() {
		return this.qtdapitordcp;
	}

	public void setQtdapitordcp(BigDecimal qtdapitordcp) {
		this.qtdapitordcp = qtdapitordcp;
	}

	public BigDecimal getVlrbrutitordcp() {
		return this.vlrbrutitordcp;
	}

	public void setVlrbrutitordcp(BigDecimal vlrbrutitordcp) {
		this.vlrbrutitordcp = vlrbrutitordcp;
	}

	public BigDecimal getVlrbrutapitordcp() {
		return this.vlrbrutapitordcp;
	}

	public void setVlrbrutapitordcp(BigDecimal vlrbrutapitordcp) {
		this.vlrbrutapitordcp = vlrbrutapitordcp;
	}

	public BigDecimal getAliqipiitordcp() {
		return this.aliqipiitordcp;
	}

	public void setAliqipiitordcp(BigDecimal aliqipiitordcp) {
		this.aliqipiitordcp = aliqipiitordcp;
	}

	public BigDecimal getVlripiitordcp() {
		return this.vlripiitordcp;
	}

	public void setVlripiitordcp(BigDecimal vlripiitordcp) {
		this.vlripiitordcp = vlripiitordcp;
	}

	public BigDecimal getVlripiapitordcp() {
		return this.vlripiapitordcp;
	}

	public void setVlripiapitordcp(BigDecimal vlripiapitordcp) {
		this.vlripiapitordcp = vlripiapitordcp;
	}

	public BigDecimal getVlrliqitordcp() {
		return this.vlrliqitordcp;
	}

	public void setVlrliqitordcp(BigDecimal vlrliqitordcp) {
		this.vlrliqitordcp = vlrliqitordcp;
	}

	public BigDecimal getVlrliqapitordcp() {
		return this.vlrliqapitordcp;
	}

	public void setVlrliqapitordcp(BigDecimal vlrliqapitordcp) {
		this.vlrliqapitordcp = vlrliqapitordcp;
	}

	public String getRefprod() {
		return this.refprod;
	}

	public void setRefprod(String refprod) {
		this.refprod = refprod;
	}

	public String getStatusitoc() {
		return this.statusitoc;
	}

	public void setStatusitoc(String statusitoc) {
		this.statusitoc = statusitoc;
	}

	public String getStatusapitoc() {
		return this.statusapitoc;
	}

	public void setStatusapitoc(String statusapitoc) {
		this.statusapitoc = statusapitoc;
	}

	public String getStatusrecitoc() {
		return this.statusrecitoc;
	}

	public void setStatusrecitoc(String statusrecitoc) {
		this.statusrecitoc = statusrecitoc;
	}

	public String getJustcancitoc() {
		return this.justcancitoc;
	}

	public void setJustcancitoc(String justcancitoc) {
		this.justcancitoc = justcancitoc;
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

	public Set getCpitordcomprapes() {
		return this.cpitordcomprapes;
	}

	public void setCpitordcomprapes(Set cpitordcomprapes) {
		this.cpitordcomprapes = cpitordcomprapes;
	}

}
