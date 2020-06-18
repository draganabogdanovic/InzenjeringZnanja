package model;

import java.util.ArrayList;

import javax.swing.ImageIcon;

public class Workspace {
	String name;
	ImageIcon image;
	ArrayList<PacijentCvor> children;
	Workspace parent;
	
	public Workspace(){
		this.children=new ArrayList<PacijentCvor>();
	}

	
	public Workspace(String name, Workspace parent){
		this();
		this.name=name;
		this.parent=parent;
		
	}
	
	
	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name=name;
	}
	
	public Workspace getParent(){
		return parent;
	}
	
	public void setParent(Workspace parent){
		this.parent=parent;
	}
	
	public ArrayList<PacijentCvor> getChildren(){
		return children;
	}
	
	public void setChildren(ArrayList<PacijentCvor> children){
		this.children=children;
	}
	
	public String toString(){
		return this.name;
	}
	
	public boolean isRoot() {
		return this.parent == null;
	}
	
	public void addChildren(PacijentCvor newChild) {
		// TODO: eventualne provere da li je dodavanja moguce
		// dodavanje cvora
		this.children.add(newChild);
		newChild.setParent(this);
			}
	
	public void removeChild(PacijentCvor child) {
		// TODO: eventualne provere da li je brisanje moguce
		this.children.remove(child);
		child.setParent(null);
	}
	
	
	public boolean isLeaf() {
		// da li je list u modelu, ne odnosi se ne JTreeModel
		return this.children.isEmpty();
	}
}

