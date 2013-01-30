package org.freedom.persist.entity;

// Generated 30/01/2013 08:30:43 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Fnfbnrec generated by hbm2java
 */
@Entity
@Table(name = "FNFBNREC")
public class Fnfbnrec implements java.io.Serializable {

	private FnfbnrecId id;
	private Sgitprefere6 sgitprefere6;
	private Fnitreceber fnitreceber;
	private String stipofebraban;
	private String sitremessa;
	private String sitretorno;
	private String nomearquivo;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Fnfbnrec() {
	}

	public Fnfbnrec(Sgitprefere6 sgitprefere6, Fnitreceber fnitreceber,
			String stipofebraban, String sitremessa, String sitretorno,
			Date dtins, Date hins, String idusuins) {
		this.sgitprefere6 = sgitprefere6;
		this.fnitreceber = fnitreceber;
		this.stipofebraban = stipofebraban;
		this.sitremessa = sitremessa;
		this.sitretorno = sitretorno;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Fnfbnrec(Sgitprefere6 sgitprefere6, Fnitreceber fnitreceber,
			String stipofebraban, String sitremessa, String sitretorno,
			String nomearquivo, Date dtins, Date hins, String idusuins,
			Date dtalt, Date halt, String idusualt) {
		this.sgitprefere6 = sgitprefere6;
		this.fnitreceber = fnitreceber;
		this.stipofebraban = stipofebraban;
		this.sitremessa = sitremessa;
		this.sitretorno = sitretorno;
		this.nomearquivo = nomearquivo;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codrec", column = @Column(name = "CODREC", nullable = false)),
			@AttributeOverride(name = "nparcitrec", column = @Column(name = "NPARCITREC", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public FnfbnrecId getId() {
		return this.id;
	}

	public void setId(FnfbnrecId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODBANCO", referencedColumnName = "CODBANCO", nullable = false),
			@JoinColumn(name = "TIPOFEBRABAN", referencedColumnName = "TIPOFEBRABAN", nullable = false),
			@JoinColumn(name = "CODFILIALBO", referencedColumnName = "CODFILIALBO", nullable = false),
			@JoinColumn(name = "CODEMPBO", referencedColumnName = "CODEMPBO", nullable = false),
			@JoinColumn(name = "CODFILIALPF", referencedColumnName = "CODFILIAL", nullable = false),
			@JoinColumn(name = "CODEMPPF", referencedColumnName = "CODEMP", nullable = false) })
	public Sgitprefere6 getSgitprefere6() {
		return this.sgitprefere6;
	}

	public void setSgitprefere6(Sgitprefere6 sgitprefere6) {
		this.sgitprefere6 = sgitprefere6;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public Fnitreceber getFnitreceber() {
		return this.fnitreceber;
	}

	public void setFnitreceber(Fnitreceber fnitreceber) {
		this.fnitreceber = fnitreceber;
	}

	@Column(name = "STIPOFEBRABAN", nullable = false, length = 2)
	public String getStipofebraban() {
		return this.stipofebraban;
	}

	public void setStipofebraban(String stipofebraban) {
		this.stipofebraban = stipofebraban;
	}

	@Column(name = "SITREMESSA", nullable = false, length = 2)
	public String getSitremessa() {
		return this.sitremessa;
	}

	public void setSitremessa(String sitremessa) {
		this.sitremessa = sitremessa;
	}

	@Column(name = "SITRETORNO", nullable = false, length = 2)
	public String getSitretorno() {
		return this.sitretorno;
	}

	public void setSitretorno(String sitretorno) {
		this.sitretorno = sitretorno;
	}

	@Column(name = "NOMEARQUIVO", length = 200)
	public String getNomearquivo() {
		return this.nomearquivo;
	}

	public void setNomearquivo(String nomearquivo) {
		this.nomearquivo = nomearquivo;
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

	@Column(name = "IDUSUINS", nullable = false, length = 8)
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

	@Column(name = "IDUSUALT", length = 8)
	public String getIdusualt() {
		return this.idusualt;
	}

	public void setIdusualt(String idusualt) {
		this.idusualt = idusualt;
	}

}
