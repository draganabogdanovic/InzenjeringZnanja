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
		
	/*	JIPEngine engine = new JIPEngine();//poziva jipProlog 
		engine.consultFile("data/program.pl");
		JIPQuery query = engine.openSynchronousQuery("symptoms(B,S,P)");

		JIPTerm solution;

		while ((solution = query.nextSolution()) != null)
		{
			//uzima niz JIPVariable variabla koje sadrze variable tipa JIPTerm 
			JIPVariable[] vars = solution.getVariables();

			String bolest;

			bolest = vars[0].toString();
			
			this.bolesti.add(bolest);
	
		}*/
		
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
		JIPQuery query = engine.openSynchronousQuery("vratiBolesti(" + simptomi + ",B,P)");
		
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
/*
		HashMap<String, Double> mapaBolesti = new HashMap<>();

		while ((solution = query.nextSolution()) != null)
		{
			JIPVariable[] vars = solution.getVariables();

			mapaBolesti.put(vars[0].toString(), Double.parseDouble(vars[1].toString()));

		}

		query = engine.openSynchronousQuery("dajProsekZaBolest(B, " + simptomi + ", No)");
		while ((solution = query.nextSolution()) != null)
		{
			JIPVariable[] vars = solution.getVariables();
			mapaBolesti.put(vars[0].toString(),
					Double.parseDouble(vars[1].toString()) / 100 + mapaBolesti.get(vars[0].toString()));
		}
		
		ArrayList<Double> listaPPc = new ArrayList<>();
		for (Map.Entry<String, Double> iterator : mapaBolesti.entrySet())
		{
			listaPPc.add(iterator.getValue());
		}

		java.util.Collections.sort(listaPPc, java.util.Collections.reverseOrder());
		//MainFrame.getInstance().getDijagnoza().getListaBolesti().clear();
		int j = 0;

		for (int i = 0; i < 3; i++)
		{
			for (Map.Entry<String, Double> iter : mapaBolesti.entrySet())
			{
				if (iter.getValue() == listaPPc.get(j))
				{
					MainFrame.getInstance().getDijagnoza().getListaBolesti().put(iter.getKey(), iter.getValue());
					j++;
					break;
				}
			}
		}*/

		
	}
	
	public ArrayList<String> vratiLekove()
	{
		JIPEngine engine = new JIPEngine();//poziva jipProlog 
		engine.consultFile("data/program.pl");
		JIPQuery query = engine.openSynchronousQuery("therapy(B,T,P)");

		JIPTerm solution;

		while ((solution = query.nextSolution()) != null)
		{
			//uzima niz JIPVariable variabla koje sadrze variable tipa JIPTerm 
			JIPVariable[] vars = solution.getVariables();

			String lek;

			lek = vars[1].toString();
			
			this.lekovi.add(lek);
	
		}
			return lekovi;
	}
	
	public ArrayList<String> vratiDodatnaIspitivanja()
	{
		
		JIPEngine engine = new JIPEngine();//poziva jipProlog 
		engine.consultFile("data/program.pl");
		JIPQuery query = engine.openSynchronousQuery("test(B, T, P)");

		JIPTerm solution;

		while ((solution = query.nextSolution()) != null)
		{
			//uzima niz JIPVariable variabla koje sadrze variable tipa JIPTerm 
			JIPVariable[] vars = solution.getVariables();

			String dodatnaIsp;

			dodatnaIsp = vars[1].toString();
			
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

	
	public ArrayList<String> dajSimptome(String izabBol)
	{
		// TODO Auto-generated method stub
		
		ArrayList<String> lista = new ArrayList<>();
		JIPEngine engine = new JIPEngine();
		engine.consultFile("data/program.pl");
		JIPQuery query = engine.openSynchronousQuery("symptom_disease(" + izabBol + ", X).");

		JIPTerm solution;

		while ((solution = query.nextSolution()) != null)
		{
			JIPVariable[] vars = solution.getVariables();
			lista.add(vars[0].toString());

		}

		return lista;

	}
}

