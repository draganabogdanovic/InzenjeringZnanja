package cbr;

import java.io.Serializable;
import java.util.List;

import ucm.gaia.jcolibri.cbrcore.Attribute;
import ucm.gaia.jcolibri.cbrcore.CaseComponent;

public class Dijagnoza implements CaseComponent, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String dij;
	private List<String> simptomi;
	
	@Override
	public Attribute getIdAttribute() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Dijagnoza() {
		
		super();
	}
	
	public Dijagnoza(String dij, List<String> simptomi) {
		
		this.setDij(dij);
		this.setSimptomi(simptomi);
	}

	public String getDij() {
		return dij;
	}

	public void setDij(String dij) {
		this.dij = dij;
	}

	public List<String> getSimptomi() {
		return simptomi;
	}

	public void setSimptomi(List<String> simptomi) {
		this.simptomi = simptomi;
	}

	 @Override
	 public String toString() {
		 String retVal = StringListMapper.toString(simptomi);
	       if (dij != null)
	           retVal += "->" + dij;
	       return retVal;
     }
}
