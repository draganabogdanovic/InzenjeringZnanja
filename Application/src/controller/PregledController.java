package controller;

import java.util.ArrayList;
import java.util.Date;

import model.PregledPacijenta;
import view.PregledPacijentaView;

public class PregledController {
	private PregledPacijenta pregled;
	private PregledPacijentaView pregledPacijenta;
	
	public PregledController(PregledPacijenta pregled, PregledPacijentaView pregledPacijenta) {
		setPregled(pregled);
		setPregledPacijentaView(pregledPacijenta);
	}
	
	
	public String updatePregled(ArrayList<String > listaSimptoma, Date datumPregleda, ArrayList<String> listaLekova,
	 ArrayList<String> listaTerapija, String bolest, String nalaz) {
		return "update";
	}


	public PregledPacijenta getPregled() {
		return pregled;
	}


	public void setPregled(PregledPacijenta pregled) {
		this.pregled = pregled;
	}


	public PregledPacijentaView getPregledPacijenta() {
		return pregledPacijenta;
	}


	public void setPregledPacijentaView(PregledPacijentaView pregledPacijenta) {
		this.pregledPacijenta = pregledPacijenta;
	}
	
}
