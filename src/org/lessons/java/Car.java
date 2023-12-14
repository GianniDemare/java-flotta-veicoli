package org.lessons.java;

import java.time.LocalDate;

public class Car extends Vehicle{
    // ATTRIBUTI
    private int numberOfPorts;

    // COSTRUTTORI

    public Car(String uniqueLicensePlateNumber, LocalDate yearOfEnrolment, int numberOfPorts) {
        super(uniqueLicensePlateNumber, yearOfEnrolment);
        this.numberOfPorts = numberOfPorts;
    }


    // GETTER E SETTER

    public int getNumberOfPorts() {
        return numberOfPorts;
    }

    public void setNumberOfPorts(int numberOfPorts) {
        this.numberOfPorts = numberOfPorts;
    }


    // METODI

    @Override
    public String toString() {
        return super.toString() + " Number of ports: " + numberOfPorts;
    }
}
