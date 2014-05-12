package org.freedom.persist.entity;

// Generated 12/05/2014 09:11:34 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Sgempresa generated by hbm2java
 */
@Entity
@Table(name = "SGEMPRESA")
public class Sgempresa implements java.io.Serializable {

	private int codemp;
	private Sgmunicipio sgmunicipio;
	private String razemp;
	private String nomeemp;
	private String cnpjemp;
	private String inscemp;
	private String endemp;
	private Integer numemp;
	private String complemp;
	private String bairemp;
	private String cepemp;
	private String cidemp;
	private String ufemp;
	private String dddemp;
	private String foneemp;
	private String faxemp;
	private String emailemp;
	private String wwwemp;
	private String codeanemp;
	private String nomecontemp;
	private char multialmoxemp;
	private byte[] fotoemp;
	private BigDecimal percissemp;
	private String codpaisemp;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set sgobjetos = new HashSet(0);

	public Sgempresa() {
	}

	public Sgempresa(int codemp, char multialmoxemp, Date dtins, Date hins,
			String idusuins) {
		this.codemp = codemp;
		this.multialmoxemp = multialmoxemp;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Sgempresa(int codemp, Sgmunicipio sgmunicipio, String razemp,
			String nomeemp, String cnpjemp, String inscemp, String endemp,
			Integer numemp, String complemp, String bairemp, String cepemp,
			String cidemp, String ufemp, String dddemp, String foneemp,
			String faxemp, String emailemp, String wwwemp, String codeanemp,
			String nomecontemp, char multialmoxemp, byte[] fotoemp,
			BigDecimal percissemp, String codpaisemp, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt,
			Set sgobjetos) {
		this.codemp = codemp;
		this.sgmunicipio = sgmunicipio;
		this.razemp = razemp;
		this.nomeemp = nomeemp;
		this.cnpjemp = cnpjemp;
		this.inscemp = inscemp;
		this.endemp = endemp;
		this.numemp = numemp;
		this.complemp = complemp;
		this.bairemp = bairemp;
		this.cepemp = cepemp;
		this.cidemp = cidemp;
		this.ufemp = ufemp;
		this.dddemp = dddemp;
		this.foneemp = foneemp;
		this.faxemp = faxemp;
		this.emailemp = emailemp;
		this.wwwemp = wwwemp;
		this.codeanemp = codeanemp;
		this.nomecontemp = nomecontemp;
		this.multialmoxemp = multialmoxemp;
		this.fotoemp = fotoemp;
		this.percissemp = percissemp;
		this.codpaisemp = codpaisemp;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.sgobjetos = sgobjetos;
	}

	@Id
	@Column(name = "CODEMP", unique = true, nullable = false)
	public int getCodemp() {
		return this.codemp;
	}

	public void setCodemp(int codemp) {
		this.codemp = codemp;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODMUNIC", referencedColumnName = "CODMUNIC"),
			@JoinColumn(name = "SIGLAUF", referencedColumnName = "SIGLAUF"),
			@JoinColumn(name = "CODPAIS", referencedColumnName = "CODPAIS") })
	public Sgmunicipio getSgmunicipio() {
		return this.sgmunicipio;
	}

	public void setSgmunicipio(Sgmunicipio sgmunicipio) {
		this.sgmunicipio = sgmunicipio;
	}

	@Column(name = "RAZEMP", length = 50)
	public String getRazemp() {
		return this.razemp;
	}

	public void setRazemp(String razemp) {
		this.razemp = razemp;
	}

	@Column(name = "NOMEEMP", length = 50)
	public String getNomeemp() {
		return this.nomeemp;
	}

	public void setNomeemp(String nomeemp) {
		this.nomeemp = nomeemp;
	}

	@Column(name = "CNPJEMP", length = 14)
	public String getCnpjemp() {
		return this.cnpjemp;
	}

	public void setCnpjemp(String cnpjemp) {
		this.cnpjemp = cnpjemp;
	}

	@Column(name = "INSCEMP", length = 20)
	public String getInscemp() {
		return this.inscemp;
	}

	public void setInscemp(String inscemp) {
		this.inscemp = inscemp;
	}

	@Column(name = "ENDEMP", length = 50)
	public String getEndemp() {
		return this.endemp;
	}

	public void setEndemp(String endemp) {
		this.endemp = endemp;
	}

	@Column(name = "NUMEMP")
	public Integer getNumemp() {
		return this.numemp;
	}

	public void setNumemp(Integer numemp) {
		this.numemp = numemp;
	}

	@Column(name = "COMPLEMP", length = 20)
	public String getComplemp() {
		return this.complemp;
	}

	public void setComplemp(String complemp) {
		this.complemp = complemp;
	}

	@Column(name = "BAIREMP", length = 30)
	public String getBairemp() {
		return this.bairemp;
	}

	public void setBairemp(String bairemp) {
		this.bairemp = bairemp;
	}

	@Column(name = "CEPEMP", length = 8)
	public String getCepemp() {
		return this.cepemp;
	}

	public void setCepemp(String cepemp) {
		this.cepemp = cepemp;
	}

	@Column(name = "CIDEMP", length = 30)
	public String getCidemp() {
		return this.cidemp;
	}

	public void setCidemp(String cidemp) {
		this.cidemp = cidemp;
	}

	@Column(name = "UFEMP", length = 2)
	public String getUfemp() {
		return this.ufemp;
	}

	public void setUfemp(String ufemp) {
		this.ufemp = ufemp;
	}

	@Column(name = "DDDEMP", length = 4)
	public String getDddemp() {
		return this.dddemp;
	}

	public void setDddemp(String dddemp) {
		this.dddemp = dddemp;
	}

	@Column(name = "FONEEMP", length = 12)
	public String getFoneemp() {
		return this.foneemp;
	}

	public void setFoneemp(String foneemp) {
		this.foneemp = foneemp;
	}

	@Column(name = "FAXEMP", length = 9)
	public String getFaxemp() {
		return this.faxemp;
	}

	public void setFaxemp(String faxemp) {
		this.faxemp = faxemp;
	}

	@Column(name = "EMAILEMP", length = 50)
	public String getEmailemp() {
		return this.emailemp;
	}

	public void setEmailemp(String emailemp) {
		this.emailemp = emailemp;
	}

	@Column(name = "WWWEMP", length = 50)
	public String getWwwemp() {
		return this.wwwemp;
	}

	public void setWwwemp(String wwwemp) {
		this.wwwemp = wwwemp;
	}

	@Column(name = "CODEANEMP", length = 10)
	public String getCodeanemp() {
		return this.codeanemp;
	}

	public void setCodeanemp(String codeanemp) {
		this.codeanemp = codeanemp;
	}

	@Column(name = "NOMECONTEMP", length = 40)
	public String getNomecontemp() {
		return this.nomecontemp;
	}

	public void setNomecontemp(String nomecontemp) {
		this.nomecontemp = nomecontemp;
	}

	@Column(name = "MULTIALMOXEMP", nullable = false, length = 1)
	public char getMultialmoxemp() {
		return this.multialmoxemp;
	}

	public void setMultialmoxemp(char multialmoxemp) {
		this.multialmoxemp = multialmoxemp;
	}

	@Column(name = "FOTOEMP")
	public byte[] getFotoemp() {
		return this.fotoemp;
	}

	public void setFotoemp(byte[] fotoemp) {
		this.fotoemp = fotoemp;
	}

	@Column(name = "PERCISSEMP", precision = 6)
	public BigDecimal getPercissemp() {
		return this.percissemp;
	}

	public void setPercissemp(BigDecimal percissemp) {
		this.percissemp = percissemp;
	}

	@Column(name = "CODPAISEMP", length = 3)
	public String getCodpaisemp() {
		return this.codpaisemp;
	}

	public void setCodpaisemp(String codpaisemp) {
		this.codpaisemp = codpaisemp;
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

	/*@OneToMany(fetch = FetchType.LAZY, mappedBy = "sgempresa")
	public Set getSgobjetos() {
		return this.sgobjetos;
	}

	public void setSgobjetos(Set sgobjetos) {
		this.sgobjetos = sgobjetos;
	}
*/
}
