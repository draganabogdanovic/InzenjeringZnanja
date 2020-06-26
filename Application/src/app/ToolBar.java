package app;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;
import javax.swing.tree.DefaultMutableTreeNode;

import controller.AddNodeAction;
import view.NoviCasePregled;
import view.NoviPregled;



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
		add.setToolTipText("Dodajte pacijenta");
		add.setIcon(new ImageIcon("img/plus.png"));
		add(add);
		
		addSeparator();
		
		JButton noviPregled=new JButton();
		noviPregled.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				DefaultMutableTreeNode selektovan = (DefaultMutableTreeNode) MainFrame.getInstance().getTree().getLastSelectedPathComponent();

				if (selektovan == null)
				{
					JOptionPane.showMessageDialog(MainFrame.getInstance(), "Dodajte pacijenta!","",
							JOptionPane.WARNING_MESSAGE);
					return;
				} else {
				
					MainFrame.getInstance().setNoviPregled(new NoviPregled());
					MainFrame.getInstance().getNoviPregled().setVisible(true);
				}
			
			}
		});
		noviPregled.setToolTipText("Dodajte pregled");
		noviPregled.setIcon(new ImageIcon("img/new.png"));
		add(noviPregled);
		
		addSeparator();
		
		JButton casePregled = new JButton();
		casePregled.addActionListener(new ActionListener() {
		

			public void  actionPerformed(ActionEvent arg0) {
				
				DefaultMutableTreeNode selektovan = (DefaultMutableTreeNode) MainFrame.getInstance().getTree().getLastSelectedPathComponent();

				if (selektovan == null)
				{
					JOptionPane.showMessageDialog(MainFrame.getInstance(), "Dodajte pacijenta!","",
							JOptionPane.WARNING_MESSAGE);
					return;
				} else {
				
					MainFrame.getInstance().setNoviCasePregled(new NoviCasePregled());
					MainFrame.getInstance().getNoviCasePregled().setVisible(true);
				}
				
			}
		});
		
		casePregled.setToolTipText("Dodajte novi case pregled");
		casePregled.setIcon(new ImageIcon("img/movie.png"));
		add(casePregled);
		
	
}
	
}

