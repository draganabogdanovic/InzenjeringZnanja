package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import com.toedter.calendar.JCalendar;

import controller.PacijentController;
import controller.ResourceManager;
import controller.SacuvajPacijenta;
import model.Pacijent;


public class PacijentView extends JPanel{

	private static final long serialVersionUID = 1884063759494311563L;
	
	private Pacijent pacijent;
	private PacijentController pacijentCon;
	
	
	private JPanel pnlContent;
	private JLabel lblIme;
	private JLabel lblPrezime;
	private JLabel lblPol;
	
	private JTextField tfIme;
	private JTextField tfPrezime;
	private JLabel lblJMBG;
	private JTextField tfJMBG;
	private JLabel lblDatum;
	private JTextField tfDatum;
	private JCalendar kal;
	
	private JPanel pnlOK;
	private JButton btnDodaj;
	private JButton btnNE;
	private JButton b;
	private JButton sacuvaj;
	private JRadioButton male;
	private JRadioButton female;

	
	public PacijentView(Pacijent pacijent){
		initGUI();
		constructGUI();
		setPacijent(pacijent);
	}
	
	private void initGUI(){
		setLayout(new BorderLayout());

		pnlContent = new JPanel(new GridBagLayout());
		
		lblIme = new JLabel("Ime:");
		tfIme = new JTextField(20);

		lblPrezime = new JLabel("Prezime:");
		tfPrezime = new JTextField(20);

		lblJMBG = new JLabel("JMBG:");
		tfJMBG = new JTextField(20);

		lblPol = new JLabel("Pol:");
		male = new JRadioButton("M");
		female = new JRadioButton("F");
		
		lblDatum = new JLabel("Datum rodjenja:");
		kal = new JCalendar();
	
		pnlOK = new JPanel(new FlowLayout(FlowLayout.CENTER));
		//btnDodaj = new JButton("Dodaj");
		btnDodaj = new JButton("Sacuvaj");
	/*	btnDodaj.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ok();
			}
		});

	 */
	    sacuvaj=new JButton("UFajl");
	    sacuvaj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a){
				SacuvajPacijenta data=new SacuvajPacijenta();
				data.ime=tfIme.getText();
				data.prezime=tfPrezime.getText();
				data.JMBG=tfJMBG.getText();
				try{
					ResourceManager.save(data,  "PACIJENTI.txt");
				}catch(Exception e){
					System.out.println("Nece da se sacuva"+e.getMessage());
				}
				
				System.out.println("Uspesno sacuvan pacijent!");
		   }
	    });

	    
	
		
		btnNE=new JButton("Odustani");
		btnDodaj.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ok();
			}
		});
		
		btnNE.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				odustaniODpostavljanja();
				
			}
		});
		
		
	}
	
	private void constructGUI(){
		pnlContent.add(lblIme, new GridBagConstraints(0, 0, 1, 1, 0, 0, GridBagConstraints.WEST,
				GridBagConstraints.NONE,new Insets(5, 5, 5, 5),0,0));
		pnlContent.add(tfIme,new GridBagConstraints(1, 0, 1, 1, 100, 0, GridBagConstraints.WEST,
				GridBagConstraints.HORIZONTAL, new Insets(5, 5, 5, 5), 0, 0));
		pnlContent.add(lblPrezime,new GridBagConstraints(0, 1, 1, 1, 0, 0, GridBagConstraints.WEST,
				GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
		pnlContent.add(tfPrezime, new GridBagConstraints(1, 1, 1, 1, 100, 0, GridBagConstraints.WEST,
				GridBagConstraints.HORIZONTAL, new Insets(5, 5, 5, 5), 0, 0));
		pnlContent.add(lblJMBG ,new GridBagConstraints(0, 2, 2, 1, 100, 100, GridBagConstraints.WEST,
				GridBagConstraints.BOTH, new Insets(15, 5, 5, 5), 0, 0));
		pnlContent.add(tfJMBG,new GridBagConstraints(1, 2, 2, 1, 0, 0, GridBagConstraints.WEST,
				GridBagConstraints.HORIZONTAL, new Insets(5, 5, 5, 5), 0, 0));
		pnlContent.add(lblPol,new GridBagConstraints(0,3,1,1,0,0,GridBagConstraints.WEST,
	    		GridBagConstraints.NONE,new Insets(5,5,5,5),0,0));
		pnlContent.add(male,new GridBagConstraints(0,4,1,1,0,0,GridBagConstraints.WEST,
	    		GridBagConstraints.NONE,new Insets(-25,55,5,5),0,0));
		pnlContent.add(female,new GridBagConstraints(0,4,1,1,0,0,GridBagConstraints.WEST,
	    		GridBagConstraints.NONE,new Insets(-25,95,5,5),0,0));
		pnlContent.add(lblDatum ,new GridBagConstraints(0,5,1,1,0,0,GridBagConstraints.WEST,
	    		GridBagConstraints.NONE,new Insets(5,5,5,5),0,0));
		pnlContent.add(kal,new GridBagConstraints(1,5,2,2,126,85,GridBagConstraints.WEST,
	    		GridBagConstraints.BOTH,new Insets(5,5,5,5),0,0));



		
	
		pnlOK.add(btnDodaj);
		
		pnlOK.add(btnNE);
		
		pnlOK.add(sacuvaj);

		add(pnlContent,BorderLayout.CENTER);
		add(pnlOK,BorderLayout.SOUTH);
		
	}
	
	public Pacijent getPacijent(){
		return pacijent;
	}
	
	
	public void setPacijent(Pacijent pacijent) {
		this.pacijent = pacijent;

		pacijentCon = null;
		refreshView();
	}
	
	public void refreshView() {
		tfIme.setText(pacijent.getIme());
		tfPrezime.setText(pacijent.getPrezime());
		tfJMBG.setText(pacijent.getJMBG());
	
	}
	
	private void ok() {
		if (pacijentCon == null) {
			pacijentCon = new PacijentController(pacijent,this);
		}
		String Ime = tfIme.getText();
		String Prezime = tfPrezime.getText();
		String JMBG = tfJMBG.getText();
		Date Datum = kal.getDate();
		
		pacijentCon.updatesPacijent(Ime, Prezime, JMBG, Datum);
		
		
	}

	
	
	private void odustaniODpostavljanja(){
		tfIme.setText("");
		tfPrezime.setText("");
		tfJMBG.setText("");
	
	}
}

