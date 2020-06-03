package model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JPanel;
//import com.toedter.calendar.JCalendar;

//import net.miginfocom.swing.MigLayout;

public class PregledPacijenta extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	private ArrayList<String> listaSimptoma;
	private Date datumPregleda;
	private ArrayList<String> listaLekova;
	private ArrayList<String> listaTerapija;
	private String bolest, nalaz;

	public PregledPacijenta(ArrayList<String> listaSimptoma, ArrayList<String> listaLekova,
			ArrayList<String> listaTerapija, String bolest)
	{
		super();
		this.listaSimptoma = listaSimptoma;
		this.datumPregleda = new Date();
		this.listaLekova = listaLekova;
		this.listaTerapija = listaTerapija;
		this.bolest = bolest;
	}

	public ArrayList<String> getListaSimptoma()
	{
		return listaSimptoma;
	}

	public String dajDatum()
	{
		return new SimpleDateFormat("dd-MM-yyyy HH:mm").format(this.datumPregleda);
	}

	public void setListaSimptoma(ArrayList<String> listaSimptoma)
	{
		this.listaSimptoma = listaSimptoma;
	}

	public String getDatumPregleda()
	{
		return datumPregleda.toString();
	}

	public void setDatumPregleda(Date datumPregleda)
	{
		this.datumPregleda = datumPregleda;
	}

	public ArrayList<String> getListaLekova()
	{
		return listaLekova;
	}

	public void setListaLekova(ArrayList<String> listaLekova)
	{
		this.listaLekova = listaLekova;
	}

	public ArrayList<String> getListaTerapija()
	{
		return listaTerapija;
	}

	public void setListaTerapija(ArrayList<String> listaTerapija)
	{
		this.listaTerapija = listaTerapija;
	}

	public String getBolest()
	{
		return bolest;
	}

	public void setBolest(String bolest)
	{
		this.bolest = bolest;
	}

	public void pregledToString()
	{
		System.out.println("simptomi : ");
		for (String s : getListaSimptoma())
			System.out.println(s);

		System.out.println("datum pregleda : " + getDatumPregleda());
		System.out.println(" lista lekova :");
		for (String s : getListaLekova())
			System.out.println(s);

		System.out.println(" lista terapija :: ");
		for (String s : getListaTerapija())
			System.out.println(s);

		System.out.println("bolest je :" + getBolest());
	}

	@Override
	public String toString()
	{
		return dajDatum() + " " + bolest;
	}

	public String getNalaz()
	{
		return nalaz;
	}

	public void setNalaz(String nalaz)
	{
		this.nalaz = nalaz;
	}
}
