package edu.miu.SC489.ads.repository;


import edu.miu.SC489.ads.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PatientRepository extends JpaRepository<Patient, Integer> {

    @Query("SELECT p FROM Patient p WHERE p.firstName LIKE %:searchString% OR p.lastName LIKE %:searchString%")
    List<Patient> searchPatients(@Param("searchString") String searchString);

    //Patient findByAddress_Id(Integer idAddress);
}
