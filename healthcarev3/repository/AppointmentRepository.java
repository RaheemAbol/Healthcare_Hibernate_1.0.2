package healthcarev3.repository;



import healthcarev3.model.Appointment;

import java.util.List;

public interface AppointmentRepository {
    void save(Appointment appointment);
    Appointment findById(int id);
    List<Appointment> findAll();
    void update(Appointment appointment);
    void delete(int id);
}
