package edu.miu.SC489.ads.dto.request;

import lombok.Data;

@Data
public class AddressResponse{
        private String city;
        private String state;
        private String zipCode;
        //@JsonBackReference
        //private PatientResponse patient;

}
