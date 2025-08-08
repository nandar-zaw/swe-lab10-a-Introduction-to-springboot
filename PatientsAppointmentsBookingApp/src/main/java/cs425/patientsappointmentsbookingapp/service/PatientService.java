package cs425.patientsappointmentsbookingapp.service;

import cs425.patientsappointmentsbookingapp.model.Patient;
import cs425.patientsappointmentsbookingapp.repository.PatientRepository;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
public class PatientService {
    private final PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }
    public List<Patient> getAllPatients(){
        return patientRepository.getAllPatients()
                .stream().
                sorted(Comparator.comparing(Patient::getAge).reversed()).toList();
    }
}
