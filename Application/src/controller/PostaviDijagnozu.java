package controller;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

public class PostaviDijagnozu extends JDialog{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private HashMap<String, Double> listaBolesti = new HashMap<String, Double>();
	private JLabel lbl;
	private JLabel lblIzabraneBolesti;
	private DefaultListModel<String> dlmSveBolesti;
	private DefaultListModel<String> dlmIzabraneBolesti;
	private JList<String> sveBolesti;
	private JList<String> izabraneBolesti;
	private JScrollPane listScB;
	private JScrollPane listScIzB;
	private JPanel pnlContent = new JPanel();
	private JPanel pane = new JPanel();
	private JPanel pane1 = new JPanel();
	private JButton btnIdi;
	

	public PostaviDijagnozu() {
		
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
		
		lbl =  new JLabel("Bolesti:");
		lblIzabraneBolesti = new JLabel("Postavi dijagnozu:");
		pnlContent = new JPanel(new GridBagLayout());
		
		dlmSveBolesti = new DefaultListModel<>();
		dlmIzabraneBolesti = new DefaultListModel<>();

		sveBolesti = new JList<String>(dlmSveBolesti);
		sveBolesti.setLayoutOrientation(JList.VERTICAL);
		sveBolesti.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		listScB = new JScrollPane();
		listScB.setViewportView(sveBolesti);
		MainFrame.getInstance().setRezim(Rezim.RBR);
		MainFrame.getInstance().getBaza().vratiBolesti();
		//ubaciBolesti(listaBolesti);
		
		btnIdi = new JButton("Dalje");
		btnIdi.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				MainFrame.getInstance().setTerapija(new PostaviTerapiju());
				MainFrame.getInstance().getTerapija().setVisible(true);
				
			}
			
			
		});

		izabraneBolesti = new JList<String>(dlmIzabraneBolesti);
		izabraneBolesti.setLayoutOrientation(JList.VERTICAL);
		izabraneBolesti.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		listScIzB = new JScrollPane();
		listScIzB.setViewportView(izabraneBolesti);
		
		
		
	}
	
	private void constructGUI() {
		
		pane.add(lbl,new GridBagConstraints(0,0,1,1,0,0,GridBagConstraints.WEST,
				GridBagConstraints.NONE, new Insets(5,30,5,5),0,0));
		pane.add(listScB,new GridBagConstraints(0,1,1,1,0,0,GridBagConstraints.WEST,
				GridBagConstraints.NONE, new Insets(5,30,5,5),0,0));
	
		pane.add(lblIzabraneBolesti,new GridBagConstraints(0,2,1,1,0,0,GridBagConstraints.WEST,
				GridBagConstraints.NONE,new Insets(5,30,5,5),0,0));
		pane.add(listScIzB,new GridBagConstraints(0,3,1,1,0,0,GridBagConstraints.WEST,
	    		GridBagConstraints.NONE,new Insets(5,30,5,5),0,0));
		pane.add(btnIdi, new GridBagConstraints(0,4,1,1,0,0,GridBagConstraints.WEST,
	    		GridBagConstraints.NONE,new Insets(15,90,5,5),0,0));
		
		add(pane, BorderLayout.CENTER);
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
