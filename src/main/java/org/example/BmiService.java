package org.example;

public class BmiService {
    public int calculate(int Height, int BodyMassa) {
        int bmi = (int) (BodyMassa / Math.pow (Height,2));
        return bmi;
    }

}
