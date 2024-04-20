package edu.miu.SC489.ads.service;


import edu.miu.SC489.ads.model.Dentist;

import java.util.List;

public interface DentistService {

    Dentist registerOne(Dentist dentist);

    void registerAll(List<Dentist> dentists);
}
