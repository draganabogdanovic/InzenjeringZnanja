package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.tree.DefaultMutableTreeNode;

import app.MainFrame;
import model.Karton;
import model.PregledPacijenta;

public class ActionSacuvajPr implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		MainFrame mf = new MainFrame().getInstance();
		ArrayList<String> simptomi = new ArrayList<String>();
		ArrayList<String> lekovi = new ArrayList<String>();
		ArrayList<String> ispitivanja = new ArrayList<String>();
		String bolest;
		
		for(int i=0; i < mf.getNoviPregled().getDlmIzabraniSimptomi().getSize(); i++) {
			
			simptomi.add(mf.getNoviPregled().getDlmIzabraniSimptomi().get(i));
		}
		
		bolest = mf.getDijagnoza().getIzabraneBolesti().getSelectedValue();
		
		for(int i=0; i < mf.getTerapija().getDlmIzabraniLekovi().getSize(); i++) {
			
			lekovi.add(mf.getTerapija().getDlmIzabraniLekovi().get(i));
		}
		
		for(int i=0; i < mf.getTerapija().getDlmIzabranaIsp().getSize(); i++) {
			
			ispitivanja.add(mf.getTerapija().getDlmIzabranaIsp().get(i));
		}
		
		
		PregledPacijenta pp = new PregledPacijenta(simptomi, lekovi, ispitivanja, bolest);
	
		DefaultMutableTreeNode element = (DefaultMutableTreeNode) mf.getModel().getRoot();

		MainFrame.getInstance().getModel().insertNodeInto(new DefaultMutableTreeNode(pp), element,
				element.getChildCount());

		Karton.getInstance().dodajPregled(pp);
	}

}
