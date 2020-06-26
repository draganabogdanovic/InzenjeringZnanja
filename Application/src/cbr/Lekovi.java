package cbr;

import java.io.Serializable;
import java.util.List;

import ucm.gaia.jcolibri.cbrcore.Attribute;
import ucm.gaia.jcolibri.cbrcore.CaseComponent;

public class Lekovi implements CaseComponent, Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String lek;
	private List<String> bolesti;

	@Override
	public Attribute getIdAttribute() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Lekovi() {
		
		super();
	}
	
	public Lekovi(String lek, List<String> bolesti) {
		
		this.setLek(lek);
		this.setBolesti(bolesti);
		
	}

	public List<String> getBolesti() {
		return bolesti;
	}

	public void setBolesti(List<String> bolesti) {
		this.bolesti = bolesti;
	}

	public String getLek() {
		return lek;
	}

	public void setLek(String lek) {
		this.lek = lek;
	}
	
	 @Override
	    public String toString() {
	        String retVal = StringListMapper.toString(bolesti);
	        if (lek != null)
	            retVal += "->" + lek;
	        return retVal;
	    }

}
