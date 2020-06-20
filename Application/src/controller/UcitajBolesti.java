package controller;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import app.MainFrame;


public class UcitajBolesti extends AbstractAction{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		MainFrame.getInstance().setDijalog(new DijalogZaBolesti());
		MainFrame.getInstance().getDijalog().setVisible(true);
	}
}
