package edu.miu.SC489.ads.service;


import edu.miu.SC489.ads.dto.request.PatientRequest;
import edu.miu.SC489.ads.dto.response.PatientResponse;
import edu.miu.SC489.ads.model.Patient;

import java.util.List;

public interface PatientService {
    void registerAll(List<Patient> patients);

    Patient registerOne(Patient patient);

    List<PatientResponse> getAll();

    PatientResponse getOne(Integer id);

    PatientResponse register(PatientRequest request);

    PatientResponse update(PatientRequest patientRequest, Integer patientId);

    void delete(Integer patientId);

    List<PatientResponse> searchPatients(String searchString);

}
