package edu.miu.SC489.ads.repository;


import edu.miu.SC489.ads.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Integer> {

}
