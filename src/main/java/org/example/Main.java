package org.example;

public class Main {
    public static void main(String[] args) {
        int weightInkg = 98;
        double heightInMeters = 1.87;
        BmiService service = new BmiService(weightInKg, heightInMeters);
        double bmi = service.calculate(weightInkg, heightInMeters);
        System.out.println("индекс массы=" + bmi);
    }
}