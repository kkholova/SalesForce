package tests;

import lombok.*;

import java.util.Objects;

@Data
@Builder
public class Car {
    String make;
    String model;
    int maxSpeed;

}
