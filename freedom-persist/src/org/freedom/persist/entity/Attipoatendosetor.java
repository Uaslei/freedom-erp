package org.freedom.persist.entity;

// Generated 18/02/2014 15:53:28 by Hibernate Tools 4.0.0

import java.util.Date;

/**
 * Attipoatendosetor generated by hbm2java
 */
public class Attipoatendosetor implements java.io.Serializable {

	private AttipoatendosetorId id;
	private Attipoatendo attipoatendo;
	private Atsetor atsetor;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Attipoatendosetor() {
	}

	public Attipoatendosetor(AttipoatendosetorId id, Attipoatendo attipoatendo,
			Atsetor atsetor, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.attipoatendo = attipoatendo;
		this.atsetor = atsetor;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Attipoatendosetor(AttipoatendosetorId id, Attipoatendo attipoatendo,
			Atsetor atsetor, Date dtins, Date hins, String idusuins,
			Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.attipoatendo = attipoatendo;
		this.atsetor = atsetor;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public AttipoatendosetorId getId() {
		return this.id;
	}

	public void setId(AttipoatendosetorId id) {
		this.id = id;
	}

	public Attipoatendo getAttipoatendo() {
		return this.attipoatendo;
	}

	public void setAttipoatendo(Attipoatendo attipoatendo) {
		this.attipoatendo = attipoatendo;
	}

	public Atsetor getAtsetor() {
		return this.atsetor;
	}

	public void setAtsetor(Atsetor atsetor) {
		this.atsetor = atsetor;
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
