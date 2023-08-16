package org.example;

public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weightInkg = 98;
        int heightInMeters = (int) 1.87;
        double bmi = service.calculate(weightInkg, heightInMeters);
        System.out.println("индекс массы=" + bmi);
    }
}