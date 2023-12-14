package org.lessons.java;

import java.util.ArrayList;

public class FleetManager {
    // ATTRIBUTI
    private ArrayList<Vehicle> vehicleList;

    // COSTRUTTORI

    public FleetManager(ArrayList<Vehicle> listOfVehicles) {
        this.vehicleList = listOfVehicles;
    }

    // GETTER E SETTER

    public ArrayList<Vehicle> getListOfVehicles() {
        return vehicleList;
    }

    public void setListOfVehicles(ArrayList<Vehicle> listOfVehicles) {
        this.vehicleList = listOfVehicles;
    }


    // METODI
    // METODO PER AGGIUNGERE UN VEICOLO ALLA FLOTTA E NON FAR AGGIUNGERE UN VEICOLO CON LA STESSA TARGA
    public void aggiungiVeicolo(Vehicle vehicle) {
        for (Vehicle vehicle1 : vehicleList) {
            if (vehicle1.getUniqueLicensePlateNumber().equals(vehicle.getUniqueLicensePlateNumber())) {
                System.err.println("Unable to add vehicle: Duplicate license plate!");
                return;
            } else {
                vehicleList.add(vehicle);
                System.out.println("Vehicle added to list: " + vehicle.toString());
            }
        }
    }


    // METODO PER CONTARE QUANTI VEICOLI CI SONO DI UN DETERMINATO TIPO
    public String getCarAndMotorcycle() {
        int counterCar = 0;
        int counterMotorcycle = 0;
        String fleet = null;
        for (Vehicle vehicle : vehicleList) {
            if (vehicle instanceof Car) {
                counterCar++;
            } else {
                counterMotorcycle++;
            }
        }
        return fleet = "Cars are: " + counterCar + "Motorcycle ares: " + counterMotorcycle;
    }

    // METODO PER TROVARE UN VEICOLO SPECIFICO TRAMITE IL NUMERO DI TARGA
    public Vehicle vehicleSearch(String plate){
        Vehicle discovery = null;
        for (Vehicle vehicle : vehicleList){
            if (vehicle.getUniqueLicensePlateNumber().equals(plate)){
                discovery = vehicle;
            }
        }
        return discovery;
    }

}






