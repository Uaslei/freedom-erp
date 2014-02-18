package org.freedom.persist.entity;

// Generated 18/02/2014 15:53:28 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Fnconta generated by hbm2java
 */
public class Fnconta implements java.io.Serializable {

	private FncontaId id;
	private Sgfilial sgfilial;
	private Fnmoeda fnmoeda;
	private Fnhistpad fnhistpad;
	private Fnplanejamento fnplanejamento;
	private Fnbanco fnbanco;
	private String descconta;
	private char tipoconta;
	private Date dataconta;
	private String codcontdeb;
	private String codcontcred;
	private String agenciaconta;
	private String convcobconta;
	private char ativaconta;
	private char tusuconta;
	private char tipocaixa;
	private String postoconta;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set fnrecebers = new HashSet(0);
	private Set fnborderosForFnborderofkfnconta = new HashSet(0);
	private Set vdvendedors = new HashSet(0);
	private Set fnmodboletos = new HashSet(0);
	private Set fncontausus = new HashSet(0);
	private Set fnpagtocomis = new HashSet(0);
	private Set fnpagars = new HashSet(0);
	private Set fnborderosForFnborderofkfncontabor = new HashSet(0);
	private Set fnitpagars = new HashSet(0);
	private Set fnfbnclis = new HashSet(0);
	private Set fnitrecebers = new HashSet(0);
	private Set cpcompras = new HashSet(0);
	private Set vdvendas = new HashSet(0);
	private Set fnitmodboletos = new HashSet(0);
	private Set fnplanopags = new HashSet(0);
	private Set sgitprefere6s = new HashSet(0);

	public Fnconta() {
	}

	public Fnconta(FncontaId id, Sgfilial sgfilial, Fnmoeda fnmoeda,
			Fnplanejamento fnplanejamento, String descconta, char tipoconta,
			Date dataconta, char ativaconta, char tusuconta, char tipocaixa,
			Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.fnmoeda = fnmoeda;
		this.fnplanejamento = fnplanejamento;
		this.descconta = descconta;
		this.tipoconta = tipoconta;
		this.dataconta = dataconta;
		this.ativaconta = ativaconta;
		this.tusuconta = tusuconta;
		this.tipocaixa = tipocaixa;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Fnconta(FncontaId id, Sgfilial sgfilial, Fnmoeda fnmoeda,
			Fnhistpad fnhistpad, Fnplanejamento fnplanejamento,
			Fnbanco fnbanco, String descconta, char tipoconta, Date dataconta,
			String codcontdeb, String codcontcred, String agenciaconta,
			String convcobconta, char ativaconta, char tusuconta,
			char tipocaixa, String postoconta, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt,
			Set fnrecebers, Set fnborderosForFnborderofkfnconta,
			Set vdvendedors, Set fnmodboletos, Set fncontausus,
			Set fnpagtocomis, Set fnpagars,
			Set fnborderosForFnborderofkfncontabor, Set fnitpagars,
			Set fnfbnclis, Set fnitrecebers, Set cpcompras, Set vdvendas,
			Set fnitmodboletos, Set fnplanopags, Set sgitprefere6s) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.fnmoeda = fnmoeda;
		this.fnhistpad = fnhistpad;
		this.fnplanejamento = fnplanejamento;
		this.fnbanco = fnbanco;
		this.descconta = descconta;
		this.tipoconta = tipoconta;
		this.dataconta = dataconta;
		this.codcontdeb = codcontdeb;
		this.codcontcred = codcontcred;
		this.agenciaconta = agenciaconta;
		this.convcobconta = convcobconta;
		this.ativaconta = ativaconta;
		this.tusuconta = tusuconta;
		this.tipocaixa = tipocaixa;
		this.postoconta = postoconta;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.fnrecebers = fnrecebers;
		this.fnborderosForFnborderofkfnconta = fnborderosForFnborderofkfnconta;
		this.vdvendedors = vdvendedors;
		this.fnmodboletos = fnmodboletos;
		this.fncontausus = fncontausus;
		this.fnpagtocomis = fnpagtocomis;
		this.fnpagars = fnpagars;
		this.fnborderosForFnborderofkfncontabor = fnborderosForFnborderofkfncontabor;
		this.fnitpagars = fnitpagars;
		this.fnfbnclis = fnfbnclis;
		this.fnitrecebers = fnitrecebers;
		this.cpcompras = cpcompras;
		this.vdvendas = vdvendas;
		this.fnitmodboletos = fnitmodboletos;
		this.fnplanopags = fnplanopags;
		this.sgitprefere6s = sgitprefere6s;
	}

	public FncontaId getId() {
		return this.id;
	}

	public void setId(FncontaId id) {
		this.id = id;
	}

	public Sgfilial getSgfilial() {
		return this.sgfilial;
	}

	public void setSgfilial(Sgfilial sgfilial) {
		this.sgfilial = sgfilial;
	}

	public Fnmoeda getFnmoeda() {
		return this.fnmoeda;
	}

	public void setFnmoeda(Fnmoeda fnmoeda) {
		this.fnmoeda = fnmoeda;
	}

	public Fnhistpad getFnhistpad() {
		return this.fnhistpad;
	}

	public void setFnhistpad(Fnhistpad fnhistpad) {
		this.fnhistpad = fnhistpad;
	}

	public Fnplanejamento getFnplanejamento() {
		return this.fnplanejamento;
	}

	public void setFnplanejamento(Fnplanejamento fnplanejamento) {
		this.fnplanejamento = fnplanejamento;
	}

	public Fnbanco getFnbanco() {
		return this.fnbanco;
	}

	public void setFnbanco(Fnbanco fnbanco) {
		this.fnbanco = fnbanco;
	}

	public String getDescconta() {
		return this.descconta;
	}

	public void setDescconta(String descconta) {
		this.descconta = descconta;
	}

	public char getTipoconta() {
		return this.tipoconta;
	}

	public void setTipoconta(char tipoconta) {
		this.tipoconta = tipoconta;
	}

	public Date getDataconta() {
		return this.dataconta;
	}

	public void setDataconta(Date dataconta) {
		this.dataconta = dataconta;
	}

	public String getCodcontdeb() {
		return this.codcontdeb;
	}

	public void setCodcontdeb(String codcontdeb) {
		this.codcontdeb = codcontdeb;
	}

	public String getCodcontcred() {
		return this.codcontcred;
	}

	public void setCodcontcred(String codcontcred) {
		this.codcontcred = codcontcred;
	}

	public String getAgenciaconta() {
		return this.agenciaconta;
	}

	public void setAgenciaconta(String agenciaconta) {
		this.agenciaconta = agenciaconta;
	}

	public String getConvcobconta() {
		return this.convcobconta;
	}

	public void setConvcobconta(String convcobconta) {
		this.convcobconta = convcobconta;
	}

	public char getAtivaconta() {
		return this.ativaconta;
	}

	public void setAtivaconta(char ativaconta) {
		this.ativaconta = ativaconta;
	}

	public char getTusuconta() {
		return this.tusuconta;
	}

	public void setTusuconta(char tusuconta) {
		this.tusuconta = tusuconta;
	}

	public char getTipocaixa() {
		return this.tipocaixa;
	}

	public void setTipocaixa(char tipocaixa) {
		this.tipocaixa = tipocaixa;
	}

	public String getPostoconta() {
		return this.postoconta;
	}

	public void setPostoconta(String postoconta) {
		this.postoconta = postoconta;
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

	public Set getFnrecebers() {
		return this.fnrecebers;
	}

	public void setFnrecebers(Set fnrecebers) {
		this.fnrecebers = fnrecebers;
	}

	public Set getFnborderosForFnborderofkfnconta() {
		return this.fnborderosForFnborderofkfnconta;
	}

	public void setFnborderosForFnborderofkfnconta(
			Set fnborderosForFnborderofkfnconta) {
		this.fnborderosForFnborderofkfnconta = fnborderosForFnborderofkfnconta;
	}

	public Set getVdvendedors() {
		return this.vdvendedors;
	}

	public void setVdvendedors(Set vdvendedors) {
		this.vdvendedors = vdvendedors;
	}

	public Set getFnmodboletos() {
		return this.fnmodboletos;
	}

	public void setFnmodboletos(Set fnmodboletos) {
		this.fnmodboletos = fnmodboletos;
	}

	public Set getFncontausus() {
		return this.fncontausus;
	}

	public void setFncontausus(Set fncontausus) {
		this.fncontausus = fncontausus;
	}

	public Set getFnpagtocomis() {
		return this.fnpagtocomis;
	}

	public void setFnpagtocomis(Set fnpagtocomis) {
		this.fnpagtocomis = fnpagtocomis;
	}

	public Set getFnpagars() {
		return this.fnpagars;
	}

	public void setFnpagars(Set fnpagars) {
		this.fnpagars = fnpagars;
	}

	public Set getFnborderosForFnborderofkfncontabor() {
		return this.fnborderosForFnborderofkfncontabor;
	}

	public void setFnborderosForFnborderofkfncontabor(
			Set fnborderosForFnborderofkfncontabor) {
		this.fnborderosForFnborderofkfncontabor = fnborderosForFnborderofkfncontabor;
	}

	public Set getFnitpagars() {
		return this.fnitpagars;
	}

	public void setFnitpagars(Set fnitpagars) {
		this.fnitpagars = fnitpagars;
	}

	public Set getFnfbnclis() {
		return this.fnfbnclis;
	}

	public void setFnfbnclis(Set fnfbnclis) {
		this.fnfbnclis = fnfbnclis;
	}

	public Set getFnitrecebers() {
		return this.fnitrecebers;
	}

	public void setFnitrecebers(Set fnitrecebers) {
		this.fnitrecebers = fnitrecebers;
	}

	public Set getCpcompras() {
		return this.cpcompras;
	}

	public void setCpcompras(Set cpcompras) {
		this.cpcompras = cpcompras;
	}

	public Set getVdvendas() {
		return this.vdvendas;
	}

	public void setVdvendas(Set vdvendas) {
		this.vdvendas = vdvendas;
	}

	public Set getFnitmodboletos() {
		return this.fnitmodboletos;
	}

	public void setFnitmodboletos(Set fnitmodboletos) {
		this.fnitmodboletos = fnitmodboletos;
	}

	public Set getFnplanopags() {
		return this.fnplanopags;
	}

	public void setFnplanopags(Set fnplanopags) {
		this.fnplanopags = fnplanopags;
	}

	public Set getSgitprefere6s() {
		return this.sgitprefere6s;
	}

	public void setSgitprefere6s(Set sgitprefere6s) {
		this.sgitprefere6s = sgitprefere6s;
	}

}
