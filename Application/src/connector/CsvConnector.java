package connector;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Collection;
import java.util.LinkedList;

import cbr.Simptomi;
import cbr.StringListMapper;
import ucm.gaia.jcolibri.cbrcore.CBRCase;
import ucm.gaia.jcolibri.cbrcore.CaseBaseFilter;
import ucm.gaia.jcolibri.cbrcore.Connector;
import ucm.gaia.jcolibri.exception.InitializingException;
import ucm.gaia.jcolibri.util.FileIO;

public class CsvConnector implements Connector {
	
	@Override
	public Collection<CBRCase> retrieveAllCases() {
		LinkedList<CBRCase> cases = new LinkedList<CBRCase>();
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(FileIO.openFile("data/simptomii.csv")));
			if (br == null)
				throw new Exception("Error opening file");

			String line = "";
			while ((line = br.readLine()) != null) {
				if (line.startsWith("#") || (line.length() == 0))
					continue;
				String[] values = line.split(";");

				CBRCase cbrCase = new CBRCase();

				/*Pregled pregled = new Pregled();
				pregled.setDisease(values[0]);
				pregled.setHunger(Integer.parseInt(values[1]));
				pregled.setFatigue(Integer.parseInt(values[2]));
				pregled.setPeeing_more_often(Integer.parseInt(values[3]));
				pregled.setDry_mouth(Integer.parseInt(values[4]));
				pregled.setItchy_skin(Integer.parseInt(values[5]));
				pregled.setBlurred_vision(Integer.parseInt(values[6]));
				pregled.setWeight_loss(Integer.parseInt(values[7]));
				pregled.setNausea(Integer.parseInt(values[8]));
				pregled.setVomiting(Integer.parseInt(values[9]));
				pregled.setYeast_infections(Integer.parseInt(values[10]));
				pregled.setSlow_healing_sores_or_cuts(Integer.parseInt(values[11]));
				pregled.setPain_in_legs(Integer.parseInt(values[12]));
				pregled.setFast_heartbeat(Integer.parseInt(values[13]));
				pregled.setPale_skin(Integer.parseInt(values[14]));
				pregled.setHeadache(Integer.parseInt(values[15]));
				pregled.setNightmares(Integer.parseInt(values[16]));
				pregled.setCoordination_problems(Integer.parseInt(values[17]));
				pregled.setSeizures(Integer.parseInt(values[18]));
				pregled.setSweating(Integer.parseInt(values[19]));
				pregled.setHeavy_thirst(Integer.parseInt(values[20]));
				pregled.setTingling_feet(Integer.parseInt(values[21]));
				pregled.setSugar_in_urine(Integer.parseInt(values[22]));
				pregled.setVaginal_infection(Integer.parseInt(values[23]));
				pregled.setSkin_infection(Integer.parseInt(values[24]));
				pregled.setDry_skin(Integer.parseInt(values[25]));
				pregled.setHigh_fever(Integer.parseInt(values[26]));
				pregled.setVision_loss(Integer.parseInt(values[27]));
				pregled.setHallucinations(Integer.parseInt(values[28]));
				pregled.setWeakness(Integer.parseInt(values[29]));
				pregled.setBack_pain(Integer.parseInt(values[30]));
				pregled.setA_stooped_posture(Integer.parseInt(values[31]));
				pregled.setEasily_broken_bones(Integer.parseInt(values[32]));
				pregled.setA_lump_on_the_neck(Integer.parseInt(values[33]));
				pregled.setChanged_voice(Integer.parseInt(values[34]));
				pregled.setDifficulty_swallowing(Integer.parseInt(values[35]));
				pregled.setThroat_pain(Integer.parseInt(values[36]));
				pregled.setKidney_stones(Integer.parseInt(values[37]));
				pregled.setAbdominal_pain(Integer.parseInt(values[38]));
				pregled.setDepression(Integer.parseInt(values[39]));
				pregled.setCramps_in_legs(Integer.parseInt(values[40]));
				pregled.setTwitching_muscles(Integer.parseInt(values[41]));
				pregled.setHair_loss(Integer.parseInt(values[42]));
				pregled.setBrittle_nails(Integer.parseInt(values[43]));
				pregled.setLow_sex_drive(Integer.parseInt(values[44]));
				pregled.setErectile_dysfunction(Integer.parseInt(values[45]));
				pregled.setLow_semen_volume(Integer.parseInt(values[46]));
				pregled.setLoss_of_muscle_mass(Integer.parseInt(values[47]));
				pregled.setIncreased_body_fat(Integer.parseInt(values[48]));
				pregled.setMood_changes(Integer.parseInt(values[49]));
				pregled.setAffected_memory(Integer.parseInt(values[50]));
				pregled.setLow_blood_counts(Integer.parseInt(values[51]));
				pregled.setIrregular_periods(Integer.parseInt(values[52]));
				pregled.setHot_flashes(Integer.parseInt(values[53]));
				pregled.setChills(Integer.parseInt(values[54]));
				pregled.setNight_sweats(Integer.parseInt(values[55]));
				pregled.setSleep_problems(Integer.parseInt(values[56]));
				pregled.setWeight_gain(Integer.parseInt(values[57]));
				pregled.setThinning_hair(Integer.parseInt(values[58]));
				pregled.setHyperpigmentation(Integer.parseInt(values[59]));
				pregled.setLow_blood_pressure(Integer.parseInt(values[60]));
				pregled.setSalt_craving(Integer.parseInt(values[61]));
				pregled.setHypoglycemia(Integer.parseInt(values[62]));
				pregled.setDiarrhea(Integer.parseInt(values[63]));
				pregled.setMuscle_pain(Integer.parseInt(values[64]));
				pregled.setIrritability(Integer.parseInt(values[65]));
				pregled.setBody_hair_loss(Integer.parseInt(values[66]));
				pregled.setStriae(Integer.parseInt(values[67]));
				pregled.setAnce(Integer.parseInt(values[68]));
				pregled.setDecreased_libido(Integer.parseInt(values[69]));
				pregled.setCognitive_difficulties(Integer.parseInt(values[70]));
				*/
				
				Simptomi symptoms = new Simptomi();
				symptoms.setSimptomi(StringListMapper.toList(values[0]));
				
				cbrCase.setDescription(symptoms);
				cases.add(cbrCase);
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cases;
	}

	@Override
	public Collection<CBRCase> retrieveSomeCases(CaseBaseFilter arg0) {
		return null;
	}

	@Override
	public void storeCases(Collection<CBRCase> arg0) {
	}
	
	@Override
	public void close() {
	}

	@Override
	public void deleteCases(Collection<CBRCase> arg0) {
	}

	@Override
	public void initFromXMLfile(URL arg0) throws InitializingException {
	}

}
