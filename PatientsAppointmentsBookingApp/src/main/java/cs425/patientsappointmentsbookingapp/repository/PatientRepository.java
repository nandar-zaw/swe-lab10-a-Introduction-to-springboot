package cs425.patientsappointmentsbookingapp.repository;

import cs425.patientsappointmentsbookingapp.model.Patient;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public class PatientRepository {
    private List<Patient> patients;

    public PatientRepository() {
        this.patients = null;
    }
    public void loadPatientsData(){
        patients  = List.of(new Patient[]{
                new Patient(1, "Daniel", "Agar", "(641) 123-0009", "dagar@m.as", "1 N Street", LocalDate.of(1987, 1, 19)),
                new Patient(2, "Ana", "Smith", null, "amsith@te.edu", null, LocalDate.of(1948, 12, 5)),
                new Patient(3, "Marcus", "Garvey", "(123) 292-0018", null, "4 East Ave", LocalDate.of(2001, 9, 18)),
                new Patient(4, "Jeff", "Goldbloom", "(999) 165-1192", "jgold@es.co.za", null, LocalDate.of(1995, 2, 28)),
                new Patient(5, "Mary", "Washington", null, null, "30 W Burlington", LocalDate.of(1932, 5, 31))
        });

    }
    public List<Patient> getAllPatients(){
        if(this.patients == null)
            loadPatientsData();
        return this.patients;
    }
}
