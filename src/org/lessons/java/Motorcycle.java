package org.lessons.java;

import java.time.LocalDate;

public class Motorcycle extends Vehicle{
    // ATTRIBUTI
    private boolean kickStand;

    // COSTRUTTORI

    public Motorcycle(String uniqueLicensePlateNumber, LocalDate yearOfEnrolment, boolean kickStand) {
        super(uniqueLicensePlateNumber, yearOfEnrolment);
        this.kickStand = kickStand;
    }

    // GETTER E SETTER

    public boolean isEasel() {
        return kickStand;
    }

    public void setEasel(boolean easel) {
        this.kickStand = easel;
    }


    // METODI

    @Override
    public String toString() {
        return super.toString() + " Kick-Stand: " + kickStand;
    }
}
