package view;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.ButtonGroup;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;



import model.Pol;

public class NoviPacijent extends JDialog {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField ime;
	private JTextField prezime;
//	private JCalendar kalendar;
	private Pol pol;
	private JRadioButton musko, zensko;
	private JPanel panel;
	private JLabel lblIme;
	private JLabel lblPrezime;
	
	public NoviPacijent() {
		
		initGui();
	}
	
private void initGui() {
		
		setLayout(new BorderLayout());
		lblIme = new JLabel("Ime:");
		ime = new JTextField();
		ime.setPreferredSize(new Dimension(300, 40));
		lblPrezime = new JLabel("Prezime:");
		prezime = new JTextField();
		prezime.setPreferredSize(new Dimension(300, 40));
		//kalendar = new JCalendar();
		
		this.setPreferredSize(new Dimension(500, 350));
		this.setSize(new Dimension(500, 500));
		this.setModal(true);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setAlwaysOnTop(true);
		
		musko = new JRadioButton();
		zensko = new JRadioButton();
		ButtonGroup group = new ButtonGroup();
		group.add(musko);
		group.add(zensko);
	}
	
	public JTextField getIme() {
		return ime;
	}

	public void setIme(JTextField ime) {
		this.ime = ime;
	}

	public JTextField getPrezime() {
		return prezime;
	}

	public void setPrezime(JTextField prezime) {
		this.prezime = prezime;
	}

	public JRadioButton getMusko() {
		return musko;
	}

	public void setMusko(JRadioButton musko) {
		this.musko = musko;
	}

	public JRadioButton getZensko() {
		return zensko;
	}

	public void setZensko(JRadioButton zensko) {
		this.zensko = zensko;
	}

	public JPanel getPanel() {
		return panel;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}

	public JLabel getLblIme() {
		return lblIme;
	}

	public void setLblIme(JLabel lblIme) {
		this.lblIme = lblIme;
	}

	public JLabel getLblPrezime() {
		return lblPrezime;
	}

	public void setLblPrezime(JLabel lblPrezime) {
		this.lblPrezime = lblPrezime;
	}


	public Pol getPol() {
		return pol;
	}

	public void setPol(Pol pol) {
		this.pol = pol;
	}

}
