package controller;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import app.MainFrame;
import view.NoviPacijent;

public class NoviPacijentCon extends AbstractAction {
	
	public NoviPacijentCon() {
		
		putValue(NAME, "Novi pacijent");
		putValue(SHORT_DESCRIPTION, "dodajte novog pacijenta");
		//putValue(SMALL_ICON, new ImageIcon("img/employee.png"));
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		MainFrame.getInstance().setNoviPacijent(new NoviPacijent());
		MainFrame.getInstance().getNoviPacijent().setVisible(true);
		
	}
	

}
