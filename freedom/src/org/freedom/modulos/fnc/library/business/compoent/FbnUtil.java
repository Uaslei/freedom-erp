package org.freedom.modulos.fnc.library.business.compoent;

public class FbnUtil {

	public enum EColcli {
		CODBANCO, TIPOFEBRABAN, STIPOFEBRABAN, AGENCIACLI, IDENTCLI, TIPOREMCLI, CODEMPPF, CODFILIALPF, NUMCONTA, CODPLAN, RAZCLI
	}

	public enum EColrec {
		CODBANCO, TIPOFEBRABAN, STIPOFEBRABAN, SITREMESSA, CODCLI, AGENCIACLI, IDENTCLI, DTVENC, VLRAPAG, PESSOACLI, CPFCLI, CNPJCLI, CODMOVIMENTO, DOCREC, DTREC, NRPARCPAG, SEQREC
	}

	public enum EParcela {
		CODREC, NPARCITREC, VLRITREC, VLRDESCITREC, VLRMULTAITREC, VLRJUROSITREC, VLRPARCITREC, VLRPAGOITREC, VLRAPAGITREC, DTITREC, DTVENCITREC, DTPAGOITREC, STATUSITREC, CODPLAN, OBSITREC, NUMCONTA, CODBANCO, CODTIPOCOB, DOCLANCAITREC, FLAG, ANOCC, CODCC, VLRCOMIITREC, DTLIQITREC;
	}

	public enum EPrefs {
		CODBANCO, NOMEBANCO, CODCONV, NOMEEMP, NOMEEMPCNAB, VERLAYOUT, IDENTSERV, CONTACOMPR, IDENTAMBCLI, IDENTAMBBCO, NROSEQ, AGENCIA, 
		DIGAGENCIA, NUMCONTA, DIGCONTA, DIGAGCONTA, CNPFEMP, FORCADTIT, TIPODOC, IDENTEMITBOL, IDENTDISTBOL, ESPECTIT, CODJUROS, VLRPERCJUROS, 
		CODDESC, VLRPERCDESC, CODPROT, DIASPROT, CODBAIXADEV, DIASBAIXADEV, MDECOB, CONVCOB, ACEITE, PADRAOCNAB, TPNOSSONUMERO, IMPDOCBOL;
	}

	public enum ETipo {
		X, $9
	}

	public class StuffCli {

		private String[] stfArgs = null;

		private Integer codigo = null;

		public StuffCli( Integer codCli, String[] args ) {

			// System.out.println(args.length);
			this.codigo = codCli;
			this.stfArgs = args;
		}

		public String[] getArgs() {

			return this.stfArgs;
		}

		public Integer getCodigo() {

			return this.codigo;
		}

		public boolean equals( Object obj ) {

			if ( obj instanceof StuffCli )
				return codigo.equals( ( (StuffCli) obj ).getCodigo() );
			else
				return false;
		}

		public int hashCode() {

			return this.codigo.hashCode();
		}
	}

	public class StuffRec {

		private String[] stfArgs = null;

		private Integer chave1 = null;

		private Integer chave2 = null;

		private Integer docrec = null;

		private Integer seqrec = null;
		
		private String chaveComp = null;

		public StuffRec( Integer codRec, Integer nParcItRec, String[] args ) {

			// System.out.println(args.length);
			this.chave1 = codRec;
			this.chave2 = nParcItRec;
			this.chaveComp = "[" + String.valueOf( codRec ) + "][" + String.valueOf( nParcItRec ) + "]";
			this.stfArgs = args;
			if ( args.length > EColrec.DOCREC.ordinal() ) {
				docrec = new Integer( args[ EColrec.DOCREC.ordinal() ] );
			}
			if ( args.length > EColrec.SEQREC.ordinal() ) {
				seqrec = new Integer( args[ EColrec.SEQREC.ordinal() ] );
			}
		}

		public String[] getArgs() {

			return this.stfArgs;
		}

		public Integer getCodrec() {

			return this.chave1;
		}

		public Integer getDocrec() {

			return this.docrec;
		}

		
		public Integer getSeqrec() {
		
			return seqrec;
		}

		
		public void setSeqrec( Integer seqrec ) {
		
			this.seqrec = seqrec;
		}

		public Integer getNParcitrec() {

			return this.chave2;
		}

		public void setSitremessa( String sit ) {

			this.stfArgs[ EColrec.SITREMESSA.ordinal() ] = sit;
		}

		public boolean equals( Object obj ) {

			if ( obj instanceof StuffRec )
				return ( ( chave1.equals( ( (StuffRec) obj ).getCodrec() ) ) && ( chave2.equals( ( (StuffRec) obj ).getNParcitrec() ) ) );
			else
				return false;
		}

		public int hashCode() {

			return chaveComp.hashCode();
		}
	}

	public class StuffParcela {

		private Integer codrec = null;

		private Integer numparcrec = null;

		private Object[] args = null;

		private String chaveComp = null;

		public StuffParcela( final Integer codrec, final Integer numparcrec, final Object[] args ) {

			this.codrec = codrec;
			this.numparcrec = numparcrec;
			this.args = args;
			this.chaveComp = "[" + String.valueOf( codrec ) + "][" + String.valueOf( numparcrec ) + "]";
		}

		public Object[] getArgs() {

			return args;
		}

		public Integer getCodrec() {

			return codrec;
		}

		public Integer getNumparcrec() {

			return numparcrec;
		}

		public boolean equals( Object obj ) {

			if ( obj instanceof StuffParcela )
				return ( ( codrec.equals( ( (StuffParcela) obj ).getCodrec() ) ) && ( numparcrec.equals( ( (StuffParcela) obj ).getNumparcrec() ) ) );
			else
				return false;
		}

		public int hashCode() {

			return chaveComp.hashCode();
		}
	}
}
