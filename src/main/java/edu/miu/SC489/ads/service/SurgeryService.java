package edu.miu.SC489.ads.service;

import edu.miu.SC489.ads.model.Surgery;

import java.util.List;

public interface SurgeryService {

    void registerAll(List<Surgery> surgeries);

    Surgery registerOne(Surgery surgery);
}
