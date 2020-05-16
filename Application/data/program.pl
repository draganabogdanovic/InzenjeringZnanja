%sve u jedan strpati
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

additional_testing(X, thyroid_function_test) :- 
   person_symptom(X, tingling_fingertips_and_toes),
   person_symptom(X, back_pain).

additional_testing(X, oral_glucose_tolerance_test) :-  
   person_symptom(X, vomiting),
   person_symptom(X, hunger).


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


%additional_testing(X, OGTT) :- 
%   person_symptom(Y),
%   member(Y, X).

%za osobu x je uradjen test OGTT i utvrdjeno je da je njegova vrednost 210 sto nas dovodi do cinjenice da pacijent x ima dijabetes tipa 1
%vrednosti nisu tacne ovo je primer

diagnosis(X, diabetes_type_1) :- fasting_test(X, Y), Y = 110;
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

%moze ovako iz liste 
treatment(diabetes_type_1, [insulin_therapy, diet, exercise]).
treatment(diabetes_type_2, [insulin_therapy, metformin, sulfonylureas, meglitinides, thiayolidinediones, diet, exercise]).
treatment(hypoglycemia, [pure_glucose_tablets, pure_glucose_food, glucagon]).
treatment(hyperglycemia, [diet, exercise, insulin_therapy, fluid_replacement, electrolyte_replacment]).
treatment(diabetic_coma, [intravenous_fluids, insulin_threapy, potassium, sodium, phosphate, glucagon_injection]).
treatment(osteporosis, [alendronate, risedronate, ibandronate, zoledronic_acid]).
treatment(thyroid_cancer, [surgery, thyroid_hormone_drug, radioactive_iodine,radiation_therapy, chemotherapy, injecting_alcohol]).
treatment(hyperparathyroidism, [surgery,  calcimemetics, hormone_replacement, bisphosphonates]).
treatment(hypoparathyroidism, [calcium, vitamin_d, magnesium, thiayide_diuretics, parathyroid_hormone, diet, intravenous_infusion]).
treatment(low_testosterone, [diet, testosterone_replacement_drug, testosterone_replacement_gel, testosterone_injections]).
treatment(menopause, [hormone_therapy, vaginal_estrogen, antidepressants, gabapentin,clonidine]).
treatment(addisons_disease, [hydrocortisone, prednisone, methylprednisolone, fludrocortisone_acetate, intravenous_injections]).
treatment(cushing_syndrome, [surgery, reducing_corticosteroid_drug, radiation_therapy, mifepristone]).

%terapije za adisonovu bolest, pisanje pravila za terapije
hydrocortisone(X) :- addisons_disease(X).
