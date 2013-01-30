package org.freedom.persist.entity;

// Generated 30/01/2013 08:30:43 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Cpcompralcchave generated by hbm2java
 */
@Entity
@Table(name = "CPCOMPRALCCHAVE")
public class Cpcompralcchave implements java.io.Serializable {

	private long id;
	private int codemp;
	private int codfilial;
	private int codcompra;
	private Date dtconsulta;
	private Date hconsulta;
	private int codretorno;
	private String mensagem;
	private char chavevalida;
	private String chavenfe;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Cpcompralcchave() {
	}

	public Cpcompralcchave(long id, int codemp, int codfilial, int codcompra,
			Date dtconsulta, Date hconsulta, int codretorno, String mensagem,
			char chavevalida, String chavenfe, Date dtins, Date hins,
			String idusuins) {
		this.id = id;
		this.codemp = codemp;
		this.codfilial = codfilial;
		this.codcompra = codcompra;
		this.dtconsulta = dtconsulta;
		this.hconsulta = hconsulta;
		this.codretorno = codretorno;
		this.mensagem = mensagem;
		this.chavevalida = chavevalida;
		this.chavenfe = chavenfe;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Cpcompralcchave(long id, int codemp, int codfilial, int codcompra,
			Date dtconsulta, Date hconsulta, int codretorno, String mensagem,
			char chavevalida, String chavenfe, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.codemp = codemp;
		this.codfilial = codfilial;
		this.codcompra = codcompra;
		this.dtconsulta = dtconsulta;
		this.hconsulta = hconsulta;
		this.codretorno = codretorno;
		this.mensagem = mensagem;
		this.chavevalida = chavevalida;
		this.chavenfe = chavenfe;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	@Id
	@Column(name = "ID", unique = true, nullable = false)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "CODEMP", nullable = false)
	public int getCodemp() {
		return this.codemp;
	}

	public void setCodemp(int codemp) {
		this.codemp = codemp;
	}

	@Column(name = "CODFILIAL", nullable = false)
	public int getCodfilial() {
		return this.codfilial;
	}

	public void setCodfilial(int codfilial) {
		this.codfilial = codfilial;
	}

	@Column(name = "CODCOMPRA", nullable = false)
	public int getCodcompra() {
		return this.codcompra;
	}

	public void setCodcompra(int codcompra) {
		this.codcompra = codcompra;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTCONSULTA", nullable = false, length = 10)
	public Date getDtconsulta() {
		return this.dtconsulta;
	}

	public void setDtconsulta(Date dtconsulta) {
		this.dtconsulta = dtconsulta;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "HCONSULTA", nullable = false, length = 8)
	public Date getHconsulta() {
		return this.hconsulta;
	}

	public void setHconsulta(Date hconsulta) {
		this.hconsulta = hconsulta;
	}

	@Column(name = "CODRETORNO", nullable = false)
	public int getCodretorno() {
		return this.codretorno;
	}

	public void setCodretorno(int codretorno) {
		this.codretorno = codretorno;
	}

	@Column(name = "MENSAGEM", nullable = false, length = 2000)
	public String getMensagem() {
		return this.mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	@Column(name = "CHAVEVALIDA", nullable = false, length = 1)
	public char getChavevalida() {
		return this.chavevalida;
	}

	public void setChavevalida(char chavevalida) {
		this.chavevalida = chavevalida;
	}

	@Column(name = "CHAVENFE", nullable = false, length = 100)
	public String getChavenfe() {
		return this.chavenfe;
	}

	public void setChavenfe(String chavenfe) {
		this.chavenfe = chavenfe;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTINS", nullable = false, length = 10)
	public Date getDtins() {
		return this.dtins;
	}

	public void setDtins(Date dtins) {
		this.dtins = dtins;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "HINS", nullable = false, length = 8)
	public Date getHins() {
		return this.hins;
	}

	public void setHins(Date hins) {
		this.hins = hins;
	}

	@Column(name = "IDUSUINS", nullable = false, length = 128)
	public String getIdusuins() {
		return this.idusuins;
	}

	public void setIdusuins(String idusuins) {
		this.idusuins = idusuins;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTALT", length = 10)
	public Date getDtalt() {
		return this.dtalt;
	}

	public void setDtalt(Date dtalt) {
		this.dtalt = dtalt;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "HALT", length = 8)
	public Date getHalt() {
		return this.halt;
	}

	public void setHalt(Date halt) {
		this.halt = halt;
	}

	@Column(name = "IDUSUALT", length = 128)
	public String getIdusualt() {
		return this.idusualt;
	}

	public void setIdusualt(String idusualt) {
		this.idusualt = idusualt;
	}

}
