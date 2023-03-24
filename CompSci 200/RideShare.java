///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           descriptive title of the program making use of this file
// Course:          Comp Sci 200 Lec 001, Spring, 2023
//
// Author:          Gavin Harwood
// Email:           gharwood@wisc.edu email address
// Lecturer's Name: Jim Williams
//
///////////////////////////////// CITATIONS ////////////////////////////////////
//
// Source or Recipient; Description
// N/A
//
/////////////////////////////// 80 COLUMNS WIDE ////////////////////////////////

import java.util.Scanner;

/**
 * This class reads in the coordinates of a customer along with the names and coordinates of
 * potential drivers, and determines which driver is closest to the customer. It prints out the name
 * of the driver and the estimated time needed for them to reach the customer.
 */
public class RideShare {

    /**
     * This method takes the coordinates of a customer and a driver and returns the expected number
     * of minutes for the driver to reach the customer. The driver can only move north, south, west,
     * or east, and is expected to go at 15 miles per hour.
     *
     * @param customerX The customer's west-east location relative to the origin in miles.
     * @param customerY The customer's north-south location relative to the origin in miles.
     * @param driverX   This is the driver's west-east location relative to the origin in miles.
     * @param driverY   This is the driver's north-south location relative to the origin in miles.
     * @return The expected number of minutes it will take for the driver to reach the customer.
     */
    public static int calculatePickupTime(int customerX, int customerY, int driverX, int driverY) {
        final int AVERAGE_SPEED = 15; // The driver's expected speed in miles per hour.

        // TODO: Calculate the expected number of minutes it will take the driver to reach the
        //  customer.
        
        int distanceX = Math.abs((customerX - driverX));
        int distanceY = Math.abs((customerY - driverY));
        int totalTime = (int) ((((double) distanceX + (double) distanceY) / AVERAGE_SPEED) * 60.0);

        return totalTime;
    }

    /**
     * Takes the coordinates of a customer and a Scanner object that reads in drivers' names and
     * coordinates and determines which driver is closest and how many minutes away they are.
     *
     * @param customerX The customer's west-east location relative to the origin in miles.
     * @param customerY The customer's north-south location relative to the origin in miles.
     * @param scnr      The Scanner object that reads in each driver's given name, x-coordinate, and
     *                  y-coordinate.
     * @return A String message containing the name of the closest driver and the estimated pickup
     * time in minutes.
     */
    public static String getClosestDriverInfo(int customerX, int customerY, Scanner scnr) {
        String driverName;
        int driverX;
        int driverY;
        int driveTime;
        int shortestDriveTime;
        String closestDriver;

        // Get info for the first driver.
        driverName = scnr.next();
        driverX = scnr.nextInt();
        driverY = scnr.nextInt();

        // Call the calculatePickupTime method to determine the first driver's driveTime.
        driveTime = calculatePickupTime(customerX, customerY, driverX, driverY);

        // Assume for now that the first driver is closest to the customer.
        shortestDriveTime = driveTime;
        closestDriver = driverName;

        while (scnr.hasNext()) {
            // Get the name and coordinates for the next driver (if there is one).
            driverName = scnr.next();

            if (driverName.equals("done")) {
                return "The closest driver is " + closestDriver + ". They will arrive in "
                        + shortestDriveTime + " minutes.";
            }

            driverX = scnr.nextInt();
            driverY = scnr.nextInt();

            // TODO: Call the calculatePickupTime method to determine this driver's driveTime.
            driveTime = calculatePickupTime(customerX, customerY, driverX, driverY);

            if (driveTime < shortestDriveTime) {
                shortestDriveTime = driveTime;
                closestDriver = driverName;
            }

            // TODO: Check if the current driver is closer than the closest driver found so far,
            //  and update shortestDriveTime and closestDriver if needed.

        }

        return "The closest driver is " + closestDriver + ". They will arrive in "
                + shortestDriveTime + " minutes.";
    }

    /**
     * This method reads in the coordinates of a customer along with the names and coordinates of
     * potential drivers, and it prints out the name of the closest driver and the estimated time
     * needed for them to reach the customer.
     *
     * @param args unused
     */
    public static void main(String[] args) {
        int customerX;
        int customerY;
        Scanner scnr = new Scanner(System.in);

        System.out.println("Customer's x-coordinate: ");
        customerX = scnr.nextInt();
        System.out.println("Customer's y-coordinate: ");
        customerY = scnr.nextInt();
        System.out.println("Driver Info:");

        String messageToCustomer = getClosestDriverInfo(customerX, customerY, scnr);
        System.out.println(messageToCustomer);
    }
}
