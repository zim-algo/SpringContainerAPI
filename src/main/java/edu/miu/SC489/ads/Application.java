package edu.miu.SC489.ads;


import edu.miu.SC489.ads.model.Address;
import edu.miu.SC489.ads.model.Patient;
import edu.miu.SC489.ads.service.PatientService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.Arrays;

@SpringBootApplication
public class Application implements CommandLineRunner {
    private PatientService patientService;

    public Application(PatientService patientService) {
        this.patientService = patientService;
    }


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

            var address1 = new Address(null, "Fairfield", "Iowa", "52557",null);
            var address2 = new Address(null, "123 Main St", "California", "12345",null);
            var address3 = new Address(null, "456 Elm St", "Nevada", "67890",null);

           // Populate the attributes of patient
            var patient1 = new Patient(null, "Paul", "Gomes", "P10", "1234567890", "john.doe@example.com", LocalDate.of(1990, 5, 15), address1, null);
            var patient2 = new Patient(null, "Jane", "Smith", "P15", "0987654321", "jane.smith@example.com", LocalDate.of(1985, 9, 20), address2, null);
            var patient3 = new Patient(null, "Alice", "Johnson", "P20", "9876543210", "alice.johnson@example.com", LocalDate.of(1975, 3, 10), address3, null);
            patientService.registerAll(Arrays.asList(patient1,patient2,patient3));
    }
}
