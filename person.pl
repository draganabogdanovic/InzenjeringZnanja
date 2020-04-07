%import('disease.pl').

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

person_genetics(ana, [osteoporosis, diabetes_type_2]).
person_genetics(ljubica, [addisons_disease]).
person_genetics(milisav,[] ).
person_genetics(slavica, []).
person_genetics(petar,[diabetes_type_1]).

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



