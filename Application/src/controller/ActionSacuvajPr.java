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
		
		ArrayList<String> simptomi = new ArrayList<String>();
		String bolest;
		ArrayList<String> lekovi = new ArrayList<String>();
		ArrayList<String> ispitivanja = new ArrayList<String>();
		
		for(int i=0; i < MainFrame.getInstance().getNoviPregled().getDlmIzabraniSimptomi().getSize(); i++) {
			
			simptomi.add(MainFrame.getInstance().getNoviPregled().getDlmIzabraniSimptomi().get(i));
		}
		
		bolest = MainFrame.getInstance().getDijagnoza().getIzabraneBolesti().getSelectedValue();
		
		for(int i=0; i < MainFrame.getInstance().getTerapija().getDlmIzabraniLekovi().getSize(); i++) {
			
			lekovi.add(MainFrame.getInstance().getTerapija().getDlmIzabraniLekovi().get(i));
		}
		
		for(int i=0; i < MainFrame.getInstance().getTerapija().getDlmIzabranaIsp().getSize(); i++) {
			
			ispitivanja.add(MainFrame.getInstance().getTerapija().getDlmIzabranaIsp().get(i));
		}
		
		
		PregledPacijenta pp = new PregledPacijenta(simptomi, lekovi, ispitivanja, bolest);
	
		DefaultMutableTreeNode element = (DefaultMutableTreeNode) MainFrame.getInstance().getModel().getRoot();

		MainFrame.getInstance().getModel().insertNodeInto(new DefaultMutableTreeNode(pp), element,
				element.getChildCount());

		Karton.getInstance().dodajPregled(pp);
	}

}
