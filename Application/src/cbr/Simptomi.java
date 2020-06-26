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
	private String simptomi;
	private List<String> disease;
	
	public Simptomi() {
		super();
	}
	
	public Simptomi(String simptomi, List<String> disease) {
		super();
		this.simptomi = simptomi;
		this.setDisease(disease);
	}
	
	
	public String getSimptomi() {
		return simptomi;
	}

	public void setSimptomi(String simptomi) {
		this.simptomi = simptomi;
	}
	

	
	@Override
	public String toString() {
		String value = simptomi;
		return value;
	}

	@Override
	public Attribute getIdAttribute() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<String> getDisease() {
		return disease;
	}

	public void setDisease(List<String> disease) {
		this.disease = disease;
	}

}

