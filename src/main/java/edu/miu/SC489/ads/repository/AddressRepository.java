package edu.miu.SC489.ads.repository;


import edu.miu.SC489.ads.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AddressRepository extends JpaRepository<Address, Integer> {

    @Query("SELECT a FROM Address a LEFT JOIN FETCH a.patient ORDER BY a.city DESC ")
    List<Address> findAllAddressesWithPatientsSortedByCity();
}
