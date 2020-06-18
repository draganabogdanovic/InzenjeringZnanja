package model;

import java.util.ArrayList;

public class PacijentCvor {
	String ime;
	String prezime;
	Workspace parent;
	ArrayList<PregledCvor> children;
	Pacijent pacijent;
	
	public PacijentCvor(){
		this.children=new ArrayList<PregledCvor>();
	}
	
	public PacijentCvor(String ime, String prezime, Workspace parent){
		this();
		this.ime=ime;
		this.prezime = prezime;
		this.parent=parent;
	}
	
	public String getIme(){
		return ime;
	}
	
	public void setIme(String ime){
		this.ime=ime;
	}
	
	public Workspace getParent(){
		return parent;
	}
	
	public void setParent(Workspace parent){
		this.parent=parent;
	}
	public ArrayList<PregledCvor>getChildren(){
		return children;
	}
	
	public void setChildren(ArrayList<PregledCvor> children) {
		this.children = children;
	}
	
	public String toString() {
		return this.ime;
	}
	
	
	public Pacijent getKarton() {
		return pacijent;
	}

	public void setKarton(Pacijent karton) {
		this.pacijent = karton;
	}

	public boolean isRoot() {
		return this.parent == null;
	}

	public void addChildren(PregledCvor newChild) {
		// TODO: eventualne provere da li je dodavanja moguce
		// dodavanje cvora
		this.children.add(newChild);
		newChild.setParent(this);
	}

	public void removeChild(PregledCvor child) {
		// TODO: eventualne provere da li je brisanje moguce
		this.children.remove(child);
		child.setParent(null);
	}
	
	public void removeFromParent() {
		// pozovemo parenta da nas ukloni
		this.parent.removeChild(this);
	}

	public boolean isLeaf() {
		// da li je list u modelu, ne odnosi se ne JTreeModel
		return this.children.isEmpty();
	}
	
}
