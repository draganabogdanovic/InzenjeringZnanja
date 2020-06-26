package controller;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Collection;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

import app.MainFrame;
import cbr.Simptomi;
import cbrApp.CbrTestiranje;
import model.Rezim;
import ucm.gaia.jcolibri.method.retrieve.RetrievalResult;

public class PostaviDijagnozuCase extends JDialog{

	private static final long serialVersionUID = 1L;
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
	private ArrayList<String> simptomi = new ArrayList<String>();
	private Collection<RetrievalResult> listaB = new ArrayList<RetrievalResult>();
	

	public PostaviDijagnozuCase() {
		
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
		
		MainFrame.getInstance().setRezim(Rezim.CBR);
	//	ArrayList<String> listaBolesti =
		
		//MainFrame.getInstance().getBaza().vratiBolesti();
		//MainFrame.getInstance().getDijagnoza().ubaciBolesti();
		CbrTestiranje appT = new CbrTestiranje();
		appT.run(simptomi);
		ubaciBolesti();
		
		
		btnIdi = new JButton("Dalje");
		btnIdi.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				MainFrame.getInstance().setTerapijaCase(new PostaviTerapijuCase());
				MainFrame.getInstance().getTerapijaCase().setVisible(true);
			}
			
			
		});
		
		sveBolesti.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				if(arg0.getClickCount() == 1) {
					
					dodajBolest(getSveBolesti().getSelectedValue());
					
				}
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
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
	
	public void ubaciBolesti() {
		
		dlmSveBolesti = new DefaultListModel<String>();
		
		for (RetrievalResult nse : listaB)
			dlmSveBolesti.addElement(nse.get_case().getDescription() + "=>" + nse.getEval());	
		sveBolesti = new JList<String>(dlmSveBolesti);
	}

	
	public boolean dodajBolest(String s) {
		if(dlmIzabraneBolesti.contains(s)) {
			return false;
			
		}
		
		dlmIzabraneBolesti.addElement(s);
		return true;
		
	}
	
	public JList<String> getSveBolesti()
	{
		return sveBolesti;
	}

	public void setSveBolesti(JList<String> sveBolesti)
	{
		this.sveBolesti = sveBolesti;
	}

	public JList<String> getIzabraneBolesti() {
		return izabraneBolesti;
	}

	public void setIzabraneBolesti(JList<String> izabraneBolesti) {
		this.izabraneBolesti = izabraneBolesti;
	}


}

