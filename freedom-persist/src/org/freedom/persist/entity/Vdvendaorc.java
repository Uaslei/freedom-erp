package org.freedom.persist.entity;

// Generated 20/11/2013 10:59:59 by Hibernate Tools 4.0.0

import java.util.Date;

/**
 * Vdvendaorc generated by hbm2java
 */
public class Vdvendaorc implements java.io.Serializable {

	private VdvendaorcId id;
	private Vditvenda vditvenda;
	private Vditorcamento vditorcamento;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Vdvendaorc() {
	}

	public Vdvendaorc(VdvendaorcId id, Vditvenda vditvenda,
			Vditorcamento vditorcamento, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.vditvenda = vditvenda;
		this.vditorcamento = vditorcamento;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Vdvendaorc(VdvendaorcId id, Vditvenda vditvenda,
			Vditorcamento vditorcamento, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.vditvenda = vditvenda;
		this.vditorcamento = vditorcamento;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public VdvendaorcId getId() {
		return this.id;
	}

	public void setId(VdvendaorcId id) {
		this.id = id;
	}

	public Vditvenda getVditvenda() {
		return this.vditvenda;
	}

	public void setVditvenda(Vditvenda vditvenda) {
		this.vditvenda = vditvenda;
	}

	public Vditorcamento getVditorcamento() {
		return this.vditorcamento;
	}

	public void setVditorcamento(Vditorcamento vditorcamento) {
		this.vditorcamento = vditorcamento;
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
