package cbr;
import java.io.Serializable;
import java.util.List;

import ucm.gaia.jcolibri.cbrcore.Attribute;
import ucm.gaia.jcolibri.cbrcore.CaseComponent;

public class Simptomi implements CaseComponent, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<String> simptomi;
	private String mogucaBolest;
	
	public Simptomi() {
		super();
	}
	
	public Simptomi(List<String> simptomi, String mogucaBolest) {
		super();
		this.simptomi = simptomi;
		this.setMogucaBolest(mogucaBolest);
	}
	
	
	public List<String> getSimptomi() {
		return simptomi;
	}

	public void setSimptomi(List<String> simptomi) {
		this.simptomi = simptomi;
	}
	

	@Override
	public String toString() {
		String value = StringListMapper.toString(simptomi);
		return value;
	}

	@Override
	public Attribute getIdAttribute() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getMogucaBolest() {
		return mogucaBolest;
	}

	public void setMogucaBolest(String mogucaBolest) {
		this.mogucaBolest = mogucaBolest;
	}

}

