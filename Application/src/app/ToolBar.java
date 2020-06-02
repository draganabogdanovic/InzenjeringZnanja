package app;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;

import view.NoviPacijent;



public class ToolBar extends JToolBar {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private NoviPacijent pacijent;
	
	public ToolBar(){
		
		
		super(SwingConstants.HORIZONTAL);
		
	
		//NoviPacijent pacijent = new NoviPacijent();
		JButton btnOpen = new JButton();
		btnOpen.setToolTipText("Dodajte pacijenta");
		btnOpen.setIcon(new ImageIcon("img/user.png"));
		
		add(btnOpen);
		
		addSeparator();
		
		JButton btnNew = new JButton();
		btnNew.setToolTipText("Zapocnite pregled");
		btnNew.setIcon(new ImageIcon("img/new.png"));
		add(btnNew);

		

		
	
		addSeparator();
		
		
		/*JToggleButton search=new JToggleButton(new SearchNodeAction());
		search.setToolTipText("Search");
		search.setIcon(new ImageIcon("slike/cetvrti.png"));
		add(search);
		
		addSeparator();*/
		
}

}

