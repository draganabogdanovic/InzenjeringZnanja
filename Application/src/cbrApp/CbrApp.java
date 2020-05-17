package cbrApp;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import app.MainFrame;
import connector.CsvConnector;
import model.Pregled;
import similarity.TableSimilarity;
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
import ucm.gaia.jcolibri.method.retrieve.NNretrieval.similarity.local.Equal;
import ucm.gaia.jcolibri.method.retrieve.NNretrieval.similarity.local.Interval;
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
		
	//	simConfig.addMapping(new Attribute("year", TransactionDescription.class), new Interval(1));
		// simConfig.addMapping(new Attribute("price", TransactionDescription.class), new Interval(100));
		//simConfig.addMapping(new Attribute("realEstateDescription", TransactionDescription.class), new Average());
		simConfig.addMapping(new Attribute("hunger", Pregled.class), new Equal());
		simConfig.addMapping(new Attribute("fatigue", Pregled.class), new Equal());
		simConfig.addMapping(new Attribute("peeing_more_often", Pregled.class), new Equal());
		simConfig.addMapping(new Attribute("dry_mouth", Pregled.class), new Equal());
		simConfig.addMapping(new Attribute("itchy_skin", Pregled.class), new Equal());
		simConfig.addMapping(new Attribute("blurred_vision", Pregled.class), new Equal());
		simConfig.addMapping(new Attribute("weight_loss", Pregled.class), new Equal());
		simConfig.addMapping(new Attribute("nausea", Pregled.class), new Equal());
		simConfig.addMapping(new Attribute("vomiting", Pregled.class), new Equal());
		simConfig.addMapping(new Attribute("yeast_infections", Pregled.class), new Equal());
		simConfig.addMapping(new Attribute("slow_healing_sores_or_cuts", Pregled.class), new Equal());
		simConfig.addMapping(new Attribute("pain_in_legs", Pregled.class), new Equal());
		simConfig.addMapping(new Attribute("fast_heartbeat", Pregled.class), new Equal());
		simConfig.addMapping(new Attribute("pale_skin", Pregled.class), new Equal());
		simConfig.addMapping(new Attribute("headache", Pregled.class), new Equal());
		simConfig.addMapping(new Attribute("nightmares", Pregled.class), new Equal());
		simConfig.addMapping(new Attribute("coordination_problems", Pregled.class), new Equal());
		simConfig.addMapping(new Attribute("seizures", Pregled.class), new Equal());
		simConfig.addMapping(new Attribute("sweating", Pregled.class), new Equal());
		simConfig.addMapping(new Attribute("heavy_thirst", Pregled.class), new Equal());
		simConfig.addMapping(new Attribute("tingling_feet", Pregled.class), new Equal());
		simConfig.addMapping(new Attribute("sugar_in_urine", Pregled.class), new Equal());
		simConfig.addMapping(new Attribute("vaginal_infection", Pregled.class), new Equal());
		simConfig.addMapping(new Attribute("skin_infection", Pregled.class), new Equal());
		simConfig.addMapping(new Attribute("dry_skin", Pregled.class), new Equal());
		simConfig.addMapping(new Attribute("high_fever", Pregled.class), new Equal());
		simConfig.addMapping(new Attribute("vision_loss", Pregled.class), new Equal());
		simConfig.addMapping(new Attribute("hallucinations", Pregled.class), new Equal());
		simConfig.addMapping(new Attribute("weakness", Pregled.class), new Equal());
		simConfig.addMapping(new Attribute("back_pain", Pregled.class), new Equal());
		simConfig.addMapping(new Attribute("a_stooped_posture", Pregled.class), new Equal());
		simConfig.addMapping(new Attribute("easily_broken_bones", Pregled.class), new Equal());
		simConfig.addMapping(new Attribute("a_lump_on_the_neck", Pregled.class), new Equal());
		simConfig.addMapping(new Attribute("changed_voice", Pregled.class), new Equal());
		simConfig.addMapping(new Attribute("difficulty_swallowing", Pregled.class), new Equal());
		simConfig.addMapping(new Attribute("throat_pain", Pregled.class), new Equal());
		simConfig.addMapping(new Attribute("kidney_stones", Pregled.class), new Equal());
		simConfig.addMapping(new Attribute("abdominal_pain", Pregled.class), new Equal());
		simConfig.addMapping(new Attribute("depression", Pregled.class), new Equal());
		simConfig.addMapping(new Attribute("cramps_in_legs", Pregled.class), new Equal());
		simConfig.addMapping(new Attribute("twitching_muscles", Pregled.class), new Equal());
		simConfig.addMapping(new Attribute("hair_loss", Pregled.class), new Equal());
		simConfig.addMapping(new Attribute("brittle_nails", Pregled.class), new Equal());
		simConfig.addMapping(new Attribute("low_sex_drive", Pregled.class), new Equal());
		simConfig.addMapping(new Attribute("erectile_dysfunction", Pregled.class), new Equal());
		simConfig.addMapping(new Attribute("low_semen_volume", Pregled.class), new Equal());
		simConfig.addMapping(new Attribute("loss_of_muscle_mass", Pregled.class), new Equal());
		simConfig.addMapping(new Attribute("increased_body_fat", Pregled.class), new Equal());
		simConfig.addMapping(new Attribute("mood_changes", Pregled.class), new Equal());
		simConfig.addMapping(new Attribute("affected_memory", Pregled.class), new Equal());
		simConfig.addMapping(new Attribute("low_blood_counts", Pregled.class), new Equal());
		simConfig.addMapping(new Attribute("irregular_periods", Pregled.class), new Equal());
		simConfig.addMapping(new Attribute("hot_flashes", Pregled.class), new Equal());
		simConfig.addMapping(new Attribute("chills", Pregled.class), new Equal());
		simConfig.addMapping(new Attribute("night_sweats", Pregled.class), new Equal());
		simConfig.addMapping(new Attribute("sleep_problems", Pregled.class), new Equal());
		simConfig.addMapping(new Attribute("weight_gain", Pregled.class), new Equal());
		simConfig.addMapping(new Attribute("thinning_hair", Pregled.class), new Equal());
		simConfig.addMapping(new Attribute("hyperpigmentation", Pregled.class), new Equal());
		simConfig.addMapping(new Attribute("low_blood_pressure", Pregled.class), new Equal());
		simConfig.addMapping(new Attribute("salt_craving", Pregled.class), new Equal());
		simConfig.addMapping(new Attribute("hypoglycemia", Pregled.class), new Equal());
		simConfig.addMapping(new Attribute("diarrhea", Pregled.class), new Equal());
		simConfig.addMapping(new Attribute("muscle_pain", Pregled.class), new Equal());
		simConfig.addMapping(new Attribute("irritability", Pregled.class), new Equal());
		simConfig.addMapping(new Attribute("body_hair_loss", Pregled.class), new Equal());
		simConfig.addMapping(new Attribute("striae", Pregled.class), new Equal());
		simConfig.addMapping(new Attribute("ance", Pregled.class), new Equal());
		simConfig.addMapping(new Attribute("decreased_libido", Pregled.class), new Equal());
		simConfig.addMapping(new Attribute("cognitive_difficulties", Pregled.class), new Equal());
	//	TableSimilarity symptomSimilarity = new TableSimilarity((Arrays.asList(new String[] {"headache", "hunger", "dry_mouth"})));
		//symptomSimilarity.setSimilarity("hunger", "dry_mouth", .3);
		//simConfig.addMapping(new Attribute("hunger", Pregled.class), symptomSimilarity);
		//simConfig.addMapping(new Attribute("localStores", RealEstateDescription.class), new Interval(2));

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

	public static void main(String[] args) {
		StandardCBRApplication recommender = new CbrApp();
		try {
			recommender.configure();

			recommender.preCycle();

			CBRQuery query = new CBRQuery();
			
		//	TransactionDescription txDescription = new TransactionDescription();
		//	RealEstateDescription reDescription = new RealEstateDescription();
			
			//List<String> izabrani = MainFrame.getInstance().getIzabrani;
			Pregled pregled = new Pregled();
			pregled.setHunger(1);
			pregled.setFatigue(1);
			pregled.setPeeing_more_often(1);
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
			pregled.setCognitive_difficulties(0);
			
			/*reDescription.setAge(25);
			reDescription.setDistanceToPublicTransportation(300);
			reDescription.setLocalStores(5);
			txDescription.setRealEstateDescription(reDescription);
			txDescription.setYear(2013);*/
			
		    query.setDescription(pregled);
			//query.setDescription( txDescription );
			/*List<String> is = MainFrame.getInstance().getIzabraniSimptom();
			String izabraniSimptom = "";
			for (int i = 0; i < is.size();)
			{
				
				i++;
			}*/
			
		/*	HashMap<String, Integer> map = new HashMap<>();
			String symptoms = "hunger, fatigue, peeing_more_often, dry_mouth, itchy_skin";
			
			String[] vars = symptoms.split(",");
			for (String s : vars)
			{
				if (!izabraniSimptom.contains(s))
				{
					map.put(s, 0);
				}
				else
				{
					map.put(s, 1);
				}
			}
			
			Pregled p = new Pregled(); //MAPA?????????? kao parametar*/

			//query.setDescription(p);
			recommender.cycle(query);

			recommender.postCycle();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
