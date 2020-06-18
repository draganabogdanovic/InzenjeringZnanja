package app;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;

import controller.AddCaseAction;
import controller.AddNodeAction;
import controller.AddPregledAction;
import controller.DodajPacijenta;



public class ToolBar extends JToolBar {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public ToolBar(){
		
		super(SwingConstants.HORIZONTAL);
		
		JButton add=new JButton( new AddNodeAction());
		add.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		add.setToolTipText("Dodajte pacijenta i pregled");
		add.setIcon(new ImageIcon("img/plus.png"));
		add(add);
		
		addSeparator();
		
		JButton casePregled = new JButton( new AddCaseAction());
		casePregled.addActionListener(new AddCaseAction() {
			
			public void  actionPerformed(ActionEvent arg0) {
				
			}
		});
		
		casePregled.setToolTipText("Dodajte novi case pregled");
		casePregled.setIcon(new ImageIcon("img/add.png"));
		add(casePregled);
		
		
	
		
	
}
	
}

