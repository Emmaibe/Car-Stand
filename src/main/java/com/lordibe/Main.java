package com.lordibe;

import java.util.*;
import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Services services = new Services();
        Cars cars = new Cars();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello there! welcome to Ibe AutoBiz.\nYou look absolutely beautiful today.\nPlease what is your name? ");
        String user = scanner.nextLine();
        System.out.println("Well... Hello " + user + "\n" + "How can we help you today");




        while (true) {
            System.out.println("Here are a list of our services: \n");
            services.getServices();

            System.out.println("Pick a service number");
            int userInput = scanner.nextInt();
            String carOption;

            if (userInput == 1) {
                System.out.println("Here's a list of our available cars: ");
                cars.getCarsList();
                System.out.println("Which car do you want to buy? ");

                carOption = scanner.next().toUpperCase();

                System.out.println("Excellent car choice of " + carOption);
                System.out.println("The price for " + carOption + " is " + cars.getCarPrice(carOption));
            } else if (userInput == 2) {
                System.out.println("We are very happy to help you sell your car \nPlease we'll need some information of the car");
                System.out.println("Name of the car: ");
                String carName = scanner.next().toUpperCase();
                System.out.println("How much are you willing to sell the car: ");
                int carPrice = scanner.nextInt();

                cars.addCars(carName, carPrice);

                System.out.println("Thank you for trusting us");
            } else if (userInput == 3) {
                System.out.println("We are always ready o answer any question from you... \nPlease ask away: ");
                String inquiry = scanner.next();
                System.out.println("We have recorded ur question and we will get back to you");

            } else if (userInput == 4) {
                System.out.println("Please Provide the complaint from your car: ");
                String fault = scanner.next();
                System.out.println("We have recorded ur complaint and we will get back to you. \nPlease drop your");
            } else {
                System.out.println("Invalid Input");
            }

            System.out.println("Do you need something else? \n Yes or No");
            String response = scanner.next().toLowerCase();

            if (response.equals("yes")){
                continue;
            } else if (response.equals("no")){
                System.out.println("Thanks for Patronizing us. \nWe love you... Byee");
                break;
            } else {
                 System.out.println("invalid response.");
            }
        }
    }
}