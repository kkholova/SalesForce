package tests;

import com.github.javafaker.Faker;

public class CarFactory {
    public static Car get() {
        Faker faker = new Faker();
        return Car.builder()
                .model(faker.name().firstName())
                .make("Volvo")
                .maxSpeed(250)
                .build();

    }
}
