package app;

import java.util.HashMap;
import java.util.List;

import javax.swing.JFrame;

import model.Pregled;

public class MainFrame extends JFrame{

	private static MainFrame instance;
	private Pregled pregled;
	private HashMap<String, Integer> mapaBolesti;
	private List<String> izabraniSimptom;
	
	public List<String> getIzabraniSimptom() {
		return izabraniSimptom;
	}

	public void setIzabraniSimptom(List<String> izabraniSimptom) {
		this.izabraniSimptom = izabraniSimptom;
	}

	public static MainFrame getInstance() {
		
		if(instance == null) {
			
			instance = new MainFrame();
			
		}
		return instance;
	}

	public Pregled getPregled() {
		return pregled;
	}

	public void setPregled(Pregled pregled) {
		this.pregled = pregled;
	}

	public HashMap<String, Integer> getMapaBolesti() {
		return mapaBolesti;
	}

	public void setMapaBolesti(HashMap<String, Integer> mapaBolesti) {
		this.mapaBolesti = mapaBolesti;
	}
	
	
}
