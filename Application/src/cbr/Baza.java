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
	private Simptomi simptomi;
	private Pacijent pacijent;
	
	public static Baza getInstance() {
		if (instance == null){
			instance = new Baza();
		}
		return instance;
	}
	
	private Baza() {
		init();
		//initSimptomi();
		initBolesti();
	}
	
	private void init() {
		this.pacijenti = new ArrayList<Pacijent>();
		this.listaSimptoma = new ArrayList<String>();
		this.listaBolesti = new ArrayList<Dijagnoza>();
	}
	
	private void initSimptomi() {
		/*try {
			BufferedReader br = new BufferedReader(new InputStreamReader(FileIO.openFile("data/simptomii.csv")));
			if(br == null) {
				throw new Exception("error");
			}
			
			String line = "";
			while((line = br.readLine()) != null) {
				if((line.startsWith("#")) || (line.length()==0)) {
					continue;
				}
				
				String [] values = line.split(";");
				Simptomi s = new Simptomi();
			//	Simptomi.setSimptomi(value[0]);
				//s.setSimptomi(StringListMapper.toList(values[0]));
				this.listaSimptoma.add(s);
			}
			
			br.close();
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}*/
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

		Pacijent noviPac = new Pacijent(pacijent.getIme(), pacijent.getPrezime(), pacijent.getJMBG());

		MainFrame.getInstance().getModel().insertNodeInto(new DefaultMutableTreeNode(noviPac), element,
				element.getChildCount());

		Karton.getInstance().dodajPacijenta(noviPac);
		
	}
}

