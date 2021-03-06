package controller;

import java.util.ArrayList;

import javax.swing.ListModel;

import com.ugos.jiprolog.engine.JIPEngine;
import com.ugos.jiprolog.engine.JIPQuery;
import com.ugos.jiprolog.engine.JIPTerm;
import com.ugos.jiprolog.engine.JIPVariable;

import app.MainFrame;

public class UcitajIzBaze {
	private ArrayList<String> simptomi;
	private ArrayList<String> bolesti;
	private ArrayList<String> lekovi;
	private ArrayList<String> ispitivanja;


	public UcitajIzBaze()
	{
		// TODO Auto-generated constructor stub
		this.simptomi = new ArrayList<>();
		this.bolesti = new ArrayList<>();
		this.lekovi = new ArrayList<>();
		this.ispitivanja = new ArrayList<>();
	}
	
	public ArrayList<String> vratiSimptome()
	{
		JIPEngine engine = new JIPEngine();//poziva jipProlog 
		engine.consultFile("data/program.pl");
		JIPQuery query = engine.openSynchronousQuery("symptoms(B,S,P)");


		JIPTerm solution;

		while ((solution = query.nextSolution()) != null)
		{
			//uzima niz JIPVariable variabla koje sadrze variable tipa JIPTerm 
			JIPVariable[] vars = solution.getVariables();

			String simptom;

			simptom = vars[1].toString();
			
			this.simptomi.add(simptom);
	
		}
			return simptomi;
	}
	
	public ArrayList<String> vratiBolesti() {
		
		String simptomi = "[";
	
		ListModel<String> lM = MainFrame.getInstance().getNoviPregled().getIzabraniSimptomi().getModel();

		for (int i = 0; i < lM.getSize();)
		{
			simptomi = simptomi.concat(lM.getElementAt(i++) + ", ");
		}

		simptomi = simptomi.substring(0, simptomi.length() - 2);

		simptomi = simptomi.concat(" ]");
	
		JIPEngine engine = new JIPEngine();
		engine.consultFile("data/program.pl");
		JIPQuery query = engine.openSynchronousQuery("pronadji("+simptomi+",B)");
		JIPTerm solution;
	
		while ((solution = query.nextSolution()) != null)
		{
			//uzima niz JIPVariable variabla koje sadrze variable tipa JIPTerm 
			JIPVariable[] vars = solution.getVariables();

			String bolest;

		
			bolest = vars[0].toString();
			
			this.bolesti.add(bolest);
	
		}

		
		return bolesti;
	

		
	}
	
	
	public ArrayList<String> vratiLekove()
	{
		String bolesti = "[";

		ListModel<String> lM = MainFrame.getInstance().getDijagnoza().getIzabraneBolesti().getModel();

		for (int i = 0; i < lM.getSize();)
		{
			bolesti = bolesti.concat(lM.getElementAt(i++) + ", ");
		}


		bolesti = bolesti.substring(0, bolesti.length() - 2);
		bolesti = bolesti.concat(" ]");
		JIPEngine engine = new JIPEngine();//poziva jipProlog 
		engine.consultFile("data/program.pl");
		JIPQuery query = engine.openSynchronousQuery("pronadjiLekove("+bolesti+",T)");

		JIPTerm solution;

		while ((solution = query.nextSolution()) != null)
		{
			//uzima niz JIPVariable variabla koje sadrze variable tipa JIPTerm 
			JIPVariable[] vars = solution.getVariables();

			String lek;

			lek = vars[0].toString();
			
			this.lekovi.add(lek);
	
		}
			return lekovi;
	}

	
	public ArrayList<String> vratiDodatnaIspitivanja()
	{
		
		String bolesti = "[";

		ListModel<String> lM = MainFrame.getInstance().getDijagnoza().getIzabraneBolesti().getModel();

		for (int i = 0; i < lM.getSize();)
		{
			bolesti = bolesti.concat(lM.getElementAt(i++) + ", ");
		}


		bolesti = bolesti.substring(0, bolesti.length() - 2);
		bolesti = bolesti.concat(" ]");
		
		JIPEngine engine = new JIPEngine();//poziva jipProlog 
		engine.consultFile("data/program.pl");
		JIPQuery query = engine.openSynchronousQuery("pronadjiIspitivanja("+bolesti+",D)");

		JIPTerm solution;

		while ((solution = query.nextSolution()) != null)
		{
			//uzima niz JIPVariable variabla koje sadrze variable tipa JIPTerm 
			JIPVariable[] vars = solution.getVariables();

			String dodatnaIsp;

			dodatnaIsp = vars[0].toString();
			
			this.ispitivanja.add(dodatnaIsp);
	
		}
	
		return ispitivanja;
	}
	
	public ArrayList<String> getSimptomi()
	{
		return simptomi;
	}

	public void setSimptomi(ArrayList<String> simptomi)
	{
		this.simptomi = simptomi;
	}

	
}

