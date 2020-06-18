package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

import controller.UcitajBolesti;
import app.MainFrame;
import model.PregledPacijenta;
import model.Rezim;

public class PregledPacijentaView extends JPanel {

	private static final long serialVersionUID = 1884063759494311563L;
		
	private JPanel pnlContent;
	private JList<String> sviSimptomi;
	private JList<String> izabraniSimptomi;
	private DefaultListModel<String> dlmSviSimptomi;
	private DefaultListModel<String> dlmIzabraniSimptomi;
	private JLabel lbl;

	private JPanel panel;
	private JLabel lblIzabraniSimp;
	private JButton dalje;

	private JScrollPane listScroller;
	private JScrollPane listScrollerIzabrani;

	private HashMap<String, Double> listaBolesti = new HashMap<String, Double>();

	public PregledPacijentaView(PregledPacijenta pacjent) {
		initGUI();
		constructGUI();
		
	}
	
	private void initGUI() {
		setLayout(new BorderLayout());
		
		lbl =  new JLabel("Odaberite simptom:");
		lblIzabraniSimp = new JLabel("Izabrani simptomi:");
		pnlContent = new JPanel(new GridBagLayout());
	
		dalje = new JButton("Dalje");
		dalje.addActionListener(new UcitajBolesti());
		
		panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		//panelBolesti = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		
		
		dlmSviSimptomi = new DefaultListModel<>();
		dlmIzabraniSimptomi = new DefaultListModel<>();

		sviSimptomi = new JList<String>(dlmSviSimptomi);
		sviSimptomi.setLayoutOrientation(JList.VERTICAL);
		sviSimptomi.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		listScroller = new JScrollPane();
		listScroller.setViewportView(sviSimptomi);
		MainFrame.getInstance().setRezim(Rezim.RBR);
		ArrayList<String> listaSimp = MainFrame.getInstance().getBaza().vratiSimptome();
		ubaciSimptome(listaSimp);
		
	/*	dijagnoza = new JLabel("Postavite dijagnozu");
		dlmBolesti = new DefaultListModel<>();
		dlmIzabraneBolesti = new DefaultListModel<>();

		bolesti = new JList<String>(dlmBolesti);
		bolesti.setLayoutOrientation(JList.VERTICAL);
		bolesti.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		listScB = new JScrollPane();
		listScB.setViewportView(bolesti);*/
		
		
	
		sviSimptomi.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
				if(arg0.getClickCount() == 1) {
					
					dodajSimptom(getSviSimptomi().getSelectedValue());
					
				}
			}

			@Override
			public void mouseEntered(MouseEvent e) {
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

		izabraniSimptomi = new JList<String>(dlmIzabraniSimptomi);
		
		izabraniSimptomi.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		listScrollerIzabrani = new JScrollPane();
		listScrollerIzabrani.setViewportView(izabraniSimptomi);
		
	/*	izabraneBolesti = new JList<String>(dlmIzabraneBolesti);
		
		izabraneBolesti.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		listScIzB = new JScrollPane();
		listScIzB.setViewportView(izabraneBolesti);*/

	}
	
	public void ocistiSve() {
		dlmIzabraniSimptomi.clear();
		
		panel.removeAll();
		this.panel.revalidate();
		this.panel.repaint();
		
		MainFrame.getInstance().getRightPanel().revalidate();
		MainFrame.getInstance().getRightPanel().repaint();
		
		this.revalidate();
		this.repaint();
	}
	
	public void ubaciSimptome(ArrayList<String> lista)
	{
		for (String s : lista)
			dlmSviSimptomi.addElement(s);

	}
	
	public boolean dodajSimptom(String s) {
		
		if(dlmIzabraniSimptomi.contains(s)) {
			return false;
		}
		
		dlmIzabraniSimptomi.addElement(s);
		return true;
	}
	
	public void ocisti() {
		
		dlmIzabraniSimptomi.clear();
		
	}
	
	/*public void dodajBolest() {
		
		for (Map.Entry<String, Double> iter : listaBolesti.entrySet())
		{
			dlmBolesti.addElement(iter.getKey());
		}
		MainFrame mf = MainFrame.getInstance();
		mf.getBaza().vratiBolesti();
		
	}*/
	
	
	
	private void constructGUI() {
		pnlContent.add(lbl,new GridBagConstraints(0,0,1,1,0,0,GridBagConstraints.WEST,
				GridBagConstraints.NONE, new Insets(5,5,5,5),0,0));
		
		pnlContent.add(listScroller,new GridBagConstraints(0,1,1,1,0,0,GridBagConstraints.WEST,
				GridBagConstraints.NONE, new Insets(5,5,5,5),0,0));
		
	
		pnlContent.add(lblIzabraniSimp, new GridBagConstraints(0,2,1,1,0,0,GridBagConstraints.WEST,
				GridBagConstraints.NONE,new Insets(5,5,5,5),0,0));
	    
	    pnlContent.add(listScrollerIzabrani,new GridBagConstraints(0,3,1,1,0,0,GridBagConstraints.WEST,
	    		GridBagConstraints.NONE,new Insets(5,5,5,5),0,0));
	 
		panel.add(dalje);
		//panelBolesti.add(dijagnoza);
		//panelBolesti.add(listScB);
		//panelBolesti.add(listScIzB);
		
		add(pnlContent, BorderLayout.WEST);
		
		add(panel, BorderLayout.SOUTH);
		//add(panelBolesti, BorderLayout.EAST);

	}

	public JPanel getPnlContent() {
		// TODO Auto-generated method stub
		return pnlContent;
	}
	
	public JList<String> getSviSimptomi()
	{
		return sviSimptomi;
	}

	public void setSviSimptomi(JList<String> sviSimptomi)
	{
		this.sviSimptomi = sviSimptomi;
	}
	
	public JList<String> getIzabraniSimptomi()
	{
		return izabraniSimptomi;
	}

	public void setIzabraniSimptomi(JList<String> izabraniSimptomi)
	{
		this.izabraniSimptomi = izabraniSimptomi;
	}

	public HashMap<String, Double> getListaBolesti()
	{
		return listaBolesti;
	}

	public void setListaBolesti(HashMap<String, Double> listaBolesti)
	{
		this.listaBolesti = listaBolesti;
	}
	
}

	


