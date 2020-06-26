package cbrApp;

import java.util.Collection;
import java.util.List;

import cbr.Lekovi;
import connector.CsvConnectorTerapija;
import similarity.ListTableSimilarity;
import ucm.gaia.jcolibri.casebase.LinealCaseBase;
import ucm.gaia.jcolibri.cbraplications.StandardCBRApplication;
import ucm.gaia.jcolibri.cbrcore.Attribute;
import ucm.gaia.jcolibri.cbrcore.CBRCase;
import ucm.gaia.jcolibri.cbrcore.CBRCaseBase;
import ucm.gaia.jcolibri.cbrcore.CBRQuery;
import ucm.gaia.jcolibri.cbrcore.Connector;
import ucm.gaia.jcolibri.exception.ExecutionException;
import ucm.gaia.jcolibri.method.retrieve.RetrievalResult;
import ucm.gaia.jcolibri.method.retrieve.NNretrieval.NNConfig;
import ucm.gaia.jcolibri.method.retrieve.NNretrieval.NNScoringMethod;
import ucm.gaia.jcolibri.method.retrieve.NNretrieval.similarity.global.Average;
import ucm.gaia.jcolibri.method.retrieve.selection.SelectCases;

public class CbrTerapija implements StandardCBRApplication
{

	
	Connector _connector;
	/** Connector object */
	CBRCaseBase _caseBase;
	/** CaseBase object */

	NNConfig simConfig;

	/** KNN configuration */

	@Override
	public void configure() throws ExecutionException
	{
		_connector = new CsvConnectorTerapija();

		_caseBase = new LinealCaseBase(); // Create a Lineal case base for in-memory organization

		simConfig = new NNConfig(); // KNN configuration
		simConfig.setDescriptionSimFunction(new Average()); // global similarity function = average
		simConfig.addMapping(new Attribute("bolesti",  Lekovi.class), new ListTableSimilarity());
		
	/*
		
		simConfig.addMapping(new Attribute("terapija", Terapija.class), new Equal());
		
		simConfig.addMapping(new Attribute("diabetes_type_1", Terapija.class), new Equal());
		simConfig.addMapping(new Attribute("diabetes_type_2", Terapija.class), new Equal());
		simConfig.addMapping(new Attribute("hypoglycemia", Terapija.class), new Equal());
		simConfig.addMapping(new Attribute("hyperglycemia", Terapija.class), new Equal());
		simConfig.addMapping(new Attribute("diabetic_coma", Terapija.class), new Equal());
		simConfig.addMapping(new Attribute("osteoporosis", Terapija.class), new Equal());
		simConfig.addMapping(new Attribute("thyroid_cancer", Terapija.class), new Equal());
		simConfig.addMapping(new Attribute("hyperparathyroidism", Terapija.class), new Equal());
		simConfig.addMapping(new Attribute("hypoparathyroidism", Terapija.class), new Equal());
		simConfig.addMapping(new Attribute("low_testosterone", Terapija.class), new Equal());
		simConfig.addMapping(new Attribute("menopause", Terapija.class), new Equal());
		simConfig.addMapping(new Attribute("addisons_disease", Terapija.class), new Equal());
		simConfig.addMapping(new Attribute("cushing_syndrome", Terapija.class), new Equal());
*/
		
		
		
	
	}

	public void cycle(CBRQuery query) throws ExecutionException
	{

		Collection<RetrievalResult> eval = NNScoringMethod.evaluateSimilarity(_caseBase.getCases(), query, simConfig);
		eval = SelectCases.selectTopKRR(eval, 4);
		System.out.println("\nVracene terapije za odredjene bolesti:\n");
		for (RetrievalResult nse : eval)
		{
			
			System.out.println(nse.get_case().getDescription());
		}
	}

	@Override
	public void postCycle() throws ExecutionException
	{

	}

	@Override
	public CBRCaseBase preCycle() throws ExecutionException
	{
		_caseBase.init(_connector);
		
		java.util.Collection<CBRCase> cases = _caseBase.getCases();
		
		  //for (CBRCase c : cases) System.out.println(c.getDescription());
		 
		return _caseBase;
	}
	
	public void main(List<String> bolesti) {
		
		StandardCBRApplication recommender = new CbrTerapija();
		
		try {
			
			recommender.configure();
			recommender.preCycle();
			
			CBRQuery query = new CBRQuery();
			
			//Terapija t = new Terapija();
			
			Lekovi l = new Lekovi();
			l.setBolesti(bolesti);
			
			
			/*t.setDiabetes_type_1(1);
			t.setDiabetes_type_2(1);
			t.setHypoglycemia(0);
			t.setHyperglycemia(1);
			t.setDiabetic_coma(0);
			t.setOsteoporosis(0);
			t.setThyroid_cancer(0);
			t.setHyperparathyroidism(0);
			t.setHypoparathyroidism(0);
			t.setLow_testosterone(0);
			t.setMenopause(0);
			t.setAddisons_disease(0);
			t.setCushing_syndrome(0);*/
			

		
			
			query.setDescription(l);
			recommender.cycle(query);
			recommender.postCycle();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
		
}

