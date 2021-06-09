package models;

import com.github.javafaker.Faker;

public class ContactsFactory {
    public static Contacts get(){
        Faker faker = new Faker();
        return Contacts.builder()
                .phone(faker.phoneNumber().phoneNumber())
                .mobile(faker.phoneNumber().cellPhone())
                .salutation("Mr.")
                .firstName(faker.name().firstName())
                .lastName(faker.name().lastName())
                .email(faker.internet().emailAddress())
                .accountName("Vlad")
                .title("BA")
                .reportsTo("Shona Wolff")
                .mailingStreet(faker.address().streetName())
                .otherStreet(faker.address().streetName())
                .mailingCity(faker.address().city())
                .mailingState(faker.address().state())
                .otherCity(faker.address().city())
                .otherState(faker.address().state())
                .mailingZip(faker.address().zipCode())
                .mailingCountry(faker.address().country())
                .otherZip(faker.address().zipCode())
                .otherCountry(faker.address().country())
                .fax(faker.phoneNumber().phoneNumber())
                .department("ProductStream")
                .homePhone(faker.phoneNumber().phoneNumber())
                .otherPhone(faker.phoneNumber().phoneNumber())
                .leadSource("Employee Referral")
                .birthdate("5/11/2002")
                .asstPhone(faker.phoneNumber().cellPhone())
                .assistant(faker.name().lastName())
                .description("Some text")

                .build();

    }
}



