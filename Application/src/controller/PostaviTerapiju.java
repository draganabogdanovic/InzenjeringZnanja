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
import java.util.Date;

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

public class PostaviTerapiju extends JDialog{

	public DefaultListModel<String> getDlmIzabranaIsp() {
		return dlmIzabranaIsp;
	}


	public void setDlmIzabranaIsp(DefaultListModel<String> dlmIzabranaIsp) {
		this.dlmIzabranaIsp = dlmIzabranaIsp;
	}


	public DefaultListModel<String> getDlmIzabraniLekovi() {
		return dlmIzabraniLekovi;
	}


	public void setDlmIzabraniLekovi(DefaultListModel<String> dlmIzabraniLekovi) {
		this.dlmIzabraniLekovi = dlmIzabraniLekovi;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblLekovi;
	private JLabel lblDodatnaIsp;
	private JLabel lblIzabrani;
	private JLabel lblIzabranaIsp;
	private JList<String> lekovi;
	private JList<String> izabraniLekovi;
	private JList<String> dodatnaIspitivanja;
	private JList<String> izabranaIspitivanja;
	private JList<String> izabraniSimptomi;
	private DefaultListModel<String> dlmLekovi;
	private DefaultListModel<String> dlmIzabraniLekovi;
	private DefaultListModel<String> dlmDodatnaIsp;
	private DefaultListModel<String> dlmIzabranaIsp;
	private JScrollPane listScL;
	private JScrollPane listScDI;
	private JScrollPane listScIL;
	private JScrollPane listScIDI;
	private Date datumPregleda = new Date();
	private JPanel pnlContent = new JPanel();
	private JPanel pane = new JPanel();
	private JPanel pane1 = new JPanel();
	private JPanel pane2 = new JPanel();
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
		pane2 = new JPanel(new GridBagLayout());
		
		lblLekovi = new JLabel("Odaberite lekove:");
		lblDodatnaIsp = new JLabel("Dodatna ispitivanja:");
		pnlContent = new JPanel(new GridBagLayout());
		lblIzabrani = new JLabel("Izabrani lekovi");
		lblIzabranaIsp = new JLabel("Izabrana ispitivanja:");
		
		dlmLekovi = new DefaultListModel<>();
		dlmDodatnaIsp = new DefaultListModel<>();
		dlmIzabraniLekovi = new DefaultListModel<>();
		dlmIzabranaIsp = new DefaultListModel<>();
		
		lekovi = new JList<String>(dlmLekovi);
		lekovi.setLayoutOrientation(JList.VERTICAL);
		lekovi.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		listScL = new JScrollPane();
		listScL.setViewportView(lekovi);
		MainFrame.getInstance().setRezim(Rezim.RBR);
		ArrayList<String> listaLekova = MainFrame.getInstance().getBaza().vratiLekove();
		ubaciLekove(listaLekova);
		
		lekovi.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				if(arg0.getClickCount() == 1) {
					
					dodajLekove(getSviLekovi().getSelectedValue());
					
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
		
		dodatnaIspitivanja = new JList<String>(dlmDodatnaIsp);
		dodatnaIspitivanja.setLayoutOrientation(JList.VERTICAL);
		dodatnaIspitivanja.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		listScDI = new JScrollPane();
		listScDI.setViewportView(dodatnaIspitivanja);
		MainFrame.getInstance().setRezim(Rezim.RBR);
		ArrayList<String> dodatnaIsp = MainFrame.getInstance().getBaza().vratiDodatnaIspitivanja();
		ubaciDodatnaIsp(dodatnaIsp);
		
		izabraniLekovi = new JList<String>(dlmIzabraniLekovi);
		izabraniLekovi.setLayoutOrientation(JList.VERTICAL);
		izabraniLekovi.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		listScIL = new JScrollPane();
		listScIL.setViewportView(izabraniLekovi);
		
		izabranaIspitivanja = new JList<String>(dlmIzabranaIsp);
		izabranaIspitivanja.setLayoutOrientation(JList.VERTICAL);
		izabranaIspitivanja.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		listScIDI = new JScrollPane();
		listScIDI.setViewportView(izabranaIspitivanja);
		
		dodatnaIspitivanja.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				if(e.getClickCount() == 1) {
					
					dodajIspitivanja(getIspitivanja().getSelectedValue());
					
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
		
		btnSacuvaj = new JButton("Sacuvaj");
		btnSacuvaj.addActionListener(new ActionSacuvajPr());

			/*@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				SacuvajPregled dataP=new SacuvajPregled();
				dataP.listaSimptoma=izabraniSimptomi;
				dataP.datumPregleda=datumPregleda;
				dataP.listaLekova= lekovi;
				dataP.dodatnaIsp= dodatnaIspitivanja;
				try{
					ResourceManager.save(dataP,  "PREGLEDI.txt");
				}catch(Exception ex){
					System.out.println("Nece da se sacuva"+ex.getMessage());
				}
				
				System.out.println("Uspesno sacuvan pregled!");
			}
			*/
			
		//});
		
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
		
		pane1.add(lblIzabrani, new GridBagConstraints(0,0,1,1,0,0,GridBagConstraints.WEST,
				GridBagConstraints.NONE, new Insets(5,30,5,5),0,0));
		pane1.add(listScIL, new GridBagConstraints(0,1,1,1,0,0,GridBagConstraints.WEST,
				GridBagConstraints.NONE, new Insets(5,30,5,5),0,0));
		pane1.add(lblIzabranaIsp,new GridBagConstraints(0,2,1,1,0,0,GridBagConstraints.WEST,
				GridBagConstraints.NONE,new Insets(5,30,5,5),0,0));
		pane1.add(listScIDI,new GridBagConstraints(0,3,1,1,0,0,GridBagConstraints.WEST,
	    		GridBagConstraints.NONE,new Insets(5,30,5,5),0,0));
		
		pane2.add(btnSacuvaj, new GridBagConstraints(0,4,1,1,0,0,GridBagConstraints.WEST,
	    		GridBagConstraints.NONE,new Insets(5,30,5,5),0,0));
		
		add(pane, BorderLayout.WEST);
		add(pane1, BorderLayout.EAST);
		add(pane2, BorderLayout.CENTER);
	}
	
	public void ubaciLekove(ArrayList<String> listaLekova) {
		for (String s : listaLekova)
			dlmLekovi.addElement(s);
		
	}
	
	public void ubaciDodatnaIsp(ArrayList<String> listaTestova) {
		for (String s : listaTestova)
			dlmDodatnaIsp.addElement(s);
		
	}
	
	public boolean dodajLekove(String s) {
		if(dlmIzabraniLekovi.contains(s)) {
			return false;
			
		}
		
		dlmIzabraniLekovi.addElement(s);
		return true;
		
	}
	
	public JList<String> getSviLekovi()
	{
		return lekovi;
	}

	public void setSviLekovi(JList<String> lekovi)
	{
		this.lekovi = lekovi;
	}
	
	public boolean dodajIspitivanja(String s) {
		if(dlmIzabranaIsp.contains(s)) {
			return false;
			
		}
		
		dlmIzabranaIsp.addElement(s);
		return true;
		
	}
	
	public JList<String> getIspitivanja()
	{
		return dodatnaIspitivanja;
	}

	public void setIspitivanja(JList<String> dodatnaIspitivanja)
	{
		this.dodatnaIspitivanja = dodatnaIspitivanja;
	}
	
}

