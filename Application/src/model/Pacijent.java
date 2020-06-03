package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;



public class Pacijent implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String ime;
	private String prezime;
	private Date datumRodjenja;
	private Karton kartonPacijenta;
	private Pol pol;
	private String brLicneKarte;
	private ArrayList<PregledPacijenta> pregledi;
	
	
	public Pol getPol() {
		return pol;
	}

	public void setPol(Pol pol) {
		this.pol = pol;
	}

	public String getBrLicneKarte() {
		return brLicneKarte;
	}

	public void setBrLicneKarte(String brLicneKarte) {
		this.brLicneKarte = brLicneKarte;
	}

	public ArrayList<PregledPacijenta> getPregledi() {
		return pregledi;
	}

	public void setPregledi(ArrayList<PregledPacijenta> pregledi) {
		this.pregledi = pregledi;
	}

	public void addPregled(PregledPacijenta pregled)
	{
		this.pregledi.add(pregled);
	}
	
	public Pacijent(String string, String stringP) {
		// TODO Auto-generated constructor stub
		setIme(string);
		setPrezime(stringP);
	}

	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public Date getDatumRodjenja() {
		return datumRodjenja;
	}
	public void setDatumRodjenja(Date datumRodjenja) {
		this.datumRodjenja = datumRodjenja;
	}
	public Karton getKartonPacijenta() {
		return kartonPacijenta;
	}
	public void setKartonPacijenta(Karton kartonPacijenta) {
		this.kartonPacijenta = kartonPacijenta;
	}
}
