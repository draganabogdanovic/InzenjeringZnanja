package cbrApp;

import java.util.Collection;

import connector.CsvConnectoreTestiranje;
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

public class CbrTestiranje implements StandardCBRApplication{
	
	Connector _connector;  /** Connector object */
	CBRCaseBase _caseBase;  /** CaseBase object */

	NNConfig simConfig;  /** KNN configuration */

	@Override
	public void configure() throws ExecutionException {
		// TODO Auto-generated method stub
		
		_connector = new CsvConnectoreTestiranje();

		_caseBase = new LinealCaseBase(); // Create a Lineal case base for in-memory organization

		simConfig = new NNConfig(); // KNN configuration
		simConfig.setDescriptionSimFunction(new Average()); // global similarity function = average
		
		//simConfig.addMapping(new Attribute("disease", Testiranje.class), new Equal());
		
		simConfig.addMapping(new Attribute("hunger", Testiranje.class), new Equal());
		simConfig.addMapping(new Attribute("fatigue", Testiranje.class), new Equal());
		simConfig.addMapping(new Attribute("peeing_more_often", Testiranje.class), new Equal());
		simConfig.addMapping(new Attribute("dry_mouth", Testiranje.class), new Equal());
		simConfig.addMapping(new Attribute("itchy_skin", Testiranje.class), new Equal());
		simConfig.addMapping(new Attribute("blurred_vision", Testiranje.class), new Equal());
		simConfig.addMapping(new Attribute("weight_loss", Testiranje.class), new Equal());
		simConfig.addMapping(new Attribute("nausea", Testiranje.class), new Equal());
		simConfig.addMapping(new Attribute("vomiting", Testiranje.class), new Equal());
		simConfig.addMapping(new Attribute("yeast_infections", Testiranje.class), new Equal());
		simConfig.addMapping(new Attribute("slow_healing_sores_or_cuts", Testiranje.class), new Equal());
		simConfig.addMapping(new Attribute("pain_in_legs", Testiranje.class), new Equal());
		simConfig.addMapping(new Attribute("fast_heartbeat", Testiranje.class), new Equal());
		simConfig.addMapping(new Attribute("pale_skin", Testiranje.class), new Equal());
		simConfig.addMapping(new Attribute("headache", Testiranje.class), new Equal());
		simConfig.addMapping(new Attribute("nightmares", Testiranje.class), new Equal());
		simConfig.addMapping(new Attribute("coordination_problems", Testiranje.class), new Equal());
		simConfig.addMapping(new Attribute("seizures", Testiranje.class), new Equal());
		simConfig.addMapping(new Attribute("sweating", Testiranje.class), new Equal());
		simConfig.addMapping(new Attribute("heavy_thirst", Testiranje.class), new Equal());
		simConfig.addMapping(new Attribute("tingling_feet", Testiranje.class), new Equal());
		simConfig.addMapping(new Attribute("sugar_in_urine", Testiranje.class), new Equal());
		simConfig.addMapping(new Attribute("vaginal_infection", Testiranje.class), new Equal());
		simConfig.addMapping(new Attribute("skin_infection", Testiranje.class), new Equal());
		simConfig.addMapping(new Attribute("dry_skin", Testiranje.class), new Equal());
		simConfig.addMapping(new Attribute("high_fever", Testiranje.class), new Equal());
		simConfig.addMapping(new Attribute("vision_loss", Testiranje.class), new Equal());
		simConfig.addMapping(new Attribute("hallucinations", Testiranje.class), new Equal());
		simConfig.addMapping(new Attribute("weakness", Testiranje.class), new Equal());
		simConfig.addMapping(new Attribute("back_pain", Testiranje.class), new Equal());
		simConfig.addMapping(new Attribute("a_stooped_posture", Testiranje.class), new Equal());
		simConfig.addMapping(new Attribute("easily_broken_bones", Testiranje.class), new Equal());
		simConfig.addMapping(new Attribute("a_lump_on_the_neck", Testiranje.class), new Equal());
		simConfig.addMapping(new Attribute("changed_voice", Testiranje.class), new Equal());
		simConfig.addMapping(new Attribute("difficulty_swallowing", Testiranje.class), new Equal());
		simConfig.addMapping(new Attribute("throat_pain", Testiranje.class), new Equal());
		simConfig.addMapping(new Attribute("kidney_stones", Testiranje.class), new Equal());
		simConfig.addMapping(new Attribute("abdominal_pain", Testiranje.class), new Equal());
		simConfig.addMapping(new Attribute("depression", Testiranje.class), new Equal());
		simConfig.addMapping(new Attribute("cramps_in_legs", Testiranje.class), new Equal());
		simConfig.addMapping(new Attribute("twitching_muscles", Testiranje.class), new Equal());
		simConfig.addMapping(new Attribute("hair_loss", Testiranje.class), new Equal());
		simConfig.addMapping(new Attribute("brittle_nails", Testiranje.class), new Equal());
		simConfig.addMapping(new Attribute("low_sex_drive", Testiranje.class), new Equal());
		simConfig.addMapping(new Attribute("erectile_dysfunction", Testiranje.class), new Equal());
		simConfig.addMapping(new Attribute("low_semen_volume", Testiranje.class), new Equal());
		simConfig.addMapping(new Attribute("loss_of_muscle_mass", Testiranje.class), new Equal());
		simConfig.addMapping(new Attribute("increased_body_fat", Testiranje.class), new Equal());
		simConfig.addMapping(new Attribute("mood_changes", Testiranje.class), new Equal());
		simConfig.addMapping(new Attribute("affected_memory", Testiranje.class), new Equal());
		simConfig.addMapping(new Attribute("low_blood_counts", Testiranje.class), new Equal());
		simConfig.addMapping(new Attribute("irregular_periods", Testiranje.class), new Equal());
		simConfig.addMapping(new Attribute("hot_flashes", Testiranje.class), new Equal());
		simConfig.addMapping(new Attribute("chills", Testiranje.class), new Equal());
		simConfig.addMapping(new Attribute("night_sweats", Testiranje.class), new Equal());
		simConfig.addMapping(new Attribute("sleep_problems", Testiranje.class), new Equal());
		simConfig.addMapping(new Attribute("weight_gain", Testiranje.class), new Equal());
		simConfig.addMapping(new Attribute("thinning_hair", Testiranje.class), new Equal());
		simConfig.addMapping(new Attribute("hyperpigmentation", Testiranje.class), new Equal());
		simConfig.addMapping(new Attribute("low_blood_pressure", Testiranje.class), new Equal());
		simConfig.addMapping(new Attribute("salt_craving", Testiranje.class), new Equal());
		simConfig.addMapping(new Attribute("hypoglycemia", Testiranje.class), new Equal());
		simConfig.addMapping(new Attribute("diarrhea", Testiranje.class), new Equal());
		simConfig.addMapping(new Attribute("muscle_pain", Testiranje.class), new Equal());
		simConfig.addMapping(new Attribute("irritability", Testiranje.class), new Equal());
		simConfig.addMapping(new Attribute("body_hair_loss", Testiranje.class), new Equal());
		simConfig.addMapping(new Attribute("striae", Testiranje.class), new Equal());
		simConfig.addMapping(new Attribute("ance", Testiranje.class), new Equal());
		simConfig.addMapping(new Attribute("decreased_libido", Testiranje.class), new Equal());
		simConfig.addMapping(new Attribute("cognitive_difficulties", Testiranje.class), new Equal());
		
	}

	@Override
	public void cycle(CBRQuery query) throws ExecutionException {
		// TODO Auto-generated method stub
		
		Collection<RetrievalResult> eval = NNScoringMethod.evaluateSimilarity(_caseBase.getCases(), query, simConfig);
		eval = SelectCases.selectTopKRR(eval, 4);
		System.out.println("Retrieved cases:");
		for (RetrievalResult nse : eval)
			System.out.println(nse.get_case().getDescription() + " -> " + nse.getEval());
		
	}

	@Override
	public void postCycle() throws ExecutionException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CBRCaseBase preCycle() throws ExecutionException {
		// TODO Auto-generated method stub
		
		_caseBase.init(_connector);
		java.util.Collection<CBRCase> cases = _caseBase.getCases();
		/*
		 * for (CBRCase c : cases) /System.out.println(c.getDescription());
		 */
		return _caseBase;
	}
	
	public static void main(String[] args) {
		StandardCBRApplication recommender = new CbrTestiranje();
		
		try {
			recommender.configure();

			recommender.preCycle();

			CBRQuery query = new CBRQuery();
			
		
			Testiranje testiranje = new Testiranje();
			testiranje.setHunger(1);
			testiranje.setFatigue(1);
			testiranje.setPeeing_more_often(1);
			testiranje.setDry_mouth(1);
			testiranje.setItchy_skin(1);
			testiranje.setBlurred_vision(1);
			testiranje.setWeight_loss(0);
			testiranje.setNausea(0);
			testiranje.setVomiting(1);
			testiranje.setYeast_infections(0);
			testiranje.setSlow_healing_sores_or_cuts(0);
			testiranje.setPain_in_legs(0);
			testiranje.setFast_heartbeat(0);
			testiranje.setPale_skin(0);
			testiranje.setHeadache(0);
			testiranje.setNightmares(0);
			testiranje.setCoordination_problems(0);
			testiranje.setSeizures(0);
			testiranje.setSweating(0);
			testiranje.setHeavy_thirst(0);
			testiranje.setTingling_feet(0);
			testiranje.setSugar_in_urine(1);
			testiranje.setVaginal_infection(0);
			testiranje.setSkin_infection(0);
			testiranje.setDry_skin(0);
			testiranje.setHigh_fever(0);
			testiranje.setVision_loss(0);
			testiranje.setHallucinations(0);
			testiranje.setWeakness(0);
			testiranje.setBack_pain(0);
			testiranje.setA_stooped_posture(0);
			testiranje.setEasily_broken_bones(0);
			testiranje.setA_lump_on_the_neck(0);
			testiranje.setChanged_voice(0);
			testiranje.setDifficulty_swallowing(0);
			testiranje.setThroat_pain(0);
			testiranje.setKidney_stones(0);
			testiranje.setAbdominal_pain(0);
			testiranje.setDepression(0);
			testiranje.setCramps_in_legs(0);
			testiranje.setTwitching_muscles(0);
			testiranje.setHair_loss(0);
			testiranje.setBrittle_nails(0);
			testiranje.setLow_sex_drive(0);
			testiranje.setErectile_dysfunction(0);
			testiranje.setLow_semen_volume(0);
			testiranje.setLoss_of_muscle_mass(0);
			testiranje.setIncreased_body_fat(0);
			testiranje.setMood_changes(0);
			testiranje.setAffected_memory(0);
			testiranje.setLow_blood_counts(0);
			testiranje.setIrregular_periods(0);
			testiranje.setHot_flashes(0);
			testiranje.setChills(0);
			testiranje.setNight_sweats(0);
			testiranje.setSleep_problems(0);
			testiranje.setWeight_gain(0);
			testiranje.setThinning_hair(0);
			testiranje.setHyperpigmentation(0);
			testiranje.setLow_blood_pressure(0);
			testiranje.setSalt_craving(0);
			testiranje.setHypoglycemia(0);
			testiranje.setDiarrhea(0);
			testiranje.setMuscle_pain(0);
			testiranje.setIrritability(0);
			testiranje.setBody_hair_loss(0);
			testiranje.setStriae(0);
			testiranje.setAnce(0);
			testiranje.setDecreased_libido(0);
			testiranje.setCognitive_difficulties(0);
			
		    query.setDescription(testiranje);
			
			recommender.cycle(query);

			recommender.postCycle();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
