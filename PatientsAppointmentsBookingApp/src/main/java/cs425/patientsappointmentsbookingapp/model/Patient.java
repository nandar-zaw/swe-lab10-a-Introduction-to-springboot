package cs425.patientsappointmentsbookingapp.model;

import lombok.*;
import org.json.JSONObject;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Patient {
    private int patientId;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private String mailingAddress;
    private LocalDate dateOfBirth;

    public int getAge(){
        return LocalDate.now().getYear() - dateOfBirth.getYear();
    }
    public JSONObject toJSON(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("Patient ID" , patientId);
        jsonObject.put("First Name" , firstName);
        jsonObject.put("Last Name" , lastName);
        jsonObject.put("Phone Number", phoneNumber);
        jsonObject.put("Email", email);
        jsonObject.put("Mailing Address", mailingAddress);
        jsonObject.put("Date Of Birth", dateOfBirth);

        return jsonObject;

    }

}
