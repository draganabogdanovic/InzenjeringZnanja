package controller;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.DefaultListModel;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class DijalogZaBolesti extends JDialog{
	private JLabel lbl;
	private JLabel lblIzabraneBolesti;
	private DefaultListModel<String> dlmSveBolesti;
	private DefaultListModel<String> dlmIzabraneBolesti;
	private JList<String> sveBolesti;
	private JScrollPane listScB;
	private JScrollPane listScIzB;
	private JPanel pnlContent = new JPanel();
	private JPanel pane = new JPanel();

	public DijalogZaBolesti() {
		
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
		
		lbl =  new JLabel("Bolesti:");
		lblIzabraneBolesti = new JLabel("Izabrane bolesti:");
		pnlContent = new JPanel(new GridBagLayout());
		
		dlmSveBolesti = new DefaultListModel<>();
		dlmIzabraneBolesti = new DefaultListModel<>();

		sveBolesti = new JList<String>(dlmSveBolesti);
		sveBolesti.setLayoutOrientation(JList.VERTICAL);
		sveBolesti.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		listScB = new JScrollPane();
		listScB.setViewportView(sveBolesti);
		
		
	}
	
	private void constructGUI() {
		
		pane.add(lbl,new GridBagConstraints(0,0,1,1,0,0,GridBagConstraints.WEST,
				GridBagConstraints.NONE, new Insets(5,5,5,5),0,0));
		pane.add(listScB,new GridBagConstraints(0,1,1,1,0,0,GridBagConstraints.WEST,
				GridBagConstraints.NONE, new Insets(5,5,5,5),0,0));
		
		add(pane, BorderLayout.WEST);
	}
}
