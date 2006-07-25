package org.freedom.ecf.driver;

import java.util.Date;

public class Teste {
	
	private Teste(){
		System.out.println("teste");
	}
	
	/**
	 * @param args
	 */
	public static void main(final String[] args) {

		final ECFBematech ecf = new ECFBematech(ECFBematech.COM1);
		
		Date data = new Date();
		System.out.println("Inicio --> " + data.getHours() + ":" + data.getMinutes() + ":" + data.getSeconds() );
		
		//formatar retornos...
		//ecf.retornoAliquotas();
		
		//verificar bytes...
		//ecf.programaCaracterParaAutenticacao(new byte[]{1,2,4,8,64,64,64,64,64,64,64,64,64,64,8,4,2,1});

		
		//ecf.comprovanteNFiscalNVinculado( "10", 1f,"A vista         ");
		
	
      ecf.leituraX();
      
      System.out.println("FIM DA LEITURA");
		
		
//		ecf.aberturaDeCupom();
		
		//ecf.programaUnidadeMedida("KG");
		//ecf.aumentaDescItem("Caneta                       0123456789" );
		
//		ecf.vendaItem("0000000000001", "Caneta                       ", "FF", 1f, 0.12f, 0f);
		
		//ecf.vendaItemTresCasas("0000000000001", "Caneta                       ", "FF", 1f, 0.125f, 0f);
		
		//ecf.vendaItemDepartamento("FF", 15.001f, 1f, 0.001f, 0.001f, 3, "UN", "0000000000001", "Caneta");
		
//		ecf.iniciaFechamentoCupom(ECFBematech.DESCONTO_PERCENTUAL,0);
//		ecf.efetuaFormaPagamento(2,0.20f,"to testando...");
//		ecf.terminaFechamentoCupom("Obrigado pela Preferencia!!!");		
		

		//ecf.autenticacaoDeDocumento();
		
		//ecf.programaFormaPagamento("Cartao Credito  ");// 2
		//ecf.programaFormaPagamento("A vista         ");// 3		

		//ecf.comprovanteNFiscalNVinculado("SU",100,"");
		
		data = new Date();
		System.out.println("Fim -----> " + data.getHours() + ":" + data.getMinutes() + ":" + data.getSeconds() );
				
		System.exit(0);
	}

}
