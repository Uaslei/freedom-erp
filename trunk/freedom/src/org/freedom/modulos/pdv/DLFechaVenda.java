package org.freedom.modulos.pdv;

/**
 * @version 01/11/2005 <BR>
 * @author Setpoint Inform�tica Ltda./Alex Rodrigues <BR>
 * 
 * Projeto: Freedom <BR>
 * 
 * Pacote: org.freedom.modulos.pdv <BR>
 * Classe:
 * @(#)FFechaVenda.java <BR>
 * 
 * Este programa � licenciado de acordo com a LPG-PC (Licen�a P�blica Geral para Programas de Computador), <BR>
 * vers�o 2.1.0 ou qualquer vers�o posterior. <BR>
 * A LPG-PC deve acompanhar todas PUBLICA��ES, DISTRIBUI��ES e REPRODU��ES deste Programa. <BR>
 * Caso uma c�pia da LPG-PC n�o esteja dispon�vel junto com este Programa, voc� pode contatar <BR>
 * o LICENCIADOR ou ent�o pegar uma c�pia em: <BR>
 * Licen�a: http://www.lpg.adv.br/licencas/lpgpc.rtf <BR>
 * Para poder USAR, PUBLICAR, DISTRIBUIR, REPRODUZIR ou ALTERAR este Programa � preciso estar <BR>
 * de acordo com os termos da LPG-PC <BR>
 * <BR>
 * 
 * Tela de fechamento de venda no PDV.
 * 
 */

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.Properties;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.JScrollPane;

import org.freedom.acao.CarregaEvent;
import org.freedom.acao.CarregaListener;
import org.freedom.componentes.GuardaCampo;
import org.freedom.componentes.JLabelPad;
import org.freedom.componentes.JPanelPad;
import org.freedom.componentes.JRadioGroup;
import org.freedom.componentes.JTabbedPanePad;
import org.freedom.componentes.JTextFieldFK;
import org.freedom.componentes.JTextFieldPad;
import org.freedom.componentes.ListaCampos;
import org.freedom.componentes.Navegador;
import org.freedom.componentes.Tabela;
import org.freedom.comutacao.Tef;
import org.freedom.ecf.app.ControllerECF;
import org.freedom.funcoes.Funcoes;
import org.freedom.funcoes.Logger;
import org.freedom.modulos.std.DLFechaParcela;
import org.freedom.telas.Aplicativo;
import org.freedom.telas.AplicativoPDV;
import org.freedom.telas.FFDialogo;
import org.freedom.telas.FPassword;

public class DLFechaVenda extends FFDialogo implements FocusListener, CarregaListener, MouseListener {

	private static final long serialVersionUID = 1L;

	private final int casasDec = Aplicativo.casasDec;

	private final JTextFieldPad txtCodVenda = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );

	private final JTextFieldPad txtTipoVenda = new JTextFieldPad( JTextFieldPad.TP_STRING, 1, 0 );

	private final JTextFieldPad txtCodPlanoPag = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );

	private final JTextFieldFK txtDescPlanoPag = new JTextFieldFK( JTextFieldPad.TP_STRING, 50, 0 );

	private final JTextFieldPad txtCodVend = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );

	private final JTextFieldFK txtNomeVend = new JTextFieldFK( JTextFieldPad.TP_STRING, 50, 0 );

	private final JTextFieldPad txtCodClComis = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );

	private final JTextFieldFK txtDescClComis = new JTextFieldFK( JTextFieldPad.TP_STRING, 50, 0 );

	private final JTextFieldFK txtVlrCupom = new JTextFieldFK( JTextFieldPad.TP_DECIMAL, 12, 2 );

	private final JTextFieldPad txtVlrDinheiro = new JTextFieldPad( JTextFieldPad.TP_DECIMAL, 12, 2 );

	private final JTextFieldPad txtVlrCheque = new JTextFieldPad( JTextFieldPad.TP_DECIMAL, 12, 2 );

	private final JTextFieldPad txtVlrChequeElet = new JTextFieldPad( JTextFieldPad.TP_DECIMAL, 12, 2 );

	private final JTextFieldFK txtVlrPago = new JTextFieldFK( JTextFieldPad.TP_DECIMAL, 12, 2 );

	private final JTextFieldFK txtVlrTroco = new JTextFieldFK( JTextFieldPad.TP_DECIMAL, 12, 2 );

	private final JTextFieldPad txtCodTran = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );

	private final JTextFieldFK txtDescTran = new JTextFieldFK( JTextFieldPad.TP_STRING, 50, 0 );

	private final JTextFieldPad txtPlacaFreteVD = new JTextFieldPad( JTextFieldPad.TP_STRING, 10, 0 );

	private final JTextFieldPad txtUFFreteVD = new JTextFieldPad( JTextFieldPad.TP_STRING, 2, 0 );

	private final JTextFieldPad txtVlrFreteVD = new JTextFieldPad( JTextFieldPad.TP_NUMERIC, 15, 2 );

	private final JTextFieldPad txtConhecFreteVD = new JTextFieldPad( JTextFieldPad.TP_STRING, 13, 0 );

	private final JTextFieldPad txtQtdFreteVD = new JTextFieldPad( JTextFieldPad.TP_NUMERIC, 15, casasDec );

	private final JTextFieldPad txtPesoBrutVD = new JTextFieldPad( JTextFieldPad.TP_NUMERIC, 15, casasDec );

	private final JTextFieldPad txtPesoLiqVD = new JTextFieldPad( JTextFieldPad.TP_NUMERIC, 15, casasDec );

	private final JTextFieldPad txtEspFreteVD = new JTextFieldPad( JTextFieldPad.TP_STRING, 10, 0 );

	private final JTextFieldPad txtMarcaFreteVD = new JTextFieldPad( JTextFieldPad.TP_STRING, 10, 0 );

	private final JTextFieldPad txtCodAuxV = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 5, 0 );

	private final JTextFieldPad txtCPFCliAuxV = new JTextFieldPad( JTextFieldPad.TP_STRING, 11, 0 );

	private final JTextFieldPad txtNomeCliAuxV = new JTextFieldPad( JTextFieldPad.TP_STRING, 50, 0 );

	private final JTextFieldPad txtEndCliAuxV = new JTextFieldPad( JTextFieldPad.TP_STRING, 50, 0 );

	private final JTextFieldPad txtNumCliAuxV = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );

	private final JTextFieldPad txtCidCliAuxV = new JTextFieldPad( JTextFieldPad.TP_STRING, 30, 0 );

	private final JTextFieldPad txtUFCliAuxV = new JTextFieldPad( JTextFieldPad.TP_STRING, 2, 0 );	
	
	private final JTextFieldPad txtCodRec = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );

	private final JTextFieldPad txtVlrParcRec = new JTextFieldPad( JTextFieldPad.TP_NUMERIC, 15, 2 );

	private final JTextFieldPad txtAltUsuRec = new JTextFieldPad( JTextFieldPad.TP_STRING, 1, 0 );	

	private final JTextFieldPad txtNParcItRec = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );

	private final JTextFieldPad txtVlrParcItRec = new JTextFieldPad( JTextFieldPad.TP_NUMERIC, 15, 2 );

	private final JTextFieldPad txtVlrDescItRec = new JTextFieldPad( JTextFieldPad.TP_NUMERIC, 15, 2 );

	private final JTextFieldPad txtDtVencItRec = new JTextFieldPad( JTextFieldPad.TP_DATE, 10, 0 );
	
	private final JTextFieldPad txtCodTipoCobItRec = new JTextFieldPad( JTextFieldPad.TP_INTEGER, 8, 0 );
	
	private final JTextFieldFK txtDescTipoCobItRec = new JTextFieldFK( JTextFieldPad.TP_STRING, 40, 0 );
	
	private final JTextFieldPad txtCodBancoItRec = new JTextFieldPad( JTextFieldPad.TP_STRING, 3, 0 );
	
	private final JTextFieldFK txtDescBancoItRec = new JTextFieldFK( JTextFieldPad.TP_STRING, 40, 0 );

	private final JTextFieldPad txtCodCartCobItRec = new JTextFieldPad( JTextFieldPad.TP_STRING, 2, 0 );

	private final JTextFieldFK txtDescCartCobItRec = new JTextFieldFK( JTextFieldPad.TP_STRING, 50, 0 );	

	private final Vector<String> vVals = new Vector<String>();

	private final Vector<String> vLabs = new Vector<String>();

	private JRadioGroup<String, String> rgFreteVD = null;

	private final JTabbedPanePad tpn = new JTabbedPanePad();

	private final JPanelPad pnVenda = new JPanelPad( 400, 300 );

	private final JPanelPad pnAdic = new JPanelPad( 400, 300 );

	private final JPanelPad pnFrete = new JPanelPad( 400, 300 );

	private final JPanelPad pnReceber = new JPanelPad( JPanelPad.TP_JPANEL, new BorderLayout() );

	private final ListaCampos lcVendedor = new ListaCampos( this, "VD" );

	private final ListaCampos lcClComis = new ListaCampos( this, "CM" );

	private final ListaCampos lcPlanoPag = new ListaCampos( this, "PG" );

	private final ListaCampos lcTran = new ListaCampos( this, "TN" );

	private final ListaCampos lcAuxVenda = new ListaCampos( this );

	private final ListaCampos lcFreteVD = new ListaCampos( this );

	private final ListaCampos lcReceber = new ListaCampos( this );

	private final ListaCampos lcItReceber = new ListaCampos( this );
	
	private final ListaCampos lcTipoCobItRec = new ListaCampos( this, "TC" );

	private final ListaCampos lcBancoItRec = new ListaCampos( this, "BO" );

	private final ListaCampos lcCartCobItRec = new ListaCampos( this, "CB" );

	private final Navegador navItRec = new Navegador( false );

	private final Tabela tabRec = new Tabela();

	private String sTipoVenda = null;

	private int iCodVenda = 0;

	private int iNumCupom = 0;

	private JLabelPad lbChequeElet;

	private Vector<Properties> vTefsOK = new Vector<Properties>();

	private BigDecimal bigPagoTef = new BigDecimal( "0.00" );

	private boolean bFrete = false;
	
	private boolean bReceber = false;
	
	private boolean bUserRec = false;

	private boolean trocouCli = false;

	private boolean impMens = false;

	private BigDecimal pesoBrutFrete = new BigDecimal( 0 );

	private BigDecimal pesoLiqFrete = new BigDecimal( 0 );

	private BigDecimal vlrFrete = new BigDecimal( 0 );

	//private Connection con = null;

	private Object[] param;

	private final ControllerECF ecf;

	private Tef tef = null;
	

	/*
	 * Construtor
	 */
	public DLFechaVenda( Object[] args ) {

		// super(Aplicativo.telaPrincipal);

		setTitulo( "Fechamento de venda" );
		setAtribos( 330, 385 );

		param = args;
		iCodVenda = ( (Integer) param[ 0 ] ).intValue();
		sTipoVenda = (String) param[ 1 ];
		iNumCupom = ( (Integer) param[ 3 ] ).intValue();
		txtCodPlanoPag.setVlrInteger( (Integer) param[ 4 ] );
		trocouCli = ( (Boolean) param[ 7 ] ).booleanValue();
		txtCodVend.setVlrInteger( (Integer) param[ 12 ] );

		txtVlrCupom.setVlrBigDecimal( ( (BigDecimal) param[ 2 ] ) );
		txtVlrChequeElet.setAtivo( false );

		vVals.addElement( "C" );
		vVals.addElement( "F" );
		vLabs.addElement( "CIF" );
		vLabs.addElement( "FOB" );
		rgFreteVD = new JRadioGroup<String, String>( 1, 2, vLabs, vVals );
		
		ecf = new ControllerECF( 
				AplicativoPDV.getEcfdriver(), 
				AplicativoPDV.getPortaECF(), 
				AplicativoPDV.bModoDemo );

		montaListaCampos();

		montaTela();

		setConexao( (Connection) param[ 5 ] );

		if ( bFrete ) {
			if ( param[ 8 ] instanceof BigDecimal ) {
				pesoBrutFrete = (BigDecimal) param[ 8 ];
				pesoLiqFrete = (BigDecimal) param[ 9 ];
				vlrFrete = (BigDecimal) param[ 10 ];
				tpn.setSelectedIndex( 2 );
			}
			else if ( param[ 8 ] instanceof Boolean ) {
				tpn.setEnabledAt( 1, false );
				tpn.setEnabledAt( 2, false );
			}
		}
		else {
			tpn.setEnabledAt( 1, false );
			tpn.setEnabledAt( 2, false );
		}
		
		tpn.setEnabledAt( 3, false );

		int iCodAux = getCodAux();
		if ( iCodAux > 0 ) {
			txtCodAuxV.setVlrInteger( new Integer( iCodAux ) );
			lcAuxVenda.carregaDados();
		}
		else
			txtCodAuxV.setVlrInteger( new Integer( 1 ) );

		// N�o pode commitar enquanto todo o processo tive OK:

		lcPlanoPag.setPodeCommit( false );

		txtVlrDinheiro.addFocusListener( this );
		txtVlrCheque.addFocusListener( this );
		txtVlrChequeElet.addFocusListener( this );

		lcTran.addCarregaListener( this );
		lcVendedor.addCarregaListener( this );
		
		tabRec.addMouseListener( this );

		lcItReceber.montaTab();

	}

	private void montaListaCampos() {
		
		lcItReceber.setMaster( lcReceber );
		lcReceber.adicDetalhe( lcItReceber );
		lcItReceber.setTabela( tabRec );

		navItRec.setName( "ItReceber" );
		lcItReceber.setNavegador( navItRec );

		/*
		 * PLANO DE PAGAMENTO
		 */
		lcPlanoPag.add( new GuardaCampo( txtCodPlanoPag, "CodPlanoPag", "C�d.p.pag.", ListaCampos.DB_PK, true ) );
		lcPlanoPag.add( new GuardaCampo( txtDescPlanoPag, "DescPlanoPag", "Descri��o do plano de pagamento", ListaCampos.DB_SI, false ) );
		lcPlanoPag.montaSql( false, "PLANOPAG", "FN" );
		lcPlanoPag.setReadOnly( true );
		txtCodPlanoPag.setTabelaExterna( lcPlanoPag );
		txtCodPlanoPag.setNomeCampo( "CodPlanoPag" );
		txtCodPlanoPag.setFK( true );

		/*
		 * COMISSIONADO
		 */
		lcVendedor.add( new GuardaCampo( txtCodVend, "CodVend", "C�d.comis.", ListaCampos.DB_PK, false ) );
		lcVendedor.add( new GuardaCampo( txtNomeVend, "NomeVend", "Nome do comissionado", ListaCampos.DB_SI, false ) );
		lcVendedor.add( new GuardaCampo( txtCodClComis, "CodClComis", "C�d.cl.comis.", ListaCampos.DB_FK, false ) );
		lcVendedor.montaSql( false, "VENDEDOR", "VD" );
		lcVendedor.setReadOnly( true );
		txtCodVend.setTabelaExterna( lcVendedor );
		txtCodVend.setFK( true );
		txtCodVend.setNomeCampo( "CodVend" );
		txtCodVend.setAtivo( ! ( (Boolean) param[ 11 ] ).booleanValue() );

		/*
		 * CLASSIFICA��O DE COMISS�O
		 */
		lcClComis.add( new GuardaCampo( txtCodClComis, "CodClComis", "C�d.cl.comis.", ListaCampos.DB_PK, false ) );
		lcClComis.add( new GuardaCampo( txtDescClComis, "DescClComis", "Descri��o da classifica��o da comiss�o", ListaCampos.DB_SI, false ) );
		lcClComis.montaSql( false, "CLCOMIS", "VD" );
		lcClComis.setReadOnly( true );
		txtCodClComis.setTabelaExterna( lcClComis );
		txtCodClComis.setFK( true );
		txtCodClComis.setNomeCampo( "CodClComis" );

		/*
		 * TRANSPORTADORA
		 */
		lcTran.add( new GuardaCampo( txtCodTran, "CodTran", "C�d.tran.", ListaCampos.DB_PK, false ) );
		lcTran.add( new GuardaCampo( txtDescTran, "RazTran", "Nome do transportador", ListaCampos.DB_SI, false ) );
		txtDescTran.setListaCampos( lcTran );
		txtCodTran.setTabelaExterna( lcTran );
		txtCodTran.setFK( true );
		lcTran.montaSql( false, "TRANSP", "VD" );
		lcTran.setQueryCommit( false );
		lcTran.setReadOnly( true );

		/*
		 * FRETE
		 */
		lcFreteVD.add( new GuardaCampo( txtTipoVenda, "TipoVenda", "Tipo", ListaCampos.DB_PK, false ) );
		lcFreteVD.add( new GuardaCampo( txtCodVenda, "CodVenda", "N.pedido", ListaCampos.DB_PK, false ) );
		lcFreteVD.add( new GuardaCampo( txtCodTran, "CodTran", "C�d.tran.", ListaCampos.DB_FK, txtDescTran, true ) );
		lcFreteVD.add( new GuardaCampo( rgFreteVD, "TipoFreteVD", "Tipo", ListaCampos.DB_SI, true ) );
		lcFreteVD.add( new GuardaCampo( txtConhecFreteVD, "ConhecFreteVD", "Conhec.", ListaCampos.DB_SI, false ) );
		lcFreteVD.add( new GuardaCampo( txtPlacaFreteVD, "PlacaFreteVD", "Placa", ListaCampos.DB_SI, true ) );
		lcFreteVD.add( new GuardaCampo( txtUFFreteVD, "UFFreteVD", "Placa", ListaCampos.DB_SI, true ) );
		lcFreteVD.add( new GuardaCampo( txtVlrFreteVD, "VlrFreteVD", "Valor", ListaCampos.DB_SI, true ) );
		lcFreteVD.add( new GuardaCampo( txtQtdFreteVD, "QtdFreteVD", "Qtd.", ListaCampos.DB_SI, true ) );
		lcFreteVD.add( new GuardaCampo( txtPesoBrutVD, "PesoBrutVD", "Peso bruto", ListaCampos.DB_SI, true ) );
		lcFreteVD.add( new GuardaCampo( txtPesoLiqVD, "PesoLiqVD", "Peso liq.", ListaCampos.DB_SI, true ) );
		lcFreteVD.add( new GuardaCampo( txtEspFreteVD, "EspFreteVD", "Esp.fiscal", ListaCampos.DB_SI, true ) );
		lcFreteVD.add( new GuardaCampo( txtMarcaFreteVD, "MarcaFreteVD", "Marca", ListaCampos.DB_SI, true ) );
		lcFreteVD.montaSql( false, "FRETEVD", "VD" );
		rgFreteVD.setListaCampos( lcFreteVD );
		txtPlacaFreteVD.setListaCampos( lcFreteVD );
		txtUFFreteVD.setListaCampos( lcFreteVD );
		txtVlrFreteVD.setListaCampos( lcFreteVD );
		txtQtdFreteVD.setListaCampos( lcFreteVD );
		txtPesoBrutVD.setListaCampos( lcFreteVD );
		txtPesoLiqVD.setListaCampos( lcFreteVD );
		txtEspFreteVD.setListaCampos( lcFreteVD );
		txtMarcaFreteVD.setListaCampos( lcFreteVD );
		txtConhecFreteVD.setListaCampos( lcFreteVD );
		txtCodTran.setListaCampos( lcFreteVD );

		/*
		 * AUXILIAR DE NOTA FISCAL
		 */
		lcAuxVenda.add( new GuardaCampo( txtTipoVenda, "TipoVenda", "Tp.venda", ListaCampos.DB_PK, true ) );
		lcAuxVenda.add( new GuardaCampo( txtCodVenda, "CodVenda", "N.pedido", ListaCampos.DB_PK, true ) );
		lcAuxVenda.add( new GuardaCampo( txtCodAuxV, "CodAuxV", "C�d.aux.", ListaCampos.DB_PK, true ) );
		lcAuxVenda.add( new GuardaCampo( txtCPFCliAuxV, "CPFCliAuxV", "CPF", ListaCampos.DB_SI, true ) );
		lcAuxVenda.add( new GuardaCampo( txtNomeCliAuxV, "NomeCliAuxV", "Nome", ListaCampos.DB_SI, true ) );
		lcAuxVenda.add( new GuardaCampo( txtEndCliAuxV, "EndCliAuxV", "Endereco", ListaCampos.DB_SI, true ) );
		lcAuxVenda.add( new GuardaCampo( txtNumCliAuxV, "NumCliAuxV", "Numero", ListaCampos.DB_SI, true ) );
		lcAuxVenda.add( new GuardaCampo( txtCidCliAuxV, "CidCliAuxV", "Cidade", ListaCampos.DB_SI, true ) );
		lcAuxVenda.add( new GuardaCampo( txtUFCliAuxV, "UFCliAuxV", "UF", ListaCampos.DB_SI, true ) );
		lcAuxVenda.montaSql( false, "AUXVENDA", "VD" );
		txtCodAuxV.setListaCampos( lcAuxVenda );
		txtCPFCliAuxV.setListaCampos( lcAuxVenda );
		txtNomeCliAuxV.setListaCampos( lcAuxVenda );
		txtEndCliAuxV.setListaCampos( lcAuxVenda );
		txtNumCliAuxV.setListaCampos( lcAuxVenda );
		txtCidCliAuxV.setListaCampos( lcAuxVenda );
		txtUFCliAuxV.setListaCampos( lcAuxVenda );
		txtCPFCliAuxV.setMascara( JTextFieldPad.MC_CPF );
		
		/*
		 * TIPO DE COBRAN�A
		 */
		txtCodTipoCobItRec.setNomeCampo( "CodTipoCob" );
		lcTipoCobItRec.add( new GuardaCampo( txtCodTipoCobItRec, "CodTipoCob", "C�d.tp.cob.", ListaCampos.DB_PK, false ) );
		lcTipoCobItRec.add( new GuardaCampo( txtDescTipoCobItRec, "DescTipoCob", "Descri��o do tipo de cobran�a.", ListaCampos.DB_SI, false ) );
		lcTipoCobItRec.montaSql( false, "TIPOCOB", "FN" );
		lcTipoCobItRec.setQueryCommit( false );
		lcTipoCobItRec.setReadOnly( true );
		txtCodTipoCobItRec.setTabelaExterna( lcTipoCobItRec );
		txtCodTipoCobItRec.setListaCampos( lcTipoCobItRec );
		txtDescTipoCobItRec.setListaCampos( lcTipoCobItRec );
		txtCodTipoCobItRec.setFK( true );
		
		/*
		 * BANCO DA PARCELA
		 */
		txtCodBancoItRec.setNomeCampo( "CodBanco" );
		lcBancoItRec.add( new GuardaCampo( txtCodBancoItRec, "CodBanco", "C�d.banco", ListaCampos.DB_PK, false ) );
		lcBancoItRec.add( new GuardaCampo( txtDescBancoItRec, "NomeBanco", "Nome do banco", ListaCampos.DB_SI, false ) );
		lcBancoItRec.montaSql( false, "BANCO", "FN" );
		lcBancoItRec.setQueryCommit( false );
		lcBancoItRec.setReadOnly( true );
		txtCodBancoItRec.setTabelaExterna( lcBancoItRec );
		txtCodBancoItRec.setListaCampos( lcBancoItRec );
		txtDescBancoItRec.setListaCampos( lcBancoItRec );
		txtCodBancoItRec.setFK( true );
		
		/*
		 * TIPO DE COBRAN�A DA PARCELA
		 */		
		txtCodCartCobItRec.setNomeCampo( "CodCartCob" );
		lcCartCobItRec.add( new GuardaCampo( txtCodCartCobItRec, "CodCartCob", "C�d.Cart.Cob.", ListaCampos.DB_PK, false ) );
		lcCartCobItRec.add( new GuardaCampo( txtCodBancoItRec, "CodBanco", "C�d.Banco.", ListaCampos.DB_PK, false ) );
		lcCartCobItRec.add( new GuardaCampo( txtDescCartCobItRec, "DescCartCob", "Descri��o da carteira de cobran�a", ListaCampos.DB_SI, false ) );
		lcCartCobItRec.montaSql( false, "CARTCOB", "FN" );
		lcCartCobItRec.setQueryCommit( false );
		lcCartCobItRec.setReadOnly( true );
		txtCodCartCobItRec.setTabelaExterna( lcCartCobItRec );
		txtCodCartCobItRec.setListaCampos( lcBancoItRec );
		txtDescCartCobItRec.setListaCampos( lcBancoItRec );
		txtCodCartCobItRec.setFK( true );	
		
		/*
		 * RECEBER
		 */
		txtCodRec.setNomeCampo( "CodRec" );
		lcReceber.add( new GuardaCampo( txtCodRec, "CodRec", "C�d.rec.", ListaCampos.DB_PK, false ) );
		lcReceber.add( new GuardaCampo( txtVlrParcRec, "VlrParcRec", "Valor tot.", ListaCampos.DB_SI, false ) );
		lcReceber.add( new GuardaCampo( txtTipoVenda, "TipoVenda", "Tp.venda", ListaCampos.DB_SI, false ) );
		lcReceber.add( new GuardaCampo( txtAltUsuRec, "AltUsuRec", "Usu.alt.", ListaCampos.DB_SI, false ) );
		lcReceber.montaSql( false, "RECEBER", "FN" );
		txtCodRec.setListaCampos( lcReceber );
		txtVlrParcRec.setListaCampos( lcReceber );
		txtTipoVenda.setListaCampos( lcReceber );
		txtAltUsuRec.setListaCampos( lcReceber );
		
		/*
		 * PARCELA DO RECEBER
		 */
		txtNParcItRec.setNomeCampo( "NParcItRec" );
		lcItReceber.add( new GuardaCampo( txtNParcItRec, "NParcItRec", "N.parc.", ListaCampos.DB_PK, false ) );
		lcItReceber.add( new GuardaCampo( txtVlrParcItRec, "VlrParcItRec", "Valor tot.", ListaCampos.DB_SI, false ) );
		lcItReceber.add( new GuardaCampo( txtDtVencItRec, "DtVencItRec", "Dt. vencto.", ListaCampos.DB_SI, false ) );
		lcItReceber.add( new GuardaCampo( txtVlrDescItRec, "VlrDescItRec", "Valor desc.", ListaCampos.DB_SI, false ) );
		lcItReceber.add( new GuardaCampo( txtCodTipoCobItRec, "CodTipoCob", "Cod.tp.cob.", ListaCampos.DB_FK, txtDescTipoCobItRec, false ) );
		lcItReceber.add( new GuardaCampo( txtCodBancoItRec, "CodBanco", "C�d.banco", ListaCampos.DB_FK, txtDescBancoItRec, false ) );
		lcItReceber.add( new GuardaCampo( txtCodCartCobItRec, "CodCartCob", "C�d.Cart.Cob.", ListaCampos.DB_FK, txtDescCartCobItRec, false ) );
		lcItReceber.montaSql( false, "ITRECEBER", "FN" );
		lcItReceber.setQueryCommit( false );
		txtNParcItRec.setListaCampos( lcItReceber );
		txtVlrParcItRec.setListaCampos( lcItReceber );
		txtVlrDescItRec.setListaCampos( lcItReceber );
		txtDtVencItRec.setListaCampos( lcItReceber );
		txtCodTipoCobItRec.setListaCampos( lcItReceber );
		txtCodBancoItRec.setListaCampos( lcItReceber );
		txtCodCartCobItRec.setListaCampos( lcItReceber );
		txtDescTipoCobItRec.setLabel( "Descri��o do tipo de cobran�a" );
		txtDescBancoItRec.setLabel( "Nome do banco" );
		txtDescCartCobItRec.setLabel( "Descri��o da carteira de cobran�a" );
	}

	private void montaTela() {

		c.add( tpn );

		tpn.add( "Fechamento", pnVenda );
		tpn.add( "Adicionais", pnAdic );
		tpn.add( "Frete", pnFrete );
		tpn.add( "Receber", pnReceber );

		/*
		 * ABA FECHAMENTO
		 */

		setPainel( pnVenda );

		adic( new JLabelPad( "C�d.comis." ), 7, 5, 250, 15 );
		adic( txtCodVend, 7, 20, 80, 20 );
		adic( new JLabelPad( "Nome do comissionado" ), 90, 5, 250, 15 );
		adic( txtNomeVend, 90, 20, 200, 20 );
		adic( new JLabelPad( "C�d.p.pag." ), 7, 45, 250, 15 );
		adic( txtCodPlanoPag, 7, 60, 80, 20 );
		adic( new JLabelPad( "Descri��o da forma de pagamento" ), 90, 45, 250, 15 );
		adic( txtDescPlanoPag, 90, 60, 200, 20 );

		JLabelPad lbLinha = new JLabelPad();
		lbLinha.setBorder( BorderFactory.createEtchedBorder() );

		adic( lbLinha, 7, 90, 300, 2 );

		adic( new JLabelPad( "Valor total do cupom: " ), 7, 100, 150, 20 );
		adic( txtVlrCupom, 170, 100, 120, 20 );
		adic( new JLabelPad( "Valor em dinheiro: " ), 7, 125, 150, 20 );
		adic( txtVlrDinheiro, 170, 125, 120, 20 );
		adic( new JLabelPad( "Valor em cheque: " ), 7, 150, 150, 20 );
		adic( txtVlrCheque, 170, 150, 120, 20 );
		adic( ( lbChequeElet = new JLabelPad( "Valor em ch. elet./cart�o: " ) ), 7, 175, 150, 20 );
		adic( txtVlrChequeElet, 170, 175, 120, 20 );
		adic( new JLabelPad( "Valor pago: " ), 7, 200, 150, 20 );
		adic( txtVlrPago, 170, 200, 120, 20 );
		adic( new JLabelPad( "Valor troco: " ), 7, 225, 150, 20 );
		adic( txtVlrTroco, 170, 225, 120, 20 );

		/*
		 * ABA AUXILIAR
		 */
		
		setPainel( pnAdic );

		adic( new JLabelPad( "Nome" ), 7, 0, 240, 20 );
		adic( txtNomeCliAuxV, 7, 20, 285, 20 );
		adic( new JLabelPad( "Endere�o" ), 7, 40, 240, 20 );
		adic( txtEndCliAuxV, 7, 60, 231, 20 );
		adic( new JLabelPad( "Num." ), 241, 40, 50, 20 );
		adic( txtNumCliAuxV, 241, 60, 53, 20 );
		adic( new JLabelPad( "CPF" ), 7, 80, 120, 20 );
		adic( txtCPFCliAuxV, 7, 100, 120, 20 );
		adic( new JLabelPad( "Cidade" ), 130, 80, 100, 20 );
		adic( txtCidCliAuxV, 130, 100, 120, 20 );
		adic( new JLabelPad( "UF" ), 253, 80, 40, 20 );
		adic( txtUFCliAuxV, 253, 100, 40, 20 );

		/*
		 * ABA FRETE
		 */

		setPainel( pnFrete );

		adic( new JLabelPad( "C�d.tran." ), 7, 0, 80, 20 );
		adic( txtCodTran, 7, 20, 80, 20 );
		adic( new JLabelPad( "Nome do transportador" ), 90, 0, 210, 20 );
		adic( txtDescTran, 90, 20, 210, 20 );
		adic( new JLabelPad( "Tipo" ), 7, 40, 170, 20 );
		adic( rgFreteVD, 7, 60, 130, 30 );
		adic( new JLabelPad( "Conhec." ), 140, 50, 77, 20 );
		adic( txtConhecFreteVD, 140, 70, 77, 20 );
		adic( new JLabelPad( "Placa" ), 220, 50, 80, 20 );
		adic( txtPlacaFreteVD, 220, 70, 80, 20 );
		adic( new JLabelPad( "Valor" ), 7, 90, 120, 20 );
		adic( txtVlrFreteVD, 7, 110, 120, 20 );
		adic( new JLabelPad( "Volumes" ), 130, 90, 77, 20 );
		adic( txtQtdFreteVD, 130, 110, 120, 20 );
		adic( new JLabelPad( "UF" ), 253, 90, 40, 20 );
		adic( txtUFFreteVD, 253, 110, 45, 20 );
		adic( new JLabelPad( "Peso B." ), 7, 130, 120, 20 );
		adic( txtPesoBrutVD, 7, 150, 120, 20 );
		adic( new JLabelPad( "Peso L." ), 130, 130, 120, 20 );
		adic( txtPesoLiqVD, 130, 150, 120, 20 );
		adic( new JLabelPad( "Espec." ), 7, 170, 120, 20 );
		adic( txtEspFreteVD, 7, 190, 120, 20 );
		adic( new JLabelPad( "Marca" ), 130, 170, 120, 20 );
		adic( txtMarcaFreteVD, 130, 190, 120, 20 );

		/*
		 * ABA RECEBER
		 */
		
		setPainel( pnReceber );

		JPanelPad pinTopRec = new JPanelPad( 400, 60 );
		pinTopRec.setPreferredSize( new Dimension( 400, 60 ) );
		
		pinTopRec.adic( new JLabelPad( "Valor Tot." ), 7, 0, 130, 20 );
		pinTopRec.adic( txtVlrParcRec, 7, 20, 130, 20 );
		
		txtVlrParcRec.setAtivo( false );
		
		pnReceber.add( pinTopRec, BorderLayout.NORTH );
		pnReceber.add( new JScrollPane( tabRec ), BorderLayout.CENTER );
	}

	private boolean execFechamento() {

		boolean bRet = false;

		if ( txtCodVend.getVlrInteger().intValue() == 0 ) {
			Funcoes.mensagemInforma( this, "Digite o c�digo do comissionado!" );
			txtCodVend.requestFocus();
			return false;
		}
		else if ( txtCodPlanoPag.getVlrInteger().intValue() == 0 ) {
			Funcoes.mensagemInforma( this, "Digite o c�digo da forma de pagamento!" );
			txtCodPlanoPag.requestFocus();
			return false;
		}
		else if ( txtVlrPago.floatValue() == 0 ) {
			Funcoes.mensagemInforma( this, "Digite o valor pago!" );
			txtVlrDinheiro.requestFocus();
			return false;
		}
		else if ( txtVlrPago.floatValue() < txtVlrCupom.floatValue() ) {
			Funcoes.mensagemInforma( this, "Valor pago menor que o valor da venda!" );
			txtVlrDinheiro.requestFocus();
			return false;
		}
		else if ( txtVlrChequeElet.floatValue() > 0 ) {

			Properties ppCompTef;

			if ( ( ppCompTef = processaTef() ) == null ) {
				Funcoes.mensagemInforma( this, "N�o foi poss�vel processar TEF" );
				return false;
			}
			if (

			txtVlrChequeElet.floatValue() < txtVlrCupom.floatValue() ) {
				bigPagoTef = bigPagoTef.add( txtVlrChequeElet.getVlrBigDecimal() );
				txtVlrChequeElet.setVlrString( "" );
				vTefsOK.add( ppCompTef );

				// bloqueio para imprimir somente um comprovante por cupom:

				lbChequeElet.setEnabled( false );
				txtVlrChequeElet.setAtivo( false );
				txtVlrDinheiro.requestFocus();

				recalcPago();

				return false;

			}

			vTefsOK.add( ppCompTef );

		}

		if ( bFrete ) {

			if ( lcFreteVD.getStatus() == ListaCampos.LCS_EDIT || lcFreteVD.getStatus() == ListaCampos.LCS_INSERT ) {

				if ( !lcFreteVD.post() ) {
					return false;
				}
				else {
					impMens = true;
				}
			}
			if ( lcAuxVenda.getStatus() == ListaCampos.LCS_EDIT || lcAuxVenda.getStatus() == ListaCampos.LCS_INSERT ) {

				if ( !lcAuxVenda.post() ) {
					return false;
				}
			}
		}

		if ( !gravaVenda() ) {
			return false;
		}
		
		// carrega o receber 

		txtCodRec.setVlrInteger( getCodRec() );
				
		lcReceber.carregaDados();
		lcItReceber.carregaDados();
		lcTipoCobItRec.carregaDados();
		lcBancoItRec.carregaDados();
		lcCartCobItRec.carregaDados();
		

		try {

			// Fecha a venda:

			String sSQL = "EXECUTE PROCEDURE PVFECHAVENDASP(?,?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement( sSQL );
			ps.setInt( 1, Aplicativo.iCodEmp );
			ps.setInt( 2, ListaCampos.getMasterFilial( "PVMOVCAIXA" ) );
			ps.setObject( 3, txtVlrPago.getVlrBigDecimal() );
			ps.setInt( 4, AplicativoPDV.iCodCaixa );
			ps.setDate( 5, Funcoes.dateToSQLDate( new Date() ) );
			ps.setString( 6, Aplicativo.strUsuario );
			ps.execute();

			ps.close();
			if ( !con.getAutoCommit() ) {
				con.commit();
			}

			bRet = true;

		} catch ( SQLException err ) {
			err.printStackTrace();
			Funcoes.mensagemErro( this, "Erro ao executar fechamento!\n" + err.getMessage(), true, con, err );
			Logger.gravaLogTxt( "", Aplicativo.strUsuario, Logger.LGEB_BD, "Erro ao executar fechamento." );
		}
		
		return bRet;
	}

	private boolean execTroco() {

		boolean bRet = false;
		PreparedStatement ps = null;
		String sSQL = "EXECUTE PROCEDURE PVSANGRIASP(?,?,?,?,?,?)";
		// Sangria para o troco:

		try {

			ps = con.prepareStatement( sSQL );
			ps.setInt( 1, Aplicativo.iCodEmp );
			ps.setInt( 2, ListaCampos.getMasterFilial( "PVMOVCAIXA" ) );
			ps.setBigDecimal( 3, txtVlrTroco.getVlrBigDecimal() );
			ps.setInt( 4, AplicativoPDV.iCodCaixa );
			ps.setDate( 5, Funcoes.dateToSQLDate( new Date() ) );
			ps.setString( 6, Aplicativo.strUsuario );
			ps.execute();

			ps.close();

			if ( !con.getAutoCommit() ) {
				con.commit();
			}

			bRet = true;

		} catch ( SQLException err ) {
			err.printStackTrace();
			Funcoes.mensagemErro( this, "Erro ao executar o troco!\n" + err.getMessage(), true, con, err );
			Logger.gravaLogTxt( "", Aplicativo.strUsuario, Logger.LGEB_BD, "Erro ao executar o troco." );
		} finally {
			ps = null;
			sSQL = null;
		}
		return bRet;
	}

	private boolean finalizaVenda() {

		boolean bRet = false;
		PreparedStatement ps = null;
		String sSQL = "UPDATE VDVENDA SET STATUSVENDA='V3' WHERE CODEMP=? AND CODFILIAL=? AND CODVENDA=? AND TIPOVENDA='E'";

		try {

			ps = con.prepareStatement( sSQL );
			ps.setInt( 1, Aplicativo.iCodEmp );
			ps.setInt( 2, ListaCampos.getMasterFilial( "VDVENDA" ) );
			ps.setInt( 3, iCodVenda );
			ps.executeUpdate();

			ps.close();

			if ( !con.getAutoCommit() ) {
				con.commit();
			}

			bRet = true;

		} catch ( SQLException err ) {
			Funcoes.mensagemErro( null, "N�o foi poss�vel finalizar a venda!\n" + err.getMessage(), true, con, err );
			err.printStackTrace();
		} finally {
			ps = null;
			sSQL = null;
		}

		return bRet;
	}

	private boolean finalizaTEF( Properties retTef ) {

		boolean bRet = false;
		/*boolean bLeituraX = false;

		Object sLinhas[] = tef.retImpTef( retTef );

		String sComprovante = "\n\n";

		for ( int i = 0; i < sLinhas.length; i++ ) {
			sComprovante += sLinhas[ i ] + "\n";
		}

		// verifica se ha linhas a serem impressas, caso contr�rio sai sem imprimir nada.
		if ( sLinhas.length == 0 )
			return true;

		do {
			try {
				// Soh abre o comprovante vinculado se n�o � para imprimir a leituraX (ou seja n�o esta reimprimindo).

				if ( !bLeituraX ) {
					if ( !ecf.abreComprovanteNaoFiscalVinculado( txtDescPlanoPag.getVlrString(), null, 0 ) ) {
						throw new Exception( "" );
					}
					if ( !ecf.usaComprovanteNaoFiscalVinculadoTef( sComprovante ) ) {
						throw new Exception( "" );
					}
				}
				else {
					// Esta reimprimindo entao vamos usar o relatorioGerencial.
					if ( !ecf.leituraX( false ) ) {
						throw new Exception( "" );
					}
					if ( !ecf.relatorioGerencialTef( sComprovante ) ) {
						throw new Exception( "" );
					}
				}

				// Coloca uns espacos para retirar o comprovante.

				if ( !bLeituraX ) {
					for ( int i = 0; i < 10; i++ ) {
						if ( !ecf.usaComprovanteNaoFiscalVinculadoTef( " " ) ) {
							throw new Exception( "" );
						}
					}

				}
				else {
					for ( int i = 0; i < 10; i++ ) {
						if ( !ecf.relatorioGerencialTef( " " ) ) {
							throw new Exception( "" );
						}
					}
				}

				// Aguarda 5 segundo para imprimir o segundo comprovante:

				ecf.iniciaModoTEF( Aplicativo.strUsuario, AplicativoPDV.bModoDemo );

				Thread.sleep( 5000 );

				ecf.finalizaModoTEF( Aplicativo.strUsuario, AplicativoPDV.bModoDemo );

				if ( !bLeituraX ) {
					if ( !ecf.usaComprovanteNaoFiscalVinculadoTef( sComprovante ) )
						throw new Exception( "" );
				}
				else {
					if ( !ecf.relatorioGerencialTef( sComprovante ) ) {
						throw new Exception( "" );
					}
				}

				if ( !bLeituraX ) {
					if ( !ecf.fechaComprovanteNaoFiscalVinculado() ) {
						throw new Exception( "" );
					}
				}
				else {
					if ( !ecf.fechaRelatorioGerencial() ) {
						throw new Exception( "" );
					}
				}

				bRet = true;
			} catch ( Exception err ) {

				ecf.finalizaModoTEF( Aplicativo.strUsuario, AplicativoPDV.bModoDemo );

				bRet = false;

				if ( Funcoes.mensagemConfirma( null, "Impressora n�o responde, tente novamente?" ) == JOptionPane.YES_OPTION ) {
					bLeituraX = true;
					continue;
				}
			}

			break;

		} while ( true );

		if ( bRet ) {
			bRet = tef.confirmaVenda( retTef );
			if ( bRet ) {
				vinculaTef( retTef );
			}
		}
		else {
			// Estornando a TEF:
			bRet = tef.naoConfirmaVenda( retTef );

			if ( bigPagoTef.doubleValue() > 0.0 ) {
				bigPagoTef = bigPagoTef.subtract( Tef.retValor( retTef ) );
			}

			recalcPago();

			vTefsOK.remove( retTef );
		}*/

		return bRet;

	}

	private boolean gravaVenda() {

		boolean bRet = false;
		PreparedStatement ps = null;
		StringBuilder sql = new StringBuilder();

		try {

			sql.append( "UPDATE VDVENDA SET " );
			sql.append( "STATUSVENDA='V2', " );
			sql.append( "CODVEND=?, " );
			sql.append( "CODEMPVD=?, " );
			sql.append( "CODFILIALVD=?, " );
			sql.append( "CODCLCOMIS=?, " );
			sql.append( "CODEMPCM=?, " );
			sql.append( "CODFILIALCM=?, " );
			sql.append( "CODPLANOPAG=?, " );
			sql.append( "CODEMPPG=?, " );
			sql.append( "CODFILIALPG=?, " );
			sql.append( "IMPNOTAVENDA='S' " );
			sql.append( "WHERE CODEMP=? AND CODFILIAL=? AND CODVENDA=? AND TIPOVENDA='E'" );

			ps = con.prepareStatement( sql.toString() );
			ps.setInt( 1, txtCodVend.getVlrInteger().intValue() );
			ps.setInt( 2, lcVendedor.getCodEmp() );
			ps.setInt( 3, lcVendedor.getCodFilial() );
			ps.setInt( 4, txtCodClComis.getVlrInteger().intValue() );
			ps.setInt( 5, lcClComis.getCodEmp() );
			ps.setInt( 6, lcClComis.getCodFilial() );
			ps.setInt( 7, txtCodPlanoPag.getVlrInteger().intValue() );
			ps.setInt( 8, lcPlanoPag.getCodEmp() );
			ps.setInt( 9, lcPlanoPag.getCodFilial() );
			ps.setInt( 10, Aplicativo.iCodEmp );
			ps.setInt( 11, ListaCampos.getMasterFilial( "VDVENDA" ) );
			ps.setInt( 12, iCodVenda );
			ps.executeUpdate();

			ps.close();

			if ( !con.getAutoCommit() ) {
				con.commit();
			}

			bRet = true;

		} catch ( SQLException err ) {
			err.printStackTrace();
			Logger.gravaLogTxt( "", Aplicativo.strUsuario, Logger.LGEB_BD, "Erro ao gravar a venda: " + err.getMessage() );
		}

		return bRet;
	}

	private void recalcPago() {

		txtVlrPago.setVlrBigDecimal( txtVlrDinheiro.getVlrBigDecimal().add( txtVlrCheque.getVlrBigDecimal().add( txtVlrChequeElet.getVlrBigDecimal() ) ).add( bigPagoTef ) );
		txtVlrTroco.setVlrBigDecimal( txtVlrPago.getVlrBigDecimal().subtract( txtVlrCupom.getVlrBigDecimal() ) );
	}

	private Properties processaTef() {

		Properties retTef = tef.solicVenda( iNumCupom, txtVlrChequeElet.getVlrBigDecimal() );

		if ( retTef == null || !tef.validaTef( retTef ) ) {
			retTef = null;
		}

		return retTef;

	}

	private void vinculaTef( Properties prop ) {

		PreparedStatement ps = null;
		String sSQL = "INSERT INTO VDTEF (CODEMP,CODFILIAL,TIPOVENDA,CODVENDA,NSUTEF,REDETEF,DTTRANSTEF,VLRTEF) VALUES (?,?,?,?,?,?,?,?)";
		try {

			ps = con.prepareStatement( sSQL );
			ps.setInt( 1, Aplicativo.iCodEmp );
			ps.setInt( 2, ListaCampos.getMasterFilial( "VDTEF" ) );
			ps.setString( 3, "E" );
			ps.setInt( 4, iCodVenda );
			ps.setString( 5, Tef.retNsu( prop ) );
			ps.setString( 6, Tef.retRede( prop ) );
			ps.setDate( 7, Funcoes.dateToSQLDate( Tef.retData( prop ) ) );
			ps.setBigDecimal( 8, Tef.retValor( prop ) );
			ps.executeUpdate();

			ps.close();

			if ( !con.getAutoCommit() ) {
				con.commit();
			}

		} catch ( SQLException err ) {
			err.printStackTrace();
			Logger.gravaLogTxt( "", Aplicativo.strUsuario, Logger.LGEB_BD, "Erro ao gravar tef vinculado no banco: " + err.getMessage() );
		} finally {
			ps = null;
			sSQL = null;
		}
	}

	private void alteraRec() {

		lcItReceber.edit();
		
		DLFechaParcela dl = new DLFechaParcela( this, con ); 
				
		Object[] valores = new Object[] {
				txtVlrParcItRec.getVlrBigDecimal(),
				txtDtVencItRec.getVlrDate(), 
				txtVlrDescItRec.getVlrBigDecimal(), 
				txtCodTipoCobItRec.getVlrInteger(), 
				txtCodBancoItRec.getVlrString(),
				txtCodCartCobItRec.getVlrString()
		};

		dl.setValores( valores );
		dl.setVisible( true );
		
		if ( dl.OK ) {
			
			valores = dl.getValores();
			
			txtVlrParcItRec.setVlrBigDecimal( (BigDecimal) valores[ DLFechaParcela.EFields.VALOR.ordinal() ] );
			txtDtVencItRec.setVlrDate( (Date) valores[ DLFechaParcela.EFields.DATA.ordinal() ] );
			txtVlrDescItRec.setVlrBigDecimal( (BigDecimal) valores[ DLFechaParcela.EFields.DESCONTO.ordinal() ] );
			txtCodTipoCobItRec.setVlrString( (String) valores[ DLFechaParcela.EFields.TIPOCOB.ordinal() ] );
			txtCodBancoItRec.setVlrString( (String) valores[ DLFechaParcela.EFields.BANCO.ordinal() ] );
			txtCodCartCobItRec.setVlrString( (String) valores[ DLFechaParcela.EFields.CARTCOB.ordinal() ] );
			
			txtAltUsuRec.setVlrString( "S" );
			
			lcItReceber.post();
			
			txtAltUsuRec.setVlrString( "N" );
			
			// Atualiza lcReceber
			if ( lcReceber.getStatus() == ListaCampos.LCS_EDIT ) {
			
				lcReceber.post(); // Caso o lcReceber estaja como edit executa o post que atualiza
			}
			else {
			
				lcReceber.carregaDados(); // Caso n�o, atualiza
			}
		}
		else {
			
			lcItReceber.cancel( true );
		}
		
		dl.dispose();
	}

	private int getCodAux() {

		int iRet = 0;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sSQL = null;

		try {

			sSQL = "SELECT CODAUXV FROM VDAUXVENDA WHERE CODEMP=? AND CODFILIAL=? AND CODVENDA=? AND TIPOVENDA='E'";
			ps = con.prepareStatement( sSQL );
			ps.setInt( 1, Aplicativo.iCodEmp );
			ps.setInt( 2, ListaCampos.getMasterFilial( "VDAUXVENDA" ) );
			ps.setInt( 3, txtCodVenda.getVlrInteger().intValue() );
			rs = ps.executeQuery();

			if ( rs.next() ) {
				iRet = rs.getInt( "CodAuxV" );
			}

			rs.close();
			ps.close();

			if ( !con.getAutoCommit() ) {
				con.commit();
			}

		} catch ( SQLException err ) {
			Funcoes.mensagemErro( this, "Erro ao buscar codaux.\n" + err.getMessage(), true, con, err );
			err.printStackTrace();
		} finally {
			ps = null;
			rs = null;
			sSQL = null;
		}

		return iRet;
	}

	private int getCodRec() {

		int iRetorno = 0;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			
			ps = con.prepareStatement( "SELECT CODREC FROM FNRECEBER WHERE TIPOVENDA='E' AND CODVENDA=? AND CODEMP=? AND CODFILIAL=?" );
			ps.setInt( 1, iCodVenda );
			ps.setInt( 2, Aplicativo.iCodEmp );
			ps.setInt( 3, ListaCampos.getMasterFilial( "FNRECEBER" ) );
			
			rs = ps.executeQuery();
			
			if ( rs.next() ) {			
				iRetorno = rs.getInt( "CodRec" );
			}
			
			ps.close();

			if ( !con.getAutoCommit() ) {
				con.commit();
			}
		} catch ( SQLException err ) {
			err.printStackTrace();
			Funcoes.mensagemErro( this, "Erro ao buscar o c�digo da conta a receber!\n" + err.getMessage(), true, con, err );
		} finally {
			ps = null;
			rs = null;
		}
		
		return iRetorno;
	}

	private String getMenssage() {

		String sMenssage = "";

		if ( trocouCli && impMens ) {

			String[] dadosCli = (String[]) param[ 6 ];

			sMenssage = ( dadosCli[ 0 ] != null ? dadosCli[ 0 ].trim() : "" ) + " - " + 
					( dadosCli[ 1 ] != null ? dadosCli[ 1 ].trim() : "" ) + "\n" + 
					( dadosCli[ 2 ] != null ? dadosCli[ 2 ].trim() : "" ) + " , " + 
					( dadosCli[ 3 ] != null ? dadosCli[ 3 ].trim() : "" ) + " - " + 
					( dadosCli[ 4 ] != null ? dadosCli[ 4 ].trim() : "" ) + "/" + 
					( dadosCli[ 5 ] != null ? dadosCli[ 5 ].trim() : "" ) + "\n" + 
					txtDescTran.getVlrString().trim() + " - " + 
					txtPlacaFreteVD.getVlrString().trim();

		}
		else if ( txtNomeCliAuxV.getVlrString().trim().length() > 0 ) {

			sMenssage = txtNomeCliAuxV.getVlrString().trim() + " - " + txtCPFCliAuxV.getVlrString().trim() + "\n" + txtEndCliAuxV.getVlrString().trim() + " , " + txtNumCliAuxV.getVlrString().trim() + " - " + txtCidCliAuxV.getVlrString().trim() + "/" + txtUFCliAuxV.getVlrString().trim() + "\n"
					+ txtDescTran.getVlrString().trim() + " - " + txtPlacaFreteVD.getVlrString().trim();

		}

		if ( sMenssage.length() > 300 ) {
			sMenssage = sMenssage.substring( 0, 300 );
		}

		return sMenssage;
	}

	public void setTef( Tef tef ) {

		this.tef = tef;
		txtVlrChequeElet.setAtivo( true );
	}

	private void getPreferencias() {

		try {

			PreparedStatement ps = con.prepareStatement( 
					"SELECT ADICPDV, HABRECEBER FROM SGPREFERE4 WHERE CODEMP=? AND CODFILIAL=?" );
			ps.setInt( 1, Aplicativo.iCodEmp );
			ps.setInt( 2, ListaCampos.getMasterFilial( "SGPREFERE4" ) );
			ResultSet rs = ps.executeQuery();

			if ( rs.next() ) {
				bFrete = "S".equals( rs.getString( "ADICPDV" ) );
				bReceber = "S".equals( rs.getString( "HABRECEBER" ) );
			}

			rs.close();
			ps.close();

			if ( !con.getAutoCommit() ) {
				con.commit();
			}
			
			ps = con.prepareStatement( "SELECT VERIFALTPARCVENDA FROM SGPREFERE1 WHERE CODEMP=? AND CODFILIAL=?" );
			ps.setInt( 1, Aplicativo.iCodEmp );
			ps.setInt( 2, ListaCampos.getMasterFilial( "SGPREFERE1" ) );
			
			rs = ps.executeQuery();
			
			if ( rs.next() ) {
			
				bUserRec = "S".equals( rs.getString( "VerifAltParcVenda" ) );
			}
			
			rs.close();
			ps.close();
			
			if ( !con.getAutoCommit() ) {
				con.commit();
			}

		} catch ( SQLException err ) {
			err.printStackTrace();
			Funcoes.mensagemErro( this, "Erro ao carregar a tabela PREFERE4!\n" + err.getMessage(), true, con, err );
		} 
	}

	public void actionPerformed( ActionEvent evt ) {

		boolean bRet = false;
		if ( evt.getSource() == btOK ) {

			lcVendedor.carregaDados();
			lcClComis.carregaDados();

			boolean exec = false;
			
			if ( execFechamento() ) {
				exec = true;
				if ( ecf.iniciaFechamentoCupom() ) {
					if ( txtVlrDinheiro.floatValue() > 0f ) {
						if ( ! ecf.efetuaFormaPagamento( "Dinheiro", txtVlrDinheiro.getVlrBigDecimal() ) ) {
							Funcoes.mensagemErro( this, ecf.getMessageLog() );
							return;
						}
					}
					if ( txtVlrCheque.floatValue() > 0f ) {
						if ( ! ecf.efetuaFormaPagamento( "Cheque", txtVlrCheque.getVlrBigDecimal() ) ) {
							Funcoes.mensagemErro( this, ecf.getMessageLog() );
							return;
						}
					}
					if ( txtVlrChequeElet.floatValue() > 0f ) {
						if ( ! ecf.efetuaFormaPagamento( "Cart�o", txtVlrChequeElet.getVlrBigDecimal() ) ) {
							Funcoes.mensagemErro( this, ecf.getMessageLog() );
							return;
						}
					}
					if ( ecf.finalizaFechamentoCupom( getMenssage() ) ) {
						if ( finalizaVenda() ) {
							btCancel.setEnabled( false );
							// Verifica se existe um comprovante de TEF para imprimir.
							if ( vTefsOK.size() > 0 ) {
								for ( int i = 0; i < vTefsOK.size(); i++ ) {
									if ( finalizaTEF( vTefsOK.elementAt( i ) ) ) {
										bRet = true;
									}
									else {
										bRet = false;
										break;
									}
								}
							}
							else {
								bRet = true;
							}

							if ( bRet && txtVlrTroco.floatValue() > 0 ) {
								bRet = execTroco();
							}
						}
						ecf.abrirGaveta();
					} 
					else {
						Funcoes.mensagemErro( this, ecf.getMessageLog() );
						return;
					}
				}
			}

			if ( !bRet ) {
				return;
			}

			if ( exec && bReceber ) {
				tpn.setEnabledAt( 3, true );
				tpn.setSelectedIndex( 3 );
				bReceber = false;
			}
			else if ( exec && !bReceber ) {
				super.actionPerformed( evt );
			}
		}
		else {
			super.actionPerformed( evt );
		}
	}

	public void keyPressed( KeyEvent kevt ) {

		if ( kevt.getSource() == btOK ) {
			btOK.doClick();
		}

		super.keyPressed( kevt );
	}

	public void focusGained( FocusEvent arg0 ) {

	}

	public void focusLost( FocusEvent fevt ) {

		if ( fevt.getSource() == txtVlrDinheiro || fevt.getSource() == txtVlrCheque || fevt.getSource() == txtVlrChequeElet ) {
			recalcPago();
		}
	}

	public void mouseClicked( MouseEvent e ) {

		if ( e.getClickCount() == 2 ) {			
			if ( e.getSource() == tabRec && tabRec.getLinhaSel() >= 0 ) {
				if ( bUserRec ) {
					
					FPassword fpw = new FPassword( this, FPassword.ALT_PARC_VENDA, null, con );
					fpw.execShow();
					
					if ( fpw.OK ) {					
						alteraRec();
					}					
					fpw.dispose();
				}
				else {				
					alteraRec();
				}
			}
		}
	}

	public void mouseEntered( MouseEvent e ) { }

	public void mouseExited( MouseEvent e ) { }

	public void mousePressed( MouseEvent e ) { }

	public void mouseReleased( MouseEvent e ) { }

	public void beforeCarrega( CarregaEvent e ) {

		if ( e.getListaCampos() == lcTran ) {
			txtPesoBrutVD.setVlrBigDecimal( pesoBrutFrete );
			txtPesoLiqVD.setVlrBigDecimal( pesoLiqFrete );
			txtVlrFreteVD.setVlrBigDecimal( vlrFrete );
		}
	}

	public void afterCarrega( CarregaEvent e ) {

		if ( e.getListaCampos() == lcVendedor ) {
			lcClComis.carregaDados();
		}
	}

	@Override
	public void setConexao( Connection cn ) {

		super.setConexao( cn );
		
		lcPlanoPag.setConexao( cn );
		lcVendedor.setConexao( cn );
		lcClComis.setConexao( cn );
		lcTran.setConexao( cn );
		lcFreteVD.setConexao( cn );
		lcAuxVenda.setConexao( cn );
		lcReceber.setConexao( cn );
		lcItReceber.setConexao( cn );	
		lcTipoCobItRec.setConexao( cn );
		lcBancoItRec.setConexao( cn );
		lcCartCobItRec.setConexao( cn );

		txtCodVenda.setVlrInteger( new Integer( iCodVenda ) );
		txtTipoVenda.setVlrString( sTipoVenda );

		lcPlanoPag.carregaDados();
		lcVendedor.carregaDados();
		lcClComis.carregaDados();

		getPreferencias();
	}
}
