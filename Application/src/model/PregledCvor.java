package model;

public class PregledCvor {
	String name;
	PregledPacijenta pregled;
	PacijentCvor parent;
	

	public PregledCvor() {
		
	}

	public PregledCvor(String name, PacijentCvor parent) {
		this();
		this.name=name;
		this.parent = parent;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name=name;
	}

	public PacijentCvor getParent() {
		return parent;
	}

	public void setParent(PacijentCvor parent) {
		this.parent = parent;
	}

	public PregledPacijenta getPregled() {
		return pregled;
	}

	public void setPregled(PregledPacijenta pregled) {
		this.pregled = pregled;
	}

	public String toString() {
		return this.name;
	}

	// Manipulacija stablom
	public boolean isRoot() {
		return this.parent == null;
	}

	public void removeFromParent() {
		// pozovemo parenta da nas ukloni
		this.parent.removeChild(this);
	}
}
