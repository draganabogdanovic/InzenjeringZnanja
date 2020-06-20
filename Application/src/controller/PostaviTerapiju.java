package controller;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class PostaviTerapiju extends JDialog{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblLekovi;
	private JLabel lblDodatnaIsp;
	private JList<String> lekovi;
	private JList<String> dodatnaIsp;
	private DefaultListModel<String> dlmLekovi;
	private DefaultListModel<String> dlmDodatnaIsp;
	private JScrollPane listScL;
	private JScrollPane listScDI;
	private JPanel pnlContent = new JPanel();
	private JPanel pane = new JPanel();
	private JPanel pane1 = new JPanel();
	private JButton btnSacuvaj;
	
	public PostaviTerapiju() {
		
		init();
		constructGUI();
	}

	
	private void init() {
		
		setTitle("Postavljanje dijagnoze");
		setModal(true);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setSize(1000, 600);
		setLocationRelativeTo(null);
		
		pnlContent.setLayout(new BorderLayout());
		pane = new JPanel(new GridBagLayout());
		pane1 = new JPanel(new GridBagLayout());
		
		lblLekovi = new JLabel("Odaberite lekove:");
		lblDodatnaIsp = new JLabel("Dodatna ispitivanja:");
		pnlContent = new JPanel(new GridBagLayout());
		
		dlmLekovi = new DefaultListModel<>();
		dlmDodatnaIsp = new DefaultListModel<>();
		
		lekovi = new JList<String>(dlmLekovi);
		lekovi.setLayoutOrientation(JList.VERTICAL);
		lekovi.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		listScL = new JScrollPane();
		listScL.setViewportView(lekovi);
		
		dodatnaIsp = new JList<String>(dlmDodatnaIsp);
		dodatnaIsp.setLayoutOrientation(JList.VERTICAL);
		dodatnaIsp.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		listScDI = new JScrollPane();
		listScDI.setViewportView(dodatnaIsp);
		
		btnSacuvaj = new JButton("Sacuvaj");
		
	}
	
	private void constructGUI() {
		
		pane.add(lblLekovi,new GridBagConstraints(0,0,1,1,0,0,GridBagConstraints.WEST,
				GridBagConstraints.NONE, new Insets(5,30,5,5),0,0));
		pane.add(listScL,new GridBagConstraints(0,1,1,1,0,0,GridBagConstraints.WEST,
				GridBagConstraints.NONE, new Insets(5,30,5,5),0,0));
	
		pane.add(lblDodatnaIsp,new GridBagConstraints(0,2,1,1,0,0,GridBagConstraints.WEST,
				GridBagConstraints.NONE,new Insets(5,30,5,5),0,0));
		pane.add(listScDI,new GridBagConstraints(0,3,1,1,0,0,GridBagConstraints.WEST,
	    		GridBagConstraints.NONE,new Insets(5,30,5,5),0,0));
		pane.add(btnSacuvaj, new GridBagConstraints(0,4,1,1,0,0,GridBagConstraints.WEST,
	    		GridBagConstraints.NONE,new Insets(15,90,5,5),0,0));
		add(pane, BorderLayout.CENTER);
		add(pane1, BorderLayout.EAST);
	}
}
