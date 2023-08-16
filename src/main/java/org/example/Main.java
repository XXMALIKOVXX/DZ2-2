package org.example;

public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weightInkg = 98;
        double heightInMeters = 1.87;
        double bmi = service.calculate(heightInMeters,weightInkg);
        System.out.println("индекс массы=" + bmi);
    }
}