package org.freedom.persist.entity;

// Generated 18/02/2014 15:53:28 by Hibernate Tools 4.0.0

import java.util.Date;

/**
 * Sgatribusu generated by hbm2java
 */
public class Sgatribusu implements java.io.Serializable {

	private SgatribusuId id;
	private Sgatribuicao sgatribuicao;
	private Sgusuario sgusuario;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Sgatribusu() {
	}

	public Sgatribusu(SgatribusuId id, Sgatribuicao sgatribuicao,
			Sgusuario sgusuario, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.sgatribuicao = sgatribuicao;
		this.sgusuario = sgusuario;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Sgatribusu(SgatribusuId id, Sgatribuicao sgatribuicao,
			Sgusuario sgusuario, Date dtins, Date hins, String idusuins,
			Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.sgatribuicao = sgatribuicao;
		this.sgusuario = sgusuario;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public SgatribusuId getId() {
		return this.id;
	}

	public void setId(SgatribusuId id) {
		this.id = id;
	}

	public Sgatribuicao getSgatribuicao() {
		return this.sgatribuicao;
	}

	public void setSgatribuicao(Sgatribuicao sgatribuicao) {
		this.sgatribuicao = sgatribuicao;
	}

	public Sgusuario getSgusuario() {
		return this.sgusuario;
	}

	public void setSgusuario(Sgusuario sgusuario) {
		this.sgusuario = sgusuario;
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
