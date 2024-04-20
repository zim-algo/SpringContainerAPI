package edu.miu.SC489.ads.service;

import edu.miu.SC489.ads.model.Appointment;

import java.util.List;

public interface AppointmentService {

    void registerAll(List<Appointment> appointments);

    List<Appointment> getAll();
}
