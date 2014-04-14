package org.freedom.persist.entity;

// Generated 14/04/2014 10:17:08 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Tkcampanha generated by hbm2java
 */
public class Tkcampanha implements java.io.Serializable {

	private TkcampanhaId id;
	private String desccamp;
	private String obscamp;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set tkcampanhaemails = new HashSet(0);
	private Set tksitcamps = new HashSet(0);
	private Set tkcampanhactos = new HashSet(0);
	private Set tkcampanhaclis = new HashSet(0);

	public Tkcampanha() {
	}

	public Tkcampanha(TkcampanhaId id, String desccamp, Date dtins, Date hins,
			String idusuins) {
		this.id = id;
		this.desccamp = desccamp;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Tkcampanha(TkcampanhaId id, String desccamp, String obscamp,
			Date dtins, Date hins, String idusuins, Date dtalt, Date halt,
			String idusualt, Set tkcampanhaemails, Set tksitcamps,
			Set tkcampanhactos, Set tkcampanhaclis) {
		this.id = id;
		this.desccamp = desccamp;
		this.obscamp = obscamp;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.tkcampanhaemails = tkcampanhaemails;
		this.tksitcamps = tksitcamps;
		this.tkcampanhactos = tkcampanhactos;
		this.tkcampanhaclis = tkcampanhaclis;
	}

	public TkcampanhaId getId() {
		return this.id;
	}

	public void setId(TkcampanhaId id) {
		this.id = id;
	}

	public String getDesccamp() {
		return this.desccamp;
	}

	public void setDesccamp(String desccamp) {
		this.desccamp = desccamp;
	}

	public String getObscamp() {
		return this.obscamp;
	}

	public void setObscamp(String obscamp) {
		this.obscamp = obscamp;
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

	public Set getTkcampanhaemails() {
		return this.tkcampanhaemails;
	}

	public void setTkcampanhaemails(Set tkcampanhaemails) {
		this.tkcampanhaemails = tkcampanhaemails;
	}

	public Set getTksitcamps() {
		return this.tksitcamps;
	}

	public void setTksitcamps(Set tksitcamps) {
		this.tksitcamps = tksitcamps;
	}

	public Set getTkcampanhactos() {
		return this.tkcampanhactos;
	}

	public void setTkcampanhactos(Set tkcampanhactos) {
		this.tkcampanhactos = tkcampanhactos;
	}

	public Set getTkcampanhaclis() {
		return this.tkcampanhaclis;
	}

	public void setTkcampanhaclis(Set tkcampanhaclis) {
		this.tkcampanhaclis = tkcampanhaclis;
	}

}
