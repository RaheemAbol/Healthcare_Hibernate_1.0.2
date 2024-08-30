package healthcarev3.service;



import healthcarev3.model.Patient;
import healthcarev3.repository.PatientRepository;

import java.util.List;

public class PatientService {

    private PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public void createPatient(Patient patient) {
        patientRepository.save(patient);
    }

    public Patient getPatientById(int id) {
        return patientRepository.findById(id);
    }

    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    public void updatePatient(Patient patient) {
        patientRepository.update(patient);
    }

    public void deletePatient(int id) {
        patientRepository.delete(id);
    }
}
