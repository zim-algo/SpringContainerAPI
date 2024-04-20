package edu.miu.SC489.ads.repository;


import edu.miu.SC489.ads.model.Dentist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DentistRepository extends JpaRepository<Dentist, Integer> {
}
