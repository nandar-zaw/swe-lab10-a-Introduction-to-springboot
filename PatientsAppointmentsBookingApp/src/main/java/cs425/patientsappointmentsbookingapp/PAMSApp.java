package cs425.patientsappointmentsbookingapp;

import cs425.patientsappointmentsbookingapp.repository.PatientRepository;
import cs425.patientsappointmentsbookingapp.service.PatientService;
import cs425.patientsappointmentsbookingapp.util.ConvertListToJSON;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class PAMSApp implements CommandLineRunner {
    private final PatientService patientService;
    public PAMSApp(PatientService patientService) {
        this.patientService = patientService;
    }


    public static void main(String[] args) {
        SpringApplication.run(PAMSApp.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        var patientList = patientService.getAllPatients();
        String jsonData = ConvertListToJSON.convertListToJSON(patientList);
        System.out.println("Patient List in JSON format: " + jsonData);

    }
}
