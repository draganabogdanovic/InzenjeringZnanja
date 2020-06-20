package controller;

import java.util.ArrayList;

import com.ugos.jiprolog.engine.JIPEngine;
import com.ugos.jiprolog.engine.JIPQuery;
import com.ugos.jiprolog.engine.JIPTerm;
import com.ugos.jiprolog.engine.JIPVariable;

public class UcitajIzBaze {
	private ArrayList<String> simptomi;

	public UcitajIzBaze()
	{
		// TODO Auto-generated constructor stub
		this.simptomi = new ArrayList<>();
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
	
	public void vratiBolesti() {
		



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
