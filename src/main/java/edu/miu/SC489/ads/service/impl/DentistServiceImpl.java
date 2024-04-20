package edu.miu.SC489.ads.service.impl;


import edu.miu.SC489.ads.model.Dentist;
import edu.miu.SC489.ads.repository.DentistRepository;
import edu.miu.SC489.ads.service.DentistService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DentistServiceImpl implements DentistService {

    private DentistRepository repo;

    public DentistServiceImpl(DentistRepository repo) {
        this.repo = repo;
    }

    @Override
    public Dentist registerOne(Dentist dentist) {
        return repo.save(dentist);
    }

    @Override
    public void registerAll(List<Dentist> dentists) {
        repo.saveAll(dentists);
    }
}
