package org.freedom.persist.entity;

// Generated 20/11/2013 10:59:59 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;

/**
 * Rhtabelainss generated by hbm2java
 */
public class Rhtabelainss implements java.io.Serializable {

	private int codtabinss;
	private BigDecimal teto;
	private BigDecimal aliquota;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Rhtabelainss() {
	}

	public Rhtabelainss(int codtabinss, BigDecimal teto, BigDecimal aliquota,
			Date dtins, Date hins, String idusuins) {
		this.codtabinss = codtabinss;
		this.teto = teto;
		this.aliquota = aliquota;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Rhtabelainss(int codtabinss, BigDecimal teto, BigDecimal aliquota,
			Date dtins, Date hins, String idusuins, Date dtalt, Date halt,
			String idusualt) {
		this.codtabinss = codtabinss;
		this.teto = teto;
		this.aliquota = aliquota;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public int getCodtabinss() {
		return this.codtabinss;
	}

	public void setCodtabinss(int codtabinss) {
		this.codtabinss = codtabinss;
	}

	public BigDecimal getTeto() {
		return this.teto;
	}

	public void setTeto(BigDecimal teto) {
		this.teto = teto;
	}

	public BigDecimal getAliquota() {
		return this.aliquota;
	}

	public void setAliquota(BigDecimal aliquota) {
		this.aliquota = aliquota;
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
