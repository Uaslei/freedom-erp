/**
 * @version 14/07/2003 <BR>
 * @author Setpoint Inform�tica Ltda./Fernando Oliveira da Silva <BR>
 *
 * Projeto: Freedom <BR>
 *  
 * Pacote: org.freedom.modulos.std <BR>
 * Classe: @(#)FBanco.java <BR>
 * 
 * Este programa � licenciado de acordo com a LPG-PC (Licen�a P�blica Geral para Programas de Computador), <BR>
 * vers�o 2.1.0 ou qualquer vers�o posterior. <BR>
 * A LPG-PC deve acompanhar todas PUBLICA��ES, DISTRIBUI��ES e REPRODU��ES deste Programa. <BR>
 * Caso uma c�pia da LPG-PC n�o esteja dispon�vel junto com este Programa, voc� pode contatar <BR>
 * o LICENCIADOR ou ent�o pegar uma c�pia em: <BR>
 * Licen�a: http://www.lpg.adv.br/licencas/lpgpc.rtf <BR>
 * Para poder USAR, PUBLICAR, DISTRIBUIR, REPRODUZIR ou ALTERAR este Programa � preciso estar <BR>
 * de acordo com os termos da LPG-PC <BR> <BR>
 *
 * Coment�rios sobre a classe...
 */

package org.freedom.modulos.std;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.freedom.componentes.GuardaCampo;
import org.freedom.componentes.ImprimeOS;
import org.freedom.componentes.JLabelPad;
import org.freedom.componentes.JTextFieldFK;
import org.freedom.componentes.JTextFieldPad;
import org.freedom.componentes.ListaCampos;
import org.freedom.funcoes.Funcoes;
import org.freedom.telas.FDados;

public class FBanco extends FDados implements ActionListener {

	private static final long serialVersionUID = 1L;

  private JTextFieldPad txtCodBanco = new JTextFieldPad(JTextFieldPad.TP_STRING,3,0);
  private JTextFieldPad txtNomeBanco = new JTextFieldPad(JTextFieldPad.TP_STRING,40,0);
  private JTextFieldPad txtCodModBol = new JTextFieldPad(JTextFieldPad.TP_INTEGER,8,0);
  private JTextFieldPad txtSiteBanco = new JTextFieldPad(JTextFieldPad.TP_STRING, 80, 0);
  private JTextFieldFK txtDescModBol = new JTextFieldFK(JTextFieldPad.TP_STRING,50,0);
  private ListaCampos lcModBol = new ListaCampos(this,"MB");
  public FBanco () {
  	super();
    setTitulo("Cadastro de Banco");
    setAtribos( 50, 50, 350, 195);

    lcModBol.add(new GuardaCampo( txtCodModBol, "CodModBol", "C�d.mod.bol.", ListaCampos.DB_PK, txtDescModBol,false));
    lcModBol.add(new GuardaCampo( txtDescModBol, "DescModBol", "Descri�ao do modelo de boleto", ListaCampos.DB_SI, null,false));
    lcModBol.montaSql(false, "MODBOLETO", "FN");    
    lcModBol.setQueryCommit(false);
    lcModBol.setReadOnly(true);
    txtCodModBol.setTabelaExterna(lcModBol);
    
    adicCampo(txtCodBanco, 7, 20, 70, 20,"CodBanco","C�d.banco",ListaCampos.DB_PK,null,true);
    adicCampo(txtNomeBanco, 80, 20, 250, 20,"NomeBanco","Nome do banco",ListaCampos.DB_SI,null,true);
    adicCampo(txtCodModBol, 7, 60, 70, 20, "CodModBol", "C�d.mod.", ListaCampos.DB_FK, txtDescModBol,false);
    adicCampo(txtSiteBanco, 7, 100, 325, 20, "SiteBanco", "Site ", ListaCampos.DB_SI, null,false);
    adicDescFK(txtDescModBol, 80, 60, 250, 20, "DescModBol", "Descri��o do modelo de boleto");
    setListaCampos( false, "BANCO", "FN");
    btImp.addActionListener(this);
    btPrevimp.addActionListener(this);
    lcCampos.setQueryInsert(false);  
    setImprimir(true);
  }
  public void actionPerformed(ActionEvent evt) {
    if (evt.getSource() == btPrevimp) {
        imprimir(true);
    }
    else if (evt.getSource() == btImp) 
      imprimir(false);
    super.actionPerformed(evt);
  }

  private void imprimir(boolean bVisualizar) {
    ImprimeOS imp = new ImprimeOS("",con);
    int linPag = imp.verifLinPag()-1;
    imp.montaCab();
    imp.setTitulo("Relat�rio de Bancos");
    DLRBanco dl = new DLRBanco(this);
    dl.setVisible(true);
    if (dl.OK == false) {
      dl.dispose();
      return;
    }
    String sSQL = "SELECT CODBANCO,NOMEBANCO FROM FNBANCO ORDER BY "+dl.getValor();
    PreparedStatement ps = null;
    ResultSet rs = null;
    try {
      ps = con.prepareStatement(sSQL);
      rs = ps.executeQuery();
      imp.limpaPags();
      while ( rs.next() ) {
         if (imp.pRow()==0) {
            imp.impCab(80, false);
            imp.say(imp.pRow()+0,0,""+imp.normal());
            imp.say(imp.pRow()+0,0,"");
            imp.say(imp.pRow()+0,2,"C�digo");
            imp.say(imp.pRow()+0,30,"Nome");
            imp.say(imp.pRow()+1,0,""+imp.normal());
            imp.say(imp.pRow()+0,0,Funcoes.replicate("-",79));
         }
         imp.say(imp.pRow()+1,0,""+imp.normal());
         imp.say(imp.pRow()+0,2,rs.getString("CodBanco"));
         imp.say(imp.pRow()+0,30,rs.getString("NomeBanco"));
         if (imp.pRow()>=linPag) {
            imp.incPags();
            imp.eject();
         }
      }
      
      imp.say(imp.pRow()+1,0,""+imp.normal());
      imp.say(imp.pRow()+0,0,Funcoes.replicate("=",79));
      imp.eject();
      
      imp.fechaGravacao();
      
//      rs.close();
//      ps.close();
      if (!con.getAutoCommit())
      	con.commit();
      dl.dispose();
    }  
    catch ( SQLException err ) {
		Funcoes.mensagemErro(this,"Erro consulta tabela de bancos!\n"+err.getMessage(),true,con,err);      
    }
    
    if (bVisualizar) {
      imp.preview(this);
    }
    else {
      imp.print();
    }
  }
  public void setConexao(Connection cn) {
  	super.setConexao(cn);
  	lcModBol.setConexao(cn);
  }
}
