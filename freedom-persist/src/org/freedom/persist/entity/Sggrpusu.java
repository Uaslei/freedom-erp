package org.freedom.persist.entity;

// Generated 20/11/2013 10:59:59 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Sggrpusu generated by hbm2java
 */
public class Sggrpusu implements java.io.Serializable {

	private SggrpusuId id;
	private Sgfilial sgfilial;
	private String nomegrpusu;
	private String comentgrpusu;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set sgusuarios = new HashSet(0);

	public Sggrpusu() {
	}

	public Sggrpusu(SggrpusuId id, Sgfilial sgfilial, String nomegrpusu,
			Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.nomegrpusu = nomegrpusu;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Sggrpusu(SggrpusuId id, Sgfilial sgfilial, String nomegrpusu,
			String comentgrpusu, Date dtins, Date hins, String idusuins,
			Date dtalt, Date halt, String idusualt, Set sgusuarios) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.nomegrpusu = nomegrpusu;
		this.comentgrpusu = comentgrpusu;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.sgusuarios = sgusuarios;
	}

	public SggrpusuId getId() {
		return this.id;
	}

	public void setId(SggrpusuId id) {
		this.id = id;
	}

	public Sgfilial getSgfilial() {
		return this.sgfilial;
	}

	public void setSgfilial(Sgfilial sgfilial) {
		this.sgfilial = sgfilial;
	}

	public String getNomegrpusu() {
		return this.nomegrpusu;
	}

	public void setNomegrpusu(String nomegrpusu) {
		this.nomegrpusu = nomegrpusu;
	}

	public String getComentgrpusu() {
		return this.comentgrpusu;
	}

	public void setComentgrpusu(String comentgrpusu) {
		this.comentgrpusu = comentgrpusu;
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

	public Set getSgusuarios() {
		return this.sgusuarios;
	}

	public void setSgusuarios(Set sgusuarios) {
		this.sgusuarios = sgusuarios;
	}

}
