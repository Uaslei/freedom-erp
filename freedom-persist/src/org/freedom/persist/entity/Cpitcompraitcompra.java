package org.freedom.persist.entity;

// Generated 14/04/2014 10:17:08 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;

/**
 * Cpitcompraitcompra generated by hbm2java
 */
public class Cpitcompraitcompra implements java.io.Serializable {

	private long id;
	private Cpitcompra cpitcompraByCpitcompitcfkitcp2;
	private Cpitcompra cpitcompraByCpitcompitcfkitcp1;
	private BigDecimal qtditcompra;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Cpitcompraitcompra() {
	}

	public Cpitcompraitcompra(long id,
			Cpitcompra cpitcompraByCpitcompitcfkitcp2,
			Cpitcompra cpitcompraByCpitcompitcfkitcp1, BigDecimal qtditcompra,
			Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.cpitcompraByCpitcompitcfkitcp2 = cpitcompraByCpitcompitcfkitcp2;
		this.cpitcompraByCpitcompitcfkitcp1 = cpitcompraByCpitcompitcfkitcp1;
		this.qtditcompra = qtditcompra;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Cpitcompraitcompra(long id,
			Cpitcompra cpitcompraByCpitcompitcfkitcp2,
			Cpitcompra cpitcompraByCpitcompitcfkitcp1, BigDecimal qtditcompra,
			Date dtins, Date hins, String idusuins, Date dtalt, Date halt,
			String idusualt) {
		this.id = id;
		this.cpitcompraByCpitcompitcfkitcp2 = cpitcompraByCpitcompitcfkitcp2;
		this.cpitcompraByCpitcompitcfkitcp1 = cpitcompraByCpitcompitcfkitcp1;
		this.qtditcompra = qtditcompra;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Cpitcompra getCpitcompraByCpitcompitcfkitcp2() {
		return this.cpitcompraByCpitcompitcfkitcp2;
	}

	public void setCpitcompraByCpitcompitcfkitcp2(
			Cpitcompra cpitcompraByCpitcompitcfkitcp2) {
		this.cpitcompraByCpitcompitcfkitcp2 = cpitcompraByCpitcompitcfkitcp2;
	}

	public Cpitcompra getCpitcompraByCpitcompitcfkitcp1() {
		return this.cpitcompraByCpitcompitcfkitcp1;
	}

	public void setCpitcompraByCpitcompitcfkitcp1(
			Cpitcompra cpitcompraByCpitcompitcfkitcp1) {
		this.cpitcompraByCpitcompitcfkitcp1 = cpitcompraByCpitcompitcfkitcp1;
	}

	public BigDecimal getQtditcompra() {
		return this.qtditcompra;
	}

	public void setQtditcompra(BigDecimal qtditcompra) {
		this.qtditcompra = qtditcompra;
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
