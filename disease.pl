import('person.pl').

disease(diabetes_type_1,[hunger, fatigue, peeing_more_often, dry_mouth, itchy_skin, blurred_vision, weight_loss, nausea, vomiting]).
disease(diabetes_type_2,[hunger, fatigue, peeing_more_often, dry_mouth, itchy_skin, blurred_vision, yeast_infections, slow-healing_sores_or_cuts, pain_in_legs]).
disease(hypoglycemia,[fast_heartbeat, pale_skin, blurred_vision, headache, nightmares, coordination_problems, seizures]).
disease(hyperglycemia,[heavy_thirst, blurred_vision, peeing_more_often, hunger, tingling_feet, fatigue, sugar_in_urine, weight_loss, vaginal_infection, skin_infection, slow-healing_sores_or_cuts]).
disease(diabetic_coma,[dry_mouth, heavy_thirst, dry_skin, high_fever, sleepiness, vision_loss, hallucinations, weakness]).
disease(osteoporosis,[back_pain, weight_loss, a_stooped_posture, easily_broken_bones]).
disease(thyroid_cancer,[a_lump_on_the_neck, changed_voice, difficulty_swallowing, throat_pain, swollen_lymph_in_the_neck]).
disease(hyperparathyroidism,[easily_broken_bones, kidney_stones, peeing_more_often, abdominal_pain, weakness, depression, nausea, vomiting]).
disease(hypoparathyroidism,[tingling_fingertips_and_toes, cramps_in_legs, twitching_muscles, fatigue, hair_loss, dry_skin, brittle_nails]).
disease(low_testosterone,[low_sex_drive, erectile_dysfunction, low_semen_volume, hair_loss, fatigue, loss_of_muscle_mass, increased_body_fat, decreased_bone_mass, mood_changes, affected_memory, low_blood_counts]).
disease(menopause,[irregular_periods, vaginal_dryness, hot_flashes, chills, night_sweats, sleep_problems, mood_changes, weight_gain, thinning_hair, dry_skin]).
disease(addisons_disease,[fatigue, weight_loss, hyperpigmentation, low_blood_pressure, salt_craving, hypoglycemia, nausea, diarrhea, vomiting, abdominal_pain, muscle_pain, irritability, depression, body_hair_loss]).
disease(cushing_syndrome,[weight_gain, striae, thinning, slow_healing_sores_or_cuts, ance, decreased_libido, erectile_dysfunction, congnitive_difficulties, headache]).

%pregled svih bolesti
disease_name(B) :- disease(B, S).
disease_name(B, S) :- disease(B, S).

%ispis simptoma
symptoms(S) :- disease(B, S).

disease_name(P, diabetes_type_1) :- person_symptom(P, dry_mouth), person_symptom(P, hunger), person_symptom(P, vomiting).
disease_name(P, osteoporosis) :- person_symptom(P, back_pain), person_symptom(P, weight_loss), person_symptom(P, a_stooped_posture).


