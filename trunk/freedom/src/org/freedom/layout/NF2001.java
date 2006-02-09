 /**
 * @version 10/12/2003 <BR>
 * @author Setpoint Inform�tica Ltda./Alex Rodrigues <BR>
 *
 * Projeto: Freedom <BR>
 * Pacote: leiautes <BR>
 * Classe: @(#)NFBuzzi2.java <BR>
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
 * Layout da nota fiscal para a empresa Iswara Ltda.
 */
package org.freedom.layout;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Vector;

import javax.swing.JOptionPane;

import org.freedom.componentes.ImprimeOS;
import org.freedom.componentes.NF;
import org.freedom.funcoes.Funcoes;

public class NF2001 extends Layout {
	private String sMensAdic="";
	private String sNumNota = ""; 
	  
	public boolean imprimir(NF nf,ImprimeOS imp) {
		boolean retorno = super.imprimir(nf, imp);
		Calendar cHora = Calendar.getInstance();
		Vector vValores = new Vector();
		Vector vClfisc = new Vector();
		Vector vSigla = new Vector();
		Vector vDesc = null;
		String sDesc = null;
		String sCodfisc = null;
		String sSigla = null;   
		String sTipoTran=  null;
		String sHora = null;
		String sMatObs = null;		 
		String[] sNat = new String[4];
		String[] sVencs = new String[6];
		String[] sVals = new String[6];
		String[] sDuplics = new String[6];
		int iNumNota = 0;
		int iProd = 0;
		boolean bMensage = false;
		boolean bFat = true;
		boolean bTotalizou = false;
		boolean bjatem = false;
		boolean bNat = true;
		
		try {
			
			imp.limpaPags();
			vClfisc.addElement("");
			
			sHora = Funcoes.strZero(""+cHora.get(Calendar.HOUR_OF_DAY),2)+":"+Funcoes.strZero(""+cHora.get(Calendar.MINUTE),2)+":"+Funcoes.strZero(""+cHora.get(Calendar.SECOND),2);
			
			if (cab.next()) 
				sNumNota = cab.getInt(NF.C_DOC)+"";
			else 
				sNumNota = Funcoes.strZero(""+iNumNota,6);			

			for (int i=0; i<6; i++) {
				if (bFat) {
					if (parc.next()) {
						sDuplics[i] = sNumNota+"/"+parc.getInt(NF.C_NPARCITREC);
						sVencs[i] = Funcoes.dateToStrDate(parc.getDate(NF.C_DTVENCTO));
						sVals[i] = Funcoes.strDecimalToStrCurrency(12,2,parc.getString(NF.C_VLRPARC));
					} else {
						bFat = false;
						sDuplics[i] = "********";
						sVencs[i] = "********";
						sVals[i] = "********";
					}
				}          
			}
						
			while (itens.next()) {
								
				if (bNat) {
					sNat[0] = itens.getString(NF.C_DESCNAT);
					sNat[1] = Funcoes.setMascara(itens.getString(NF.C_CODNAT),"#.##");
					sMatObs = (!cab.getString(NF.C_OBSPED).equals("") ? cab.getString(NF.C_OBSPED) : "");
					bNat = false;
				}
				
				if (imp.pRow()==0) {        	 
					imp.say(imp.pRow()+1,0,""+imp.comprimido());
					
					if (nf.getTipoNF()==NF.TPNF_ENTRADA)
						imp.say(imp.pRow()+0,102,"X");
					else
						imp.say(imp.pRow()+0,90,"X");
					
					imp.say(imp.pRow()+0,128,sNumNota);
					imp.say(imp.pRow()+6,0,""+imp.comprimido());
					imp.say(imp.pRow()+0,6,sNat[0]);
					imp.say(imp.pRow()+0,52,sNat[1]);
					imp.say(imp.pRow()+2,0,""+imp.comprimido());
					imp.say(imp.pRow()+0,6,cab.getInt(NF.C_CODEMIT)+" - "+cab.getString(NF.C_RAZEMIT));
					imp.say(imp.pRow()+0,90,!cab.getString(NF.C_CPFEMIT).equals("") ? Funcoes.setMascara(cab.getString(NF.C_CPFEMIT),"###.###.###-##") : Funcoes.setMascara(cab.getString(NF.C_CNPJEMIT),"##.###.###/####-##")) ;
					imp.say(imp.pRow()+0,126,Funcoes.dateToStrDate(cab.getDate(NF.C_DTEMITPED)));
					imp.say(imp.pRow()+1,0,""+imp.comprimido());
					imp.say(imp.pRow()+0,6,Funcoes.copy(cab.getString(NF.C_ENDEMIT),0,50).trim()+", "+(!cab.getString(NF.C_NUMEMIT).equals("") ? Funcoes.copy(cab.getString(NF.C_NUMEMIT),0,6).trim() : "").trim()+" - "+(!cab.getString(NF.C_COMPLEMIT).equals("") ? Funcoes.copy(cab.getString(NF.C_COMPLEMIT),0,9).trim() : "").trim());
					imp.say(imp.pRow()+0,84,!cab.getString(NF.C_BAIREMIT).equals("") ? Funcoes.copy(cab.getString(NF.C_BAIREMIT),0,20) : "");
					imp.say(imp.pRow()+0,107,Funcoes.setMascara(cab.getString(NF.C_CEPEMIT),"#####-###"));
					imp.say(imp.pRow()+0,126,Funcoes.dateToStrDate(cab.getDate(NF.C_DTSAIDA)));
					imp.say(imp.pRow()+1,0,"");
					imp.say(imp.pRow()+1,0,""+imp.comprimido());
					imp.say(imp.pRow()+0,6,cab.getString(NF.C_CIDEMIT));
					imp.say(imp.pRow()+0,50,(!cab.getString(NF.C_DDDEMIT).equals("") ? "("+cab.getString(NF.C_DDDEMIT)+")" : "")+(!cab.getString(NF.C_FONEEMIT).equals("")? Funcoes.setMascara(cab.getString(NF.C_FONEEMIT).trim(),"####-####") : ""));
					imp.say(imp.pRow()+0,73,cab.getString(NF.C_UFEMIT));
					imp.say(imp.pRow()+0,90,!cab.getString(NF.C_RGEMIT).equals("") ? cab.getString(NF.C_RGEMIT) : cab.getString(NF.C_INSCEMIT));
					imp.say(imp.pRow()+0,127,sHora);
					
					imp.say(imp.pRow()+3,0,""+imp.comprimido());		
					   
					/*imp.say(imp.pRow()+0,8,sVals[0]);            
					imp.say(imp.pRow()+0,36,sVencs[0]);             
					
					imp.say(imp.pRow()+0,55,sVals[1]);
					imp.say(imp.pRow()+0,83,sVencs[1]);             
					
					imp.say(imp.pRow()+0,102,sVals[2]);
					imp.say(imp.pRow()+0,130,sVencs[2]);*/             
					   
					imp.say(imp.pRow()+1,0,""+imp.comprimido());
					     
					/*imp.say(imp.pRow()+0,8,sVals[3]);            
					imp.say(imp.pRow()+0,36,sVencs[3]);             
					
					imp.say(imp.pRow()+0,55,sVals[4]);
					imp.say(imp.pRow()+0,83,sVencs[4]);             
					
					imp.say(imp.pRow()+0,102,sVals[5]);
					imp.say(imp.pRow()+0,130,sVencs[5]);    */
					imp.say(imp.pRow()+3,0,"");
				}
				 
				imp.say(imp.pRow()+1,0,""+imp.comprimido());            
				imp.say(imp.pRow()+0,4,""+itens.getInt(NF.C_CODPROD));             
				vDesc = Funcoes.strToVectorSilabas(itens.getString(NF.C_OBSITPED)==null || itens.getString(NF.C_OBSITPED).equals("") ? (itens.getString(NF.C_DESCPROD).trim()):itens.getString(NF.C_OBSITPED),50);
				
				for (int iConta=0;( (iConta < 20) && (vDesc.size()>iConta) );iConta++) {
					if (!vDesc.elementAt(iConta).toString().equals(""))					
						sDesc = vDesc.elementAt(iConta).toString();
					else					
						sDesc = "";
					
					if (iConta > 0)
						imp.say(imp.pRow()+1,0,""+imp.comprimido());
					
					imp.say(imp.pRow()+0,14, sDesc);
					iProd = iProd+vDesc.size();
					
					sMensAdic = !itens.getString(NF.C_DESCFISC).equals("") ? itens.getString(NF.C_DESCFISC).trim() : "";
				}
				
				sCodfisc = (!itens.getString(NF.C_CODFISC).equals("") ? itens.getString(NF.C_CODFISC) : "");
				   
				if(!sCodfisc.equals("")){
					for(int i=0;i<vClfisc.size();i++){
						if(vClfisc.elementAt(i)!=null){
							if(sCodfisc.equals((String)vClfisc.elementAt(i))){
								bjatem = true;
								sSigla = ""+(char)(64 + i);
							} else
								bjatem = false;
						}
					}
					if(!bjatem){
						vClfisc.addElement(sCodfisc);
						sSigla = ""+(char)(63 + vClfisc.size());
						vSigla.addElement(sSigla + " = " + sCodfisc);
					}
				}

				imp.say(imp.pRow()+0,68,sSigla);				
				imp.say(imp.pRow()+0,73,Funcoes.copy(itens.getString(NF.C_ORIGFISC),0,1)+Funcoes.copy(itens.getString(NF.C_CODTRATTRIB),0,2));
				imp.say(imp.pRow()+0,79,itens.getString(NF.C_CODUNID).substring(0,4));
				imp.say(imp.pRow()+0,82,Funcoes.alinhaDir(""+itens.getFloat(NF.C_QTDITPED),8));
				imp.say(imp.pRow()+0,92,Funcoes.strDecimalToStrCurrency(12,2,""+((new BigDecimal(itens.getFloat(NF.C_VLRLIQITPED))).divide(new BigDecimal(itens.getFloat(NF.C_QTDITPED)),2,BigDecimal.ROUND_HALF_UP))));
				imp.say(imp.pRow()+0,107,Funcoes.strDecimalToStrCurrency(13,2,itens.getFloat(NF.C_VLRLIQITPED)+""));
				imp.say(imp.pRow()+0,122,""+itens.getFloat(NF.C_PERCICMSITPED));
				imp.say(imp.pRow()+0,127,""+itens.getFloat(NF.C_PERCIPIITPED));
				imp.say(imp.pRow()+0,132,Funcoes.strDecimalToStrCurrency(5,2,itens.getFloat(NF.C_VLRIPIITPED)+""));
			
				if((iProd+((vSigla.size()/2)+2)) >= 25){
					bMensage = true;
					break;
				}
				
				if (!bTotalizou) {
					frete.next();
					
					vValores.addElement(""+itens.getFloat(NF.C_VLRBASEICMSPED)); //0
					vValores.addElement(""+itens.getFloat(NF.C_VLRICMSPED)); //1
					vValores.addElement(""+itens.getFloat(NF.C_VLRLIQPED)); // 2
					vValores.addElement(""+frete.getFloat(NF.C_VLRFRETEPED));//3
					vValores.addElement(""+itens.getFloat(NF.C_VLRADICPED));//4
					vValores.addElement(""+itens.getFloat(NF.C_VLRIPIPED));//5
					vValores.addElement(""+(itens.getFloat(NF.C_VLRLIQPED) - frete.getFloat(NF.C_VLRFRETEPED) + itens.getFloat(NF.C_VLRADICPED) - itens.getFloat(NF.C_VLRIPIPED)));//6
					vValores.addElement(frete.getString(NF.C_RAZTRANSP));//7
					vValores.addElement(frete.getString(NF.C_TIPOFRETE));//8
					vValores.addElement(frete.getString(NF.C_PLACAFRETE));//9
					vValores.addElement(frete.getString(NF.C_UFFRETE));      //10   
					sTipoTran = !frete.getString(NF.C_TIPOTRANSP).equals("") ? frete.getString(NF.C_TIPOTRANSP) : "";
					vValores.addElement(sTipoTran);//11
					vValores.addElement(cab.getString(NF.C_CNPJEMIT));//12
					vValores.addElement(frete.getString(NF.C_CNPJTRANSP));   //13         
					vValores.addElement(!frete.getString(NF.C_ENDTRANSP).equals("")?frete.getString(NF.C_ENDTRANSP):"");//14
					   
					if (sTipoTran.equals("C")) {
						vValores.addElement("");//15
						vValores.addElement("");//16
						vValores.addElement("");//17
						vValores.addElement(""); //18
					} else {
						vValores.addElement(""+frete.getInt(NF.C_NUMTRANSP));//15
						vValores.addElement(!frete.getString(NF.C_CIDTRANSP).equals("")?frete.getString(NF.C_CIDTRANSP):"");//16
						vValores.addElement(!frete.getString(NF.C_UFTRANSP).equals("")?frete.getString(NF.C_UFTRANSP): "");//17
						vValores.addElement(!frete.getString(NF.C_INSCTRANSP).equals("")?frete.getString(NF.C_INSCTRANSP):""); //18
					}
					
					vValores.addElement(""+frete.getFloat(NF.C_QTDFRETE));//19
					vValores.addElement(frete.getString(NF.C_ESPFRETE));//20
					vValores.addElement(frete.getString(NF.C_MARCAFRETE));//21
					vValores.addElement(""+frete.getFloat(NF.C_PESOBRUTO));//22
					vValores.addElement(""+frete.getFloat(NF.C_PESOLIQ));//23
					vValores.addElement(""+itens.getFloat(NF.C_VLRISSPED));//24
					vValores.addElement(""+cab.getInt(NF.C_CODVEND));//25
					
					if (cab.getString(NF.C_NOMEVEND)==null || cab.getString(NF.C_NOMEVEND).equals(""))
						vValores.addElement(Funcoes.replicate(" ",25)); // 26
					else 
						vValores.addElement(cab.getString(NF.C_NOMEVEND)+Funcoes.replicate(" ",25-cab.getString(NF.C_NOMEVEND).length()));
					
					bTotalizou = true;
				} 
				
			}			
			
			imp.say(imp.pRow()+1,0,""+imp.comprimido());
			imp.say(imp.pRow()+0,14,"CLASSIFICACAO FISCAL");
			
			int pos = 1;
			for(int i=0;i<vSigla.size();i++){
				if(pos==1){
					imp.say(imp.pRow()+1,0,""+imp.comprimido());
					imp.say(imp.pRow()+0,14,(String)vSigla.elementAt(i));
					pos = 2;
				} else{
					imp.say(imp.pRow()+0,35,(String)vSigla.elementAt(i));
					pos = 1;
					iProd++;
				}
			}
			 
			imp.say(imp.pRow()+1,0,""+imp.comprimido());
			imp.say(imp.pRow()+0,6,(sMatObs.trim().length()>130 ? sMatObs.trim().substring(0,130) : sMatObs.trim()));
			
			
			impTotais(imp,vValores);
			
			imp.fechaGravacao();
			
			retorno = true;
			
			if(bMensage) {
				if(Funcoes.mensagemConfirma(null,
						"Podem conter erros na disposi��o da nota.\n"+
						"A descri��o dos produtos ultrapassa o limite na nota.\n"+
						"Deseja imprimir?")==JOptionPane.YES_NO_CANCEL_OPTION)
					retorno = false;					
			}

		} catch ( Exception err ) {
			Funcoes.mensagemErro(null,"Erro ao montar Nota Fiscal!"+err.getMessage());      
			retorno = false;
		} finally {
			cHora = null;
			vValores = null;
			vClfisc = null;
			vSigla = null;
			vDesc = null;
			sDesc = null;
			sCodfisc = null;
			sSigla = null;   
			sTipoTran=  null;
			sHora = null;
			sMatObs = null;		 
			sNat = null;
			sVencs = null;
			sVals = null;
			sDuplics = null;
		}
		
		return retorno;
	}
	
	private void impTotais(ImprimeOS imp,Vector vValores){
		Vector vObs = null;
		String sTipoTran = null;
		try {	
			for (int i=0;(imp.pRow()<47);i++)
				imp.say(imp.pRow()+1,0,"");
			
			imp.say(imp.pRow()+1,0,""+imp.comprimido());
			imp.say(imp.pRow()+0,6,Funcoes.strDecimalToStrCurrency(20,2,vValores.elementAt(0).toString()));
			imp.say(imp.pRow()+0,35,Funcoes.strDecimalToStrCurrency(20,2,vValores.elementAt(1).toString()));
			imp.say(imp.pRow()+0,117,Funcoes.strDecimalToStrCurrency(20,2,vValores.elementAt(6).toString()));
			
			imp.say(imp.pRow()+2,0,""+imp.comprimido());
			
			imp.say(imp.pRow()+0,6,Funcoes.strDecimalToStrCurrency(20,2,vValores.elementAt(3).toString()));
			imp.say(imp.pRow()+0,65,Funcoes.strDecimalToStrCurrency(20,2,vValores.elementAt(4).toString()));
			imp.say(imp.pRow()+0,90,Funcoes.strDecimalToStrCurrency(20,2,vValores.elementAt(5).toString()));
			imp.say(imp.pRow()+0,117,Funcoes.strDecimalToStrCurrency(20,2,vValores.elementAt(2).toString()));
			
			imp.say(imp.pRow()+2,0,""+imp.comprimido());
			    	        	       	      	      
			imp.say(imp.pRow()+0,6,vValores.elementAt(7) != null ? vValores.elementAt(7).toString() : "");
			imp.say(imp.pRow()+0,88,vValores.elementAt(8) != null ? (vValores.elementAt(8).toString().equals("C") ? "1" : "2") : "");
			imp.say(imp.pRow()+0,92,vValores.elementAt(9) != null ? vValores.elementAt(9).toString() : "");
			imp.say(imp.pRow()+0,108,vValores.elementAt(10) != null ? vValores.elementAt(10).toString() : "");
			  
			sTipoTran = vValores.elementAt(11).toString();
			if (sTipoTran==null) 
				sTipoTran = "T";
			  
			if ( sTipoTran.equals("C") )
				imp.say(imp.pRow()+0,118,"");			  	
			else 
				imp.say(imp.pRow()+0,118,Funcoes.setMascara(vValores.elementAt(13) != null ? vValores.elementAt(13).toString() : "","##.###.###/####-##"));
			
			  
			imp.say(imp.pRow()+2,0,""+imp.comprimido());
			
			imp.say(imp.pRow()+0,6,vValores.elementAt(14) != null ? vValores.elementAt(14).toString().trim() : "");
			imp.say(imp.pRow()+0,72,vValores.elementAt(16) != null ? vValores.elementAt(16).toString().trim() : "");
			imp.say(imp.pRow()+0,106,vValores.elementAt(17) != null ? vValores.elementAt(17).toString().trim() : "");
			imp.say(imp.pRow()+0,117,vValores.elementAt(18) != null ? vValores.elementAt(18).toString() : "");
			    	      
			imp.say(imp.pRow()+1,0,""+imp.comprimido());
			  
			imp.say(imp.pRow()+0,6,vValores.elementAt(19) != null ? vValores.elementAt(19).toString() : "");
			imp.say(imp.pRow()+0,20,vValores.elementAt(20) != null ? vValores.elementAt(20).toString() : "");
			imp.say(imp.pRow()+0,42,vValores.elementAt(21) != null ? vValores.elementAt(21).toString() : "");
			imp.say(imp.pRow()+0,105,vValores.elementAt(22) != null ? vValores.elementAt(22).toString() : "");
			imp.say(imp.pRow()+0,128,vValores.elementAt(23) != null ? vValores.elementAt(23).toString() : "");
			  
			imp.say(imp.pRow()+2,0,""+imp.comprimido());
			  
			vObs = Funcoes.quebraLinha(Funcoes.stringToVector(sMensAdic),65);
			for (int i=0; i<vObs.size(); i++) {
				imp.say(imp.pRow()+1,0,""+imp.comprimido());
				imp.say(imp.pRow()+0,6,vObs.elementAt(i).toString());				
			}
			  
			imp.say(imp.pRow()+7,0,""+imp.comprimido());
			imp.say(imp.pRow()+0,128,sNumNota);
			imp.setPrc(0,0);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			vObs = null;
			sTipoTran = null;
		}
	}
}
