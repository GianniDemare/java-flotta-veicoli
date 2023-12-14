package org.lessons.java;

import java.time.LocalDate;

public abstract class Vehicle {
    // ATTRIBUTI
    private String uniqueLicensePlateNumber;
    private LocalDate yearOfEnrolment;

    // COSTRUTTORI

    public Vehicle(String uniqueLicensePlateNumber, LocalDate yearOfEnrolment) {
        this.uniqueLicensePlateNumber = uniqueLicensePlateNumber;
        this.yearOfEnrolment = yearOfEnrolment;
    }


    // GETTER E SETTER

    public String getUniqueLicensePlateNumber() {
        return uniqueLicensePlateNumber;
    }

    public void setUniqueLicensePlateNumber(String uniqueLicensePlateNumber) {
        this.uniqueLicensePlateNumber = uniqueLicensePlateNumber;
    }

    public LocalDate getYearOfEnrolment() {
        return yearOfEnrolment;
    }

    public void setYearOfEnrolment(LocalDate yearOfEnrolment) {
        this.yearOfEnrolment = yearOfEnrolment;
    }


    // METODI


    @Override
    public String toString() {
        return "Vehicle: " + "Plate: " + uniqueLicensePlateNumber + " Year: " + yearOfEnrolment;
    }
}
