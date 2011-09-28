package org.freedom.modulos.crm.business.object;

import java.awt.Color;
import java.util.Vector;

import org.freedom.modulos.crm.business.component.Constant;

public class Contrato {
	public static final Constant SIT_PROJ_NAO_SALVO = new Constant("N�o salvo", "",  Color.WHITE, Color.BLACK);	
	public static final Constant SIT_PROJ_PENDENTE = new Constant("Pendente", "PE",  Color.YELLOW, Color.BLACK);
	public static final Constant SIT_PROJ_EM_PLANEJAMENTO = new Constant("Em planejamento", "PA", Color.GRAY, Color.WHITE);
	public static final Constant SIT_PROJ_PLANEJADO = new Constant("Planejado", "PF", Color.DARK_GRAY, Color.WHITE);
	public static final Constant SIT_PROJ_EM_EXECUCAO = new Constant("Em execu��o", "EE", Color.CYAN, Color.BLACK);
	public static final Constant SIT_PROJ_EXECUTADO = new Constant("Executado", "EX", Color.GREEN, Color.WHITE);
	public static final Constant SIT_PROJ_PARALIZADO = new Constant("Paralizado", "PO", Color.WHITE, Color.BLACK);
	public static final Constant SIT_PROJ_CANCELADO_CLIENTE = new Constant("Canc. cliente", "CC", Color.RED, Color.BLACK);
	public static final Constant SIT_PROJ_CANCELADO_PRESTADOR = new Constant("Canc. prestador ", "CP", Color.RED, Color.BLACK);
	public static final Constant SIT_PROJ_FINALIZADO = new Constant("Finalizado", "FN", Color.BLUE, Color.WHITE);
	
	private static Vector<Constant> listSitproj = null;
	
	public static Vector<Constant> getListSitproj() {
		if (listSitproj==null) {
			listSitproj = new Vector<Constant>();
			listSitproj.add( SIT_PROJ_PENDENTE );
			listSitproj.add( SIT_PROJ_EM_PLANEJAMENTO );
			listSitproj.add( SIT_PROJ_PLANEJADO );
			listSitproj.add( SIT_PROJ_EM_EXECUCAO );
			listSitproj.add( SIT_PROJ_EXECUTADO );
			listSitproj.add( SIT_PROJ_PARALIZADO );
			listSitproj.add( SIT_PROJ_CANCELADO_CLIENTE );
			listSitproj.add( SIT_PROJ_CANCELADO_PRESTADOR );
			listSitproj.add( SIT_PROJ_FINALIZADO );
		}
		return listSitproj;
	}
	
	public static Vector<String> getSitprojName() {
		Vector<String> result = new Vector<String>();
		listSitproj = getListSitproj();
		for (int i=0; i<listSitproj.size(); i++) {
			result.add( listSitproj.elementAt( i ) .getName());
		}
		return result;
	}

	public static Vector<String> getSitprojValue() {
		Vector<String> result = new Vector<String>();
		listSitproj = getListSitproj();
		for (int i=0; i<listSitproj.size(); i++) {
			result.add( (String) listSitproj.elementAt( i ) .getValue());
		}
		return result;
	}
	
}
