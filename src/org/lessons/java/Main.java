package org.lessons.java;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Vehicle> vehicleList = new ArrayList<>();
        FleetManager vehicleOrganization = new FleetManager(vehicleList);

        boolean stop = false;
        while (!stop) {
            System.out.println("Want to add a vehicle to the list? y/n ");
            String veichle = scanner.nextLine();
            switch (veichle) {
                case "y":
                    System.out.println("Is it a car (1) or a motorcycle(2)?");
                    String choice1 = scanner.nextLine();
                    switch (choice1) {
                        case "1":
                            System.out.print("License plate number? ");
                            String plateInput = scanner.nextLine();
                            System.out.println("Date of enrolment? (YYYY-MM-DD)");
                            LocalDate dateInput = LocalDate.parse(scanner.nextLine());
                            System.out.println("How many ports does the car have? ");
                            int doorInput = scanner.nextInt();

                            Car car = new Car(plateInput, dateInput, doorInput);
                            vehicleList.add(car);
                            break;
                        case "2":
                            System.out.print("License plate number? ");
                            String plateInput1 = scanner.nextLine();
                            System.out.println("Date of enrolment? (yyyy-mm-dd)");
                            LocalDate dateInput1 = LocalDate.parse(scanner.nextLine());
                            System.out.println("Does it have a kick-stand? (y/n)");
                            String kickStandInput = scanner.nextLine();
                            boolean kickStand;
                            if (kickStandInput.equalsIgnoreCase("y")) {
                                kickStand = true;
                                Motorcycle motorcycle = new Motorcycle(plateInput1, dateInput1, kickStand);
                                vehicleList.add(motorcycle);
                            } else if (kickStandInput.equalsIgnoreCase("n")) {
                                kickStand = false;
                                Motorcycle motorcycle = new Motorcycle(plateInput1, dateInput1, kickStand);
                                vehicleList.add(motorcycle);
                            } else {
                                System.out.println("Invalid choice");
                            }
                            break;
                        default:
                            System.out.println("Invalid choice");
                            break;
                    }
                    break;
                case "n":
                    System.out.println("This is your vehicle list: ");
                    System.out.println(vehicleList.toString());
                    stop = true;
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }
        scanner.close();
    }
}


