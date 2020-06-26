package controller;

import java.io.Serializable;
import java.util.Date;

import javax.swing.JList;

public class SacuvajPregled implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JList<String> listaSimptoma;
	public Date datumPregleda;
	public JList<String> listaLekova;
	public JList<String> dodatnaIsp;
}
