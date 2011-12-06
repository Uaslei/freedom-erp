package org.freedom.modulos.gms.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.freedom.infra.dao.AbstractDAO;
import org.freedom.infra.model.jdbc.DbConnection;
import org.freedom.library.persistence.ListaCampos;
import org.freedom.library.swing.frame.Aplicativo;
import org.freedom.modulos.gms.business.object.Coleta;
import org.freedom.modulos.gms.business.object.Coleta.PREFS;


public class DAOColeta extends AbstractDAO {

	private Object prefs[] = null;
	
	
	public DAOColeta( DbConnection cn ) {

		super( cn );
		
	}
	
	public void setPrefs(Integer codemp, Integer codfilial) throws SQLException {
		
		PreparedStatement ps = null;
		ResultSet rs = null;
		StringBuilder sql = null;
		
		prefs = new Object[ Coleta.PREFS.values().length];
		
		try {
			sql = new StringBuilder("select pf1.usarefprod, " );
			sql.append( "pf8.codemptr, pf8.codfilialtr, coalesce(pf8.codtiporecmerccm,0) codtiporecmerc " );
			sql.append( "from sgprefere1 pf1 left outer join sgprefere8 pf8 " );
			sql.append( "on pf8.codemp=pf1.codemp and pf8.codfilial=pf1.codfilial " );
			sql.append( "where pf1.codemp=? and pf1.codfilial=? " );

			ps = getConn().prepareStatement( sql.toString() );
			ps.setInt( 1, Aplicativo.iCodEmp);
			ps.setInt( 2, ListaCampos.getMasterFilial( "SGPREFERE1" ) );
			rs = ps.executeQuery();
			
			if ( rs.next() ) {
				
				prefs[ PREFS.USAREFPROD.ordinal() ] = new Boolean( "S".equals( rs.getString( PREFS.USAREFPROD.toString() ) ) );
				prefs[ PREFS.CODEMPTR.ordinal() ] = new Integer(rs.getInt( PREFS.CODEMPTR.toString() ));
				prefs[ PREFS.CODFILIALTR.ordinal() ] = new Integer(rs.getInt( PREFS.CODFILIALTR.toString() ));
				prefs[ PREFS.CODTIPORECMERC.ordinal() ] = new Integer(rs.getInt( PREFS.CODTIPORECMERC.toString() ));

			}
			rs.close();
			ps.close();
			getConn().commit();
		} finally {
			ps = null;
			rs = null;
			sql = null;
		}
	}
	
	public Object[] getPrefs() {
		return this.prefs;
	}
}
