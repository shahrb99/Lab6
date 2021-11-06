package CentralizedHealthSystem;

import java.time.LocalDate;
import java.util.ArrayList;

public class Patient {

    private LocalDate birthday;
    private String gender;
    private String baseInsurance;
    private String supplementaryInsurance;
    private String degreeOfEducation;
    private String job;
    private String address;
    private String geographicalLocation;
    private ArrayList<TrustedDoctor> trustedDoctors;

    public void addDoctor(TrustedDoctor doctor) {

    }
}
