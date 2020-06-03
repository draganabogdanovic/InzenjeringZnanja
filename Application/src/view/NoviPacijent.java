package view;

import java.util.ArrayList;
import java.util.Date;

import javax.swing.JDialog;

import model.Pol;
import model.PregledPacijenta;



public class NoviPacijent extends JDialog {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	static int br = 0;
	private String name;
	private String surname;
	private String brLicneKarte;
	private Pol pol;
	private ArrayList<PregledPacijenta> pregledi;
	
	public NoviPacijent(String name, String surname)
	{
		super();
		this.name = name;
		this.surname = surname;
	
	}

	
	public NoviPacijent() {
		
		
	}
	
	public String getName() {
		
		return name;
	}
	
	public void setName(String name) {
		
		this.name = name;
	}
	
	public String getSurname() {
		
		return surname;
	}
	
	public void setSurname(String surname) {
		
		this.surname = surname;
	}

	public String getBrLicneKarte() {
		return brLicneKarte;
	}

	public void setBrLicneKarte(String brLicneKarte) {
		this.brLicneKarte = brLicneKarte;
	}


	public Pol getPol() {
		return pol;
	}


	public void setPol(Pol pol) {
		this.pol = pol;
	}


	public ArrayList<PregledPacijenta> getPregledi() {
		return pregledi;
	}


	public void setPregledi(ArrayList<PregledPacijenta> pregledi) {
		this.pregledi = pregledi;
	}
	
	
	

}