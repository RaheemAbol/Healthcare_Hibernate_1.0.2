package healthcarev3.repository;



import healthcarev3.model.Patient;

import java.util.List;

public interface PatientRepository {
    void save(Patient patient);
    Patient findById(int id);
    List<Patient> findAll();
    void update(Patient patient);
    void delete(int id);
}
