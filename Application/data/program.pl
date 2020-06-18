%sve u jedan strpati

symptoms(diabetes_type_1, hunger).
symptoms(diabetes_type_1, fatigue).
symptoms(diabetes_type_1, peeing_more_often).
symptoms(diabetes_type_1, dry_mouth).
symptoms(diabetes_type_1, weight_loss).
symptoms(diabetes_type_1, itchy_skin).
symptoms(diabetes_type_1, blurred_vision).
symptoms(diabetes_type_1, nausea).
symptoms(diabetes_type_1, vomiting).

symptoms(diabetes_type_2, hunger).
symptoms(diabetes_type_2, fatigue).
symptoms(diabetes_type_2, peeing_more_often).
symptoms(diabetes_type_2, dry_mouth).
symptoms(diabetes_type_2, itchy_skin).
symptoms(diabetes_type_2, blurred_vision).
symptoms(diabetes_type_2, yeast_infection).
symptoms(diabetes_type_2, slow-healing_sores_or_cuts).
symptoms(diabetes_type_2, pain_in_legs).

symptoms(hypoglycemia, fast_heartbeat).
symptoms(hypoglycemia, pale_skin).
symptoms(hypoglycemia, blured_vision).
symptoms(hypoglycemia, headache).
symptoms(hypoglycemia, nightmares).
symptoms(hypoglycemia, coordination_problems).
symptoms(hypoglycemia, seizures).
symptoms(hypoglycemia, sweating).

symptoms(hyperglycemia, heavy_thirst).
symptoms(hyperglycemia, blurred_vision).
symptoms(hyperglycemia, peeing_more_often).
symptoms(hyperglycemia, hunger).
symptoms(hyperglycemia, tingling_feet).
symptoms(hyperglycemia, fakigue).
symptoms(hyperglycemia, sugar_in_urine).
symptoms(hyperglycemia, weight_loss).
symptoms(hyperglycemia, vaginal_infection).
symptoms(hyperglycemia, skin_infection).
symptoms(hyperglycemia, slow_healing_sores_or_cuts).


symptoms(diabetic_coma, dry_mought).
symptoms(diabetic_coma, heavy_thirst).
symptoms(diabetic_coma, dry_skin).
symptoms(diabetic_coma, high_fever).
symptoms(diabetic_coma, vidion_loss).
symptoms(diabetic_coma, hallucinations).
symptoms(diabetic_coma, weakness).

symptoms(osteoporosis, pack_pain).
symptoms(osteoporosis, weight_loss).
symptoms(osteoporosis, a_stooped_posture).
symptoms(osteoporosis, easily_broken_bones).

symptoms(throid_cancer, a_lump_on_the_neck).
symptoms(throid_cancer, change_voice).
symptoms(throid_cancer, difficulty_swalloving).
symptoms(throid_cancer, throat_pain).

symptoms(hyperparathyroidism, easily_broken_bones).
symptoms(hyperparathyroidism, kidney_stones).
symptoms(hyperparathyroidism, peeing_more_often).
symptoms(hyperparathyroidism, abdominal_pain).
symptoms(hyperparathyroidism, weakness).
symptoms(hyperparathyroidism, depressions).
symptoms(hyperparathyroidism, nausea).
symptoms(hyperparathyroidism, vomiting).

symptoms(hypoparathyroidism, tingling_feet).
symptoms(hypoparathyroidism, cramps_in_legs).
symptoms(hypoparathyroidism, twitching_muscles).
symptoms(hypoparathyroidism, fatigue).
symptoms(hypoparathyroidism, hair_loss).
symptoms(hypoparathyroidism, dry_skin).
symptoms(hypoparathyroidism, brittle_nails).

symptoms(low_testosterone, low_sex_drive).
symptoms(low_testosterone, erectile_dysfunction).
symptoms(low_testosterone, low_semen_volume).
symptoms(low_testosterone, hair_loss).
symptoms(low_testosterone, fatigue).
symptoms(low_testosterone, loss_of_muscle_mass).
symptoms(low_testosterone, increased_body_fat).
symptoms(low_testosterone, mood_changes).
symptoms(low_testosterone, affected_memory).
symptoms(low_testosterone, low_blood_counts).

symptoms(menopause, irregular_periods).
symptoms(menopause, hot_flashes).
symptoms(menopause, chills).
symptoms(menopause, night_sweats).
symptoms(menopause, sleep_problems).
symptoms(menopause, mood_changes).
symptoms(menopause, weight_gain).
symptoms(menopause, thinning_hair).
symptoms(menopause, dry_skin).

symptoms(addisons_disease, fatigue).  
symptoms(addisons_disease, weight_loss).
symptoms(addisons_disease, hyperpigmentation).
symptoms(addisons_disease, low_blood_pressure).
symptoms(addisons_disease, salt_craving).
symptoms(addisons_disease, hypoglycemia).
symptoms(addisons_disease, nausea).
symptoms(addisons_disease, diarrhea).
symptoms(addisons_disease, vomiting).
symptoms(addisons_disease, abdominal_pain).
symptoms(addisons_disease, muscle_pain).
symptoms(addisons_disease, irritability).
symptoms(addisons_disease, body_hair_loss).

symptoms(cushing_syndrome, weight_gain).
symptoms(cushing_syndrome, striae).
symptoms(cushing_syndrome, slow_healing_sores_or_cuts).
symptoms(cushing_syndrome, ance).
symptoms(cushing_syndrome, decreased_libido).
symptoms(cushing_syndrome, erectile_dysfunction).
symptoms(cushing_syndrome, congnitive_difficulties).
symptoms(cushing_syndrome, headache).

test(diabetes_type_1, hemoglobin_a1c).
test(diabetes_type_1, random_blood_sugar_test).
test(diabetes_type_1, fasting_blood_sugar_test).
test(diabetes_type_1, autoantibodies_test).

test(diabetes_type_2, random_blood_sugar_test).
test(diabetes_type_2, fasting_blood_sugar_test).

test(hypoglycemia, random_blood_sugar_test).
test(hypoglycemia, fasting_blood_sugar_test).
test(hypoglycemia, fructosamine).

test(diabetic_coma, random_blood_sugar_test).

test(osteoporosis, bone_density_test).

test(thyroid_cancer, ultrasound).
test(tryroid_cancer, biopsy).

test(hyperparathyroidism, ultrasound).
test(hyperparathyroidism, calcium_level).
test(hyperparathyroidism, x_ray).
test(hyperparathyroidism, parathyroid_hormone_level).

test(hypoparathyroidism, calcium_level).
test(hypoparathyroidism, parathyroid_hormone_level).

test(low_testosterone, testosterone_level).

test(menopause, x).

test(addisons_disease, thyroid_function_test).
test(addisons_disease, ct).

test(cushing_syndrome, ct).


therapy(diabetes_type_1, insulin_therapy).
therapy(diabetes_type_1, diet).
therapy(diabetes_type_1, exercise).

therapy(diabetes_type_2, insulin_therapy).
therapy(diabetes_type_2, metformin).
therapy(diabetes_type_2, sulfonylureas).
therapy(diabetes_type_2, meglitinides).
therapy(diabetes_type_2, diet).
therapy(diabetes_type_2, exercise).
therapy(diabetes_type_2, thiayolidinediones).

therapy(hypoglycemia, pure_glucose_tablets).
therapy(hypoglycemia, pure_glucose_food).
therapy(hypoglycemia, glucagon).

therapy(hyperglycemia, diet).
therapy(hyperglycemia, exercise).
therapy(hyperglycemia, insulin_therapy).
therapy(hyperglycemia, fluid_replacement).
therapy(hyperglycemia, electrolyte_replacment).

therapy(diabetic_coma, intravenous_fluids).
therapy(diabetic_coma, insulin_therapy).
therapy(diabetic_coma, potassium).
therapy(diabetic_coma, sodium).
therapy(diabetic_coma, phosphate).
therapy(diabetic_coma, glucagon_injection).

therapy(osteporosis, alendronate).
therapy(osteporosis, risedronate).
therapy(osteporosis, ibandronate).
therapy(osteporosis, zoledronic_acid).

therapy(thyroid_cancer, surgery).
therapy(thyroid_cancer, thyroid_hormone_drug).
therapy(thyroid_cancer, radioactive_iodne).
therapy(thyroid_cancer, radiation_therapy).
therapy(thyroid_cancer, chemotherapy).
therapy(thyroid_cancer, injecting_alcohol).

therapy(hyperparathyroidism, surgery).
therapy(hyperparathyroidism, calcimemetics).
therapy(hyperparathyroidism, hormone_replacement).
therapy(hyperparathyroidism, bisphosphonates).

therapy(hypoparathyroidism, calcium).
therapy(hypoparathyroidism, vitamin_d).
therapy(hypoparathyroidism, magnesium).
therapy(hypoparathyroidism, thiayide_diuretics).
therapy(hypoparathyroidism, parathyroid_hormone).
therapy(hypoparathyroidism, diet).
therapy(hypoparathyroidism, intravenous_infusion).

therapy(low_testosterone, diet).
therapy(low_testosterone, testosterone_replacement_drug).
therapy(low_testosterone, testosterone_replacement_gel).
therapy(low_testosterone, testosterone_injection).

therapy(menopause, hormone_therapy).
therapy(menopause, vaginal_estrogen).
therapy(menopause, antidepressants).
therapy(menopause, gabapentin).
therapy(menopause, clonidine).

therapy(addisons_disease, hydrocortisone).
therapy(addisons_disease, prednisone).
therapy(addisons_disease, intravenous_injections).
therapy(addisons_disease, fludrocortisone_acetate).
therapy(addisons_disease, methylprednisolone).

therapy(cushing_syndrome, surgery).
therapy(cushing_syndrome, reducing_corticosteroid_drug).
therapy(cushing_syndrome, radiation_therapy).
therapy(cushing_syndrome, mifepristone).

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

additional_test(symptoms(X, S), hemoglobin_a1c) :-
    disease(diabetes_type_1, S2), contains(S2, S),  person__name(X).

additional_testing(X, random_blood_sugar_test) :- 
   disease(diabetes_type_1, S2), contains(S2, S),  person__name(X).
   
additional_testing(X, autoantibodies) :- 
   disease(diabetes_type_1, S2), contains(S2, S),  person__name(X).

additional_testing(X, fasting_blood_sugar_test) :- 
   disease(diabetes_type_1, S2), contains(S2, S),  person__name(X).

additional_testing(X, random_blood_sugar_test) :- 
   disease(diabetes_type_2, S2), contains(S2, S),  person__name(X).

additional_testing(X, fasting_blood_sugar_test) :- 
   disease(diabetes_type_2, S2), contains(S2, S),  person__name(X).

additional_testing(X, random_blood_sugar_test) :- 
   disease(hypoglycemia, S2), contains(S2, S),  person__name(X).

additional_testing(X, fasting_blood_sugar_test) :- 
   disease(hyperglycemia, S2), contains(S2, S),  person__name(X).

additional_testing(X, random_blood_sugar_test) :- 
   disease(diabetic_coma, S2), contains(S2, S),  person__name(X).

additional_testing(X, bone_density_test) :- 
   disease(osteoporosis, S2), contains(S2, S),  person__name(X).

additional_testing(X, ultrasound) :- 
   disease(thyroid_cancer, S2), contains(S2, S),  person__name(X).

additional_testing(X, biopsy) :- 
   disease(thyroid_cancer, S2), contains(S2, S),  person__name(X).

additional_testing(X, ultrasound) :- 
   disease(hyperparathyroidism, S2), contains(S2, S),  person__name(X).

additional_testing(X, calcium_level) :- 
   disease(hyperparathyroidism, S2), contains(S2, S),  person__name(X).

additional_testing(X, parathyroid_hormone_level) :- 
   disease(hyperparathyroidism, S2), contains(S2, S),  person__name(X).

additional_testing(X, calcium_level) :- 
   disease(hypoparathyroidism, S2), contains(S2, S),  person__name(X).

additional_testing(X, parathyroid_hormone_level) :- 
   disease(hypoparathyroidism, S2), contains(S2, S),  person__name(X).

additional_testing(X, testosterone_level) :- 
   disease(low_testosterone, S2), contains(S2, S),  person__name(X).

additional_testing(X, thyroid_function_test) :- 
   disease(addisons_disease, S2), contains(S2, S),  person__name(X).

additional_testing(X, ct) :- 
   disease(addisons_disease, S2), contains(S2, S),  person__name(X).

additional_testing(X, ct) :- 
   disease(cushing_syndrome, S2), contains(S2, S),  person__name(X).

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