package org.freedom.persist.entity;

// Generated 20/11/2013 10:59:59 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Tkconfemail generated by hbm2java
 */
public class Tkconfemail implements java.io.Serializable {

	private TkconfemailId id;
	private String emailremet;
	private String nomeremet;
	private String usuarioremet;
	private char criptsenha;
	private String senharemet;
	private String emailresp;
	private String hostsmtp;
	private char usassl;
	private char usaautsmtp;
	private int portasmtp;
	private String assinatremet;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set tkemails = new HashSet(0);
	private Set sgprefere3sForSgprefere3fktkconf = new HashSet(0);
	private Set sgusuarios = new HashSet(0);
	private Set sgprefere3sForSgprefere3fktkcon2 = new HashSet(0);

	public Tkconfemail() {
	}

	public Tkconfemail(TkconfemailId id, String emailremet, String nomeremet,
			String usuarioremet, char criptsenha, String emailresp,
			String hostsmtp, char usassl, char usaautsmtp, int portasmtp,
			Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.emailremet = emailremet;
		this.nomeremet = nomeremet;
		this.usuarioremet = usuarioremet;
		this.criptsenha = criptsenha;
		this.emailresp = emailresp;
		this.hostsmtp = hostsmtp;
		this.usassl = usassl;
		this.usaautsmtp = usaautsmtp;
		this.portasmtp = portasmtp;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Tkconfemail(TkconfemailId id, String emailremet, String nomeremet,
			String usuarioremet, char criptsenha, String senharemet,
			String emailresp, String hostsmtp, char usassl, char usaautsmtp,
			int portasmtp, String assinatremet, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt,
			Set tkemails, Set sgprefere3sForSgprefere3fktkconf, Set sgusuarios,
			Set sgprefere3sForSgprefere3fktkcon2) {
		this.id = id;
		this.emailremet = emailremet;
		this.nomeremet = nomeremet;
		this.usuarioremet = usuarioremet;
		this.criptsenha = criptsenha;
		this.senharemet = senharemet;
		this.emailresp = emailresp;
		this.hostsmtp = hostsmtp;
		this.usassl = usassl;
		this.usaautsmtp = usaautsmtp;
		this.portasmtp = portasmtp;
		this.assinatremet = assinatremet;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.tkemails = tkemails;
		this.sgprefere3sForSgprefere3fktkconf = sgprefere3sForSgprefere3fktkconf;
		this.sgusuarios = sgusuarios;
		this.sgprefere3sForSgprefere3fktkcon2 = sgprefere3sForSgprefere3fktkcon2;
	}

	public TkconfemailId getId() {
		return this.id;
	}

	public void setId(TkconfemailId id) {
		this.id = id;
	}

	public String getEmailremet() {
		return this.emailremet;
	}

	public void setEmailremet(String emailremet) {
		this.emailremet = emailremet;
	}

	public String getNomeremet() {
		return this.nomeremet;
	}

	public void setNomeremet(String nomeremet) {
		this.nomeremet = nomeremet;
	}

	public String getUsuarioremet() {
		return this.usuarioremet;
	}

	public void setUsuarioremet(String usuarioremet) {
		this.usuarioremet = usuarioremet;
	}

	public char getCriptsenha() {
		return this.criptsenha;
	}

	public void setCriptsenha(char criptsenha) {
		this.criptsenha = criptsenha;
	}

	public String getSenharemet() {
		return this.senharemet;
	}

	public void setSenharemet(String senharemet) {
		this.senharemet = senharemet;
	}

	public String getEmailresp() {
		return this.emailresp;
	}

	public void setEmailresp(String emailresp) {
		this.emailresp = emailresp;
	}

	public String getHostsmtp() {
		return this.hostsmtp;
	}

	public void setHostsmtp(String hostsmtp) {
		this.hostsmtp = hostsmtp;
	}

	public char getUsassl() {
		return this.usassl;
	}

	public void setUsassl(char usassl) {
		this.usassl = usassl;
	}

	public char getUsaautsmtp() {
		return this.usaautsmtp;
	}

	public void setUsaautsmtp(char usaautsmtp) {
		this.usaautsmtp = usaautsmtp;
	}

	public int getPortasmtp() {
		return this.portasmtp;
	}

	public void setPortasmtp(int portasmtp) {
		this.portasmtp = portasmtp;
	}

	public String getAssinatremet() {
		return this.assinatremet;
	}

	public void setAssinatremet(String assinatremet) {
		this.assinatremet = assinatremet;
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

	public Set getTkemails() {
		return this.tkemails;
	}

	public void setTkemails(Set tkemails) {
		this.tkemails = tkemails;
	}

	public Set getSgprefere3sForSgprefere3fktkconf() {
		return this.sgprefere3sForSgprefere3fktkconf;
	}

	public void setSgprefere3sForSgprefere3fktkconf(
			Set sgprefere3sForSgprefere3fktkconf) {
		this.sgprefere3sForSgprefere3fktkconf = sgprefere3sForSgprefere3fktkconf;
	}

	public Set getSgusuarios() {
		return this.sgusuarios;
	}

	public void setSgusuarios(Set sgusuarios) {
		this.sgusuarios = sgusuarios;
	}

	public Set getSgprefere3sForSgprefere3fktkcon2() {
		return this.sgprefere3sForSgprefere3fktkcon2;
	}

	public void setSgprefere3sForSgprefere3fktkcon2(
			Set sgprefere3sForSgprefere3fktkcon2) {
		this.sgprefere3sForSgprefere3fktkcon2 = sgprefere3sForSgprefere3fktkcon2;
	}

}
