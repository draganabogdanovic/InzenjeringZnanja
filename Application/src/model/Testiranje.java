package model;

import java.util.HashMap;

import ucm.gaia.jcolibri.cbrcore.Attribute;
import ucm.gaia.jcolibri.cbrcore.CaseComponent;


public class Testiranje implements CaseComponent{

		private int hunger, fatigue, peeing_more_often, dry_mouth, itchy_skin, blurred_vision, weight_loss, nausea,
		vomiting, yeast_infections, slow_healing_sores_or_cuts, pain_in_legs, fast_heartbeat, pale_skin, headache,
		nightmares, coordination_problems, seizures, sweating, heavy_thirst, tingling_feet, sugar_in_urine,
		vaginal_infection, skin_infection, dry_skin, high_fever, vision_loss, hallucinations, weakness, 
		back_pain, a_stooped_posture, easily_broken_bones, a_lump_on_the_neck, changed_voice, difficulty_swallowing,
		throat_pain, kidney_stones, abdominal_pain, depression, cramps_in_legs, twitching_muscles, hair_loss, 
		brittle_nails, low_sex_drive, erectile_dysfunction, low_semen_volume,
		loss_of_muscle_mass, increased_body_fat, mood_changes, affected_memory, low_blood_counts, 
		irregular_periods, hot_flashes, chills, night_sweats, sleep_problems, weight_gain, thinning_hair,
		hyperpigmentation, low_blood_pressure, salt_craving, hypoglycemia, diarrhea, muscle_pain, irritability, 
		body_hair_loss, striae, ance, decreased_libido, cognitive_difficulties;
	
	private String disease, testiranje;
	
	public Testiranje() {
	
	}
	
	public Testiranje(String t) {
	
	String[] values = t.split(";");
	this.disease = values[0];
	this.hunger = Integer.parseInt(values[1]);
	this.fatigue = Integer.parseInt(values[2]);
	this.peeing_more_often = Integer.parseInt(values[3]);
	this.dry_mouth = Integer.parseInt(values[4]);
	this.itchy_skin = Integer.parseInt(values[5]);
	this.blurred_vision = Integer.parseInt(values[6]);
	this.weight_loss = Integer.parseInt(values[7]);
	this.nausea = Integer.parseInt(values[8]);
	this.vomiting = Integer.parseInt(values[9]);
	this.yeast_infections = Integer.parseInt(values[10]);
	this.slow_healing_sores_or_cuts = Integer.parseInt(values[11]);
	this.pain_in_legs = Integer.parseInt(values[12]);
	this.fast_heartbeat = Integer.parseInt(values[13]);
	this.pale_skin = Integer.parseInt(values[14]);
	this.headache = Integer.parseInt(values[15]);
	this.nightmares = Integer.parseInt(values[16]);
	this.coordination_problems = Integer.parseInt(values[17]);
	this.seizures = Integer.parseInt(values[18]);
	this.sweating = Integer.parseInt(values[19]);
	this.heavy_thirst = Integer.parseInt(values[20]);
	this.tingling_feet = Integer.parseInt(values[21]);
	this.sugar_in_urine = Integer.parseInt(values[22]);
	this.vaginal_infection = Integer.parseInt(values[23]);
	this.skin_infection = Integer.parseInt(values[24]);
	this.dry_skin = Integer.parseInt(values[25]);
	this.high_fever = Integer.parseInt(values[26]);
	this.vision_loss = Integer.parseInt(values[27]);
	this.hallucinations = Integer.parseInt(values[28]);
	this.weakness = Integer.parseInt(values[29]);
	this.back_pain = Integer.parseInt(values[30]);
	this.a_stooped_posture = Integer.parseInt(values[31]);
	this.easily_broken_bones = Integer.parseInt(values[32]);
	this.a_lump_on_the_neck = Integer.parseInt(values[33]);
	this.changed_voice = Integer.parseInt(values[34]);
	this.difficulty_swallowing = Integer.parseInt(values[35]);
	this.throat_pain = Integer.parseInt(values[36]);
	this.kidney_stones = Integer.parseInt(values[37]);
	this.abdominal_pain = Integer.parseInt(values[38]);
	this.depression = Integer.parseInt(values[39]);
	this.cramps_in_legs = Integer.parseInt(values[40]);
	this.twitching_muscles = Integer.parseInt(values[41]);
	this.hair_loss = Integer.parseInt(values[42]);
	this.brittle_nails = Integer.parseInt(values[43]);
	this.low_sex_drive = Integer.parseInt(values[44]);
	this.erectile_dysfunction = Integer.parseInt(values[45]);
	this.low_semen_volume = Integer.parseInt(values[46]);
	this.loss_of_muscle_mass = Integer.parseInt(values[47]);
	this.increased_body_fat = Integer.parseInt(values[48]);
	this.mood_changes = Integer.parseInt(values[49]);
	this.affected_memory = Integer.parseInt(values[50]);
	this.low_blood_counts = Integer.parseInt(values[51]);
	this.irregular_periods = Integer.parseInt(values[52]);
	this.hot_flashes = Integer.parseInt(values[53]);
	this.chills = Integer.parseInt(values[54]);
	this.night_sweats = Integer.parseInt(values[55]);
	this.sleep_problems = Integer.parseInt(values[56]);
	this.weight_gain = Integer.parseInt(values[57]);
	this.thinning_hair = Integer.parseInt(values[58]);
	this.hyperpigmentation = Integer.parseInt(values[59]); 
	this.low_blood_pressure = Integer.parseInt(values[60]);
	this.salt_craving = Integer.parseInt(values[61]);
	this.hypoglycemia = Integer.parseInt(values[62]);
	this.diarrhea = Integer.parseInt(values[63]);
	this.muscle_pain = Integer.parseInt(values[64]);
	this.irritability = Integer.parseInt(values[65]);
	this.body_hair_loss = Integer.parseInt(values[66]);
	this.striae = Integer.parseInt(values[67]);
	this.ance = Integer.parseInt(values[68]);
	this.decreased_libido = Integer.parseInt(values[69]);
	this.cognitive_difficulties = Integer.parseInt(values[70]);	
	this.testiranje = values[71];
	}
	
	public Testiranje(HashMap<String, Integer> map, String testiranje) {
	
	this.testiranje = testiranje;
	this.hunger = map.get("hunger");
	this.fatigue = map.get("fatigue");
	this.peeing_more_often = map.get("peeing_more_often");
	this.dry_mouth = map.get("dry_mouth");
	this.itchy_skin = map.get("itchy_skin");
	this.blurred_vision = map.get("blurred_vision");
	this.weight_loss = map.get("weight_loss");
	this.nausea = map.get("nausea");
	this.vomiting = map.get("vomiting");
	this.yeast_infections = map.get("yeast_infections");
	this.slow_healing_sores_or_cuts = map.get("slow_healing_sores_or_cuts");
	this.pain_in_legs = map.get("pain_in_legs");
	this.fast_heartbeat = map.get("fast_heartbeat");
	this.pale_skin = map.get("pale_skin");
	this.headache = map.get("headache");
	this.nightmares = map.get("nightmares");
	this.coordination_problems = map.get("coordination_problems");
	this.seizures = map.get("seizures");
	this.sweating = map.get("sweating");
	this.heavy_thirst = map.get(heavy_thirst);
	this.tingling_feet = map.get("tingling_feet");
	this.sugar_in_urine = map.get("sugar_in_urine");
	this.vaginal_infection = map.get("vaginal_infection");
	this.skin_infection = map.get("skin_infection");
	this.dry_skin = map.get("dry_skin");
	this.high_fever = map.get("high_fever");
	this.vision_loss = map.get("vision_loss");
	this.hallucinations = map.get("hallucinations");
	this.weakness = map.get("weakness");
	this.back_pain = map.get("back_pain");
	this.a_stooped_posture = map.get("a_stooped_posture");
	this.easily_broken_bones = map.get("easily_broken_bones");
	this.a_lump_on_the_neck = map.get("a_lump_on_the_neck");
	this.changed_voice = map.get("changed_voice");
	this.difficulty_swallowing = map.get("difficulty_swallowing");
	this.throat_pain = map.get("throat_pain");
	this.kidney_stones = map.get("kidney_stones");
	this.abdominal_pain = map.get("abdominal_pain");
	this.depression = map.get("depression");
	this.cramps_in_legs = map.get("cramps_in_legs");
	this.twitching_muscles = map.get("twitching_muscles");
	this.hair_loss = map.get("hair_loss");
	this.brittle_nails = map.get("brittle_nails");
	this.low_sex_drive = map.get("low_sex_drive");
	this.erectile_dysfunction = map.get("erectile_dysfunction");
	this.low_semen_volume = map.get("low_semen_volume");
	this.loss_of_muscle_mass = map.get("loss_of_muscle_mass");
	this.increased_body_fat = map.get("increased_body_fat");
	this.mood_changes = map.get("mood_changes");
	this.affected_memory = map.get("affected_memory");
	this.low_blood_counts = map.get("low_blood_counts");
	this.irregular_periods = map.get("irregular_periods");
	this.hot_flashes = map.get("hot_flashes");
	this.chills = map.get("chills");
	this.night_sweats = map.get("night_sweats");
	this.sleep_problems = map.get("sleep_problems");
	this.weight_gain = map.get("weight_gain");
	this.thinning_hair = map.get("thinning_hair");
	this.hyperpigmentation = map.get("hyperpigmentation"); 
	this.low_blood_pressure = map.get("low_blood_pressure");
	this.salt_craving = map.get("salt_craving");
	this.hypoglycemia = map.get("hypoglycemia");
	this.diarrhea = map.get("diarrhea");
	this.muscle_pain = map.get("muscle_pain");
	this.irritability = map.get("irritability");
	this.body_hair_loss = map.get("body_hair_loss");
	this.striae = map.get("striae");
	this.ance = map.get("ance");
	this.decreased_libido = map.get("decreased_libido");
	this.cognitive_difficulties = map.get("cognitive_difficulties");
	}
	
	public int getHunger() {
	return hunger;
	}
	
	public void setHunger(int hunger) {
	this.hunger = hunger;
	}
	
	public int getFatigue() {
	return fatigue;
	}
	
	public void setFatigue(int fatigue) {
	this.fatigue = fatigue;
	}
	
	public int getPeeing_more_often() {
	return peeing_more_often;
	}
	
	public void setPeeing_more_often(int peeing_more_often) {
	this.peeing_more_often = peeing_more_often;
	}
	
	public int getDry_mouth() {
	return dry_mouth;
	}
	
	public void setDry_mouth(int dry_mouth) {
	this.dry_mouth = dry_mouth;
	}
	
	public int getItchy_skin() {
	return itchy_skin;
	}
	
	public void setItchy_skin(int itchy_skin) {
	this.itchy_skin = itchy_skin;
	}
	
	public int getBlurred_vision() {
	return blurred_vision;
	}
	
	public void setBlurred_vision(int blurred_vision) {
	this.blurred_vision = blurred_vision;
	}
	
	public int getWeight_loss() {
	return weight_loss;
	}
	
	public void setWeight_loss(int weight_loss) {
	this.weight_loss = weight_loss;
	}
	
	public int getNausea() {
	return nausea;
	}
	
	public void setNausea(int nausea) {
	this.nausea = nausea;
	}
	
	public int getVomiting() {
	return vomiting;
	}
	
	public void setVomiting(int vomiting) {
	this.vomiting = vomiting;
	}
	
	public int getYeast_infections() {
	return yeast_infections;
	}
	
	public void setYeast_infections(int yeast_infections) {
	this.yeast_infections = yeast_infections;
	}
	
	public int getSlow_healing_sores_or_cuts() {
	return slow_healing_sores_or_cuts;
	}
	
	public void setSlow_healing_sores_or_cuts(int slow_healing_sores_or_cuts) {
	this.slow_healing_sores_or_cuts = slow_healing_sores_or_cuts;
	}
	
	public int getPain_in_legs() {
	return pain_in_legs;
	}
	
	public void setPain_in_legs(int pain_in_legs) {
	this.pain_in_legs = pain_in_legs;
	}
	
	public int getFast_heartbeat() {
	return fast_heartbeat;
	}
	
	public void setFast_heartbeat(int fast_heartbeat) {
	this.fast_heartbeat = fast_heartbeat;
	}
	
	public int getPale_skin() {
	return pale_skin;
	}
	
	public void setPale_skin(int pale_skin) {
	this.pale_skin = pale_skin;
	}
	
	public int getHeadache() {
	return headache;
	}
	
	public void setHeadache(int headache) {
	this.headache = headache;
	}
	
	public int getNightmares() {
	return nightmares;
	}
	
	public void setNightmares(int nightmares) {
	this.nightmares = nightmares;
	}
	
	public int getCoordination_problems() {
	return coordination_problems;
	}
	
	public void setCoordination_problems(int coordination_problems) {
	this.coordination_problems = coordination_problems;
	}
	
	public int getSeizures() {
	return seizures;
	}
	
	public void setSeizures(int seizures) {
	this.seizures = seizures;
	}
	
	public int getSweating() {
	return sweating;
	}
	
	public void setSweating(int sweating) {
	this.sweating = sweating;
	}
	
	public int getHeavy_thirst() {
	return heavy_thirst;
	}
	
	public void setHeavy_thirst(int heavy_thirst) {
	this.heavy_thirst = heavy_thirst;
	}
	
	public int getTingling_feet() {
	return tingling_feet;
	}
	
	public void setTingling_feet(int tingling_feet) {
	this.tingling_feet = tingling_feet;
	}
	
	public int getSugar_in_urine() {
	return sugar_in_urine;
	}
	
	public void setSugar_in_urine(int sugar_in_urine) {
	this.sugar_in_urine = sugar_in_urine;
	}
	
	public int getVaginal_infection() {
	return vaginal_infection;
	}
	
	public void setVaginal_infection(int vaginal_infection) {
	this.vaginal_infection = vaginal_infection;
	}
	
	public int getSkin_infection() {
	return skin_infection;
	}
	
	public void setSkin_infection(int skin_infection) {
	this.skin_infection = skin_infection;
	}
	
	public int getDry_skin() {
	return dry_skin;
	}
	
	public void setDry_skin(int dry_skin) {
	this.dry_skin = dry_skin;
	}
	
	public int getHigh_fever() {
	return high_fever;
	}
	
	public void setHigh_fever(int high_fever) {
	this.high_fever = high_fever;
	}
	
	public int getVision_loss() {
	return vision_loss;
	}
	
	public void setVision_loss(int vision_loss) {
	this.vision_loss = vision_loss;
	}
	
	public int getHallucinations() {
	return hallucinations;
	}
	
	public void setHallucinations(int hallucinations) {
	this.hallucinations = hallucinations;
	}
	
	public int getWeakness() {
	return weakness;
	}
	
	public void setWeakness(int weakness) {
	this.weakness = weakness;
	}
	
	public int getBack_pain() {
	return back_pain;
	}
	
	public void setBack_pain(int back_pain) {
	this.back_pain = back_pain;
	}
	
	public int getA_stooped_posture() {
	return a_stooped_posture;
	}
	
	public void setA_stooped_posture(int a_stooped_posture) {
	this.a_stooped_posture = a_stooped_posture;
	}
	
	public int getEasily_broken_bones() {
	return easily_broken_bones;
	}
	
	public void setEasily_broken_bones(int easily_broken_bones) {
	this.easily_broken_bones = easily_broken_bones;
	}
	
	public int getA_lump_on_the_neck() {
	return a_lump_on_the_neck;
	}
	
	public void setA_lump_on_the_neck(int a_lump_on_the_neck) {
	this.a_lump_on_the_neck = a_lump_on_the_neck;
	}
	
	public int getChanged_voice() {
	return changed_voice;
	}
	
	public void setChanged_voice(int changed_voice) {
	this.changed_voice = changed_voice;
	}
	
	public int getDifficulty_swallowing() {
	return difficulty_swallowing;
	}
	
	public void setDifficulty_swallowing(int difficulty_swallowing) {
	this.difficulty_swallowing = difficulty_swallowing;
	}
	
	public int getThroat_pain() {
	return throat_pain;
	}
	
	public void setThroat_pain(int throat_pain) {
	this.throat_pain = throat_pain;
	}
	
	public int getKidney_stones() {
	return kidney_stones;
	}
	
	public void setKidney_stones(int kidney_stones) {
	this.kidney_stones = kidney_stones;
	}
	
	public int getAbdominal_pain() {
	return abdominal_pain;
	}
	
	public void setAbdominal_pain(int abdominal_pain) {
	this.abdominal_pain = abdominal_pain;
	}
	
	public int getDepression() {
	return depression;
	}
	
	public void setDepression(int depression) {
	this.depression = depression;
	}
	
	
	public int getCramps_in_legs() {
	return cramps_in_legs;
	}
	
	public void setCramps_in_legs(int cramps_in_legs) {
	this.cramps_in_legs = cramps_in_legs;
	}
	
	public int getTwitching_muscles() {
	return twitching_muscles;
	}
	
	public void setTwitching_muscles(int twitching_muscles) {
	this.twitching_muscles = twitching_muscles;
	}
	
	public int getHair_loss() {
	return hair_loss;
	}
	
	public void setHair_loss(int hair_loss) {
	this.hair_loss = hair_loss;
	}
	
	public int getBrittle_nails() {
	return brittle_nails;
	}
	
	public void setBrittle_nails(int brittle_nails) {
	this.brittle_nails = brittle_nails;
	}
	
	public int getLow_sex_drive() {
	return low_sex_drive;
	}
	
	public void setLow_sex_drive(int low_sex_drive) {
	this.low_sex_drive = low_sex_drive;
	}
	
	public int getErectile_dysfunction() {
	return erectile_dysfunction;
	}
	
	public void setErectile_dysfunction(int erectile_dysfunction) {
	this.erectile_dysfunction = erectile_dysfunction;
	}
	
	public int getLow_semen_volume() {
	return low_semen_volume;
	}
	
	public void setLow_semen_volume(int low_semen_volume) {
	this.low_semen_volume = low_semen_volume;
	}
	
	public int getLoss_of_muscle_mass() {
	return loss_of_muscle_mass;
	}
	
	public void setLoss_of_muscle_mass(int loss_of_muscle_mass) {
	this.loss_of_muscle_mass = loss_of_muscle_mass;
	}
	
	public int getIncreased_body_fat() {
	return increased_body_fat;
	}
	
	public void setIncreased_body_fat(int increased_body_fat) {
	this.increased_body_fat = increased_body_fat;
	}
	
	
	public int getMood_changes() {
	return mood_changes;
	}
	
	public void setMood_changes(int mood_changes) {
	this.mood_changes = mood_changes;
	}
	
	public int getAffected_memory() {
	return affected_memory;
	}
	
	public void setAffected_memory(int affected_memory) {
	this.affected_memory = affected_memory;
	}
	
	public int getLow_blood_counts() {
	return low_blood_counts;
	}
	
	public void setLow_blood_counts(int low_blood_counts) {
	this.low_blood_counts = low_blood_counts;
	}
	
	public int getIrregular_periods() {
	return irregular_periods;
	}
	
	public void setIrregular_periods(int irregular_periods) {
	this.irregular_periods = irregular_periods;
	}
	
	
	public int getHot_flashes() {
	return hot_flashes;
	}
	
	public void setHot_flashes(int hot_flashes) {
	this.hot_flashes = hot_flashes;
	}
	
	public int getChills() {
	return chills;
	}
	
	public void setChills(int chills) {
	this.chills = chills;
	}
	
	public int getNight_sweats() {
	return night_sweats;
	}
	
	public void setNight_sweats(int night_sweats) {
	this.night_sweats = night_sweats;
	}
	
	public int getSleep_problems() {
	return sleep_problems;
	}
	
	public void setSleep_problems(int sleep_problems) {
	this.sleep_problems = sleep_problems;
	}
	
	public int getWeight_gain() {
	return weight_gain;
	}
	
	public void setWeight_gain(int weight_gain) {
	this.weight_gain = weight_gain;
	}
	
	public int getThinning_hair() {
	return thinning_hair;
	}
	
	public void setThinning_hair(int thinning_hair) {
	this.thinning_hair = thinning_hair;
	}
	
	public int getHyperpigmentation() {
	return hyperpigmentation;
	}
	
	public void setHyperpigmentation(int hyperpigmentation) {
	this.hyperpigmentation = hyperpigmentation;
	}
	
	public int getLow_blood_pressure() {
	return low_blood_pressure;
	}
	
	public void setLow_blood_pressure(int low_blood_pressure) {
	this.low_blood_pressure = low_blood_pressure;
	}
	
	public int getSalt_craving() {
	return salt_craving;
	}
	
	public void setSalt_craving(int salt_craving) {
	this.salt_craving = salt_craving;
	}
	
	public int getHypoglycemia() {
	return hypoglycemia;
	}
	
	public void setHypoglycemia(int hypoglycemia) {
	this.hypoglycemia = hypoglycemia;
	}
	
	public int getDiarrhea() {
	return diarrhea;
	}
	
	public void setDiarrhea(int diarrhea) {
	this.diarrhea = diarrhea;
	}
	
	public int getMuscle_pain() {
	return muscle_pain;
	}
	
	public void setMuscle_pain(int muscle_pain) {
	this.muscle_pain = muscle_pain;
	}
	
	public int getIrritability() {
	return irritability;
	}
	
	public void setIrritability(int irritability) {
	this.irritability = irritability;
	}
	
	public int getBody_hair_loss() {
	return body_hair_loss;
	}
	
	public void setBody_hair_loss(int body_hair_loss) {
	this.body_hair_loss = body_hair_loss;
	}
	
	public int getStriae() {
	return striae;
	}
	
	public void setStriae(int striae) {
	this.striae = striae;
	}
	
	
	public int getAnce() {
	return ance;
	}
	
	public void setAnce(int ance) {
	this.ance = ance;
	}
	
	public int getDecreased_libido() {
	return decreased_libido;
	}
	
	public void setDecreased_libido(int decreased_libido) {
	this.decreased_libido = decreased_libido;
	}
	
	public int getCognitive_difficulties() {
	return cognitive_difficulties;
	}
	
	public void setCognitive_difficulties(int cognitive_difficulties) {
	this.cognitive_difficulties = cognitive_difficulties;
	}
	
	@Override
	public Attribute getIdAttribute() {
	// TODO Auto-generated method stub
	return null;
	}
	
	public String getBolest()	{
	return disease;
	}
	
	public void setBolest(String disease){
	this.disease = disease;
	}
	
	@Override
	public String toString(){
	return disease + " - " + testiranje;
	}
	
	public String getTestiranje(){
	return testiranje;
	} 
	
	public void setTestiranje(String testiranje){
	this.testiranje = testiranje;
	} 

}
