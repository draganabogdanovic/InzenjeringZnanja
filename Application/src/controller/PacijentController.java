package controller;

import java.util.Date;

import javax.swing.tree.DefaultMutableTreeNode;

import app.MainFrame;
import model.Karton;
import model.Pacijent;
import view.PacijentView;

public class PacijentController {
	private Pacijent pacijent;
	private PacijentView pacijentView;
	
	public PacijentController(Pacijent pacijent,PacijentView pacijentView){
		setPacijent(pacijent);
		setPacijentView(pacijentView);
	}
	
	public String updatesPacijent(String Ime, String Prezime, String JMBG, Date Datum) {
		if (Ime == null) {
			return "Unesite ime pacijenta";
		}
		Ime = Ime.trim();
		if (Ime.isEmpty()) {
			return "Unesite ime pacijenta";
		}

		if (Prezime == null) {
			return "Unesite sediste pacijenta";
		}
		Prezime = Prezime.trim();
		if (Prezime.isEmpty()) {
			return "Unesite sediste pacijenta";
		}
		
		if (JMBG == null) {
			return "Unesite JMBG";
		}
		JMBG = JMBG.trim();
		if (JMBG.isEmpty()) {
			return "Unesite JMBG";
		}

		if (Datum == null) {
			return "Unesite datum rodjenja pacijenta";
		}
		
		if(Datum.equals(null)) {
			return "Unesite datum rodjenja pacijenta";
			
		}

		pacijent.setIme(Ime);
		pacijent.setPrezime(Prezime);
		pacijent.setJMBG(JMBG);
		pacijent.setDatumRodjenja(Datum);
		
		DefaultMutableTreeNode element = (DefaultMutableTreeNode) MainFrame.getInstance().getModel()
				.getRoot();

		Pacijent noviPac = new Pacijent(pacijent.getIme(), pacijent.getPrezime(), pacijent.getJMBG());

		MainFrame.getInstance().getModel().insertNodeInto(new DefaultMutableTreeNode(noviPac), element,
				element.getChildCount());

		Karton.getInstance().dodajPacijenta(noviPac);
	
		pacijentView.refreshView();

		return "Model uspesno azuriran";
	}
	
	public Pacijent getPacijent(){
		return pacijent;
	}
	
	private void setPacijent(Pacijent pacijent){
		if(pacijent==null){
			throw new NullPointerException();
			
		}
		this.pacijent = pacijent;
	}
	
	public PacijentView getPacijentView() {
		return pacijentView;
	}
	
	private void setPacijentView(PacijentView pacijentView) {
		if (pacijentView == null) {
			throw new NullPointerException();
		}
		this.pacijentView = pacijentView;
	}

}
