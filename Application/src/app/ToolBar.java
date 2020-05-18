package app;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;

public class ToolBar extends JToolBar {
	
	public ToolBar(){
		
		super(SwingConstants.HORIZONTAL);
		JButton btnNew = new JButton();
		btnNew.setToolTipText("Zapocnite pregled");
		btnNew.setIcon(new ImageIcon("img/new.png"));
		add(btnNew);

		addSeparator();

		JButton btnOpen = new JButton();
		btnOpen.setToolTipText("Dodajte pacijenta");
		btnOpen.setIcon(new ImageIcon("img/user.png"));
		add(btnOpen);
	
		addSeparator();
		
		
		/*JToggleButton search=new JToggleButton(new SearchNodeAction());
		search.setToolTipText("Search");
		search.setIcon(new ImageIcon("slike/cetvrti.png"));
		add(search);
		
		addSeparator();*/
		
}

}

