package edu.miu.SC489.ads.service.impl;

import edu.miu.SC489.ads.model.Surgery;
import edu.miu.SC489.ads.repository.SurgeryRepository;
import org.springframework.stereotype.Service;
import edu.miu.SC489.ads.service.SurgeryService;

import java.util.List;

@Service
public class SurgeryServiceImpl implements SurgeryService {

    private SurgeryRepository repo;

    public SurgeryServiceImpl(SurgeryRepository repo) {
        this.repo = repo;
    }

    @Override
    public void registerAll(List<Surgery> surgeries) {
        repo.saveAll(surgeries);
    }

    @Override
    public Surgery registerOne(Surgery surgery) {
        return repo.save(surgery);
    }
}
