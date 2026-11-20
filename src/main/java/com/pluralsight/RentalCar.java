package com.pluralsight;

import java.util.Scanner;

public class RentalCar {

    static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Pickup Date MM/DD: ");
        String pickup = myScanner.nextLine();

        System.out.print("Numbers of days for the rental: ");
        int days = myScanner.nextInt();
        myScanner.nextLine();

        System.out.print("Electronic toll tag yes/no: ");
        char tollPrice = myScanner.nextLine().charAt(0);

        System.out.print("GPS yes/no: ");
        char gpsPrice = myScanner.nextLine().charAt(0);

        System.out.print("Roadside assistance yes/no: ");
        char assistancePrice = myScanner.nextLine().charAt(0);

        System.out.print("Age: ");
        int age = myScanner.nextInt();

        double price = 29.99 * days;
        double fees = 0;
        double underageFee = 0;

        if (age < 25) {
            underageFee += (price * .3);
        }

        double tollTag = switch (tollPrice) {
            case 'y', 'Y' -> fees += (3.95 * days);

            default -> 0;
        };

        double GPS = switch (gpsPrice) {
            case 'y', 'Y' -> fees += (2.95 * days);

            default -> 0;
        };

        double roadsideAssistance = switch (assistancePrice) {
            case 'y', 'Y' -> fees += (3.95 * days);

            default -> 0;
        };

        double totalCost = (price + underageFee + fees);

        System.out.printf("a. basic car rental: %.2f\n", price);
        System.out.printf("b. options cost: %.2f\n", fees);
        System.out.printf("c. underage driver surcharge: %.2f\n", underageFee);
        System.out.printf("d. total cost: %.2f", totalCost);
    }
}



