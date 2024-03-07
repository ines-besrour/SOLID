package com.directi.training.srp.exercise_refactored;

public class CarFormatter {
    
    public String getCarsNames(Car car)
    {
        StringBuilder sb = new StringBuilder();
            sb.append(car.getBrand());
            sb.append(" ");
            sb.append(car.getModel());
            sb.append(", ");
        return sb.substring(0, sb.length() - 2);
    }
}
