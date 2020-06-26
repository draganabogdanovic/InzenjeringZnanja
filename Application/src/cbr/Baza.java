package cbr;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.tree.DefaultMutableTreeNode;

import app.MainFrame;
import model.Karton;
import model.Pacijent;
import ucm.gaia.jcolibri.util.FileIO;

public class Baza implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static Baza instance = null;
	private ArrayList<Pacijent> pacijenti;
	private ArrayList<String> listaSimptoma;
	private ArrayList<Dijagnoza> listaBolesti;
	private ArrayList<Lekovi> listaLekova;
	private Pacijent pacijent;
	
	public static Baza getInstance() {
		if (instance == null){
			instance = new Baza();
		}
		return instance;
	}
	
	private Baza() {
		init();
		initBolesti();
		initLekovi();
	}
	
	private void init() {
		this.pacijenti = new ArrayList<Pacijent>();
		this.listaSimptoma = new ArrayList<String>();
		this.listaBolesti = new ArrayList<Dijagnoza>();
		this.listaLekova = new ArrayList<Lekovi>();
	}

	private void initBolesti() {
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(FileIO.openFile("data/cases_pregled.csv")));
			if (br == null)
				throw new Exception("Error opening file");

			String line = "";
			while ((line = br.readLine()) != null) {
				if (line.startsWith("#") || (line.length() == 0))
					continue;
				String[] values = line.split(";");


				Dijagnoza diagnosis = new Dijagnoza();
				
				diagnosis.setSimptomi(StringListMapper.toList(values[0]));
				diagnosis.setDij(values[1]);
				
				this.listaBolesti.add(diagnosis);
			
			}
			br.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void initLekovi() {
		
	}

	public ArrayList<String> getListaSimptoma() {
		return listaSimptoma;
	}

	public void setListaSimptoma(ArrayList<String> listaSimptoma) {
		this.listaSimptoma = listaSimptoma;
	}

	public ArrayList<Pacijent> getPacijenti() {
		return pacijenti;
	}

	public void setPacijenti(ArrayList<Pacijent> pacijenti) {
		this.pacijenti = pacijenti;
	}

	public void dodajPacijenta(String ime, String prezime, String jMBG, Date datum) {
		// TODO Auto-generated method stub
		DefaultMutableTreeNode element = (DefaultMutableTreeNode) MainFrame.getInstance().getModel()
				.getRoot();

		Pacijent noviPac = new Pacijent(pacijent.getIme(), pacijent.getPrezime(), pacijent.getJMBG(), pacijent.getDatumRodjenja());

		MainFrame.getInstance().getModel().insertNodeInto(new DefaultMutableTreeNode(noviPac), element,
				element.getChildCount());

		Karton.getInstance().dodajPacijenta(noviPac);
		
	}

	public ArrayList<Lekovi> getListaLekova() {
		return listaLekova;
	}

	public void setListaLekova(ArrayList<Lekovi> listaLekova) {
		this.listaLekova = listaLekova;
	}
}

