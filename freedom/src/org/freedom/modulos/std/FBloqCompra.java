/**
 * @version 05/03/2005 <BR>
 * @author Setpoint Inform�tica Ltda./Robson Sanchez <BR>
 *
 * Projeto: Freedom <BR>
 *  
 * Pacote: org.freedom.modulos.std <BR>
 * Classe: @(#)FBloqCompra.java <BR>
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
 * 
 */

package org.freedom.modulos.std;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import org.freedom.acao.CarregaEvent;
import org.freedom.acao.CarregaListener;
import org.freedom.bmps.Icone;
import org.freedom.componentes.GuardaCampo;
import org.freedom.componentes.JTextFieldPad;
import org.freedom.componentes.ListaCampos;
import org.freedom.componentes.Painel;
import org.freedom.funcoes.Funcoes;
import org.freedom.telas.Aplicativo;
import org.freedom.telas.FFilho;

public class FBloqCompra extends FFilho implements ActionListener, CarregaListener {
  private Painel pinFor = new Painel(350,100);
  private JPanel pnRod = new JPanel(new BorderLayout());
  private JTextFieldPad txtCodCompra = new JTextFieldPad();
  private JTextFieldPad txtDocCompra = new JTextFieldPad();
  private JTextFieldPad txtSerie = new JTextFieldPad();
  private JTextFieldPad txtBloqCompra = new JTextFieldPad();
  private JTextFieldPad txtVlrLiqCompra = new JTextFieldPad();
  private JTextFieldPad txtStatusCompra = new JTextFieldPad();
  private JButton btBloquear = new JButton("Executar",Icone.novo("btExecuta.gif"));
  private JButton btSair = new JButton("Sair",Icone.novo("btSair.gif"));
  private ListaCampos lcCompra = new ListaCampos(this);
  private Connection con = null;
  public FBloqCompra() {
    setTitulo("Bloqueio e desbloqueio de compras");
    setAtribos(50,50,350,250);
    
    Funcoes.setBordReq(txtCodCompra);
    txtDocCompra.setAtivo(false);
    txtSerie.setAtivo(false);
    txtVlrLiqCompra.setAtivo(false);
    txtStatusCompra.setAtivo(false);
    txtBloqCompra.setAtivo(false);
    
    txtCodCompra.setTipo(JTextFieldPad.TP_INTEGER,8,0);
    txtDocCompra.setTipo(JTextFieldPad.TP_INTEGER,8,0);
    txtVlrLiqCompra.setTipo(JTextFieldPad.TP_DECIMAL,15,2);
    txtSerie.setTipo(JTextFieldPad.TP_STRING,4,0);
    txtStatusCompra.setTipo(JTextFieldPad.TP_STRING,2,0);
    txtBloqCompra.setTipo(JTextFieldPad.TP_STRING,1,0);
    
    lcCompra.add(new GuardaCampo( txtCodCompra, "CodCompra", "N.pedido", ListaCampos.DB_PK, false));
    lcCompra.add(new GuardaCampo( txtDocCompra, "DocCompra", "Documento", ListaCampos.DB_SI, false));
    lcCompra.add(new GuardaCampo( txtSerie, "Serie", "S�rie", ListaCampos.DB_SI, false));
    lcCompra.add(new GuardaCampo( txtBloqCompra, "BloqCompra", "Bloqueio", ListaCampos.DB_SI, false));
    lcCompra.add(new GuardaCampo( txtVlrLiqCompra, "VlrLiqCompra", "V. Liq.", ListaCampos.DB_SI, false));
    lcCompra.add(new GuardaCampo( txtStatusCompra, "StatusCompra", "Status", ListaCampos.DB_SI, false));
    lcCompra.montaSql(false, "COMPRA", "CP");
    lcCompra.setReadOnly(true);
    lcCompra.addCarregaListener(this);
    txtCodCompra.setTabelaExterna(lcCompra);
    txtCodCompra.setFK(true);
    txtCodCompra.setNomeCampo("CodCompra");
    
    Container c = getContentPane();
    c.setLayout(new BorderLayout());
    
    btSair.setPreferredSize(new Dimension(100,30));

    pnRod.setPreferredSize(new Dimension(350,30));
    pnRod.add(btSair,BorderLayout.EAST);
    
    c.add(pnRod,BorderLayout.SOUTH);
    c.add(pinFor,BorderLayout.CENTER);
    
    btBloquear.setToolTipText("Bloqueia compra");

    pinFor.adic(new JLabel("N� Pedido"),7,0,80,20);
    pinFor.adic(txtCodCompra,7,20,80,20);
    pinFor.adic(new JLabel("Doc."),90,0,67,20);
    pinFor.adic(txtDocCompra,90,20,67,20);
    pinFor.adic(new JLabel("S�rie"),160,0,67,20);
    pinFor.adic(txtSerie,160,20,67,20);
    pinFor.adic(new JLabel("Valor"),230,0,100,20);
    pinFor.adic(txtVlrLiqCompra,230,20,100,20);
    pinFor.adic(new JLabel("Situa��o"),7,40,70,20);
    pinFor.adic(txtStatusCompra,7,60,70,20);
    pinFor.adic(new JLabel("Bloqueada"),80,40,70,20);
    pinFor.adic(txtBloqCompra,80,60,70,20);
    pinFor.adic(btBloquear,7,90,120,30);

  
    btSair.addActionListener(this);
    btBloquear.addActionListener(this);
  }
  
  public void beforeCarrega(CarregaEvent ce) {
      if (ce.getListaCampos()==lcCompra) {
          
      }
  }

  public void afterCarrega(CarregaEvent ce) {
      if (ce.getListaCampos()==lcCompra) {
          
      }
  }
  
  public void bloquear() {
    int iCodCompra = 0;
    String sStatus = null;
    String sBloqCompra = null;
    String sSQL = null;
    String sTexto = null;
    PreparedStatement ps = null;
    
    try {
        iCodCompra = txtCodCompra.getVlrInteger().intValue();
        sStatus = txtStatusCompra.getVlrString();
        sBloqCompra = txtBloqCompra.getVlrString();

        if (iCodCompra == 0) {
            Funcoes.mensagemInforma(this,"Nenhuma compra foi selecionada!");
            txtCodCompra.requestFocus();
            return;
        }
        if (sStatus.substring(0,1).equals("C")) {
            Funcoes.mensagemInforma(this,"Compra est� cancelada!");
            txtCodCompra.requestFocus();
            return;
        }
        if (sBloqCompra.equals("S")) {
            sBloqCompra = "N";
            sTexto = "desbloquear";
            Funcoes.mensagemInforma(this,"Esta compra encontra-se bloqueada!");
        }
        else { 
            sBloqCompra = "S";
            sTexto = "bloquear";
        }
        if (Funcoes.mensagemConfirma(this, "Deseja realmente "+sTexto+" esta compra?")==JOptionPane.YES_OPTION ) {
            sSQL = "EXECUTE PROCEDURE VDBLOQCOMPRASP(?,?,?,?,?)";
            ps = con.prepareStatement(sSQL);
            ps.setInt(1,Aplicativo.iCodEmp);
            ps.setInt(2,ListaCampos.getMasterFilial("VDCOMPRA"));
            ps.setInt(3,iCodCompra);
            ps.setString(4,sBloqCompra);
            ps.executeUpdate();
            ps.close();
            if (!con.getAutoCommit())
                con.commit();
            lcCompra.carregaDados();
        }
    }
    catch(SQLException e) {
        Funcoes.mensagemErro(this,"Erro bloqueando ou desbloqueando compra!\n"+e.getMessage());
    }
    finally {
        iCodCompra = 0;
        sStatus = null;
        sBloqCompra = null;
        sSQL = null;
        sTexto = null;
        ps = null;
    }
  }
  
  public void actionPerformed(ActionEvent evt) { 
    if (evt.getSource() == btSair)
      dispose();
    else if (evt.getSource() == btBloquear)
      bloquear();
  }
  
  public void setConexao(Connection cn) {
    con = cn;
    lcCompra.setConexao(cn);
  }
}

