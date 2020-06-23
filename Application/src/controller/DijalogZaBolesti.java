package controller;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

import app.MainFrame;
import model.Rezim;

public class DijalogZaBolesti extends JDialog{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private HashMap<String, Double> listaBolesti = new HashMap<String, Double>();
	private JLabel lbl;
	private JLabel lblIzabraneBolesti;
	private JLabel lblLekovi;
	private JLabel lblDodatnaIsp;
	private DefaultListModel<String> dlmSveBolesti;
	private DefaultListModel<String> dlmIzabraneBolesti;
	private DefaultListModel<String> dlmLekovi;
	private DefaultListModel<String> dlmDodatnaIsp;
	private JList<String> sveBolesti;
	private JList<String> izabraneBolesti;
	private JList<String> lekovi;
	private JList<String> dodatnaIsp;
	private JScrollPane listScB;
	private JScrollPane listScIzB;
	private JScrollPane listScL;
	private JScrollPane listScDI;
	private JPanel pnlContent = new JPanel();
	private JPanel pane = new JPanel();
	private JPanel pane1 = new JPanel();
	private JButton btnIdi = new JButton("Dalje");
	private JButton btnSacuvaj = new JButton("Sacuvaj");

	public DijalogZaBolesti() {
		
		init();
		constructGUI();
	}
	
	private void init() {
		
		setTitle("Dijagnoza");
		setModal(true);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setSize(850, 450);
		setLocationRelativeTo(null);
		
		pnlContent.setLayout(new BorderLayout());
		pane = new JPanel(new GridBagLayout());
		pane1 = new JPanel(new GridBagLayout());
		
		lbl =  new JLabel("Bolesti:");
		lblIzabraneBolesti = new JLabel("Postavi dijagnozu:");
		lblLekovi = new JLabel("Odaberite lekove:");
		lblDodatnaIsp = new JLabel("Dodatna ispitivanja:");
		pnlContent = new JPanel(new GridBagLayout());
		
		dlmSveBolesti = new DefaultListModel<>();
		dlmIzabraneBolesti = new DefaultListModel<>();
		dlmLekovi = new DefaultListModel<>();
		dlmDodatnaIsp = new DefaultListModel<>();

		sveBolesti = new JList<String>(dlmSveBolesti);
		sveBolesti.setLayoutOrientation(JList.VERTICAL);
		sveBolesti.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		listScB = new JScrollPane();
		listScB.setViewportView(sveBolesti);
		MainFrame.getInstance().setRezim(Rezim.RBR);
		MainFrame.getInstance().getBaza().vratiBolesti();
		//ubaciBolesti(listaBolesti);

		izabraneBolesti = new JList<String>(dlmIzabraneBolesti);
		izabraneBolesti.setLayoutOrientation(JList.VERTICAL);
		izabraneBolesti.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		listScIzB = new JScrollPane();
		listScIzB.setViewportView(izabraneBolesti);
		
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
		
		
	}
	
	private void constructGUI() {
		
		pane.add(lbl,new GridBagConstraints(0,0,1,1,0,0,GridBagConstraints.WEST,
				GridBagConstraints.NONE, new Insets(5,50,5,5),0,0));
		pane.add(listScB,new GridBagConstraints(0,1,1,1,0,0,GridBagConstraints.WEST,
				GridBagConstraints.NONE, new Insets(5,50,5,5),0,0));
	
		pane.add(lblIzabraneBolesti, new GridBagConstraints(0,2,1,1,0,0,GridBagConstraints.WEST,
				GridBagConstraints.NONE,new Insets(5,50,5,5),0,0));
		pane.add(listScIzB, new GridBagConstraints(0,3,1,1,0,0,GridBagConstraints.WEST,
	    		GridBagConstraints.NONE,new Insets(5,50,5,5),0,0));
		pane.add(btnIdi, new GridBagConstraints(0,4,1,1,0,0,GridBagConstraints.WEST,
	    		GridBagConstraints.NONE,new Insets(5,130,5,5),0,0));
		pane1.add(lblLekovi,new GridBagConstraints(0,0,1,1,0,0,GridBagConstraints.EAST,
				GridBagConstraints.NONE, new Insets(-200,50,5,5),0,0));
		pane1.add(listScL,new GridBagConstraints(0,1,1,1,0,0,GridBagConstraints.EAST,
				GridBagConstraints.NONE, new Insets(-80,50,5,5),0,0));
		pane1.add(lblDodatnaIsp,new GridBagConstraints(0,2,1,1,0,0,GridBagConstraints.EAST,
				GridBagConstraints.NONE, new Insets(10,50,5,5),0,0));
		pane1.add(listScDI,new GridBagConstraints(0,3,1,1,0,0,GridBagConstraints.EAST,
				GridBagConstraints.NONE, new Insets(30,50,5,5),0,0));
		pane1.add(btnSacuvaj,new GridBagConstraints(0,4,1,1,0,0,GridBagConstraints.EAST,
				GridBagConstraints.NONE, new Insets(40,50,5,5),0,0));
		
		add(pane, BorderLayout.WEST);
		add(pane1, BorderLayout.EAST);
	
	}
	
	public void ubaciBolesti(ArrayList<String> lista) {
		
		//for (String s : lista)
			//dlmSveBolesti.addElement(s);
	}
	
	public HashMap<String, Double> getListaBolesti()
	{
		return listaBolesti;
	}
}

