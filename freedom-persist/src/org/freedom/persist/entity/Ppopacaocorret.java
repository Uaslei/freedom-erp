package org.freedom.persist.entity;

// Generated 20/11/2013 10:59:59 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Ppopacaocorret generated by hbm2java
 */
public class Ppopacaocorret implements java.io.Serializable {

	private PpopacaocorretId id;
	private String tpcausa;
	private String obscausa;
	private String tpacao;
	private String obsacao;
	private String status;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set ppitops = new HashSet(0);
	private Set ppopcqs = new HashSet(0);

	public Ppopacaocorret() {
	}

	public Ppopacaocorret(PpopacaocorretId id, String tpcausa, String status,
			Date dtins, Date hins, String idusuins, Date dtalt, Date halt,
			String idusualt) {
		this.id = id;
		this.tpcausa = tpcausa;
		this.status = status;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public Ppopacaocorret(PpopacaocorretId id, String tpcausa, String obscausa,
			String tpacao, String obsacao, String status, Date dtins,
			Date hins, String idusuins, Date dtalt, Date halt, String idusualt,
			Set ppitops, Set ppopcqs) {
		this.id = id;
		this.tpcausa = tpcausa;
		this.obscausa = obscausa;
		this.tpacao = tpacao;
		this.obsacao = obsacao;
		this.status = status;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.ppitops = ppitops;
		this.ppopcqs = ppopcqs;
	}

	public PpopacaocorretId getId() {
		return this.id;
	}

	public void setId(PpopacaocorretId id) {
		this.id = id;
	}

	public String getTpcausa() {
		return this.tpcausa;
	}

	public void setTpcausa(String tpcausa) {
		this.tpcausa = tpcausa;
	}

	public String getObscausa() {
		return this.obscausa;
	}

	public void setObscausa(String obscausa) {
		this.obscausa = obscausa;
	}

	public String getTpacao() {
		return this.tpacao;
	}

	public void setTpacao(String tpacao) {
		this.tpacao = tpacao;
	}

	public String getObsacao() {
		return this.obsacao;
	}

	public void setObsacao(String obsacao) {
		this.obsacao = obsacao;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
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

	public Set getPpitops() {
		return this.ppitops;
	}

	public void setPpitops(Set ppitops) {
		this.ppitops = ppitops;
	}

	public Set getPpopcqs() {
		return this.ppopcqs;
	}

	public void setPpopcqs(Set ppopcqs) {
		this.ppopcqs = ppopcqs;
	}

}
