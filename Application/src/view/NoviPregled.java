package view;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
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
import controller.PostaviDijagnozu;
import model.Rezim;

public class NoviPregled extends JDialog{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	private HashMap<String, Double> listaBolesti = new HashMap<String, Double>();
	private JLabel lbl;
	private JLabel lblIzabraniSimptomi;
	private DefaultListModel<String> dlmSviSimptomi;
	private DefaultListModel<String> dlmIzabraniSimptomi;
	private JList<String> sviSimptomi;
	private JList<String> izabraniSimptomi;
	private JScrollPane listSc;
	private JScrollPane listScIz;
	private JPanel pnlContent = new JPanel();
	private JPanel pane = new JPanel();
	private JPanel pane1 = new JPanel();
	private JButton btnDalje;

	public NoviPregled() {
		
		init();
		constructGUI();
	}
	
	public JList<String> getIzabraniSimptomi() {
		return izabraniSimptomi;
	}

	public void setIzabraniSimptomi(JList<String> izabraniSimptomi) {
		this.izabraniSimptomi = izabraniSimptomi;
	}

	private void init() {
		
		setTitle("Pregled simptoma");
		setModal(true);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setSize(1000, 600);
		setLocationRelativeTo(null);
		
		pnlContent.setLayout(new BorderLayout());
		pane = new JPanel(new GridBagLayout());
		pane1 = new JPanel(new GridBagLayout());
		
		lbl =  new JLabel("Svi simptomi:");
		lblIzabraniSimptomi = new JLabel("Odabrani simptomi:");
		pnlContent = new JPanel(new GridBagLayout());
		
		dlmSviSimptomi = new DefaultListModel<>();
		dlmIzabraniSimptomi = new DefaultListModel<>();

		sviSimptomi = new JList<String>(dlmSviSimptomi);
		sviSimptomi.setLayoutOrientation(JList.VERTICAL);
		sviSimptomi.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		listSc = new JScrollPane();
		listSc.setViewportView(sviSimptomi);
		MainFrame.getInstance().setRezim(Rezim.RBR);
		ArrayList<String> listaSimp = MainFrame.getInstance().getBaza().vratiSimptome();
		ubaciSimptome(listaSimp);
		
		
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
		izabraniSimptomi.setLayoutOrientation(JList.VERTICAL);
		izabraniSimptomi.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		listScIz = new JScrollPane();
		listScIz.setViewportView(izabraniSimptomi);
		
		btnDalje = new JButton("Dalje");
		btnDalje.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				MainFrame.getInstance().setDijagnoza(new PostaviDijagnozu());
				MainFrame.getInstance().getDijagnoza().setVisible(true);
			}
			
		});
	}
	
	private void constructGUI() {
		
		pane.add(lbl,new GridBagConstraints(0,0,1,1,0,0,GridBagConstraints.WEST,
				GridBagConstraints.NONE, new Insets(5,30,5,5),0,0));
		pane.add(listSc,new GridBagConstraints(0,1,1,1,0,0,GridBagConstraints.WEST,
				GridBagConstraints.NONE, new Insets(5,30,5,5),0,0));
	
		pane.add(lblIzabraniSimptomi, new GridBagConstraints(0,2,1,1,0,0,GridBagConstraints.WEST,
				GridBagConstraints.NONE,new Insets(5,30,5,5),0,0));
		pane.add(listScIz, new GridBagConstraints(0,3,1,1,0,0,GridBagConstraints.WEST,
	    		GridBagConstraints.NONE,new Insets(5,30,5,5),0,0));
		pane.add(btnDalje, new GridBagConstraints(0,4,1,1,0,0,GridBagConstraints.WEST,
	    		GridBagConstraints.NONE,new Insets(15,90,5,5),0,0));
		add(pane, BorderLayout.CENTER);
		add(pane1, BorderLayout.EAST);
	
	}
	
	
	public HashMap<String, Double> getListaBolesti()
	{
		return listaBolesti;
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
	
	public JList<String> getSviSimptomi()
	{
		return sviSimptomi;
	}

	public void setSviSimptomi(JList<String> sviSimptomi)
	{
		this.sviSimptomi = sviSimptomi;
	}
}

