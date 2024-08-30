package healthcarev3.repository;




import healthcarev3.model.Doctor;

import java.util.List;

public interface DoctorRepository {
    void save(Doctor doctor);
    Doctor findById(int id);
    List<Doctor> findAll();
    void update(Doctor doctor);
    void delete(int id);
}
