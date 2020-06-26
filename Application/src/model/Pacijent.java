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
	private String JMBG;
	private ArrayList<PregledPacijenta> children;
	
	public String getJMBG() {
		return JMBG;
	}

	public void setJMBG(String JMBG) {
		this.JMBG = JMBG;
	}

	public ArrayList<PregledPacijenta> getPregledi() {
		return children;
	}

	public void setPregledi(ArrayList<PregledPacijenta> pregledi) {
		this.children = pregledi;
	}

	public void addPregled(PregledPacijenta pregled)
	{
		this.children.add(pregled);
	}
	
	public Pacijent(String ime, String prezime, String JMBG, Date datumRodjenja) {
		// TODO Auto-generated constructor stub
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.JMBG = JMBG;
		this.datumRodjenja = datumRodjenja;
	}
	
	public Pacijent() {
		
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
	
	@Override
	public String toString()
	{
		return ""+ime
				+" "+ prezime+"";
	}
	
}
