package edu.miu.SC489.ads.service;


import edu.miu.SC489.ads.dto.response.AddressPatientResponse;
import edu.miu.SC489.ads.model.Address;

import java.util.List;

public interface AddressService {

    Address register(Address address);
     void registerAll(List<Address> addresses);
    List<AddressPatientResponse> findAll();

    List<AddressPatientResponse> findAllWithPatient();


}
