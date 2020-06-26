disease1(diabetes_type_1, [weight_gain]).
disease1(diabetes_type_1, [itchy_skin]).
disease1(diabetes_type_1, [nausea]).
disease1(diabetes_type_1, [vomiting]).
disease1(diabetes_type_1, [blurred_vision]).
disease1(diabetes_type_1, [dry_mouth]).
disease1(diabetes_type_1, [peeing_more_often]).
disease1(diabetes_type_1, [fatigue]).
disease1(diabetes_type_1, [hunger]).

disease1(diabetes_type_2, [yeast_infection]).
disease1(diabetes_type_2, [slow_healing_sores_or_cuts]).
disease1(diabetes_type_2, [pain_in_legs]).
disease1(diabetes_type_2, [hunger]).
disease1(diabetes_type_2, [fatigue]).
disease1(diabetes_type_2, [peeing_more_often]).
disease1(diabetes_type_2, [dry_mouth]).
disease1(diabetes_type_2, [itchy_skin]).
disease1(diabetes_type_2, [blurred_vision]).


disease1(hypoglycemia, [fast_heartbeat]).
disease1(hypoglycemia, [pale_skin]).
disease1(hypoglycemia, [headache]).
disease1(hypoglycemia, [nightmares]).
disease1(hypoglycemia, [coordination_problems]).
disease1(hypoglycemia, [seizures]).
disease1(hypoglycemia, [sweating]).

disease1(hyperglycemia, [heavy_thirst]).
disease1(hyperglycemia, [blurred_vision]).
disease1(hyperglycemia, [peeing_more_often]).
disease1(hyperglycemia, [hunger]).
disease1(hyperglycemia, [tingling_feet]).
disease1(hyperglycemia, [fatigue]).
disease1(hyperglycemia, [sugar_in_urine]).
disease1(hyperglycemia, [weight_loss]).
disease1(hyperglycemia, [vaginal_infection]).
disease1(hyperglycemia, [skin_infection]).
disease1(hyperglycemia, [slow_healing_sores_or_cuts]).

disease1(diabetic_coma, [dry_mought]).
disease1(diabetic_coma, [heavy_thirst]).
disease1(diabetic_coma, [dry_skin]).
disease1(diabetic_coma, [high_fever]).
disease1(diabetic_coma, [vision_loss]).
disease1(diabetic_coma, [hallucinations]).
disease1(diabetic_coma, [weakness]).

disease1(osteoporosis, [back_pain]).
disease1(osteoporosis, [weight_loss]).
disease1(osteoporosis, [a_stooped_posture]).
disease1(osteoporosis, [easily_broken_bones]).

disease1(thyroid_cancer, [throat_pain]).
disease1(thyroid_cancer, [a_lump_on_the_neck]).
disease1(thyroid_cancer, [changed_voice]).
disease1(thyroid_cancer, [difficulty_swallowing]).

disease1(hyperparathyroidism, [easily_broken_bones]).
disease1(hyperparathyroidism, [kidney_stones]).
disease1(hyperparathyroidism, [peeing_more_often]).
disease1(hyperparathyroidism, [abdominal_pain]).
disease1(hyperparathyroidism, [weakness]).
disease1(hyperparathyroidism, [depression]).
disease1(hyperparathyroidism, [nausea]).
disease1(hyperparathyroidism, [vomiting]).

disease1(hypoparathyroidism, [tingling_feet]).
disease1(hypoparathyroidism, [cramps_in_legs]).
disease1(hypoparathyroidism, [twitching_muscles]).
disease1(hypoparathyroidism, [fatigue]).
disease1(hypoparathyroidism, [hair_loss]).
disease1(hypoparathyroidism, [dry_skin]).
disease1(hypoparathyroidism, [brittle_nails]).

disease1(low_testosterone, [low_sex_drive]).
disease1(low_testosterone, [erectile_dysfunction]).
disease1(low_testosterone, [low_semen_volume]).
disease1(low_testosterone, [hair_loss]).
disease1(low_testosterone, [fatigue]).
disease1(low_testosterone, [loss_of_muscle_mass]).
disease1(low_testosterone, [increased_body_fat]).
disease1(low_testosterone, [mood_changes]).
disease1(low_testosterone, [affected_memory]).
disease1(low_testosterone, [low_blood_counts]).

disease1(menopause, [irregular_periods]).
disease1(menopause, [hot_flashes]).
disease1(menopause, [chills]).
disease1(menopause, [night_sweats]).
disease1(menopause, [sleep_problems]).
disease1(menopause, [mood_changes]).
disease1(menopause, [weight_gain]).
disease1(menopause, [thinning_hair]).
disease1(menopause, [dry_skin]).

disease1(addisons_disease, [fatigue]).
disease1(addisons_disease, [weight_loss]).
disease1(addisons_disease, [hyperpigmentation]).
disease1(addisons_disease, [low_blood_pressure]).
disease1(addisons_disease, [salt_craving]).
disease1(addisons_disease, [hypoglycemia]).
disease1(addisons_disease, [nausea]).
disease1(addisons_disease, [diarrhea]).
disease1(addisons_disease, [vomiting]).
disease1(addisons_disease, [abdominal_pain]).
disease1(addisons_disease, [muscle_pain]).
disease1(addisons_disease, [irritability]).
disease1(addisons_disease, [body_hair_loss]).

disease1(cushing_syndrome, [weight_gain]).
disease1(cushing_syndrome, [striae]).
disease1(cushing_syndrome, [slow_healing_sores_or_cuts]).
disease1(cushing_syndrome, [ance]).
disease1(cushing_syndrome, [decreased_libido]).
disease1(cushing_syndrome, [erectile_dysfunction]).
disease1(cushing_syndrome, [congnitive_difficulties]).
disease1(cushing_syndrome, [headache]).

pronadji(S,B) :- disease1(B,S).

symptoms(diabetes_type_1, hunger, 88).
symptoms(diabetes_type_1, fatigue, 52).
symptoms(diabetes_type_1, peeing_more_often, 83).
symptoms(diabetes_type_1, dry_mouth, 72).
symptoms(diabetes_type_1, weight_gain, 67).
symptoms(diabetes_type_1, itchy_skin, 69).
symptoms(diabetes_type_1, blurred_vision, 71).
symptoms(diabetes_type_1, nausea, 22).
symptoms(diabetes_type_1, vomiting, 35).

symptoms(diabetes_type_2, hunger, 86).
symptoms(diabetes_type_2, fatigue, 52).
symptoms(diabetes_type_2, peeing_more_often, 83).
symptoms(diabetes_type_2, dry_mouth, 72).
symptoms(diabetes_type_2, itchy_skin, 44).
symptoms(diabetes_type_2, blurred_vision, 71).
symptoms(diabetes_type_2, yeast_infection, 74).
symptoms(diabetes_type_2, slow-healing_sores_or_cuts, 91).
symptoms(diabetes_type_2, pain_in_legs, 75).

symptoms(hypoglycemia, fast_heartbeat, 92).
symptoms(hypoglycemia, pale_skin, 88).
symptoms(hypoglycemia, blured_vision, 51).
symptoms(hypoglycemia, headache, 43).
symptoms(hypoglycemia, nightmares, 47).
symptoms(hypoglycemia, coordination_problems, 90).
symptoms(hypoglycemia, seizures, 94).
symptoms(hypoglycemia, sweating, 32).

symptoms(hyperglycemia, heavy_thirst, 55).
symptoms(hyperglycemia, blurred_vision, 43).
symptoms(hyperglycemia, peeing_more_often, 60).
symptoms(hyperglycemia, hunger, 51).
symptoms(hyperglycemia, tingling_feet, 87).
symptoms(hyperglycemia, fatigue, 40).
symptoms(hyperglycemia, sugar_in_urine, 89).
symptoms(hyperglycemia, weight_loss, 72).
symptoms(hyperglycemia, vaginal_infection, 63).
symptoms(hyperglycemia, skin_infection, 77).
symptoms(hyperglycemia, slow_healing_sores_or_cuts, 67).


symptoms(diabetic_coma, dry_mought, 32).
symptoms(diabetic_coma, heavy_thirst, 54).
symptoms(diabetic_coma, dry_skin, 66).
symptoms(diabetic_coma, high_fever, 95).
symptoms(diabetic_coma, vision_loss, 87).
symptoms(diabetic_coma, hallucinations, 79).
symptoms(diabetic_coma, weakness, 41).

symptoms(osteoporosis, back_pain, 89).
symptoms(osteoporosis, weight_loss, 54).
symptoms(osteoporosis, a_stooped_posture, 66).
symptoms(osteoporosis, easily_broken_bones, 85).

symptoms(thyroid_cancer, a_lump_on_the_neck, 95).
symptoms(thyroid_cancer, change_voice, 83).
symptoms(thyroid_cancer, difficulty_swallowing, 79).
symptoms(thyroid_cancer, throat_pain, 75).

symptoms(hyperparathyroidism, easily_broken_bones, 71).
symptoms(hyperparathyroidism, kidney_stones, 79).
symptoms(hyperparathyroidism, peeing_more_often, 35).
symptoms(hyperparathyroidism, abdominal_pain, 59).
symptoms(hyperparathyroidism, weakness, 46).
symptoms(hyperparathyroidism, depressions, 55).
symptoms(hyperparathyroidism, nausea, 49).
symptoms(hyperparathyroidism, vomiting, 33).

symptoms(hypoparathyroidism, tingling_feet, 74).
symptoms(hypoparathyroidism, cramps_in_legs, 81).
symptoms(hypoparathyroidism, twitching_muscles, 91).
symptoms(hypoparathyroidism, fatigue, 43).
symptoms(hypoparathyroidism, hair_loss, 69).
symptoms(hypoparathyroidism, dry_skin, 67).
symptoms(hypoparathyroidism, brittle_nails, 46).

symptoms(low_testosterone, low_sex_drive, 94).
symptoms(low_testosterone, erectile_dysfunction, 88).
symptoms(low_testosterone, low_semen_volume, 91).
symptoms_strong(low_testosterone, hair_loss, 76).
symptoms(low_testosterone, fatigue, 62).
symptoms(low_testosterone, loss_of_muscle_mass, 54).
symptoms(low_testosterone, increased_body_fat, 53).
symptoms(low_testosterone, mood_changes, 57).
symptoms(low_testosterone, affected_memory, 41).
symptoms(low_testosterone, low_blood_counts, 38).

symptoms(menopause, irregular_periods, 96).
symptoms(menopause, hot_flashes, 91).
symptoms(menopause, chills, 72).
symptoms(menopause, night_sweats, 55).
symptoms_strong(menopause, sleep_problems, 61).
symptoms(menopause, mood_changes, 69).
symptoms(menopause, weight_gain, 79).
symptoms(menopause, thinning_hair, 36).
symptoms(menopause, dry_skin, 42).

symptoms(addisons_disease, fatigue, 41).  
symptoms(addisons_disease, weight_loss, 69).
symptoms(addisons_disease, hyperpigmentation, 72).
symptoms(addisons_disease, low_blood_pressure, 82).
symptoms(addisons_disease, salt_craving, 91).
symptoms(addisons_disease, hypoglycemia, 84).
symptoms(addisons_disease, nausea, 55).
symptoms_strong(addisons_disease, diarrhea, 73).
symptoms(addisons_disease, vomiting, 39).
symptoms(addisons_disease, abdominal_pain, 46).
symptoms(addisons_disease, muscle_pain, 89).
symptoms(addisons_disease, irritability, 68).
symptoms(addisons_disease, body_hair_loss, 57).

symptoms(cushing_syndrome, weight_gain, 82).
symptoms(cushing_syndrome, striae, 75).
symptoms_strong(cushing_syndrome, slow_healing_sores_or_cuts, 42).
symptoms(cushing_syndrome, ance, 89).
symptoms(cushing_syndrome, decreased_libido, 76).
symptoms(cushing_syndrome, erectile_dysfunction, 68).
symptoms(cushing_syndrome, congnitive_difficulties, 76).
symptoms(cushing_syndrome, headache, 39).

test(diabetes_type_1, hemoglobin_a1c, 100).
test(diabetes_type_1, random_blood_sugar_test, 70).
test(diabetes_type_1, fasting_blood_sugar_test, 80).
test(diabetes_type_1, autoantibodies_test, 55).

test(diabetes_type_2, random_blood_sugar_test, 70).
test(diabetes_type_2, fasting_blood_sugar_test, 88).

test(hypoglycemia, random_blood_sugar_test, 70).
test(hypoglycemia, fasting_blood_sugar_test, 75).
test(hypoglycemia, fructosamine, 90).

test(diabetic_coma, random_blood_sugar_test, 86).

test(osteoporosis, bone_density_test, 98).

test(thyroid_cancer, ultrasound, 95).
test(tryroid_cancer, biopsy, 89).

test(hyperparathyroidism, ultrasound, 84).
test(hyperparathyroidism, calcium_level, 55).
test(hyperparathyroidism, x_ray, 86).
test(hyperparathyroidism, parathyroid_hormone_level, 67).

test(hypoparathyroidism, calcium_level, 71).
test(hypoparathyroidism, parathyroid_hormone_level, 79).

test(low_testosterone, testosterone_level, 98).

test(menopause, x, x).

test(addisons_disease, thyroid_function_test, 75).
test(addisons_disease, ct, 86).

test(cushing_syndrome, ct, 90).


therapy(diabetes_type_1, insulin_therapy, 98).
therapy(diabetes_type_1, diet, 91).
therapy(diabetes_type_1, exercise, 70).

therapy(diabetes_type_2, insulin_therapy, 92).
therapy(diabetes_type_2, metformin, 90).
therapy(diabetes_type_2, sulfonylureas, 77).
therapy(diabetes_type_2, meglitinides, 80).
therapy(diabetes_type_2, diet, 89).
therapy(diabetes_type_2, exercise, 60).
therapy(diabetes_type_2, thiayolidinediones, 65).

therapy(hypoglycemia, pure_glucose_tablets, 95).
therapy(hypoglycemia, pure_glucose_food, 90).
therapy(hypoglycemia, glucagon, 91).

therapy(hyperglycemia, diet, 60).
therapy(hyperglycemia, exercise, 50).
therapy(hyperglycemia, insulin_therapy, 65).
therapy(hyperglycemia, fluid_replacement, 90).
therapy(hyperglycemia, electrolyte_replacment, 75).

therapy(diabetic_coma, intravenous_fluids, 71).
therapy(diabetic_coma, insulin_therapy, 90).
therapy(diabetic_coma, potassium, 54).
therapy(diabetic_coma, sodium, 67).
therapy(diabetic_coma, phosphate, 83).
therapy(diabetic_coma, glucagon_injection, 85).

therapy(osteporosis, alendronate, 96).
therapy(osteporosis, risedronate, 85).
therapy(osteporosis, ibandronate, 68).
therapy(osteporosis, zoledronic_acid, 45).

therapy(thyroid_cancer, surgery, 90).
therapy(thyroid_cancer, thyroid_hormone_drug, 85).
therapy(thyroid_cancer, radioactive_iodne, 79).
therapy(thyroid_cancer, radiation_therapy, 82).
therapy(thyroid_cancer, chemotherapy, 92).
therapy(thyroid_cancer, injecting_alcohol, 63).

therapy(hyperparathyroidism, surgery, 95).
therapy(hyperparathyroidism, calcimemetics, 65).
therapy(hyperparathyroidism, hormone_replacement, 61).
therapy(hyperparathyroidism, bisphosphonates, 55).

therapy(hypoparathyroidism, calcium, 49).
therapy(hypoparathyroidism, vitamin_d, 41).
therapy(hypoparathyroidism, magnesium, 34).
therapy(hypoparathyroidism, thiayide_diuretics, 62).
therapy(hypoparathyroidism, parathyroid_hormone, 89).
therapy(hypoparathyroidism, diet, 67).
therapy(hypoparathyroidism, intravenous_infusion, 78).

therapy(low_testosterone, diet, 55).
therapy(low_testosterone, testosterone_replacement_drug, 90).
therapy(low_testosterone, testosterone_replacement_gel, 85).
therapy(low_testosterone, testosterone_injection, 87).

therapy(menopause, hormone_therapy, 63).
therapy(menopause, vaginal_estrogen, 72).
therapy(menopause, antidepressants, 55).
therapy(menopause, gabapentin, 42).
therapy(menopause, clonidine, 21).

therapy(addisons_disease, hydrocortisone, 41).
therapy(addisons_disease, prednisone, 32).
therapy(addisons_disease, intravenous_injections, 80).
therapy(addisons_disease, fludrocortisone_acetate, 83).
therapy(addisons_disease, methylprednisolone, 90).

therapy(cushing_syndrome, surgery, 92).
therapy(cushing_syndrome, reducing_corticosteroid_drug, 71).
therapy(cushing_syndrome, radiation_therapy, 88).
therapy(cushing_syndrome, mifepristone, 62).

additional_tests(hemoglobin_a1c, [diabetes_type_1]).
additional_tests(random_blood_sugar_test, [diabetes_type_1]).
additional_tests(autoantibodies, [diabetes_type_1]).
additional_tests(fasting_blood_sugar_test, [diabetes_type_1]).

additional_tests(random_blood_sugar_test, [diabetes_type_2]).
additional_tests(fasting_blood_sugar_test, [diabetes_type_2]).

additional_tests(random_blood_sugar_test, [hypoglycemia]).
additional_tests(fasting_blood_sugar_test, [hypoglycemia]).

additional_tests(random_blood_sugar_test, [hyperglycemia]).
additional_tests(fasting_blood_sugar_test, [hyperglycemia]).

additional_tests(random_blood_sugar_test, [diabetic_coma]).

additional_tests(bone_density_test, [osteoporosis]).

additional_tests(ultrasound, [thyroid_cancer]).
additional_tests(biopsy, [thyroid_cancer]).

additional_tests(ultrasound, [hyperparathyroidism]).
additional_tests(calcium_level, [hyperparathyroidism]).
additional_tests(parathyroid_hormone_level, [hyperparathyroidism]).

additional_tests(calcium_level, [hyporparathyroidism]).
additional_tests(parathyroid_hormone_level, [hyporparathyroidism]).

additional_tests(testosterone_level, [low_testosterone]).

additional_tests(thyroid_function_test, [addisons_disease]).
additional_tests(ct, [addisons_disease]).

additional_tests(ct, [cushing_syndrome]).

pronadjiIspitivanja(B,D) :- additional_tests(D,B).

person_name(ana).
person_name(ljubica).
person_name(milisav).
person_name(slavica).
person_neme(petar).

person_age(ana, 23).
person_age(ljubica,58).
person_age(milisav, 31).
person_age(slavica, 67).
person_age(petar, 21).

person_activity(ana, active).
person_activity(ljubica, inactive).
person_activity(misilav, active).
person_activity(slavica, active).
person_activity(petar, inactive).

%bolesti porodice
person_genetics(ana, [osteoporosis, diabetes_type_2]).
person_genetics(ljubica, [addisons_disease]).
person_genetics(milisav,[] ).
person_genetics(slavica, []).
person_genetics(petar,[diabetes_type_1]).

%dodala istoriju bolesti pacijenata
person_disease_history(ana, [hypoglycemia]).
person_disease_history(ljubica, [menopause]).
person_disease_history(milisav, []).
person_disease_history(slavica, [menopause]).
person_disease_history(petar, [diabetes_type_2]).


person_BMI(ana, 23).
person_BMI(ljubica, 29).
person_BMI(milisav, 19).
person_BMI(slavica, 25).
person_BMI(petar, 32).

person_proper_nutrition(ana, true).
person_proper_nutrition(ljubica, false).
person_proper_nutrition(milisav, true).
person_proper_nutrition(slavica, true).
person_proper_nutrition(petar, false).

person_stress_level(ana, low).
person_stress_level(ljubica, high).
person_stress_level(milisav, low).
person_stress_level(slavica, medium).
person_stress_level(petar, medium).

person_symptom(petar, dry_mouth).
person_symptom(ana, back_pain).
person_symptom(ana, weight_loss).
person_symptom(ana, a_stooped_posture).
person_symptom(petar, hunger).
person_symptom(petar, vomiting).

contains(S,[]).
contains(S,[H|T]) :- member(H,S), contains(S,T).

symptom(person_name, list_of_symptoms).

disease(diabetes_type_1,[hunger, fatigue, peeing_more_often, dry_mouth, itchy_skin, blurred_vision, weight_loss, nausea, vomiting]).
disease(diabetes_type_2,[hunger, fatigue, peeing_more_often, dry_mouth, itchy_skin, blurred_vision, yeast_infections, slow-healing_sores_or_cuts, pain_in_legs]).
disease(hypoglycemia,[fast_heartbeat, pale_skin, blurred_vision, headache, nightmares, coordination_problems, seizures, sweating]).
disease(hyperglycemia,[heavy_thirst, blurred_vision, peeing_more_often, hunger, tingling_feet, fatigue, sugar_in_urine, weight_loss, vaginal_infection, skin_infection, slow-healing_sores_or_cuts]).
disease(diabetic_coma,[dry_mouth, heavy_thirst, dry_skin, high_fever, vision_loss, hallucinations, weakness]).
disease(osteoporosis,[back_pain, weight_loss, a_stooped_posture, easily_broken_bones]).
disease(thyroid_cancer,[a_lump_on_the_neck, changed_voice, difficulty_swallowing, throat_pain]).
disease(hyperparathyroidism,[easily_broken_bones, kidney_stones, peeing_more_often, abdominal_pain, weakness, depression, nausea, vomiting]).
disease(hypoparathyroidism,[tingling_feet, cramps_in_legs, twitching_muscles, fatigue, hair_loss, dry_skin, brittle_nails]).
disease(low_testosterone,[low_sex_drive, erectile_dysfunction, low_semen_volume, hair_loss, fatigue, loss_of_muscle_mass, increased_body_fat, mood_changes, affected_memory, low_blood_counts]).
disease(menopause,[irregular_periods, hot_flashes, chills, night_sweats, sleep_problems, mood_changes, weight_gain, thinning_hair, dry_skin]).
disease(addisons_disease,[fatigue, weight_loss, hyperpigmentation, low_blood_pressure, salt_craving, hypoglycemia, nausea, diarrhea, vomiting, abdominal_pain, muscle_pain, irritability, body_hair_loss]).
disease(cushing_syndrome,[weight_gain, striae, slow_healing_sores_or_cuts, ance, decreased_libido, erectile_dysfunction, congnitive_difficulties, headache]).


%fasting test se radi kad se za osobu sumnja da ima dijabetes tipa 1
additional_testing(X, fasting_blood_sugar_test) :-  
   person_symptom(X, hunger),
   person_symptom(X, fatigue).

%dijabetes tip1
additional_testing(X, oral_glucose_tolerance_test) :-  
   person_symptom(X, hunger),
   person_symptom(X, fatigue).

%dijabetes tip1
additional_testing(X, random_plasma_glucose_test) :-  
   person_symptom(X, hunger),
   person_symptom(X, fatigue).

%dijabetes tip1
additional_testing(X, HbA1c_test) :-  
   person_symptom(X, hunger),
   person_symptom(X, fatigue).


%za osobu x je uradjen test OGTT i utvrdjeno je da je njegova vrednost 210 sto nas dovodi do cinjenice da pacijent x ima dijabetes tipa 1

%diagnosis(X, diabetes_type_1) :- hemoglobin_a1c(X, Y), Y > 6.5;
%                               random_blood_sugar_test(X, Y2), Y2 >200;
 %                               fasting_blood_sugar_test(X, Y3), Y3 > 126;
  %                              autoantibodies (X, Y4), Y4 = high.
								
diagnosis(X, osteoporosis) :- bone_density_test(X, Y), Y < -2.5.

diagnosis(X, hyperglycemia) :-random_blood_sugar_test(X, Y2), Y2 <70;
                                 fructosamine(X, Y3), Y3 > 175.



diagnosis(X, diabetes_type_1) :- fasting(X, Y), Y = 110;
                                 oral_glucose_tolerance_test(X, 210);
                                 random_test(X, 110);
                                 hb1ac(X, D), D = 200.
diagnosis(X, diabetes_type_2) :- fasting_test(X, Y), Y = 110;
                                 hb1ac(X, D), D = 210;
                                 oral_glucose_tolerance_test(X, 180);
                                 random_test(X, 90);
                                 two_hour_postprandial_test(X, S), S = high.

diagnosis(X, hyperglycemia) :- fasting_test(X, 300);
                               oral_glucose_tolerance_test(X, 160);
                               hb1ac(X, D), D = 100;
                               fructosamine_test(X, F), F = medium.
                 
diagnosis(X, hypoglycemia) :- the_72_hour_fast_test(X, high);
                              glucagon_tolerance_test(X, S), S = 3;
                              mixed_meal_testing(X, high);
                              continuous_glucose_monitoring(X, medium);
                              c_peptide_suppression_test(X, D), D = 20;
                              ct(X, high);
                              mri(X, medium);
                              transabdinomal_and_ednoscopic_ultrasonography(X, M), M = 20.

diagnosis(X, diabetic_coma) :- fasting_test(X, high);
                               hba1c(X, D), D = 300.

%blood test?
diagnosis(X, osteoporosis) :- dexa(X, high);
                              vfa(X, high);
                              qus(X, high);
                              qct(X, high);
                              mri(X, medium);
                              ct(X, medium).

diagnosis(X, thyroid_cancer) :- ultrasound(X, high);
                                fna(X, D), D = 100;
                                ct(X, high);
                                mri(X, high);
                                pet(X, high);
                                radioiodine_scan(X, medium);
                                chest_x_ray(X, high).

diagnosis(X, hyperparathyroidism) :- pth_level(X, S), S > 100;
                                     dexa(X, high);
                                     urine_test(X, medium);
                                     ultrasound(X, high);
                                     sestamibi_parathyroid_scan(X, medium).

diagnosis(X, hypoparathyroidism) :- pth_level(X, S), S < 100;
                                    dexa(X, high);
                                    urine_test(X, medium);
                                    ekg(X, D), D > 200.

diagnosis(X, low_testosterone) :- testosterone_level_test(X, M), M > 150;
                                  hormone_test(X, high);
                                  mri(X, high);
                                  ct(X, medium).
                                   
diagnosis(X, menopause) :- blood_test_fsh(X, S), S > 200;
                           blood_test_tsh(X, D), D > 150.

diagnosis(X, addisons_disease) :- acth_test(X, high);
                                  insulin_tolerance_test(X, M), M > 120;
                                  crh_test(X, high);
                                  ct(X, high);
                                  mri(X, medium).


diagnosis(X, cushings_syndrome) :- ufc(X, M), M > 200;
                                   lddst(X, high);
                                   late_night_salivary_cortisol_measurement(X, S), S > 220;
                                   bilateral_inferior_petrosal_sinus_sampling(X, high);
                                   midnight_serum_cortisol(X, medium);
                                   crh_test(X, medium);
                                   ct(X, high);
                                   mri(X, medium).

treatment1(insulin_therapy, [diabetes_type_1]).
treatment1(insulin_therapy, [diabetes_type_2]).
treatment1(insulin_therapy, [hyperglycemia]).
treatment1(insulin_therapy, [diabetic_coma]).
treatment1(diet, [diabetes_type_1]).
treatment1(diet, [diabetes_type_2]).
treatment1(diet, [hyperglycemia]).
treatment1(diet, [hypoparathyroidism]).
treatment1(diet, [low_testosterone]).
treatment1(exercise, [diabetes_type_1]).
treatment1(exercise, [diabetes_type_2]).
treatment1(exercise, [hyperglycemia]).
treatment1(metformin, [diabetes_type_2]).
treatment1(sulfonylureas, [diabetes_type_2]).
treatment1(meglitinides, [diabetes_type_2]).
treatment1(thiayolidinediones, [diabetes_type_2]).
treatment1(pure_glucose_tablets, [hypoglycemia]).
treatment1(pure_glucose_food, [hypoglycemia]).
treatment1(glucagon, [hypoglycemia]).
treatment1(glucagon, [diabetic_coma]).
treatment1(fluid_replacement, [hyperglycemia]).
treatment1(electrolyte_replacement, [hyperglycemia]).
treatment1(intravenous_fluids, [diabetic_coma]).
treatment1(intravenous_fluids, [hypoparathyroidism]).
treatment1(intravenous_fluids, [addisons_disease]).
treatment1(potassium, [diabetic_coma]).
treatment1(sodium, [diabetic_coma]).
treatment1(phosphate, [diabetic_coma]).
treatment1(alendronate, [osteporosis]).
treatment1(risedronate, [osteporosis]).
treatment1(ibandronate, [osteporosis]).
treatment1(zoledronic_acid, [osteporosis]).
treatment1(surgery, [thyroid_cancer]).
treatment1(surgery, [hyperparathyroidism]).
treatment1(surgery, [cushing_syndrome]).
treatment1(thyroid_hormone_drug, [thyroid_cancer]).
treatment1(radioactive_iodine, [thyroid_cancer]).
treatment1(radiation_therapy, [thyroid_cancer]).
treatment1(chemotherapy, [thyroid_cancer]).
treatment1(injecting_alcohol, [thyroid_cancer]).
treatment1(calcimemetics, [hyperparathyroidism]).
treatment1(hormone_replacement, [hyperparathyroidism]).
treatment1(bisphosphonates, [hyperparathyroidism]).
treatment1(calcium, [hypoparathyroidism]).
treatment1(vitamin_d, [hypoparathyroidism]).
treatment1(magnesium, [hypoparathyroidism]).
treatment1(thiayide_diuretics, [hypoparathyroidism]).
treatment1(parathyroid_hormone, [hypoparathyroidism]).
treatment1(testosterone_replacement_drug, [low_testosterone]).
treatment1(testosterone_replacement_gel, [low_testosterone]).
treatment1(testosterone_injections, [low_testosterone]).
treatment1(hormone_therapy, [menopause]).
treatment1(vaginal_estrogen, [menopause]).
treatment1(antidepressants, [menopause]).
treatment1(gabapentin, [menopause]).
treatment1(clonidine, [menopause]).
treatment1(hydrocortisone, [addisons_disease]).
treatment1(prednisone, [addisons_disease]).
treatment1(methylprednisolone, [addisons_disease]).
treatment1(fludrocortisone_acetate, [addisons_disease]).
treatment1(reducing_corticosteroid_drug, [cushing_syndrome]).
treatment1(radiation_therapy, [cushing_syndrome]).
treatment1(mifepristone, [cushing_syndrome]).

pronadjiLekove(B,T) :- treatment1(T,B).