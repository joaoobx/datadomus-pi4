package br.com.datadomus.modules.residents.usecases.updateresident.dtos;

import br.com.datadomus.modules.residents.entities.Resident;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateResidentResponseDTO {

    protected Long id;

    @JsonProperty("registration_date")
    protected String registrationDate;

    @JsonProperty("resident_name")
    protected String residentName;

    @JsonProperty("Apartment_number")
    protected Integer apartmentNumber;

    @JsonProperty("Telephone1")
    protected String telephone1;

    @JsonProperty("Telephone2")
    protected String telephone2;

    @JsonProperty("Email")
    protected String email;

    @JsonProperty("Observations")
    protected String observations;

    public UpdateResidentResponseDTO(Resident resident) {
        this.id = resident.getId();
        this.apartmentNumber = resident.getApartmentNumber();
        this.email = resident.getEmail();
        this.residentName =  resident.getResidentName();
        this.telephone1 = resident.getTelephone1();
        this.telephone2 = resident.getTelephone2();
        this.observations = resident.getObservations();
        this.registrationDate = resident.getRegistrationDate();
    }

}
