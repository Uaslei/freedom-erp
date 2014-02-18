package org.freedom.persist.entity;

// Generated 18/02/2014 15:53:28 by Hibernate Tools 4.0.0

import java.util.Date;

/**
 * Atatendoagenda generated by hbm2java
 */
public class Atatendoagenda implements java.io.Serializable {

	private AtatendoagendaId id;
	private Sgagenda sgagenda;
	private Atatendimento atatendimento;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Atatendoagenda() {
	}

	public Atatendoagenda(AtatendoagendaId id, Sgagenda sgagenda,
			Atatendimento atatendimento, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.sgagenda = sgagenda;
		this.atatendimento = atatendimento;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Atatendoagenda(AtatendoagendaId id, Sgagenda sgagenda,
			Atatendimento atatendimento, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.sgagenda = sgagenda;
		this.atatendimento = atatendimento;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public AtatendoagendaId getId() {
		return this.id;
	}

	public void setId(AtatendoagendaId id) {
		this.id = id;
	}

	public Sgagenda getSgagenda() {
		return this.sgagenda;
	}

	public void setSgagenda(Sgagenda sgagenda) {
		this.sgagenda = sgagenda;
	}

	public Atatendimento getAtatendimento() {
		return this.atatendimento;
	}

	public void setAtatendimento(Atatendimento atatendimento) {
		this.atatendimento = atatendimento;
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
