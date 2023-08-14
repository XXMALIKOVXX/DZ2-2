package org.example;

public class BmiService {
    public int calculate(double heightInMeters, int weightInKg) {
        double bmi = weightInkg / heightInMeters / heightInMeters;
        return (int) bmi;
    }

}
