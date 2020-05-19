package cbrApp;

import java.util.Collection;



import connector.CsvConnectorTerapija;
import model.Terapija;
import model.Testiranje;
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

		
		/*simConfig.addMapping(new Attribute("hunger", Terapija.class), new Equal());
		simConfig.addMapping(new Attribute("fatigue", Terapija.class), new Equal());
		simConfig.addMapping(new Attribute("peeing_more_often", Terapija.class), new Equal());
		simConfig.addMapping(new Attribute("dry_mouth", Terapija.class), new Equal());
		simConfig.addMapping(new Attribute("itchy_skin", Terapija.class), new Equal());
		simConfig.addMapping(new Attribute("blurred_vision", Terapija.class), new Equal());
		simConfig.addMapping(new Attribute("weight_loss", Terapija.class), new Equal());
		simConfig.addMapping(new Attribute("nausea", Terapija.class), new Equal());
		simConfig.addMapping(new Attribute("vomiting", Terapija.class), new Equal());
		simConfig.addMapping(new Attribute("yeast_infections", Terapija.class), new Equal());
		simConfig.addMapping(new Attribute("slow_healing_sores_or_cuts", Terapija.class), new Equal());
		simConfig.addMapping(new Attribute("pain_in_legs", Terapija.class), new Equal());
		simConfig.addMapping(new Attribute("fast_heartbeat", Terapija.class), new Equal());
		simConfig.addMapping(new Attribute("pale_skin", Terapija.class), new Equal());
		simConfig.addMapping(new Attribute("headache", Terapija.class), new Equal());
		simConfig.addMapping(new Attribute("nightmares", Terapija.class), new Equal());
		simConfig.addMapping(new Attribute("coordination_problems", Terapija.class), new Equal());
		simConfig.addMapping(new Attribute("seizures", Terapija.class), new Equal());
		simConfig.addMapping(new Attribute("sweating", Terapija.class), new Equal());
		simConfig.addMapping(new Attribute("heavy_thirst", Terapija.class), new Equal());
		simConfig.addMapping(new Attribute("tingling_feet", Terapija.class), new Equal());
		simConfig.addMapping(new Attribute("sugar_in_urine", Terapija.class), new Equal());
		simConfig.addMapping(new Attribute("vaginal_infection", Terapija.class), new Equal());
		simConfig.addMapping(new Attribute("skin_infection", Terapija.class), new Equal());
		simConfig.addMapping(new Attribute("dry_skin", Terapija.class), new Equal());
		simConfig.addMapping(new Attribute("high_fever", Terapija.class), new Equal());
		simConfig.addMapping(new Attribute("vision_loss", Terapija.class), new Equal());
		simConfig.addMapping(new Attribute("hallucinations", Terapija.class), new Equal());
		simConfig.addMapping(new Attribute("weakness", Terapija.class), new Equal());
		simConfig.addMapping(new Attribute("back_pain", Terapija.class), new Equal());
		simConfig.addMapping(new Attribute("a_stooped_posture", Terapija.class), new Equal());
		simConfig.addMapping(new Attribute("easily_broken_bones", Terapija.class), new Equal());
		simConfig.addMapping(new Attribute("a_lump_on_the_neck", Terapija.class), new Equal());
		simConfig.addMapping(new Attribute("changed_voice", Terapija.class), new Equal());
		simConfig.addMapping(new Attribute("difficulty_swallowing", Terapija.class), new Equal());
		simConfig.addMapping(new Attribute("throat_pain", Terapija.class), new Equal());
		simConfig.addMapping(new Attribute("kidney_stones", Terapija.class), new Equal());
		simConfig.addMapping(new Attribute("abdominal_pain", Terapija.class), new Equal());
		simConfig.addMapping(new Attribute("depression", Terapija.class), new Equal());
		simConfig.addMapping(new Attribute("cramps_in_legs", Terapija.class), new Equal());
		simConfig.addMapping(new Attribute("twitching_muscles", Terapija.class), new Equal());
		simConfig.addMapping(new Attribute("hair_loss", Terapija.class), new Equal());
		simConfig.addMapping(new Attribute("brittle_nails", Terapija.class), new Equal());
		simConfig.addMapping(new Attribute("low_sex_drive", Terapija.class), new Equal());
		simConfig.addMapping(new Attribute("erectile_dysfunction", Terapija.class), new Equal());
		simConfig.addMapping(new Attribute("low_semen_volume", Terapija.class), new Equal());
		simConfig.addMapping(new Attribute("loss_of_muscle_mass", Terapija.class), new Equal());
		simConfig.addMapping(new Attribute("increased_body_fat", Terapija.class), new Equal());
		simConfig.addMapping(new Attribute("mood_changes", Terapija.class), new Equal());
		simConfig.addMapping(new Attribute("affected_memory", Terapija.class), new Equal());
		simConfig.addMapping(new Attribute("low_blood_counts", Terapija.class), new Equal());
		simConfig.addMapping(new Attribute("irregular_periods", Terapija.class), new Equal());
		simConfig.addMapping(new Attribute("hot_flashes", Terapija.class), new Equal());
		simConfig.addMapping(new Attribute("chills", Terapija.class), new Equal());
		simConfig.addMapping(new Attribute("night_sweats", Terapija.class), new Equal());
		simConfig.addMapping(new Attribute("sleep_problems", Terapija.class), new Equal());
		simConfig.addMapping(new Attribute("weight_gain", Terapija.class), new Equal());
		simConfig.addMapping(new Attribute("thinning_hair", Terapija.class), new Equal());
		simConfig.addMapping(new Attribute("hyperpigmentation", Terapija.class), new Equal());
		simConfig.addMapping(new Attribute("low_blood_pressure", Terapija.class), new Equal());
		simConfig.addMapping(new Attribute("salt_craving", Terapija.class), new Equal());
		simConfig.addMapping(new Attribute("hypoglycemia", Terapija.class), new Equal());
		simConfig.addMapping(new Attribute("diarrhea", Terapija.class), new Equal());
		simConfig.addMapping(new Attribute("muscle_pain", Terapija.class), new Equal());
		simConfig.addMapping(new Attribute("irritability", Terapija.class), new Equal());
		simConfig.addMapping(new Attribute("body_hair_loss", Terapija.class), new Equal());
		simConfig.addMapping(new Attribute("striae", Terapija.class), new Equal());
		simConfig.addMapping(new Attribute("ance", Terapija.class), new Equal());
		simConfig.addMapping(new Attribute("decreased_libido", Terapija.class), new Equal());
		simConfig.addMapping(new Attribute("cognitive_difficulties", Terapija.class), new Equal());
		*/
		
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

		
		
		
	
	}

	public void cycle(CBRQuery query) throws ExecutionException
	{

		Collection<RetrievalResult> eval = NNScoringMethod.evaluateSimilarity(_caseBase.getCases(), query, simConfig);
		eval = SelectCases.selectTopKRR(eval, 4);
		System.out.println("Retrieved cases:");
		for (RetrievalResult nse : eval)
		{
			
			System.out.println(nse.get_case().getDescription() + " -> " + nse.getEval());
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
	
	public static void main(String[] args) {
		
		StandardCBRApplication recommender = new CbrTerapija();
		
		try {
			
			recommender.configure();
			recommender.preCycle();
			
			CBRQuery query = new CBRQuery();
			
			Terapija t = new Terapija();
			
			/*t.setHunger(1);
			t.setFatigue(1);
			t.setPeeing_more_often(1);
			t.setDry_mouth(1);
			t.setItchy_skin(1);
			t.setBlurred_vision(1);
			t.setWeight_loss(1);
			t.setNausea(1);
			t.setVomiting(1);
			t.setYeast_infections(0);
			t.setSlow_healing_sores_or_cuts(0);
			t.setPain_in_legs(0);
			t.setFast_heartbeat(0);
			t.setPale_skin(0);
			t.setHeadache(0);
			t.setNightmares(1);
			t.setCoordination_problems(0);
			t.setSeizures(0);
			t.setSweating(0);
			t.setHeavy_thirst(0);
			t.setTingling_feet(0);
			t.setSugar_in_urine(0);
			t.setVaginal_infection(0);
			t.setSkin_infection(0);
			t.setDry_skin(0);
			t.setHigh_fever(0);
			t.setVision_loss(0);
			t.setHallucinations(0);
			t.setWeakness(0);
			t.setBack_pain(0);
			t.setA_stooped_posture(0);
			t.setEasily_broken_bones(0);
			t.setA_lump_on_the_neck(0);
			t.setChanged_voice(0);
			t.setDifficulty_swallowing(0);
			t.setThroat_pain(0);
			t.setKidney_stones(0);
			t.setAbdominal_pain(0);
			t.setDepression(0);
			t.setCramps_in_legs(0);
			t.setTwitching_muscles(0);
			t.setHair_loss(0);
			t.setBrittle_nails(0);
			t.setLow_sex_drive(0);
			t.setErectile_dysfunction(0);
			t.setLow_semen_volume(0);
			t.setLoss_of_muscle_mass(0);
			t.setIncreased_body_fat(0);
			t.setMood_changes(0);
			t.setAffected_memory(0);
			t.setLow_blood_counts(0);
			t.setIrregular_periods(0);
			t.setHot_flashes(0);
			t.setChills(0);
			t.setNight_sweats(0);
			t.setSleep_problems(0);
			t.setWeight_gain(0);
			t.setThinning_hair(0);
			t.setHyperpigmentation(0);
			t.setLow_blood_pressure(0);
			t.setSalt_craving(0);
			t.setHypoglycemia(0);
			t.setDiarrhea(0);
			t.setMuscle_pain(0);
			t.setIrritability(0);
			t.setBody_hair_loss(0);
			t.setStriae(0);
			t.setAnce(0);
			t.setDecreased_libido(0);
			t.setCognitive_difficulties(0);
			*/
			
			
			t.setDiabetes_type_1(1);
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
			t.setCushing_syndrome(0);
			

		
			
			query.setDescription(t);
			recommender.cycle(query);
			recommender.postCycle();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
		
}

