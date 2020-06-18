package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.ugos.jiprolog.engine.JIPEngine;
import com.ugos.jiprolog.engine.JIPQuery;
import com.ugos.jiprolog.engine.JIPTerm;
import com.ugos.jiprolog.engine.JIPVariable;

import view.PregledPacijentaView;

public class UcitajIzBaze {
	private ArrayList<String> simptomi;
	private PregledPacijentaView pv;

	public UcitajIzBaze()
	{
		// TODO Auto-generated constructor stub
		this.simptomi = new ArrayList<>();
	}
	
	public ArrayList<String> vratiSimptome()
	{
		JIPEngine engine = new JIPEngine();//poziva jipProlog 
		engine.consultFile("data/program.pl");
		JIPQuery query = engine.openSynchronousQuery("symptoms(B,S)");

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
	
	public void vratiBolesti() {
		

		JIPEngine engine = new JIPEngine();
		engine.consultFile("data/program.pl");
		JIPQuery query = engine.openSynchronousQuery("symptoms(B,S)");

		JIPTerm solution;

		HashMap<String, String> mapaBolesti = new HashMap<>();

		while ((solution = query.nextSolution()) != null)
		{
			JIPVariable[] vars = solution.getVariables();

			mapaBolesti.put(vars[0].toString(), (vars[1].toString()));

		}

		ArrayList<String> listaPPc = new ArrayList<>();
		for (Map.Entry<String, String> iterator : mapaBolesti.entrySet())
		{
			listaPPc.add(iterator.getValue());
		}

		java.util.Collections.sort(listaPPc, java.util.Collections.reverseOrder());
	//	MainFrame.getInstance().getPp2().getListaBolesti().clear();
		//pv.getListaBolesti().clear();
		int j = 0;

		for (int i = 0; i < 3; i++)
		{
			for (Map.Entry<String, String> iter : mapaBolesti.entrySet())
			{
				if (iter.getValue() == listaPPc.get(j))
				{
					//MainFrame.getInstance().getPp2().getListaBolesti().put(iter.getKey(), iter.getValue());
					//pv.getListaBolesti().put(iter.getKey(), iter.getValue());
					j++;
					break;
				}
			}
		}

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
