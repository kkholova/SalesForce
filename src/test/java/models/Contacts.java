package models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Contacts {
    String phone;
    String mobile;
    String salutation;
    String firstName;
    String lastName;
    String email;
    String accountName;
    String title;
    String reportsTo;
    String mailingStreet;
    String otherStreet;
    String mailingCity;
    String mailingState;
    String otherCity;
    String otherState;
    String mailingZip;
    String mailingCountry;
    String otherZip;
    String otherCountry;
    String fax;
    String department;
    String homePhone;
    String otherPhone;
    String leadSource;
    String birthdate;
    String asstPhone;
    String assistant;
    String description;

}
