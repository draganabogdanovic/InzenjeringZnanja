package cbrApp;

import java.util.Collection;

import cbr.Simptomi;
import connector.CsvConnector;
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

public class CbrApp implements StandardCBRApplication {
	
	Connector _connector;  /** Connector object */
	CBRCaseBase _caseBase;  /** CaseBase object */

	NNConfig simConfig;  /** KNN configuration */
	
	public void configure() throws ExecutionException {
		_connector =  new CsvConnector();
		
		_caseBase = new LinealCaseBase();  // Create a Lineal case base for in-memory organization
		
		simConfig = new NNConfig(); // KNN configuration
		simConfig.setDescriptionSimFunction(new Average());  // global similarity function = average
		simConfig.addMapping(new Attribute("simptomi", Simptomi.class), new ListTableSimilarity());
		
	
		// Equal - returns 1 if both individuals are equal, otherwise returns 0
		// Interval - returns the similarity of two number inside an interval: sim(x,y) = 1-(|x-y|/interval)
		// Threshold - returns 1 if the difference between two numbers is less than a threshold, 0 in the other case
		// EqualsStringIgnoreCase - returns 1 if both String are the same despite case letters, 0 in the other case
		// MaxString - returns a similarity value depending of the biggest substring that belong to both strings
		// EnumDistance - returns the similarity of two enum values as the their distance: sim(x,y) = |ord(x) - ord(y)|
		// EnumCyclicDistance - computes the similarity between two enum values as their cyclic distance
		// Table - uses a table to obtain the similarity between two values. Allowed values are Strings or Enums. The table is read from a text file.
		// TableSimilarity(List<String> values).setSimilarity(value1,value2,similarity) 
	}

	public void cycle(CBRQuery query) throws ExecutionException {
		
		//MainFrame.getInstance().getMapaBolesti();
		Collection<RetrievalResult> eval = NNScoringMethod.evaluateSimilarity(_caseBase.getCases(), query, simConfig);
		eval = SelectCases.selectTopKRR(eval, 4);
		System.out.println("Retrieved cases:");
		for (RetrievalResult nse : eval)
			System.out.println(nse.get_case().getDescription() + " -> " + nse.getEval());
	}

	public void postCycle() throws ExecutionException {
		
	}

	public CBRCaseBase preCycle() throws ExecutionException {
		_caseBase.init(_connector);
		java.util.Collection<CBRCase> cases = _caseBase.getCases();
		for (CBRCase c: cases)
			System.out.println(c.getDescription());
		return _caseBase;
	}

	public void run(String simptomi) {
		CbrApp recommender = new CbrApp();
		try {
			recommender.configure();

			recommender.preCycle();

			CBRQuery query = new CBRQuery();
			
		//	TransactionDescription txDescription = new TransactionDescription();
		//	RealEstateDescription reDescription = new RealEstateDescription();
			
			//List<String> izabrani = MainFrame.getInstance().getIzabrani;
		/*	Pregled pregled = new Pregled();
			pregled.setHunger(1);
			pregled.setFatigue(1);
			pregled.setPeeing_more_often(0);
			pregled.setDry_mouth(1);
			pregled.setItchy_skin(1);
			pregled.setBlurred_vision(1);
			pregled.setWeight_loss(1);
			pregled.setNausea(1);
			pregled.setVomiting(1);
			pregled.setYeast_infections(0);
			pregled.setSlow_healing_sores_or_cuts(0);
			pregled.setPain_in_legs(0);
			pregled.setFast_heartbeat(0);
			pregled.setPale_skin(0);
			pregled.setHeadache(0);
			pregled.setNightmares(0);
			pregled.setCoordination_problems(0);
			pregled.setSeizures(0);
			pregled.setSweating(0);
			pregled.setHeavy_thirst(0);
			pregled.setTingling_feet(0);
			pregled.setSugar_in_urine(0);
			pregled.setVaginal_infection(0);
			pregled.setSkin_infection(0);
			pregled.setDry_skin(0);
			pregled.setHigh_fever(0);
			pregled.setVision_loss(0);
			pregled.setHallucinations(0);
			pregled.setWeakness(0);
			pregled.setBack_pain(0);
			pregled.setA_stooped_posture(0);
			pregled.setEasily_broken_bones(0);
			pregled.setA_lump_on_the_neck(0);
			pregled.setChanged_voice(0);
			pregled.setDifficulty_swallowing(0);
			pregled.setThroat_pain(0);
			pregled.setKidney_stones(0);
			pregled.setAbdominal_pain(0);
			pregled.setDepression(0);
			pregled.setCramps_in_legs(0);
			pregled.setTwitching_muscles(0);
			pregled.setHair_loss(0);
			pregled.setBrittle_nails(0);
			pregled.setLow_sex_drive(0);
			pregled.setErectile_dysfunction(0);
			pregled.setLow_semen_volume(0);
			pregled.setLoss_of_muscle_mass(0);
			pregled.setIncreased_body_fat(0);
			pregled.setMood_changes(0);
			pregled.setAffected_memory(0);
			pregled.setLow_blood_counts(0);
			pregled.setIrregular_periods(0);
			pregled.setHot_flashes(0);
			pregled.setChills(0);
			pregled.setNight_sweats(0);
			pregled.setSleep_problems(0);
			pregled.setWeight_gain(0);
			pregled.setThinning_hair(0);
			pregled.setHyperpigmentation(0);
			pregled.setLow_blood_pressure(0);
			pregled.setSalt_craving(0);
			pregled.setHypoglycemia(0);
			pregled.setDiarrhea(0);
			pregled.setMuscle_pain(0);
			pregled.setIrritability(0);
			pregled.setBody_hair_loss(0);
			pregled.setStriae(0);
			pregled.setAnce(0);
			pregled.setDecreased_libido(0);
			pregled.setCognitive_difficulties(0);*/
			
			/*reDescription.setAge(25);
			reDescription.setDistanceToPublicTransportation(300);
			reDescription.setLocalStores(5);
			txDescription.setRealEstateDescription(reDescription);
			txDescription.setYear(2013);*/
			
		   
			Simptomi s = new Simptomi();
			//s.setSimptomi(simptomi);
			query.setDescription(s);
			recommender.cycle(query);

			recommender.postCycle();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

