package cs425.patientsappointmentsbookingapp.util;

import cs425.patientsappointmentsbookingapp.model.Patient;
import org.json.JSONArray;

import java.util.List;

public class ConvertListToJSON {
    public static String convertListToJSON(List<Patient> patients){
        JSONArray jsonArray = new JSONArray();
        patients.forEach(patient -> jsonArray.put(patient.toJSON()));
        return jsonArray.toString(2);
    }
}
