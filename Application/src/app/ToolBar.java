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

import controller.AddPregledAction;
import controller.DodajPacijenta;



public class ToolBar extends JToolBar {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//private NoviPacijent pacijent;
	
	public ToolBar(){
		
		
		super(SwingConstants.HORIZONTAL);
		
	
		//JButton btnOpen = new JButton( new AddPacijentAction());
		JButton btnOpen = new JButton();
		btnOpen.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// new AddNodeAction();
				// new AddPacijentAction();
				JDialog d = new JDialog();
				d.setVisible(true);
				
				d.setPreferredSize(new Dimension(500, 350));
				d.setSize(new Dimension(500, 500));
				d.setModal(true);
				d.setLocationRelativeTo(null);
				d.setResizable(false);
				
				JLabel lblIme = new JLabel("Ime:");
				//d.add(lblIme);
				JTextField ime = new JTextField(20);
				ime.setPreferredSize(new Dimension(40, 40));
				//d.add(ime);
				JLabel lblPrezime = new JLabel("Prezime:");
				//d.add(lblPrezime);
				JTextField prezime = new JTextField(20);
				prezime.setPreferredSize(new Dimension(40, 40));
				//d.add(prezime);
				JLabel lblPol = new JLabel("Pol");
				
				JPanel pane = new JPanel();
				d.add(pane);
				
				
				pane.setBackground(Color.LIGHT_GRAY);
				pane.setPreferredSize(new Dimension(300, 100));
				pane.setMinimumSize(new Dimension(100, 100));
			
				pane.add(lblIme);
				pane.add(ime);
			
				pane.add(lblPrezime);
				pane.add(prezime);
				
				JButton dodaj = new JButton("Dodaj");
				dodaj.setPreferredSize(new Dimension(60, 20));
				pane.add(dodaj);
				
				dodaj.addActionListener(new DodajPacijenta());
			
	
			
			}
			
		});
		btnOpen.setToolTipText("Dodajte pacijenta");
		btnOpen.setIcon(new ImageIcon("img/user.png"));
		add(btnOpen);
		
		
		addSeparator();
		
		JButton btnNew = new JButton(new AddPregledAction());
		btnNew.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				new AddPregledAction();
			}
			
			
		});
		btnNew.setToolTipText("Zapocnite pregled");
		btnNew.setIcon(new ImageIcon("img/new.png"));
		add(btnNew);


		
}

}

