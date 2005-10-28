/**
 * @version 02/11/2003 <BR>
 * @author Setpoint Inform�tica Ltda./Fernando Oliveira da Silva <BR>
 * 
 * Projeto: Freedom <BR>
 * 
 * Pacote: org.freedom.modulos.std <BR>
 * Classe:
 * @(#)FRResumoDiario.java <BR>
 * 
 * Este programa � licenciado de acordo com a LPG-PC (Licen�a P�blica Geral para
 * Programas de Computador), <BR>
 * vers�o 2.1.0 ou qualquer vers�o posterior. <BR>
 * A LPG-PC deve acompanhar todas PUBLICA��ES, DISTRIBUI��ES e REPRODU��ES deste
 * Programa. <BR>
 * Caso uma c�pia da LPG-PC n�o esteja dispon�vel junto com este Programa, voc�
 * pode contatar <BR>
 * o LICENCIADOR ou ent�o pegar uma c�pia em: <BR>
 * Licen�a: http://www.lpg.adv.br/licencas/lpgpc.rtf <BR>
 * Para poder USAR, PUBLICAR, DISTRIBUIR, REPRODUZIR ou ALTERAR este Programa �
 * preciso estar <BR>
 * de acordo com os termos da LPG-PC <BR>
 * <BR>
 * 
 * Coment�rios sobre a classe...
 *  
 */

package org.freedom.modulos.std;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.Vector;

import javax.swing.BorderFactory;

import org.freedom.componentes.GuardaCampo;
import org.freedom.componentes.ImprimeOS;
import org.freedom.componentes.JLabelPad;
import org.freedom.componentes.JRadioGroup;
import org.freedom.componentes.JTextFieldFK;
import org.freedom.componentes.JTextFieldPad;
import org.freedom.componentes.ListaCampos;
import org.freedom.funcoes.Funcoes;
import org.freedom.telas.Aplicativo;
import org.freedom.telas.FRelatorio;

public class FRResumoDiario extends FRelatorio {
	private static final long serialVersionUID = 1L;

	private JTextFieldPad txtDataini = new JTextFieldPad(JTextFieldPad.TP_DATE,10, 0);
	private JTextFieldPad txtDatafim = new JTextFieldPad(JTextFieldPad.TP_DATE,10, 0);
	private JTextFieldPad txtCodVend = new JTextFieldPad(JTextFieldPad.TP_INTEGER, 8, 0);
	private JTextFieldFK txtDescVend = new JTextFieldFK(JTextFieldPad.TP_STRING, 50, 0);
	private ListaCampos lcVend = new ListaCampos(this);
	private JRadioGroup rgFaturados = null;
	private JRadioGroup rgFinanceiro = null;
	private Vector vLabs = new Vector();
	private Vector vVals = new Vector();
	private Vector vLabsFat = new Vector();
	private Vector vValsFat = new Vector();
	private Vector vLabsFin = new Vector();
	private Vector vValsFin = new Vector();
	private JRadioGroup rgFormato = null;
	private int iLinha = 1;
	private int iCol = 1;

	public FRResumoDiario() {
		setTitulo("Resumo Diario");
		setAtribos(80, 80, 296, 320);

		txtDataini.setVlrDate(new Date());
		txtDatafim.setVlrDate(new Date());
		JLabelPad lbLinha = new JLabelPad();
		lbLinha.setBorder(BorderFactory.createEtchedBorder());

		adic(new JLabelPad("Periodo:"), 7, 5, 100, 20);
		adic(lbLinha, 60, 15, 210, 2);
		adic(new JLabelPad("De:"), 7, 30, 30, 20);
		adic(txtDataini, 32, 30, 97, 20);
		adic(new JLabelPad("At�:"), 140, 30, 30, 20);
		adic(txtDatafim, 170, 30, 100, 20);

		lcVend.add(new GuardaCampo(txtCodVend, "CodVend", "C�d.comiss.",ListaCampos.DB_PK, false));
		lcVend.add(new GuardaCampo(txtDescVend, "NomeVend","Nome do comissionado", ListaCampos.DB_SI, false));
		lcVend.montaSql(false, "VENDEDOR", "VD");
		lcVend.setQueryCommit(false);
		lcVend.setReadOnly(true);
		txtCodVend.setNomeCampo("CodVend");
		txtCodVend.setFK(true);
		txtCodVend.setTabelaExterna(lcVend);

		adic(new JLabelPad("C�d.comiss."), 7, 60, 210, 20);
		adic(txtCodVend, 7, 80, 70, 20);
		adic(new JLabelPad("Nome do comissionado"), 80, 60, 210, 20);
		adic(txtDescVend, 80, 80, 190, 20);
		
		vLabs.addElement("Detalhado");
		vLabs.addElement("Resumido");
		vVals.addElement("D");
		vVals.addElement("R");
		rgFormato = new JRadioGroup(1, 2, vLabs, vVals);
		rgFormato.setVlrString("D");

		vLabsFat.addElement("Faturado");
		vLabsFat.addElement("N�o Faturado");
		vLabsFat.addElement("Ambos");
		vValsFat.addElement("S");
		vValsFat.addElement("N");
		vValsFat.addElement("A");
		rgFaturados = new JRadioGroup(3, 1, vLabsFat, vValsFat);
		rgFaturados.setVlrString("S");
		
		vLabsFin.addElement("Financeiro");
		vLabsFin.addElement("N�o Finaceiro");
		vLabsFin.addElement("Ambos");
		vValsFin.addElement("S");
		vValsFin.addElement("N");
		vValsFin.addElement("A");
		rgFinanceiro = new JRadioGroup(3, 1, vLabsFin, vValsFin);
		rgFinanceiro.setVlrString("S");
	    
		adic(rgFormato, 7, 115, 265, 30);
		adic(rgFaturados, 7, 160, 120, 70);
		adic(rgFinanceiro, 153, 160, 120, 70);

	}

	public void setConexao(Connection cn) {
		super.setConexao(cn);
		lcVend.setConexao(con);
	}

	public void imprimir(boolean bVisualizar) {

		String sWhere = "";
		String sWhere1 = "";
		String sWhere2 = "";
		String sCab = "";

		if (txtDatafim.getVlrDate().before(txtDataini.getVlrDate())) {
			Funcoes.mensagemInforma(this,"Data final maior que a data inicial!");
			return;
		}

		if (txtCodVend.getText().trim().length() > 0) {
			sWhere += " AND V.CODVEND = " + txtCodVend.getText().trim();
			sCab = "COMISS.: " + txtCodVend.getVlrString() + " - "+ txtDescVend.getText().trim();
			sWhere += " AND V.CODEMPVD=" + Aplicativo.iCodEmp+ " AND V.CODFILIALVD=" + lcVend.getCodFilial();
		} 
		
		if(rgFaturados.getVlrString().equals("S")){
			sWhere1 = " AND TM.FISCALTIPOMOV='S' ";
			sCab += " - SO FATURADO";
		}
		else if(rgFaturados.getVlrString().equals("N")){
			sWhere1 = " AND TM.FISCALTIPOMOV='N' ";
			sCab += " - NAO FATURADO";
		}
		else if(rgFaturados.getVlrString().equals("A")){
			sWhere1 = " AND TM.FISCALTIPOMOV IN ('S','N') ";
		}	
		if(rgFinanceiro.getVlrString().equals("S")){
			sWhere2 = " AND TM.SOMAVDTIPOMOV='S' ";
			sCab += " - SO FINANCEIRO";
		}
		else if(rgFinanceiro.getVlrString().equals("N")){
			sWhere2 = " AND TM.SOMAVDTIPOMOV='N' ";
			sCab += " - NAO FINANCEIRO";
		}
		else if(rgFinanceiro.getVlrString().equals("A")){
			sWhere2 = " AND TM.SOMAVDTIPOMOV IN ('S','N') ";
		}

		ImprimeOS imp = new ImprimeOS("", con);
		int linPag = imp.verifLinPag() - 1;
		boolean bFimDia = false;
		String sSQL = "";

		BigDecimal bTotalDiaVal = new BigDecimal("0");
		BigDecimal bTotalDiaDesc = new BigDecimal("0");
		BigDecimal bTotalDiaLiq = new BigDecimal("0");

		BigDecimal bTotalVal = new BigDecimal("0");
		BigDecimal bTotalDesc = new BigDecimal("0");
		BigDecimal bTotalLiq = new BigDecimal("0");

		String sDataini = "";
		String sDatafim = "";
		String sDtemitvenda = "";

		sDataini = txtDataini.getVlrString();
		sDatafim = txtDatafim.getVlrString();

		if (rgFormato.getVlrString().equals("D")) {
			sSQL = "SELECT V.DTEMITVENDA,V.CODTIPOMOV,V.CODVENDA,V.DOCVENDA,V.SERIE,"
					+ "V.STATUSVENDA,V.DOCVENDA,"
					+ "V.DTEMITVENDA,V.VLRPRODVENDA,V.VLRLIQVENDA,"
					+ "V.CODPLANOPAG,P.DESCPLANOPAG,"
					+ "V.VLRCOMISVENDA,V.VLRDESCITVENDA,"
					+ "V.CODCLI,C.RAZCLI,V.STATUSVENDA"
					+ " FROM VDVENDA V,VDCLIENTE C,FNPLANOPAG P, EQTIPOMOV TM "
					+ "WHERE TM.CODTIPOMOV=V.CODTIPOMOV"
					+ " AND TM.CODEMP=V.CODEMPTM"
					+ " AND TM.CODFILIAL=V.CODFILIALTM"
					+ " AND C.CODCLI=V.CODCLI"
					+ " AND C.CODEMP=V.CODEMPCL AND C.CODFILIAL=V.CODFILIALCL"
					+ " AND V.DTEMITVENDA BETWEEN ? AND ? AND "
					+ "P.CODPLANOPAG=V.CODPLANOPAG AND V.FLAG IN "
					+ Aplicativo.carregaFiltro(con,org.freedom.telas.Aplicativo.iCodEmp)
					+ " AND V.CODEMP=? AND V.CODFILIAL=?"
					+ sWhere1 + sWhere2
					+ " AND NOT SUBSTR(V.STATUSVENDA,1,1)='C' "
					+ sWhere + " ORDER BY V.DTEMITVENDA,V.DOCVENDA";
			//				  " AND TM.TIPOMOV IN ('VD','PV','VT','SE')"+

		} else if (rgFormato.getVlrString().equals("R")) {
			sSQL = "SELECT V.DTEMITVENDA,SUM(V.VLRLIQVENDA) FROM VDVENDA V,"
					+ " EQTIPOMOV TM WHERE V.DTEMITVENDA BETWEEN ? AND ? AND V.FLAG IN "
					+ Aplicativo.carregaFiltro(con,org.freedom.telas.Aplicativo.iCodEmp)
					+ " AND TM.CODEMP=V.CODEMPTM"
					+ " AND TM.CODFILIAL=V.CODFILIALTM"
					+ " AND TM.CODTIPOMOV=V.CODTIPOMOV"
					+ sWhere1 + sWhere2			
					+ " AND V.CODEMP=? AND V.CODFILIAL=? "
					+ sWhere + " GROUP BY V.DTEMITVENDA";

		}

		System.out.println(sSQL);

		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = con.prepareStatement(sSQL);
			ps.setDate(1, Funcoes.dateToSQLDate(txtDataini.getVlrDate()));
			ps.setDate(2, Funcoes.dateToSQLDate(txtDatafim.getVlrDate()));
			ps.setInt(3, Aplicativo.iCodEmp);
			ps.setInt(4, ListaCampos.getMasterFilial("VDVENDA"));
			rs = ps.executeQuery();
			imp.limpaPags();

			if (rgFormato.getVlrString().equals("D")) {
				
				imp.setTitulo("Resumo Di�rio de Vendas");
				imp.addSubTitulo("RESUMO DIARIO DE VENDAS   -   PERIODO DE :"+ sDataini + " At�: " + sDatafim);
				if (sCab.length() > 0) {
					imp.addSubTitulo(sCab);
				}

				while (rs.next()) {
					if (imp.pRow() >= (linPag - 1)) {
						imp.say(imp.pRow() + 1, 0, "" + imp.comprimido());
						imp.say(imp.pRow() + 0, 0, "+"+ Funcoes.replicate("-", 133) + "+");
						imp.incPags();
						imp.eject();
					}

					
					if (imp.pRow() == 0) {
						imp.montaCab();						
						imp.impCab(136, true);

						imp.say(imp.pRow() + 0, 0, "" + imp.comprimido());
						imp.say(imp.pRow() + 0, 0, "|");
						imp.say(imp.pRow() + 0, 135, "|");
						imp.say(imp.pRow() + 1, 0, "" + imp.comprimido());
						imp.say(imp.pRow() + 0, 0, "|"+ Funcoes.replicate("-", 133) + "|");
						imp.say(imp.pRow() + 1, 0, "" + imp.comprimido());
						imp.say(imp.pRow() + 0, 0, "| Dt. Emissao");
						imp.say(imp.pRow() + 0, 17, "NF./Ped.");
						imp.say(imp.pRow() + 0, 31, "Cliente");
						imp.say(imp.pRow() + 0, 85, "|    Valor   Desconto "+ "  Liquido    F.Pagto.");
						imp.say(imp.pRow() + 0, 135, "|");
						imp.say(imp.pRow() + 1, 0, "" + imp.comprimido());
						imp.say(imp.pRow() + 0, 0, "|"+ Funcoes.replicate("-", 133) + "|");
					}
					if ((!Funcoes.sqlDateToStrDate(rs.getDate("dtemitvenda")).equals(sDtemitvenda))& (bFimDia)) {
						imp.say(imp.pRow() + 1, 0, "" + imp.comprimido());
						imp.say(imp.pRow() + 0, 0, "|"+ Funcoes.replicate("-", 133) + "|");
						imp.say(imp.pRow() + 1, 0, "" + imp.comprimido());
						imp.say(imp.pRow() + 0, 0, "|");
						imp.say(imp.pRow() + 0, 58, "Totais do Dia-> "+ sDtemitvenda+ " |"+ Funcoes.strDecimalToStrCurrency(10, 2, ""+ bTotalDiaVal)
								+ Funcoes.strDecimalToStrCurrency(10, 2, ""+ bTotalDiaDesc)+ Funcoes.strDecimalToStrCurrency(11, 2, ""+ bTotalDiaLiq));
						imp.say(imp.pRow(), 135, "|");
						imp.say(imp.pRow() + 1, 0, "" + imp.comprimido());
						imp.say(imp.pRow() + 0, 0, "|"+ Funcoes.replicate("-", 133) + "|");
						bTotalDiaVal = new BigDecimal("0");
						bTotalDiaDesc = new BigDecimal("0");
						bTotalDiaLiq = new BigDecimal("0");
						bFimDia = false;
					}
					imp.say(imp.pRow() + 1, 0, "" + imp.comprimido());
					imp.say(imp.pRow() + 0, 0, "|");
					if (!Funcoes.sqlDateToStrDate(rs.getDate("dtemitvenda")).equals(sDtemitvenda)) {
						imp.say(imp.pRow() + 0, 3, Funcoes.sqlDateToStrDate(rs.getDate("dtemitvenda")));
					}

					imp.say(imp.pRow() + 0, 17, rs.getString("StatusVenda").substring(0, 1).equals("P") ? "P-"+ Funcoes.copy(rs.getString("codvenda"), 0, 6): "V-"+ Funcoes.copy(rs.getString("docvenda"), 0,6));
					imp.say(imp.pRow() + 0, 31, Funcoes.copy(rs.getString("codcli"), 0, 8)+ "-"+ Funcoes.copy(rs.getString("razcli"), 0, 45)+ "|"+ Funcoes.strDecimalToStrCurrency(10, 2, rs.getString("vlrprodvenda"))
							+ Funcoes.strDecimalToStrCurrency(10, 2, rs.getString("vlrdescitvenda"))+ Funcoes.strDecimalToStrCurrency(11, 2, rs.getString("vlrliqvenda"))+ "  "+ Funcoes.copy(rs.getString("descplanopag"), 0, 16)+ "|");
					if (rs.getString("VlrProdVenda") != null) {
						bTotalDiaVal = bTotalDiaVal.add(new BigDecimal(rs.getString("VlrProdVenda")));
						bTotalVal = bTotalVal.add(new BigDecimal(rs.getString("VlrProdVenda")));
					}

					if (rs.getString("VlrDescitvenda") != null) {
						bTotalDiaDesc = bTotalDiaDesc.add(new BigDecimal(rs.getString("VlrDescitVenda")));
						bTotalDesc = bTotalDesc.add(new BigDecimal(rs.getString("VlrDescitVenda")));
					}

					if (rs.getString("VlrLiqVenda") != null) {
						bTotalDiaLiq = bTotalDiaLiq.add(new BigDecimal(rs.getString("VlrLiqVenda")));
						bTotalLiq = bTotalLiq.add(new BigDecimal(rs.getString("VlrLiqVenda")));
					}

					bFimDia = true;
					sDtemitvenda = Funcoes.sqlDateToStrDate(rs.getDate("Dtemitvenda"));

				}

				if (bFimDia) {
					imp.say(imp.pRow() + 1, 0, "" + imp.comprimido());
					imp.say(imp.pRow() + 0, 0, "|"+ Funcoes.replicate("-", 133) + "|");
					imp.say(imp.pRow() + 1, 0, "" + imp.comprimido());
					imp.say(imp.pRow() + 0, 0, "|");
					imp.say(imp.pRow() + 0, 58, "Totais do Dia-> "+ sDtemitvenda+ " |"
							+ Funcoes.strDecimalToStrCurrency(10, 2, ""+ bTotalDiaVal)
							+ Funcoes.strDecimalToStrCurrency(10, 2, ""+ bTotalDiaDesc)
							+ Funcoes.strDecimalToStrCurrency(11, 2, ""+ bTotalDiaLiq));
					imp.say(imp.pRow(), 135, "|");
				}

				imp.say(imp.pRow() + 1, 0, "" + imp.comprimido());
				imp.say(imp.pRow(), 0, "|" + Funcoes.replicate("=", 133) + "|");
				imp.say(imp.pRow() + 1, 0, "" + imp.comprimido());
				imp.say(imp.pRow() + 0, 0, "|");
				imp.say(imp.pRow() + 0, 69, "Totais Geral    |"+ Funcoes.strDecimalToStrCurrency(10, 2, ""+ bTotalVal)
								+ Funcoes.strDecimalToStrCurrency(10, 2, ""+ bTotalDesc)
								+ Funcoes.strDecimalToStrCurrency(11, 2, ""+ bTotalLiq));
				imp.say(imp.pRow(), 135, "|");
				imp.say(imp.pRow() + 1, 0, "" + imp.comprimido());
				imp.say(imp.pRow() + 0, 0, "|" + Funcoes.replicate("=", 133)+ "|");

			} else if (rgFormato.getVlrString().equals("R")) {
				iLinha = 1;
				iCol = 0;
				
				imp.setTitulo("Resumo Di�rio de Vendas");
				imp.addSubTitulo("RESUMO DE TOTAL DE VENDAS - PERIODO DE :"+ sDataini + " At�: " + sDatafim);
				if (sCab.length() > 0) {
					imp.addSubTitulo(sCab);
				}
				
				while (rs.next()) {
					if (imp.pRow() >= (linPag - 1)) {
						imp.say(imp.pRow() + 1, 0, "" + imp.comprimido());
						imp.say(imp.pRow() + 0, 0, "|"+ Funcoes.replicate("-", 133) + "|");
						imp.incPags();
						imp.eject();
					}
					if (imp.pRow() == 0) {
						imp.montaCab();
						
						imp.impCab(136, true);

						imp.say(imp.pRow() + 0, 0,"|" + Funcoes.replicate("-", 133) + "|");
						imp.say(imp.pRow() + 1, 0, "" + imp.comprimido());
						imp.say(imp.pRow() + 0, 0, "|  Data");
						imp.say(imp.pRow() + 0, 14, "        Valor");
						imp.say(imp.pRow() + 0, 35, "|  Data");
						imp.say(imp.pRow() + 0, 49, "        Valor");
						imp.say(imp.pRow() + 0, 70, "|  Data");
						imp.say(imp.pRow() + 0, 84, "        Valor");
						imp.say(imp.pRow() + 0, 105, "|  Data");
						imp.say(imp.pRow() + 0, 119, "       Valor");
						imp.say(imp.pRow() + 0, 135, "|");
						imp.say(imp.pRow() + 1, 0, "|"+ Funcoes.replicate("-", 133) + "|");

					}

					imp.say(imp.pRow() + iLinha, iCol, "|  "+ Funcoes.sqlDateToStrDate(rs.getDate(1)));
					imp.say(imp.pRow() + 0, iCol + 14, " "+ Funcoes.strDecimalToStrCurrency(15, 2, ""+ rs.getString(2)));

					if (iCol == 0) {
						iLinha = 0;
						iCol = 35;
					} else if (iCol == 35)
						iCol = 70;
					else if (iCol == 70)
						iCol = 105;
					else {
						imp.say(imp.pRow() + 0, 135, "|");
						iCol = 0;
						iLinha = 1;
					}

					if (rs.getString(2) != null) {
						bTotalDiaLiq = bTotalDiaLiq.add(new BigDecimal(rs.getString(2)));
						bTotalLiq = bTotalLiq.add(new BigDecimal(rs.getString(2)));
					}

				}

				if ((iCol < 105) && (iLinha == 0)) {
					imp.say(imp.pRow() + 0, 135, "|");
				}

			}

			imp.say(imp.pRow() + 1, 0, "+" + Funcoes.replicate("=", 133) + "+");
			imp.say(imp.pRow() + 1, 0, "|");
			imp.say(imp.pRow() + 0, 85, "| Total Geral do Per�odo   | "+ Funcoes.strDecimalToStrCurrency(11, 2, "" + bTotalLiq));
			imp.say(imp.pRow(), 135, "|");
			imp.say(imp.pRow() + 1, 0, "+" + Funcoes.replicate("=", 133) + "+");

			imp.eject();

			imp.fechaGravacao();

			//      rs.close();
			//      ps.close();
			if (!con.getAutoCommit())
				con.commit();
			//      dl.dispose();
		} catch (SQLException err) {
			Funcoes.mensagemErro(this, "Erro consulta tabela de vendas!\n"+ err.getMessage(),true,con,err);
		}

		if (bVisualizar) {
			imp.preview(this);
		} else {
			imp.print();
		}
	}
}